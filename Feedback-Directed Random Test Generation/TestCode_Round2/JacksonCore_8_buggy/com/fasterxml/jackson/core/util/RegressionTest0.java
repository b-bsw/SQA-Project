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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = com.fasterxml.jackson.core.util.TextBuffer.MAX_SEGMENT_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 262144 + "'", int0 == 262144);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = com.fasterxml.jackson.core.util.TextBuffer.MIN_SEGMENT_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray4, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        java.lang.Class<?> wildcardClass3 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = textBuffer1.expandCurrentSegment((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = textBuffer1.setCurrentAndReturn(262144);
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
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        boolean boolean8 = textBuffer7.hasTextAsCharacters();
        int int9 = textBuffer7.size();
        textBuffer7.resetWithEmpty();
        char[] charArray11 = textBuffer7.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray11, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = textBuffer1.expandCurrentSegment((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = textBuffer1.setCurrentAndReturn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.append('4');
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass6 = charArray5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 45, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        int int7 = textBuffer5.size();
        textBuffer5.resetWithEmpty();
        char[] charArray9 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, (int) (short) 1, (int) '4');
        char[] charArray15 = new char[] { ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray15, 262144, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262144 out of bounds for char[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray5 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray5, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 101 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a' });
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        char[] charArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray4, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        boolean boolean4 = textBuffer3.hasTextAsCharacters();
        textBuffer3.resetWithEmpty();
        char[] charArray6 = textBuffer3.contentsAsArray();
        char[] charArray7 = textBuffer3.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray7, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = textBuffer1.expandCurrentSegment((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        char[] charArray11 = textBuffer9.getTextBuffer();
        java.lang.String str12 = textBuffer9.contentsAsString();
        boolean boolean13 = textBuffer9.hasTextAsCharacters();
        java.lang.String str15 = textBuffer9.setCurrentAndReturn(0);
        char[] charArray17 = new char[] { '#' };
        textBuffer9.resetWithShared(charArray17, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray17, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 62 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#' });
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        int int3 = textBuffer1.getCurrentSegmentSize();
        char[] charArray4 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 149, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
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
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = textBuffer1.setCurrentAndReturn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.ensureNotShared();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        int int3 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = textBuffer1.setCurrentAndReturn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        java.lang.String str3 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray8, (int) (byte) 0, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262144 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        int int8 = textBuffer6.size();
        textBuffer6.resetWithEmpty();
        char[] charArray10 = textBuffer6.getCurrentSegment();
        textBuffer6.resetWithString("");
        char[] charArray13 = textBuffer6.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray13, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.Class<?> wildcardClass4 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 10, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        textBuffer1.setCurrentLength(0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        textBuffer1.setCurrentLength(0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.ensureNotShared();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        java.lang.Class<?> wildcardClass5 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        textBuffer1.setCurrentLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = textBuffer1.setCurrentAndReturn((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"hi!\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (short) 100, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 1100, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        int int8 = textBuffer6.size();
        textBuffer6.resetWithString("hi!");
        java.lang.String str11 = textBuffer6.contentsAsString();
        java.lang.String str12 = textBuffer6.toString();
        char[] charArray13 = textBuffer6.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray13, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        char[] charArray13 = textBuffer9.getCurrentSegment();
        textBuffer9.resetWithString("");
        char[] charArray16 = textBuffer9.getCurrentSegment();
        char[] charArray17 = textBuffer9.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray17, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        int int15 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"????????????????????????????????????????????????????????????????????????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        int int6 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass9 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        int int15 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        java.lang.Class<?> wildcardClass8 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        textBuffer1.setCurrentLength(1000);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = textBuffer1.expandCurrentSegment((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getTextBuffer();
        java.lang.String str9 = textBuffer6.contentsAsString();
        boolean boolean10 = textBuffer6.hasTextAsCharacters();
        java.lang.String str12 = textBuffer6.setCurrentAndReturn(0);
        char[] charArray14 = new char[] { '#' };
        textBuffer6.resetWithShared(charArray14, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray14, (int) (short) -1, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#' });
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 1000, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1000, end 2000, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        char[] charArray6 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray6, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength((int) (short) 0);
        char[] charArray16 = textBuffer13.getTextBuffer();
        int int17 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        int int26 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        boolean boolean36 = textBuffer35.hasTextAsCharacters();
        int int37 = textBuffer35.size();
        textBuffer35.resetWithEmpty();
        char[] charArray39 = textBuffer35.getCurrentSegment();
        textBuffer31.resetWithShared(charArray39, (int) (short) 1, (int) '4');
        textBuffer28.resetWithShared(charArray39, (int) ' ', (int) (short) 0);
        textBuffer19.resetWithCopy(charArray39, (int) (short) 1, (int) (byte) 10);
        textBuffer13.resetWithShared(charArray39, (int) (short) 100, (int) '#');
        textBuffer1.resetWithShared(charArray39, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler55 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer56 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler55);
        char[] charArray57 = textBuffer56.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray57, 262144, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262154 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray57);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str5 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) (short) 10, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 1010, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = textBuffer1.setCurrentAndReturn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = textBuffer1.setCurrentAndReturn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass7 = charArray6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray12, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        int int19 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end 34, length 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        int int13 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getTextBuffer();
        java.lang.String str18 = textBuffer15.contentsAsString();
        boolean boolean19 = textBuffer15.hasTextAsCharacters();
        int int20 = textBuffer15.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        int int23 = textBuffer22.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        boolean boolean26 = textBuffer25.hasTextAsCharacters();
        int int27 = textBuffer25.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        boolean boolean30 = textBuffer29.hasTextAsCharacters();
        int int31 = textBuffer29.size();
        textBuffer29.resetWithEmpty();
        char[] charArray33 = textBuffer29.getCurrentSegment();
        textBuffer25.resetWithShared(charArray33, (int) (short) 1, (int) '4');
        textBuffer22.resetWithShared(charArray33, (int) ' ', (int) (short) 0);
        textBuffer15.resetWithShared(charArray33, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray33, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray33);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        textBuffer9.resetWithEmpty();
        boolean boolean14 = textBuffer9.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        char[] charArray18 = textBuffer16.getCurrentSegment();
        textBuffer9.resetWithShared(charArray18, (int) '4', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray18, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        int int12 = textBuffer10.size();
        textBuffer10.resetWithEmpty();
        char[] charArray14 = textBuffer10.getCurrentSegment();
        textBuffer10.resetWithString("");
        int int17 = textBuffer10.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        int int20 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        boolean boolean23 = textBuffer22.hasTextAsCharacters();
        int int24 = textBuffer22.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        boolean boolean27 = textBuffer26.hasTextAsCharacters();
        int int28 = textBuffer26.size();
        textBuffer26.resetWithEmpty();
        char[] charArray30 = textBuffer26.getCurrentSegment();
        textBuffer22.resetWithShared(charArray30, (int) (short) 1, (int) '4');
        textBuffer19.resetWithShared(charArray30, (int) ' ', (int) (short) 0);
        textBuffer10.resetWithCopy(charArray30, (int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray30, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 67, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        textBuffer1.resetWithString("hi!");
        char[] charArray6 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        char[] charArray6 = textBuffer5.emptyAndGetCurrentSegment();
        int int7 = textBuffer5.getTextOffset();
        char[] charArray8 = textBuffer5.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray8, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray6 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer8.resetWithString("");
        char[] charArray15 = textBuffer8.getCurrentSegment();
        char[] charArray16 = textBuffer8.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray16, (int) 'a', 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1097 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getTextBuffer();
        java.lang.String str9 = textBuffer6.contentsAsString();
        boolean boolean10 = textBuffer6.hasTextAsCharacters();
        textBuffer6.append('4');
        char[] charArray13 = textBuffer6.contentsAsArray();
        char[] charArray14 = textBuffer6.contentsAsArray();
        textBuffer1.resetWithCopy(charArray14, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass18 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4' });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = textBuffer1.setCurrentAndReturn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = textBuffer1.setCurrentAndReturn((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray4, 3, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        char[] charArray5 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        int int19 = textBuffer1.size();
        char[] charArray20 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass21 = charArray20.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.expandCurrentSegment((int) (short) 0);
        int int18 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        boolean boolean21 = textBuffer20.hasTextAsCharacters();
        char[] charArray22 = textBuffer20.emptyAndGetCurrentSegment();
        int int23 = textBuffer20.size();
        char[] charArray24 = textBuffer20.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray24, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getTextBuffer();
        java.lang.String str11 = textBuffer8.contentsAsString();
        boolean boolean12 = textBuffer8.hasTextAsCharacters();
        textBuffer8.append('4');
        char[] charArray15 = textBuffer8.contentsAsArray();
        char[] charArray16 = textBuffer8.contentsAsArray();
        char[] charArray17 = textBuffer8.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray17, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4' });
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        int int13 = textBuffer11.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        int int17 = textBuffer15.size();
        textBuffer15.resetWithEmpty();
        char[] charArray19 = textBuffer15.getCurrentSegment();
        textBuffer11.resetWithShared(charArray19, (int) (short) 1, (int) '4');
        textBuffer8.resetWithShared(charArray19, (int) ' ', (int) (short) 0);
        textBuffer1.resetWithShared(charArray19, (int) (byte) 1, (int) '4');
        textBuffer1.setCurrentLength((int) (short) 100);
        java.lang.String str31 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str31, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength((int) (short) 0);
        char[] charArray16 = textBuffer13.getTextBuffer();
        int int17 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        int int26 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        boolean boolean36 = textBuffer35.hasTextAsCharacters();
        int int37 = textBuffer35.size();
        textBuffer35.resetWithEmpty();
        char[] charArray39 = textBuffer35.getCurrentSegment();
        textBuffer31.resetWithShared(charArray39, (int) (short) 1, (int) '4');
        textBuffer28.resetWithShared(charArray39, (int) ' ', (int) (short) 0);
        textBuffer19.resetWithCopy(charArray39, (int) (short) 1, (int) (byte) 10);
        textBuffer13.resetWithShared(charArray39, (int) (short) 100, (int) '#');
        textBuffer1.resetWithShared(charArray39, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler55 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer56 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler55);
        boolean boolean57 = textBuffer56.hasTextAsCharacters();
        char[] charArray58 = textBuffer56.emptyAndGetCurrentSegment();
        char[] charArray59 = textBuffer56.contentsAsArray();
        textBuffer1.resetWithShared(charArray59, 262144, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = textBuffer1.setCurrentAndReturn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str5 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        char[] charArray7 = textBuffer5.getTextBuffer();
        java.lang.String str8 = textBuffer5.contentsAsString();
        boolean boolean9 = textBuffer5.hasTextAsCharacters();
        java.lang.String str11 = textBuffer5.setCurrentAndReturn(0);
        char[] charArray12 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 101, length 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = textBuffer1.setCurrentAndReturn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("hi!");
        java.lang.Class<?> wildcardClass11 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (short) 1);
        java.lang.String str8 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        java.lang.String str3 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        int int12 = textBuffer10.size();
        textBuffer10.resetWithEmpty();
        char[] charArray14 = textBuffer10.getCurrentSegment();
        textBuffer10.resetWithString("");
        int int17 = textBuffer10.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        int int20 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        boolean boolean23 = textBuffer22.hasTextAsCharacters();
        int int24 = textBuffer22.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        boolean boolean27 = textBuffer26.hasTextAsCharacters();
        int int28 = textBuffer26.size();
        textBuffer26.resetWithEmpty();
        char[] charArray30 = textBuffer26.getCurrentSegment();
        textBuffer22.resetWithShared(charArray30, (int) (short) 1, (int) '4');
        textBuffer19.resetWithShared(charArray30, (int) ' ', (int) (short) 0);
        textBuffer10.resetWithCopy(charArray30, (int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray30, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.size();
        int int9 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        int int3 = textBuffer1.getCurrentSegmentSize();
        char[] charArray4 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = textBuffer1.setCurrentAndReturn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.setCurrentLength((int) (short) 0);
        char[] charArray8 = textBuffer5.getTextBuffer();
        int int9 = textBuffer5.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        int int13 = textBuffer11.size();
        textBuffer11.resetWithEmpty();
        char[] charArray15 = textBuffer11.getCurrentSegment();
        textBuffer11.resetWithString("");
        int int18 = textBuffer11.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        int int21 = textBuffer20.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        boolean boolean24 = textBuffer23.hasTextAsCharacters();
        int int25 = textBuffer23.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        boolean boolean28 = textBuffer27.hasTextAsCharacters();
        int int29 = textBuffer27.size();
        textBuffer27.resetWithEmpty();
        char[] charArray31 = textBuffer27.getCurrentSegment();
        textBuffer23.resetWithShared(charArray31, (int) (short) 1, (int) '4');
        textBuffer20.resetWithShared(charArray31, (int) ' ', (int) (short) 0);
        textBuffer11.resetWithCopy(charArray31, (int) (short) 1, (int) (byte) 10);
        textBuffer5.resetWithShared(charArray31, (int) (short) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray31, (int) (byte) -1, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray31);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass4 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("hi!");
        java.lang.String str11 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = textBuffer1.setCurrentAndReturn(262144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.append('4');
        int int7 = textBuffer1.getTextOffset();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        boolean boolean8 = textBuffer7.hasTextAsCharacters();
        int int9 = textBuffer7.size();
        textBuffer7.resetWithEmpty();
        char[] charArray11 = textBuffer7.getCurrentSegment();
        textBuffer7.resetWithString("");
        int int14 = textBuffer7.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        boolean boolean24 = textBuffer23.hasTextAsCharacters();
        int int25 = textBuffer23.size();
        textBuffer23.resetWithEmpty();
        char[] charArray27 = textBuffer23.getCurrentSegment();
        textBuffer19.resetWithShared(charArray27, (int) (short) 1, (int) '4');
        textBuffer16.resetWithShared(charArray27, (int) ' ', (int) (short) 0);
        textBuffer7.resetWithCopy(charArray27, (int) (short) 1, (int) (byte) 10);
        textBuffer1.resetWithShared(charArray27, 1, 1000);
        java.lang.Class<?> wildcardClass40 = charArray27.getClass();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.Class<?> wildcardClass4 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        char[] charArray13 = textBuffer11.emptyAndGetCurrentSegment();
        char[] charArray14 = textBuffer11.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray14, (int) ' ', 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1032 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        int int3 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = textBuffer1.setCurrentAndReturn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.expandCurrentSegment((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 1000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        textBuffer1.ensureNotShared();
        java.lang.String str14 = textBuffer1.setCurrentAndReturn((int) (short) 0);
        java.lang.String str15 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        boolean boolean18 = textBuffer17.hasTextAsCharacters();
        int int19 = textBuffer17.size();
        textBuffer17.resetWithString("hi!");
        java.lang.String str22 = textBuffer17.contentsAsString();
        java.lang.String str23 = textBuffer17.toString();
        char[] charArray24 = textBuffer17.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray24, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for char[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", 3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.Class<?> wildcardClass6 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray3, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getTextBuffer();
        java.lang.String str11 = textBuffer8.contentsAsString();
        boolean boolean12 = textBuffer8.hasTextAsCharacters();
        textBuffer8.append('4');
        char[] charArray15 = textBuffer8.contentsAsArray();
        char[] charArray16 = textBuffer8.contentsAsArray();
        char[] charArray17 = textBuffer8.getTextBuffer();
        char[] charArray18 = textBuffer8.contentsAsArray();
        textBuffer1.resetWithShared(charArray18, (int) '4', (int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.setCurrentLength((int) (short) 0);
        char[] charArray26 = textBuffer23.getTextBuffer();
        int int27 = textBuffer23.size();
        char[] charArray28 = textBuffer23.getCurrentSegment();
        boolean boolean29 = textBuffer23.hasTextAsCharacters();
        char[] charArray30 = textBuffer23.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray30, (int) ' ', 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 87 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4' });
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 10, count 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        textBuffer1.releaseBuffers();
        int int14 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        textBuffer1.setCurrentLength(0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = textBuffer1.contentsAsArray();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -9 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getTextBuffer();
        java.lang.String str11 = textBuffer8.contentsAsString();
        boolean boolean12 = textBuffer8.hasTextAsCharacters();
        java.lang.String str14 = textBuffer8.setCurrentAndReturn(0);
        char[] charArray16 = new char[] { '#' };
        textBuffer8.resetWithShared(charArray16, (int) (short) 10, (int) (short) 1);
        char[] charArray20 = textBuffer8.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray20, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#' });
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.append('4');
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        java.lang.Class<?> wildcardClass9 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass12 = charArray11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength((int) (short) 0);
        int int12 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.resetWithString("");
        boolean boolean15 = textBuffer9.hasTextAsCharacters();
        textBuffer9.setCurrentLength((int) (byte) 100);
        textBuffer9.ensureNotShared();
        textBuffer9.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength((int) (short) 0);
        char[] charArray24 = textBuffer21.getTextBuffer();
        int int25 = textBuffer21.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        boolean boolean28 = textBuffer27.hasTextAsCharacters();
        int int29 = textBuffer27.size();
        textBuffer27.resetWithEmpty();
        char[] charArray31 = textBuffer27.getCurrentSegment();
        textBuffer27.resetWithString("");
        int int34 = textBuffer27.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        boolean boolean40 = textBuffer39.hasTextAsCharacters();
        int int41 = textBuffer39.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        boolean boolean44 = textBuffer43.hasTextAsCharacters();
        int int45 = textBuffer43.size();
        textBuffer43.resetWithEmpty();
        char[] charArray47 = textBuffer43.getCurrentSegment();
        textBuffer39.resetWithShared(charArray47, (int) (short) 1, (int) '4');
        textBuffer36.resetWithShared(charArray47, (int) ' ', (int) (short) 0);
        textBuffer27.resetWithCopy(charArray47, (int) (short) 1, (int) (byte) 10);
        textBuffer21.resetWithShared(charArray47, (int) (short) 100, (int) '#');
        textBuffer9.resetWithShared(charArray47, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler63 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer64 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler63);
        boolean boolean65 = textBuffer64.hasTextAsCharacters();
        char[] charArray66 = textBuffer64.emptyAndGetCurrentSegment();
        char[] charArray67 = textBuffer64.contentsAsArray();
        textBuffer9.resetWithShared(charArray67, 262144, (int) (byte) 100);
        textBuffer1.resetWithShared(charArray67, (int) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str74 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 100, count 100, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] {});
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.emptyAndGetCurrentSegment();
        java.lang.String str12 = textBuffer10.toString();
        int int13 = textBuffer10.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getTextBuffer();
        java.lang.String str18 = textBuffer15.contentsAsString();
        boolean boolean19 = textBuffer15.hasTextAsCharacters();
        textBuffer15.append('4');
        char[] charArray22 = textBuffer15.contentsAsArray();
        char[] charArray23 = textBuffer15.contentsAsArray();
        textBuffer10.resetWithCopy(charArray23, (int) (byte) 1, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        char[] charArray29 = textBuffer28.emptyAndGetCurrentSegment();
        java.lang.String str30 = textBuffer28.toString();
        int int31 = textBuffer28.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        boolean boolean34 = textBuffer33.hasTextAsCharacters();
        char[] charArray35 = textBuffer33.getTextBuffer();
        java.lang.String str36 = textBuffer33.contentsAsString();
        boolean boolean37 = textBuffer33.hasTextAsCharacters();
        textBuffer33.append('4');
        char[] charArray40 = textBuffer33.contentsAsArray();
        char[] charArray41 = textBuffer33.contentsAsArray();
        textBuffer28.resetWithCopy(charArray41, (int) (byte) 1, 0);
        char[] charArray45 = textBuffer28.emptyAndGetCurrentSegment();
        textBuffer10.resetWithShared(charArray45, (int) 'a', 1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer50 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler49);
        boolean boolean51 = textBuffer50.hasTextAsCharacters();
        int int52 = textBuffer50.size();
        textBuffer50.resetWithString("hi!");
        java.lang.String str55 = textBuffer50.contentsAsString();
        java.lang.String str56 = textBuffer50.toString();
        char[] charArray57 = textBuffer50.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray57, 0, (int) ' ');
        textBuffer1.resetWithShared(charArray57, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double64 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(charArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(charArray57);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength((int) (short) 0);
        char[] charArray12 = textBuffer9.getTextBuffer();
        int int13 = textBuffer9.size();
        char[] charArray14 = textBuffer9.getCurrentSegment();
        boolean boolean15 = textBuffer9.hasTextAsCharacters();
        char[] charArray16 = textBuffer9.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray16, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray16);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength((int) (short) 0);
        char[] charArray16 = textBuffer13.getTextBuffer();
        int int17 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        int int26 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        boolean boolean36 = textBuffer35.hasTextAsCharacters();
        int int37 = textBuffer35.size();
        textBuffer35.resetWithEmpty();
        char[] charArray39 = textBuffer35.getCurrentSegment();
        textBuffer31.resetWithShared(charArray39, (int) (short) 1, (int) '4');
        textBuffer28.resetWithShared(charArray39, (int) ' ', (int) (short) 0);
        textBuffer19.resetWithCopy(charArray39, (int) (short) 1, (int) (byte) 10);
        textBuffer13.resetWithShared(charArray39, (int) (short) 100, (int) '#');
        textBuffer1.resetWithShared(charArray39, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler55 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer56 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler55);
        boolean boolean57 = textBuffer56.hasTextAsCharacters();
        char[] charArray58 = textBuffer56.emptyAndGetCurrentSegment();
        char[] charArray59 = textBuffer56.contentsAsArray();
        textBuffer1.resetWithShared(charArray59, 262144, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray63 = textBuffer1.contentsAsArray();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -262144 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        java.lang.String str3 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        int int13 = textBuffer11.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        int int17 = textBuffer15.size();
        textBuffer15.resetWithEmpty();
        char[] charArray19 = textBuffer15.getCurrentSegment();
        textBuffer11.resetWithShared(charArray19, (int) (short) 1, (int) '4');
        textBuffer8.resetWithShared(charArray19, (int) ' ', (int) (short) 0);
        textBuffer1.resetWithShared(charArray19, (int) (byte) 1, (int) '4');
        textBuffer1.setCurrentLength((int) (short) 100);
        java.lang.String str31 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str31, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        java.lang.Class<?> wildcardClass16 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.emptyAndGetCurrentSegment();
        java.lang.String str12 = textBuffer10.toString();
        int int13 = textBuffer10.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getTextBuffer();
        java.lang.String str18 = textBuffer15.contentsAsString();
        boolean boolean19 = textBuffer15.hasTextAsCharacters();
        textBuffer15.append('4');
        char[] charArray22 = textBuffer15.contentsAsArray();
        char[] charArray23 = textBuffer15.contentsAsArray();
        textBuffer10.resetWithCopy(charArray23, (int) (byte) 1, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        char[] charArray29 = textBuffer28.emptyAndGetCurrentSegment();
        java.lang.String str30 = textBuffer28.toString();
        int int31 = textBuffer28.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        boolean boolean34 = textBuffer33.hasTextAsCharacters();
        char[] charArray35 = textBuffer33.getTextBuffer();
        java.lang.String str36 = textBuffer33.contentsAsString();
        boolean boolean37 = textBuffer33.hasTextAsCharacters();
        textBuffer33.append('4');
        char[] charArray40 = textBuffer33.contentsAsArray();
        char[] charArray41 = textBuffer33.contentsAsArray();
        textBuffer28.resetWithCopy(charArray41, (int) (byte) 1, 0);
        char[] charArray45 = textBuffer28.emptyAndGetCurrentSegment();
        textBuffer10.resetWithShared(charArray45, (int) 'a', 1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer50 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler49);
        boolean boolean51 = textBuffer50.hasTextAsCharacters();
        int int52 = textBuffer50.size();
        textBuffer50.resetWithString("hi!");
        java.lang.String str55 = textBuffer50.contentsAsString();
        java.lang.String str56 = textBuffer50.toString();
        char[] charArray57 = textBuffer50.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray57, 0, (int) ' ');
        textBuffer1.resetWithShared(charArray57, 0, 0);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(charArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(charArray57);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        int int15 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        textBuffer9.resetWithEmpty();
        char[] charArray12 = textBuffer9.contentsAsArray();
        char[] charArray13 = textBuffer9.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray13, (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 35, count -1, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (short) 1);
        textBuffer1.setCurrentLength((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        int int7 = textBuffer5.size();
        textBuffer5.resetWithEmpty();
        char[] charArray9 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, (int) (short) 1, (int) '4');
        int int13 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = textBuffer1.setCurrentAndReturn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        int int10 = textBuffer1.getTextOffset();
        char[] charArray11 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        boolean boolean8 = textBuffer7.hasTextAsCharacters();
        textBuffer7.resetWithEmpty();
        char[] charArray10 = textBuffer7.contentsAsArray();
        char[] charArray11 = textBuffer7.contentsAsArray();
        int int12 = textBuffer7.size();
        char[] charArray13 = textBuffer7.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray13, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        int int14 = textBuffer12.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        int int18 = textBuffer16.size();
        textBuffer16.resetWithEmpty();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        textBuffer12.resetWithShared(charArray20, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray20, 262144, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262145 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.expandCurrentSegment((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        boolean boolean8 = textBuffer7.hasTextAsCharacters();
        int int9 = textBuffer7.size();
        textBuffer7.resetWithEmpty();
        char[] charArray11 = textBuffer7.getCurrentSegment();
        textBuffer7.resetWithString("");
        int int14 = textBuffer7.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        boolean boolean24 = textBuffer23.hasTextAsCharacters();
        int int25 = textBuffer23.size();
        textBuffer23.resetWithEmpty();
        char[] charArray27 = textBuffer23.getCurrentSegment();
        textBuffer19.resetWithShared(charArray27, (int) (short) 1, (int) '4');
        textBuffer16.resetWithShared(charArray27, (int) ' ', (int) (short) 0);
        textBuffer7.resetWithCopy(charArray27, (int) (short) 1, (int) (byte) 10);
        textBuffer1.resetWithShared(charArray27, (int) (short) 100, (int) '#');
        char[] charArray40 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        boolean boolean43 = textBuffer42.hasTextAsCharacters();
        char[] charArray44 = textBuffer42.getTextBuffer();
        java.lang.String str45 = textBuffer42.contentsAsString();
        boolean boolean46 = textBuffer42.hasTextAsCharacters();
        int int47 = textBuffer42.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        int int50 = textBuffer49.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        boolean boolean53 = textBuffer52.hasTextAsCharacters();
        int int54 = textBuffer52.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler55 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer56 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler55);
        boolean boolean57 = textBuffer56.hasTextAsCharacters();
        int int58 = textBuffer56.size();
        textBuffer56.resetWithEmpty();
        char[] charArray60 = textBuffer56.getCurrentSegment();
        textBuffer52.resetWithShared(charArray60, (int) (short) 1, (int) '4');
        textBuffer49.resetWithShared(charArray60, (int) ' ', (int) (short) 0);
        textBuffer42.resetWithShared(charArray60, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray60, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(charArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray60);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        textBuffer1.ensureNotShared();
        java.lang.String str14 = textBuffer1.setCurrentAndReturn((int) (short) 0);
        textBuffer1.setCurrentLength((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = textBuffer1.setCurrentAndReturn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = textBuffer1.expandCurrentSegment((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        java.lang.Class<?> wildcardClass6 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.append('4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.emptyAndGetCurrentSegment();
        int int13 = textBuffer11.getTextOffset();
        textBuffer11.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        boolean boolean18 = textBuffer17.hasTextAsCharacters();
        textBuffer17.resetWithEmpty();
        char[] charArray20 = textBuffer17.contentsAsArray();
        char[] charArray21 = textBuffer17.contentsAsArray();
        textBuffer17.releaseBuffers();
        textBuffer17.resetWithString("");
        java.lang.String str25 = textBuffer17.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        textBuffer27.setCurrentLength((int) (short) 0);
        char[] charArray30 = textBuffer27.getTextBuffer();
        int int31 = textBuffer27.size();
        char[] charArray32 = textBuffer27.getCurrentSegment();
        textBuffer17.resetWithCopy(charArray32, 3, 1);
        textBuffer11.resetWithShared(charArray32, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray32, 262144, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray32);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = textBuffer1.setCurrentAndReturn(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 100, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.size();
        int int9 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.expandCurrentSegment(3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("hi!");
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        int int14 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.append('4');
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 20, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.getTextBuffer();
        java.lang.String str8 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        int int19 = textBuffer1.size();
        char[] charArray20 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer8.resetWithString("");
        char[] charArray15 = textBuffer8.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray15, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray15);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 100, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray13 = textBuffer1.expandCurrentSegment((int) '#');
        textBuffer1.setCurrentLength(0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.emptyAndGetCurrentSegment();
        int int9 = textBuffer7.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        char[] charArray13 = textBuffer11.getTextBuffer();
        java.lang.String str14 = textBuffer11.contentsAsString();
        boolean boolean15 = textBuffer11.hasTextAsCharacters();
        java.lang.String str17 = textBuffer11.setCurrentAndReturn(0);
        char[] charArray18 = textBuffer11.getCurrentSegment();
        textBuffer7.resetWithShared(charArray18, (int) (short) 1, (int) (short) 1);
        textBuffer1.append(charArray18, 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"????????????????????????????????????????????????????????????????????????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        textBuffer1.resetWithEmpty();
        char[] charArray15 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 33, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength((int) (short) 0);
        char[] charArray16 = textBuffer13.getTextBuffer();
        int int17 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        int int26 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        boolean boolean36 = textBuffer35.hasTextAsCharacters();
        int int37 = textBuffer35.size();
        textBuffer35.resetWithEmpty();
        char[] charArray39 = textBuffer35.getCurrentSegment();
        textBuffer31.resetWithShared(charArray39, (int) (short) 1, (int) '4');
        textBuffer28.resetWithShared(charArray39, (int) ' ', (int) (short) 0);
        textBuffer19.resetWithCopy(charArray39, (int) (short) 1, (int) (byte) 10);
        textBuffer13.resetWithShared(charArray39, (int) (short) 100, (int) '#');
        textBuffer1.resetWithShared(charArray39, 10, (int) (byte) 10);
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray57 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray13 = textBuffer1.expandCurrentSegment((int) '#');
        textBuffer1.setCurrentLength(0);
        int int16 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str7 = textBuffer1.contentsAsString();
        int int8 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        int int13 = textBuffer1.getTextOffset();
        int int14 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 10, count 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getTextBuffer();
        java.lang.String str9 = textBuffer6.contentsAsString();
        boolean boolean10 = textBuffer6.hasTextAsCharacters();
        java.lang.String str12 = textBuffer6.setCurrentAndReturn(0);
        char[] charArray13 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithShared(charArray13, (int) 'a', 262144);
        java.lang.Class<?> wildcardClass17 = charArray13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        boolean boolean14 = textBuffer13.hasTextAsCharacters();
        int int15 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        boolean boolean18 = textBuffer17.hasTextAsCharacters();
        int int19 = textBuffer17.size();
        textBuffer17.resetWithEmpty();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        textBuffer13.resetWithShared(charArray21, (int) (short) 1, (int) '4');
        textBuffer10.resetWithShared(charArray21, (int) ' ', (int) (short) 0);
        textBuffer1.resetWithCopy(charArray21, (int) (short) 1, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer32 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler31);
        textBuffer32.setCurrentLength((int) (short) 0);
        int int35 = textBuffer32.getCurrentSegmentSize();
        textBuffer32.resetWithString("");
        boolean boolean38 = textBuffer32.hasTextAsCharacters();
        textBuffer32.setCurrentLength((int) (byte) 100);
        textBuffer32.ensureNotShared();
        boolean boolean42 = textBuffer32.hasTextAsCharacters();
        char[] charArray43 = textBuffer32.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray43, (int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass47 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        int int10 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getTextBuffer();
        java.lang.String str11 = textBuffer8.contentsAsString();
        boolean boolean12 = textBuffer8.hasTextAsCharacters();
        textBuffer8.append('4');
        char[] charArray15 = textBuffer8.contentsAsArray();
        char[] charArray16 = textBuffer8.contentsAsArray();
        char[] charArray17 = textBuffer8.getTextBuffer();
        char[] charArray18 = textBuffer8.contentsAsArray();
        textBuffer1.resetWithShared(charArray18, (int) '4', (int) '#');
        int int22 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        boolean boolean25 = textBuffer24.hasTextAsCharacters();
        char[] charArray26 = textBuffer24.getTextBuffer();
        java.lang.String str27 = textBuffer24.contentsAsString();
        int int28 = textBuffer24.getTextOffset();
        char[] charArray29 = textBuffer24.emptyAndGetCurrentSegment();
        textBuffer24.setCurrentLength((int) (short) 10);
        java.lang.String str32 = textBuffer24.contentsAsString();
        textBuffer24.setCurrentLength((int) (short) 10);
        char[] charArray35 = textBuffer24.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray35, 3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 87 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str32, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray35);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        char[] charArray8 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 33, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("");
        char[] charArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray7, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength((int) (short) 0);
        int int12 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.resetWithString("");
        boolean boolean15 = textBuffer9.hasTextAsCharacters();
        textBuffer9.setCurrentLength((int) (byte) 100);
        textBuffer9.ensureNotShared();
        textBuffer9.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength((int) (short) 0);
        char[] charArray24 = textBuffer21.getTextBuffer();
        int int25 = textBuffer21.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        boolean boolean28 = textBuffer27.hasTextAsCharacters();
        int int29 = textBuffer27.size();
        textBuffer27.resetWithEmpty();
        char[] charArray31 = textBuffer27.getCurrentSegment();
        textBuffer27.resetWithString("");
        int int34 = textBuffer27.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        boolean boolean40 = textBuffer39.hasTextAsCharacters();
        int int41 = textBuffer39.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        boolean boolean44 = textBuffer43.hasTextAsCharacters();
        int int45 = textBuffer43.size();
        textBuffer43.resetWithEmpty();
        char[] charArray47 = textBuffer43.getCurrentSegment();
        textBuffer39.resetWithShared(charArray47, (int) (short) 1, (int) '4');
        textBuffer36.resetWithShared(charArray47, (int) ' ', (int) (short) 0);
        textBuffer27.resetWithCopy(charArray47, (int) (short) 1, (int) (byte) 10);
        textBuffer21.resetWithShared(charArray47, (int) (short) 100, (int) '#');
        textBuffer9.resetWithShared(charArray47, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler63 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer64 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler63);
        boolean boolean65 = textBuffer64.hasTextAsCharacters();
        char[] charArray66 = textBuffer64.emptyAndGetCurrentSegment();
        char[] charArray67 = textBuffer64.contentsAsArray();
        textBuffer9.resetWithShared(charArray67, 262144, (int) (byte) 100);
        textBuffer1.resetWithShared(charArray67, (int) (short) 100, (int) (short) 100);
        int int74 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] {});
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray10 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass11 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        char[] charArray7 = textBuffer5.getTextBuffer();
        java.lang.String str8 = textBuffer5.contentsAsString();
        int int9 = textBuffer5.getTextOffset();
        char[] charArray10 = textBuffer5.emptyAndGetCurrentSegment();
        textBuffer5.setCurrentLength((int) (short) 10);
        java.lang.String str13 = textBuffer5.contentsAsString();
        char[] charArray14 = textBuffer5.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray14, (int) 'a', 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1097 out of bounds for char[10]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str13, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.toString();
        java.lang.String str8 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        int int13 = textBuffer11.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        int int17 = textBuffer15.size();
        textBuffer15.resetWithEmpty();
        char[] charArray19 = textBuffer15.getCurrentSegment();
        textBuffer11.resetWithShared(charArray19, (int) (short) 1, (int) '4');
        textBuffer8.resetWithShared(charArray19, (int) ' ', (int) (short) 0);
        textBuffer1.resetWithShared(charArray19, (int) (byte) 1, (int) '4');
        char[] charArray29 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        char[] charArray33 = textBuffer31.getTextBuffer();
        java.lang.String str34 = textBuffer31.contentsAsString();
        char[] charArray35 = textBuffer31.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray35, 0, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1000 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        textBuffer8.resetWithEmpty();
        java.lang.String str11 = textBuffer8.toString();
        textBuffer8.releaseBuffers();
        char[] charArray13 = textBuffer8.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray13, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        textBuffer1.setCurrentLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 10, count 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getTextBuffer();
        java.lang.String str11 = textBuffer8.contentsAsString();
        int int12 = textBuffer8.getTextOffset();
        char[] charArray13 = textBuffer8.emptyAndGetCurrentSegment();
        char[] charArray14 = textBuffer8.getTextBuffer();
        java.lang.String str15 = textBuffer8.contentsAsString();
        char[] charArray16 = textBuffer8.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray16, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        java.lang.String str12 = textBuffer1.toString();
        textBuffer1.append('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength((int) (short) 0);
        int int12 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.resetWithString("");
        boolean boolean15 = textBuffer9.hasTextAsCharacters();
        textBuffer9.setCurrentLength((int) (byte) 100);
        textBuffer9.ensureNotShared();
        textBuffer9.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength((int) (short) 0);
        char[] charArray24 = textBuffer21.getTextBuffer();
        int int25 = textBuffer21.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        boolean boolean28 = textBuffer27.hasTextAsCharacters();
        int int29 = textBuffer27.size();
        textBuffer27.resetWithEmpty();
        char[] charArray31 = textBuffer27.getCurrentSegment();
        textBuffer27.resetWithString("");
        int int34 = textBuffer27.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        boolean boolean40 = textBuffer39.hasTextAsCharacters();
        int int41 = textBuffer39.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        boolean boolean44 = textBuffer43.hasTextAsCharacters();
        int int45 = textBuffer43.size();
        textBuffer43.resetWithEmpty();
        char[] charArray47 = textBuffer43.getCurrentSegment();
        textBuffer39.resetWithShared(charArray47, (int) (short) 1, (int) '4');
        textBuffer36.resetWithShared(charArray47, (int) ' ', (int) (short) 0);
        textBuffer27.resetWithCopy(charArray47, (int) (short) 1, (int) (byte) 10);
        textBuffer21.resetWithShared(charArray47, (int) (short) 100, (int) '#');
        textBuffer9.resetWithShared(charArray47, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler63 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer64 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler63);
        boolean boolean65 = textBuffer64.hasTextAsCharacters();
        char[] charArray66 = textBuffer64.emptyAndGetCurrentSegment();
        char[] charArray67 = textBuffer64.contentsAsArray();
        textBuffer9.resetWithShared(charArray67, 262144, (int) (byte) 100);
        textBuffer1.resetWithShared(charArray67, (int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass74 = charArray67.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = textBuffer1.setCurrentAndReturn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count -1, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.append('4');
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        java.lang.Class<?> wildcardClass13 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength(52);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        textBuffer9.resetWithEmpty();
        int int12 = textBuffer9.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        boolean boolean15 = textBuffer14.hasTextAsCharacters();
        int int16 = textBuffer14.size();
        textBuffer14.resetWithEmpty();
        char[] charArray18 = textBuffer14.getCurrentSegment();
        textBuffer14.resetWithString("");
        char[] charArray21 = textBuffer14.getCurrentSegment();
        textBuffer14.append('4');
        char[] charArray24 = textBuffer14.contentsAsArray();
        textBuffer9.resetWithShared(charArray24, 52, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray24, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4' });
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        char[] charArray8 = new char[] { ' ', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray8, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for char[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', '4', '#' });
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength((int) (short) 0);
        char[] charArray16 = textBuffer13.getTextBuffer();
        int int17 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        int int26 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        boolean boolean36 = textBuffer35.hasTextAsCharacters();
        int int37 = textBuffer35.size();
        textBuffer35.resetWithEmpty();
        char[] charArray39 = textBuffer35.getCurrentSegment();
        textBuffer31.resetWithShared(charArray39, (int) (short) 1, (int) '4');
        textBuffer28.resetWithShared(charArray39, (int) ' ', (int) (short) 0);
        textBuffer19.resetWithCopy(charArray39, (int) (short) 1, (int) (byte) 10);
        textBuffer13.resetWithShared(charArray39, (int) (short) 100, (int) '#');
        textBuffer1.resetWithShared(charArray39, 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass55 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        char[] charArray12 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("a");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        java.lang.Class<?> wildcardClass12 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray6 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        java.lang.String str8 = textBuffer1.setCurrentAndReturn((int) (byte) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        int int12 = textBuffer10.size();
        textBuffer10.resetWithEmpty();
        char[] charArray14 = textBuffer10.getCurrentSegment();
        textBuffer10.resetWithString("");
        char[] charArray17 = textBuffer10.getCurrentSegment();
        java.lang.String str18 = textBuffer10.contentsAsString();
        int int19 = textBuffer10.getTextOffset();
        char[] charArray20 = textBuffer10.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray20, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 132 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 62, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getTextBuffer();
        java.lang.String str9 = textBuffer6.contentsAsString();
        boolean boolean10 = textBuffer6.hasTextAsCharacters();
        java.lang.String str12 = textBuffer6.setCurrentAndReturn(0);
        char[] charArray14 = new char[] { '#' };
        textBuffer6.resetWithShared(charArray14, (int) (short) 10, (int) (short) 1);
        textBuffer6.releaseBuffers();
        int int19 = textBuffer6.getCurrentSegmentSize();
        char[] charArray20 = textBuffer6.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, 1000, 262144);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength((int) (short) 0);
        int int12 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.resetWithString("");
        boolean boolean15 = textBuffer9.hasTextAsCharacters();
        textBuffer9.setCurrentLength((int) (byte) 100);
        textBuffer9.ensureNotShared();
        textBuffer9.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength((int) (short) 0);
        char[] charArray24 = textBuffer21.getTextBuffer();
        int int25 = textBuffer21.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        boolean boolean28 = textBuffer27.hasTextAsCharacters();
        int int29 = textBuffer27.size();
        textBuffer27.resetWithEmpty();
        char[] charArray31 = textBuffer27.getCurrentSegment();
        textBuffer27.resetWithString("");
        int int34 = textBuffer27.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        boolean boolean40 = textBuffer39.hasTextAsCharacters();
        int int41 = textBuffer39.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        boolean boolean44 = textBuffer43.hasTextAsCharacters();
        int int45 = textBuffer43.size();
        textBuffer43.resetWithEmpty();
        char[] charArray47 = textBuffer43.getCurrentSegment();
        textBuffer39.resetWithShared(charArray47, (int) (short) 1, (int) '4');
        textBuffer36.resetWithShared(charArray47, (int) ' ', (int) (short) 0);
        textBuffer27.resetWithCopy(charArray47, (int) (short) 1, (int) (byte) 10);
        textBuffer21.resetWithShared(charArray47, (int) (short) 100, (int) '#');
        textBuffer9.resetWithShared(charArray47, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler63 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer64 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler63);
        boolean boolean65 = textBuffer64.hasTextAsCharacters();
        char[] charArray66 = textBuffer64.emptyAndGetCurrentSegment();
        char[] charArray67 = textBuffer64.contentsAsArray();
        textBuffer9.resetWithShared(charArray67, 262144, (int) (byte) 100);
        textBuffer1.resetWithShared(charArray67, (int) (short) 100, (int) (short) 100);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = textBuffer1.setCurrentAndReturn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] {});
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength((int) (short) 0);
        char[] charArray16 = textBuffer13.getTextBuffer();
        int int17 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        int int26 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        boolean boolean36 = textBuffer35.hasTextAsCharacters();
        int int37 = textBuffer35.size();
        textBuffer35.resetWithEmpty();
        char[] charArray39 = textBuffer35.getCurrentSegment();
        textBuffer31.resetWithShared(charArray39, (int) (short) 1, (int) '4');
        textBuffer28.resetWithShared(charArray39, (int) ' ', (int) (short) 0);
        textBuffer19.resetWithCopy(charArray39, (int) (short) 1, (int) (byte) 10);
        textBuffer13.resetWithShared(charArray39, (int) (short) 100, (int) '#');
        textBuffer1.resetWithShared(charArray39, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler55 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer56 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler55);
        boolean boolean57 = textBuffer56.hasTextAsCharacters();
        char[] charArray58 = textBuffer56.emptyAndGetCurrentSegment();
        char[] charArray59 = textBuffer56.contentsAsArray();
        textBuffer1.resetWithShared(charArray59, 262144, (int) (byte) 100);
        int int63 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 262144, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262244 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 262144 + "'", int63 == 262144);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 99, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        int int13 = textBuffer11.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        int int17 = textBuffer15.size();
        textBuffer15.resetWithEmpty();
        char[] charArray19 = textBuffer15.getCurrentSegment();
        textBuffer11.resetWithShared(charArray19, (int) (short) 1, (int) '4');
        textBuffer8.resetWithShared(charArray19, (int) ' ', (int) (short) 0);
        textBuffer1.resetWithShared(charArray19, (int) (byte) 1, (int) '4');
        textBuffer1.setCurrentLength((int) (short) 100);
        java.lang.String str31 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = textBuffer1.setCurrentAndReturn((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str31, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength((int) (short) 0);
        char[] charArray16 = textBuffer13.getTextBuffer();
        int int17 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        int int26 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        boolean boolean36 = textBuffer35.hasTextAsCharacters();
        int int37 = textBuffer35.size();
        textBuffer35.resetWithEmpty();
        char[] charArray39 = textBuffer35.getCurrentSegment();
        textBuffer31.resetWithShared(charArray39, (int) (short) 1, (int) '4');
        textBuffer28.resetWithShared(charArray39, (int) ' ', (int) (short) 0);
        textBuffer19.resetWithCopy(charArray39, (int) (short) 1, (int) (byte) 10);
        textBuffer13.resetWithShared(charArray39, (int) (short) 100, (int) '#');
        textBuffer1.resetWithShared(charArray39, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler55 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer56 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler55);
        boolean boolean57 = textBuffer56.hasTextAsCharacters();
        char[] charArray58 = textBuffer56.emptyAndGetCurrentSegment();
        char[] charArray59 = textBuffer56.contentsAsArray();
        textBuffer1.resetWithShared(charArray59, 262144, (int) (byte) 100);
        int int63 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray64 = textBuffer1.contentsAsArray();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -262144 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 262144 + "'", int63 == 262144);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getTextBuffer();
        java.lang.String str9 = textBuffer6.contentsAsString();
        boolean boolean10 = textBuffer6.hasTextAsCharacters();
        textBuffer6.append('4');
        char[] charArray13 = textBuffer6.contentsAsArray();
        char[] charArray14 = textBuffer6.contentsAsArray();
        textBuffer1.resetWithCopy(charArray14, (int) (byte) 1, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        char[] charArray20 = textBuffer19.emptyAndGetCurrentSegment();
        java.lang.String str21 = textBuffer19.toString();
        int int22 = textBuffer19.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        boolean boolean25 = textBuffer24.hasTextAsCharacters();
        char[] charArray26 = textBuffer24.getTextBuffer();
        java.lang.String str27 = textBuffer24.contentsAsString();
        boolean boolean28 = textBuffer24.hasTextAsCharacters();
        textBuffer24.append('4');
        char[] charArray31 = textBuffer24.contentsAsArray();
        char[] charArray32 = textBuffer24.contentsAsArray();
        textBuffer19.resetWithCopy(charArray32, (int) (byte) 1, 0);
        char[] charArray36 = textBuffer19.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray36, (int) 'a', 1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        boolean boolean42 = textBuffer41.hasTextAsCharacters();
        int int43 = textBuffer41.size();
        textBuffer41.resetWithString("hi!");
        java.lang.String str46 = textBuffer41.contentsAsString();
        java.lang.String str47 = textBuffer41.toString();
        char[] charArray48 = textBuffer41.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray48, 0, (int) ' ');
        java.lang.Class<?> wildcardClass52 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray8 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(charArray8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength((int) (short) 0);
        char[] charArray12 = textBuffer9.getTextBuffer();
        java.lang.String str13 = textBuffer9.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        int int17 = textBuffer15.size();
        textBuffer15.resetWithEmpty();
        char[] charArray19 = textBuffer15.getCurrentSegment();
        textBuffer15.resetWithString("");
        int int22 = textBuffer15.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        int int25 = textBuffer24.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        boolean boolean28 = textBuffer27.hasTextAsCharacters();
        int int29 = textBuffer27.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        textBuffer31.resetWithEmpty();
        char[] charArray35 = textBuffer31.getCurrentSegment();
        textBuffer27.resetWithShared(charArray35, (int) (short) 1, (int) '4');
        textBuffer24.resetWithShared(charArray35, (int) ' ', (int) (short) 0);
        textBuffer15.resetWithCopy(charArray35, (int) (short) 1, (int) (byte) 10);
        textBuffer9.resetWithShared(charArray35, 1, 1000);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray35, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray35);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"hi!\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = textBuffer1.setCurrentAndReturn(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength((int) (short) 0);
        int int12 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.resetWithString("");
        boolean boolean15 = textBuffer9.hasTextAsCharacters();
        textBuffer9.setCurrentLength((int) (byte) 100);
        textBuffer9.ensureNotShared();
        textBuffer9.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength((int) (short) 0);
        char[] charArray24 = textBuffer21.getTextBuffer();
        int int25 = textBuffer21.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        boolean boolean28 = textBuffer27.hasTextAsCharacters();
        int int29 = textBuffer27.size();
        textBuffer27.resetWithEmpty();
        char[] charArray31 = textBuffer27.getCurrentSegment();
        textBuffer27.resetWithString("");
        int int34 = textBuffer27.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        boolean boolean40 = textBuffer39.hasTextAsCharacters();
        int int41 = textBuffer39.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        boolean boolean44 = textBuffer43.hasTextAsCharacters();
        int int45 = textBuffer43.size();
        textBuffer43.resetWithEmpty();
        char[] charArray47 = textBuffer43.getCurrentSegment();
        textBuffer39.resetWithShared(charArray47, (int) (short) 1, (int) '4');
        textBuffer36.resetWithShared(charArray47, (int) ' ', (int) (short) 0);
        textBuffer27.resetWithCopy(charArray47, (int) (short) 1, (int) (byte) 10);
        textBuffer21.resetWithShared(charArray47, (int) (short) 100, (int) '#');
        textBuffer9.resetWithShared(charArray47, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler63 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer64 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler63);
        boolean boolean65 = textBuffer64.hasTextAsCharacters();
        char[] charArray66 = textBuffer64.emptyAndGetCurrentSegment();
        char[] charArray67 = textBuffer64.contentsAsArray();
        textBuffer9.resetWithShared(charArray67, 262144, (int) (byte) 100);
        textBuffer1.resetWithShared(charArray67, (int) (short) 100, (int) (short) 100);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal75 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] {});
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.setCurrentAndReturn(10);
        char[] charArray10 = textBuffer1.getTextBuffer();
        java.lang.String str11 = textBuffer1.toString();
        char[] charArray12 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str11, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.toString();
        java.lang.String str7 = textBuffer1.toString();
        java.lang.String str8 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = textBuffer1.setCurrentAndReturn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str7 = textBuffer1.contentsAsString();
        int int8 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        textBuffer10.resetWithEmpty();
        char[] charArray13 = textBuffer10.contentsAsArray();
        char[] charArray14 = textBuffer10.contentsAsArray();
        textBuffer10.releaseBuffers();
        char[] charArray16 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray17 = textBuffer10.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray17, 97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", (int) '#', 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end 1035, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray5 = textBuffer1.expandCurrentSegment((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        char[] charArray12 = textBuffer10.getTextBuffer();
        java.lang.String str13 = textBuffer10.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray17, 0, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        boolean boolean23 = textBuffer22.hasTextAsCharacters();
        char[] charArray24 = textBuffer22.getTextBuffer();
        java.lang.String str25 = textBuffer22.contentsAsString();
        boolean boolean26 = textBuffer22.hasTextAsCharacters();
        java.lang.String str27 = textBuffer22.contentsAsString();
        char[] charArray28 = textBuffer22.getTextBuffer();
        char[] charArray29 = textBuffer22.getCurrentSegment();
        textBuffer10.resetWithShared(charArray29, (int) 'a', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray29, 262144, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        int int12 = textBuffer10.size();
        textBuffer10.resetWithEmpty();
        char[] charArray14 = textBuffer10.getCurrentSegment();
        textBuffer10.resetWithString("");
        java.lang.String str18 = textBuffer10.setCurrentAndReturn(10);
        char[] charArray19 = textBuffer10.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray19, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str18, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength((int) (short) -1);
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        textBuffer15.resetWithEmpty();
        java.lang.String str18 = textBuffer15.toString();
        textBuffer15.releaseBuffers();
        char[] charArray20 = textBuffer15.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray20, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.toString();
        java.lang.String str8 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        java.lang.String str8 = textBuffer1.setCurrentAndReturn((int) (byte) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.emptyAndGetCurrentSegment();
        textBuffer10.setCurrentLength((int) '4');
        char[] charArray14 = textBuffer10.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray14, (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        char[] charArray11 = textBuffer9.emptyAndGetCurrentSegment();
        int int12 = textBuffer9.size();
        char[] charArray13 = textBuffer9.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        int int17 = textBuffer15.size();
        textBuffer15.resetWithEmpty();
        char[] charArray19 = textBuffer15.getCurrentSegment();
        textBuffer15.resetWithString("");
        char[] charArray22 = textBuffer15.getCurrentSegment();
        java.lang.String str23 = textBuffer15.contentsAsString();
        char[] charArray24 = textBuffer15.getTextBuffer();
        textBuffer9.resetWithShared(charArray24, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray24, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass6 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        java.lang.String str8 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (short) 1);
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        int int7 = textBuffer5.size();
        textBuffer5.resetWithEmpty();
        char[] charArray9 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, (int) (short) 1, (int) '4');
        int int13 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        int int17 = textBuffer15.size();
        textBuffer15.resetWithEmpty();
        char[] charArray19 = textBuffer15.getCurrentSegment();
        char[] charArray20 = textBuffer15.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray25 = textBuffer1.expandCurrentSegment((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        char[] charArray12 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("a");
        int int15 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        boolean boolean18 = textBuffer17.hasTextAsCharacters();
        char[] charArray19 = textBuffer17.getTextBuffer();
        java.lang.String str20 = textBuffer17.contentsAsString();
        boolean boolean21 = textBuffer17.hasTextAsCharacters();
        textBuffer17.append('4');
        char[] charArray24 = textBuffer17.contentsAsArray();
        char[] charArray25 = textBuffer17.contentsAsArray();
        char[] charArray26 = textBuffer17.getTextBuffer();
        double double27 = textBuffer17.contentsAsDouble();
        char[] charArray28 = textBuffer17.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray28, 10, 52);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.0d + "'", double27 == 4.0d);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.setCurrentAndReturn(10);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 110, length 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        char[] charArray14 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.size();
        int int9 = textBuffer1.size();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = textBuffer1.setCurrentAndReturn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count -1, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray13 = textBuffer1.expandCurrentSegment((int) '#');
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        int int6 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        int int7 = textBuffer5.size();
        textBuffer5.resetWithEmpty();
        char[] charArray9 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, (int) (short) 1, (int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.setCurrentLength((int) (short) 0);
        int int17 = textBuffer14.getCurrentSegmentSize();
        textBuffer14.resetWithString("");
        boolean boolean20 = textBuffer14.hasTextAsCharacters();
        textBuffer14.setCurrentLength((int) (byte) 100);
        char[] charArray23 = textBuffer14.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        boolean boolean26 = textBuffer25.hasTextAsCharacters();
        int int27 = textBuffer25.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        boolean boolean30 = textBuffer29.hasTextAsCharacters();
        int int31 = textBuffer29.size();
        textBuffer29.resetWithEmpty();
        char[] charArray33 = textBuffer29.getCurrentSegment();
        textBuffer25.resetWithShared(charArray33, (int) (short) 1, (int) '4');
        textBuffer14.resetWithShared(charArray33, 262144, (int) (byte) 1);
        char[] charArray41 = textBuffer14.expandCurrentSegment(10);
        textBuffer1.append(charArray41, 3, (int) (byte) 100);
        char[] charArray46 = textBuffer1.expandCurrentSegment((int) '4');
        java.lang.Class<?> wildcardClass47 = charArray46.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        int int11 = textBuffer1.getTextOffset();
        char[] charArray12 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = textBuffer1.setCurrentAndReturn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        char[] charArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray7, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        int int7 = textBuffer5.size();
        textBuffer5.resetWithEmpty();
        char[] charArray9 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, (int) (short) 1, (int) '4');
        int int13 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        int int17 = textBuffer15.size();
        textBuffer15.resetWithEmpty();
        char[] charArray19 = textBuffer15.getCurrentSegment();
        char[] charArray20 = textBuffer15.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            double double6 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 110, length 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getTextBuffer();
        java.lang.String str9 = textBuffer6.contentsAsString();
        boolean boolean10 = textBuffer6.hasTextAsCharacters();
        textBuffer6.append('4');
        char[] charArray13 = textBuffer6.contentsAsArray();
        char[] charArray14 = textBuffer6.contentsAsArray();
        textBuffer1.resetWithCopy(charArray14, (int) (byte) 1, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        char[] charArray26 = textBuffer19.getCurrentSegment();
        textBuffer1.resetWithShared(charArray26, (int) (byte) 1, 1000);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1001 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.setCurrentLength((int) (short) 0);
        int int11 = textBuffer8.getCurrentSegmentSize();
        textBuffer8.resetWithString("");
        boolean boolean14 = textBuffer8.hasTextAsCharacters();
        textBuffer8.setCurrentLength((int) (byte) 100);
        char[] charArray17 = textBuffer8.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        boolean boolean24 = textBuffer23.hasTextAsCharacters();
        int int25 = textBuffer23.size();
        textBuffer23.resetWithEmpty();
        char[] charArray27 = textBuffer23.getCurrentSegment();
        textBuffer19.resetWithShared(charArray27, (int) (short) 1, (int) '4');
        textBuffer8.resetWithShared(charArray27, 262144, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray27, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray27);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        boolean boolean8 = textBuffer7.hasTextAsCharacters();
        int int9 = textBuffer7.size();
        textBuffer7.resetWithEmpty();
        char[] charArray11 = textBuffer7.getCurrentSegment();
        textBuffer7.resetWithString("");
        char[] charArray14 = textBuffer7.getCurrentSegment();
        char[] charArray15 = textBuffer7.getTextBuffer();
        char[] charArray16 = textBuffer7.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        boolean boolean19 = textBuffer18.hasTextAsCharacters();
        int int20 = textBuffer18.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        boolean boolean23 = textBuffer22.hasTextAsCharacters();
        int int24 = textBuffer22.size();
        textBuffer22.resetWithEmpty();
        char[] charArray26 = textBuffer22.getCurrentSegment();
        textBuffer18.resetWithShared(charArray26, (int) (short) 1, (int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        textBuffer31.setCurrentLength((int) (short) 0);
        int int34 = textBuffer31.getCurrentSegmentSize();
        textBuffer31.resetWithString("");
        boolean boolean37 = textBuffer31.hasTextAsCharacters();
        textBuffer31.setCurrentLength((int) (byte) 100);
        char[] charArray40 = textBuffer31.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        boolean boolean43 = textBuffer42.hasTextAsCharacters();
        int int44 = textBuffer42.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer46 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler45);
        boolean boolean47 = textBuffer46.hasTextAsCharacters();
        int int48 = textBuffer46.size();
        textBuffer46.resetWithEmpty();
        char[] charArray50 = textBuffer46.getCurrentSegment();
        textBuffer42.resetWithShared(charArray50, (int) (short) 1, (int) '4');
        textBuffer31.resetWithShared(charArray50, 262144, (int) (byte) 1);
        char[] charArray58 = textBuffer31.expandCurrentSegment(10);
        textBuffer18.append(charArray58, 3, (int) (byte) 100);
        char[] charArray63 = textBuffer18.expandCurrentSegment((int) '4');
        textBuffer7.resetWithShared(charArray63, (int) (short) 100, 52);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray63, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray63);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.expandCurrentSegment((int) (short) 0);
        int int18 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        int int20 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        int int8 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 194, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray8 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4\000\000\000\000\000\000\000\000\000", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 11, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(charArray8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        int int19 = textBuffer1.size();
        char[] charArray20 = textBuffer1.emptyAndGetCurrentSegment();
        int int21 = textBuffer1.getCurrentSegmentSize();
        char[] charArray23 = textBuffer1.expandCurrentSegment(100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        boolean boolean26 = textBuffer25.hasTextAsCharacters();
        char[] charArray27 = textBuffer25.getTextBuffer();
        java.lang.String str28 = textBuffer25.contentsAsString();
        textBuffer25.append('4');
        textBuffer25.ensureNotShared();
        boolean boolean32 = textBuffer25.hasTextAsCharacters();
        char[] charArray33 = textBuffer25.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray33, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(charArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4' });
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 97, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        char[] charArray10 = textBuffer1.getTextBuffer();
        int int11 = textBuffer1.getCurrentSegmentSize();
        char[] charArray12 = textBuffer1.contentsAsArray();
        java.lang.String str13 = textBuffer1.toString();
        java.lang.Class<?> wildcardClass14 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str5 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        char[] charArray13 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = textBuffer1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 10, count 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        int int3 = textBuffer1.getCurrentSegmentSize();
        char[] charArray4 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(262144);
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.emptyAndGetCurrentSegment();
        java.lang.String str11 = textBuffer9.toString();
        textBuffer9.setCurrentLength(52);
        char[] charArray14 = textBuffer9.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray14, 262144, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 262144 + "'", int7 == 262144);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        char[] charArray13 = textBuffer9.getCurrentSegment();
        textBuffer9.resetWithString("");
        char[] charArray16 = textBuffer9.getCurrentSegment();
        char[] charArray17 = textBuffer9.getTextBuffer();
        textBuffer1.resetWithShared(charArray17, (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray21 = textBuffer1.getCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        char[] charArray7 = textBuffer5.getTextBuffer();
        java.lang.String str8 = textBuffer5.contentsAsString();
        boolean boolean9 = textBuffer5.hasTextAsCharacters();
        java.lang.String str11 = textBuffer5.setCurrentAndReturn(0);
        char[] charArray12 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = textBuffer1.setCurrentAndReturn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count -1, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray13 = textBuffer1.expandCurrentSegment((int) '#');
        int int14 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int9 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getTextBuffer();
        java.lang.String str9 = textBuffer6.contentsAsString();
        boolean boolean10 = textBuffer6.hasTextAsCharacters();
        java.lang.String str12 = textBuffer6.setCurrentAndReturn(0);
        char[] charArray13 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithShared(charArray13, (int) 'a', 262144);
        textBuffer1.setCurrentLength(0);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 97, count 262144, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        textBuffer9.resetWithEmpty();
        boolean boolean14 = textBuffer9.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        char[] charArray18 = textBuffer16.getCurrentSegment();
        textBuffer9.resetWithShared(charArray18, (int) '4', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray18, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4\000\000\000\000\000\000\000\000\000", (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getTextBuffer();
        java.lang.String str11 = textBuffer8.contentsAsString();
        boolean boolean12 = textBuffer8.hasTextAsCharacters();
        textBuffer8.append('4');
        char[] charArray15 = textBuffer8.contentsAsArray();
        char[] charArray16 = textBuffer8.contentsAsArray();
        char[] charArray17 = textBuffer8.getTextBuffer();
        char[] charArray18 = textBuffer8.contentsAsArray();
        textBuffer1.resetWithShared(charArray18, (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 87 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4' });
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength((int) (short) 0);
        int int12 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.resetWithString("");
        boolean boolean15 = textBuffer9.hasTextAsCharacters();
        textBuffer9.setCurrentLength((int) (byte) 100);
        textBuffer9.ensureNotShared();
        textBuffer9.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength((int) (short) 0);
        char[] charArray24 = textBuffer21.getTextBuffer();
        int int25 = textBuffer21.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        boolean boolean28 = textBuffer27.hasTextAsCharacters();
        int int29 = textBuffer27.size();
        textBuffer27.resetWithEmpty();
        char[] charArray31 = textBuffer27.getCurrentSegment();
        textBuffer27.resetWithString("");
        int int34 = textBuffer27.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        boolean boolean40 = textBuffer39.hasTextAsCharacters();
        int int41 = textBuffer39.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        boolean boolean44 = textBuffer43.hasTextAsCharacters();
        int int45 = textBuffer43.size();
        textBuffer43.resetWithEmpty();
        char[] charArray47 = textBuffer43.getCurrentSegment();
        textBuffer39.resetWithShared(charArray47, (int) (short) 1, (int) '4');
        textBuffer36.resetWithShared(charArray47, (int) ' ', (int) (short) 0);
        textBuffer27.resetWithCopy(charArray47, (int) (short) 1, (int) (byte) 10);
        textBuffer21.resetWithShared(charArray47, (int) (short) 100, (int) '#');
        textBuffer9.resetWithShared(charArray47, 10, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler63 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer64 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler63);
        boolean boolean65 = textBuffer64.hasTextAsCharacters();
        char[] charArray66 = textBuffer64.emptyAndGetCurrentSegment();
        char[] charArray67 = textBuffer64.contentsAsArray();
        textBuffer9.resetWithShared(charArray67, 262144, (int) (byte) 100);
        textBuffer1.resetWithShared(charArray67, (int) (short) 100, (int) (short) 100);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray75 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] {});
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('4');
        char[] charArray10 = textBuffer1.expandCurrentSegment(1000);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        char[] charArray6 = textBuffer5.emptyAndGetCurrentSegment();
        int int7 = textBuffer5.getTextOffset();
        textBuffer5.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray10 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '#', (int) (short) 0);
        int int14 = textBuffer1.size();
        boolean boolean15 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.contentsAsArray();
        int int9 = textBuffer1.getTextOffset();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass11 = charArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        java.lang.String str7 = textBuffer1.contentsAsString();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        int int12 = textBuffer1.getCurrentSegmentSize();
        char[] charArray13 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        textBuffer15.resetWithEmpty();
        char[] charArray18 = textBuffer15.contentsAsArray();
        char[] charArray19 = textBuffer15.contentsAsArray();
        int int20 = textBuffer15.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        boolean boolean23 = textBuffer22.hasTextAsCharacters();
        char[] charArray24 = textBuffer22.getTextBuffer();
        java.lang.String str25 = textBuffer22.contentsAsString();
        boolean boolean26 = textBuffer22.hasTextAsCharacters();
        textBuffer22.append('4');
        char[] charArray29 = textBuffer22.contentsAsArray();
        char[] charArray30 = textBuffer22.contentsAsArray();
        char[] charArray31 = textBuffer22.getTextBuffer();
        char[] charArray32 = textBuffer22.contentsAsArray();
        textBuffer15.resetWithShared(charArray32, (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray32, 1000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1010 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4' });
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        int int19 = textBuffer1.size();
        char[] charArray20 = textBuffer1.emptyAndGetCurrentSegment();
        int int21 = textBuffer1.getTextOffset();
        int int22 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray25 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = textBuffer1.setCurrentAndReturn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count -1, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.append('a');
        textBuffer1.resetWithString("");
        int int13 = textBuffer1.size();
        java.lang.Class<?> wildcardClass14 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        int int14 = textBuffer12.size();
        textBuffer12.resetWithEmpty();
        char[] charArray16 = textBuffer12.getCurrentSegment();
        textBuffer12.resetWithString("");
        char[] charArray19 = textBuffer12.getCurrentSegment();
        char[] charArray20 = textBuffer12.getTextBuffer();
        char[] charArray21 = textBuffer12.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray21, 262144, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        char[] charArray10 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass11 = charArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.getCurrentSegmentSize();
        char[] charArray7 = textBuffer1.getTextBuffer();
        char[] charArray8 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("a");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        char[] charArray7 = textBuffer5.getTextBuffer();
        java.lang.String str8 = textBuffer5.contentsAsString();
        boolean boolean9 = textBuffer5.hasTextAsCharacters();
        java.lang.String str11 = textBuffer5.setCurrentAndReturn(0);
        char[] charArray12 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (int) (short) 1, (int) (short) 1);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.expandCurrentSegment((int) (short) 0);
        int int18 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int20 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray13 = textBuffer1.expandCurrentSegment((int) '#');
        textBuffer1.setCurrentLength(0);
        int int16 = textBuffer1.getCurrentSegmentSize();
        char[] charArray17 = textBuffer1.getCurrentSegment();
        java.lang.String str18 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str18, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        int int8 = textBuffer6.size();
        textBuffer6.resetWithEmpty();
        char[] charArray10 = textBuffer6.getCurrentSegment();
        textBuffer6.resetWithString("");
        char[] charArray13 = textBuffer6.emptyAndGetCurrentSegment();
        char[] charArray14 = textBuffer6.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray14, 52, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str7 = textBuffer1.contentsAsString();
        int int8 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str7 = textBuffer1.contentsAsString();
        int int8 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int9 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        char[] charArray13 = textBuffer11.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray13, 1000, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.expandCurrentSegment((int) (short) 0);
        int int18 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        int int20 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 11, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        int int14 = textBuffer12.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        int int18 = textBuffer16.size();
        textBuffer16.resetWithEmpty();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        textBuffer12.resetWithShared(charArray20, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray20, 262144, (int) (byte) 1);
        char[] charArray28 = textBuffer1.expandCurrentSegment(10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262145 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        java.lang.Class<?> wildcardClass4 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        boolean boolean8 = textBuffer7.hasTextAsCharacters();
        char[] charArray9 = textBuffer7.getTextBuffer();
        java.lang.String str10 = textBuffer7.contentsAsString();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        java.lang.String str13 = textBuffer7.setCurrentAndReturn(0);
        char[] charArray15 = new char[] { '#' };
        textBuffer7.resetWithShared(charArray15, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray15, 100, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1100 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#' });
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str5 = textBuffer1.setCurrentAndReturn((int) (byte) 10);
        char[] charArray7 = textBuffer1.expandCurrentSegment(1000);
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str5, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength((int) (short) 0);
        char[] charArray14 = textBuffer11.getTextBuffer();
        int int15 = textBuffer11.size();
        char[] charArray16 = textBuffer11.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray16, 3, 1);
        boolean boolean20 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.expandCurrentSegment((int) (short) 0);
        int int18 = textBuffer1.size();
        java.lang.String str19 = textBuffer1.toString();
        int int20 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str19, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        textBuffer1.releaseBuffers();
        textBuffer1.append("hi!", (int) (byte) 0, 3);
        char[] charArray17 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 132, length 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.expandCurrentSegment(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        textBuffer1.releaseBuffers();
        int int14 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        int int18 = textBuffer16.size();
        textBuffer16.resetWithEmpty();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        textBuffer16.resetWithString("");
        java.lang.String str24 = textBuffer16.setCurrentAndReturn(10);
        char[] charArray25 = textBuffer16.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray25, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str24, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.lang.String str11 = textBuffer1.setCurrentAndReturn((int) '#');
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str11, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str5 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getTextBuffer();
        java.lang.String str9 = textBuffer6.contentsAsString();
        boolean boolean10 = textBuffer6.hasTextAsCharacters();
        textBuffer6.append('4');
        char[] charArray13 = textBuffer6.contentsAsArray();
        char[] charArray14 = textBuffer6.contentsAsArray();
        textBuffer1.resetWithCopy(charArray14, (int) (byte) 1, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        char[] charArray26 = textBuffer19.getCurrentSegment();
        textBuffer1.resetWithShared(charArray26, (int) (byte) 1, 1000);
        java.lang.Class<?> wildcardClass30 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        java.lang.String str7 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = textBuffer1.setCurrentAndReturn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        char[] charArray14 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass15 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        int int10 = textBuffer1.getTextOffset();
        int int11 = textBuffer1.getTextOffset();
        char[] charArray12 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4' });
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.emptyAndGetCurrentSegment();
        java.lang.String str9 = textBuffer7.toString();
        int int10 = textBuffer7.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        char[] charArray14 = textBuffer12.getTextBuffer();
        java.lang.String str15 = textBuffer12.contentsAsString();
        boolean boolean16 = textBuffer12.hasTextAsCharacters();
        textBuffer12.append('4');
        char[] charArray19 = textBuffer12.contentsAsArray();
        char[] charArray20 = textBuffer12.contentsAsArray();
        textBuffer7.resetWithCopy(charArray20, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray20, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4' });
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        int int8 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        char[] charArray12 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.expandCurrentSegment((int) (short) 1);
        int int9 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("hi!");
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.setCurrentLength((int) (short) 0);
        char[] charArray17 = textBuffer14.getTextBuffer();
        int int18 = textBuffer14.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        boolean boolean21 = textBuffer20.hasTextAsCharacters();
        int int22 = textBuffer20.size();
        textBuffer20.resetWithEmpty();
        char[] charArray24 = textBuffer20.getCurrentSegment();
        textBuffer20.resetWithString("");
        int int27 = textBuffer20.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer32 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler31);
        boolean boolean33 = textBuffer32.hasTextAsCharacters();
        int int34 = textBuffer32.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        boolean boolean37 = textBuffer36.hasTextAsCharacters();
        int int38 = textBuffer36.size();
        textBuffer36.resetWithEmpty();
        char[] charArray40 = textBuffer36.getCurrentSegment();
        textBuffer32.resetWithShared(charArray40, (int) (short) 1, (int) '4');
        textBuffer29.resetWithShared(charArray40, (int) ' ', (int) (short) 0);
        textBuffer20.resetWithCopy(charArray40, (int) (short) 1, (int) (byte) 10);
        textBuffer14.resetWithShared(charArray40, (int) (short) 100, (int) '#');
        char[] charArray53 = textBuffer14.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray53, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(charArray53);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.append('4');
        char[] charArray11 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass12 = charArray11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4' });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 97, length 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 197, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str9 = textBuffer1.toString();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        java.lang.String str11 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 9, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str7 = textBuffer1.contentsAsString();
        int int8 = textBuffer1.size();
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        char[] charArray14 = textBuffer12.getCurrentSegment();
        char[] charArray15 = textBuffer12.contentsAsArray();
        char[] charArray16 = textBuffer12.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray16, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength((int) (short) 0);
        char[] charArray16 = textBuffer13.getTextBuffer();
        int int17 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        int int26 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        boolean boolean36 = textBuffer35.hasTextAsCharacters();
        int int37 = textBuffer35.size();
        textBuffer35.resetWithEmpty();
        char[] charArray39 = textBuffer35.getCurrentSegment();
        textBuffer31.resetWithShared(charArray39, (int) (short) 1, (int) '4');
        textBuffer28.resetWithShared(charArray39, (int) ' ', (int) (short) 0);
        textBuffer19.resetWithCopy(charArray39, (int) (short) 1, (int) (byte) 10);
        textBuffer13.resetWithShared(charArray39, (int) (short) 100, (int) '#');
        textBuffer1.resetWithShared(charArray39, 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass55 = charArray39.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        char[] charArray10 = textBuffer1.getTextBuffer();
        int int11 = textBuffer1.getCurrentSegmentSize();
        char[] charArray12 = textBuffer1.contentsAsArray();
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 10, (int) (byte) 0);
        java.lang.String str17 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        char[] charArray20 = textBuffer19.emptyAndGetCurrentSegment();
        java.lang.String str21 = textBuffer19.toString();
        textBuffer19.setCurrentLength(52);
        textBuffer19.releaseBuffers();
        char[] charArray25 = textBuffer19.getCurrentSegment();
        char[] charArray26 = textBuffer19.contentsAsArray();
        int int27 = textBuffer19.getTextOffset();
        java.lang.String str28 = textBuffer19.toString();
        char[] charArray29 = textBuffer19.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray29, 262144, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262176 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        char[] charArray12 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("a");
        int int15 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal18 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = textBuffer1.setCurrentAndReturn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        textBuffer8.resetWithEmpty();
        char[] charArray11 = textBuffer8.contentsAsArray();
        char[] charArray12 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray12, 0, (int) ' ');
        java.lang.Class<?> wildcardClass16 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getCurrentSegmentSize();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.expandCurrentSegment((int) (short) 0);
        char[] charArray18 = textBuffer1.getCurrentSegment();
        int int19 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"????????????????????????????????????????????????????????????????????????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        int int3 = textBuffer1.getCurrentSegmentSize();
        char[] charArray4 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = textBuffer1.setCurrentAndReturn(3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        boolean boolean8 = textBuffer7.hasTextAsCharacters();
        char[] charArray9 = textBuffer7.getTextBuffer();
        java.lang.String str10 = textBuffer7.contentsAsString();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        textBuffer7.append('4');
        char[] charArray14 = textBuffer7.contentsAsArray();
        char[] charArray15 = textBuffer7.contentsAsArray();
        char[] charArray16 = textBuffer7.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray16, 3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 103 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getTextOffset();
        int int9 = textBuffer7.getCurrentSegmentSize();
        char[] charArray10 = textBuffer7.getTextBuffer();
        textBuffer7.setCurrentLength(262144);
        char[] charArray13 = textBuffer7.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray13, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getTextBuffer();
        java.lang.String str9 = textBuffer6.contentsAsString();
        boolean boolean10 = textBuffer6.hasTextAsCharacters();
        java.lang.String str12 = textBuffer6.setCurrentAndReturn(0);
        char[] charArray14 = new char[] { '#' };
        textBuffer6.resetWithShared(charArray14, (int) (short) 10, (int) (short) 1);
        textBuffer6.releaseBuffers();
        int int19 = textBuffer6.getCurrentSegmentSize();
        char[] charArray20 = textBuffer6.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, 1000, 262144);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1000, count 262144, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getTextBuffer();
        java.lang.String str11 = textBuffer8.contentsAsString();
        boolean boolean12 = textBuffer8.hasTextAsCharacters();
        textBuffer8.append('4');
        char[] charArray15 = textBuffer8.contentsAsArray();
        char[] charArray16 = textBuffer8.contentsAsArray();
        char[] charArray17 = textBuffer8.getTextBuffer();
        char[] charArray18 = textBuffer8.contentsAsArray();
        textBuffer1.resetWithShared(charArray18, (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray23 = textBuffer1.expandCurrentSegment((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4' });
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        int int14 = textBuffer12.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        int int18 = textBuffer16.size();
        textBuffer16.resetWithEmpty();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        textBuffer12.resetWithShared(charArray20, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray20, 262144, (int) (byte) 1);
        boolean boolean27 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("hi!");
        java.lang.Class<?> wildcardClass30 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("hi!");
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        int int14 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        char[] charArray18 = textBuffer16.emptyAndGetCurrentSegment();
        int int19 = textBuffer16.size();
        char[] charArray20 = textBuffer16.contentsAsArray();
        char[] charArray21 = textBuffer16.getTextBuffer();
        textBuffer1.resetWithShared(charArray21, (int) '#', (int) (short) 10);
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        java.lang.String str14 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.expandCurrentSegment((int) (short) 0);
        int int18 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        boolean boolean21 = textBuffer20.hasTextAsCharacters();
        int int22 = textBuffer20.size();
        textBuffer20.resetWithEmpty();
        char[] charArray24 = textBuffer20.getCurrentSegment();
        textBuffer20.resetWithString("");
        char[] charArray27 = textBuffer20.getCurrentSegment();
        java.lang.String str28 = textBuffer20.contentsAsString();
        textBuffer20.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray32 = textBuffer20.expandCurrentSegment((int) '#');
        textBuffer20.setCurrentLength(0);
        int int35 = textBuffer20.getCurrentSegmentSize();
        char[] charArray36 = textBuffer20.getCurrentSegment();
        textBuffer1.resetWithShared(charArray36, 262144, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double40 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 262144, count 35, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray36);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        int int13 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        textBuffer15.resetWithEmpty();
        char[] charArray18 = textBuffer15.contentsAsArray();
        char[] charArray19 = textBuffer15.contentsAsArray();
        textBuffer15.releaseBuffers();
        textBuffer15.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        boolean boolean24 = textBuffer23.hasTextAsCharacters();
        int int25 = textBuffer23.size();
        textBuffer23.resetWithEmpty();
        char[] charArray27 = textBuffer23.getCurrentSegment();
        textBuffer15.resetWithCopy(charArray27, 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray27, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray27);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        java.lang.String str8 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        char[] charArray12 = textBuffer10.getTextBuffer();
        java.lang.String str13 = textBuffer10.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray17, 0, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        boolean boolean23 = textBuffer22.hasTextAsCharacters();
        char[] charArray24 = textBuffer22.getTextBuffer();
        java.lang.String str25 = textBuffer22.contentsAsString();
        boolean boolean26 = textBuffer22.hasTextAsCharacters();
        java.lang.String str27 = textBuffer22.contentsAsString();
        char[] charArray28 = textBuffer22.getTextBuffer();
        char[] charArray29 = textBuffer22.getCurrentSegment();
        textBuffer10.resetWithShared(charArray29, (int) 'a', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray29, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(0);
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength((int) (short) 0);
        char[] charArray16 = textBuffer13.getTextBuffer();
        java.lang.String str17 = textBuffer13.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("");
        int int26 = textBuffer19.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        boolean boolean36 = textBuffer35.hasTextAsCharacters();
        int int37 = textBuffer35.size();
        textBuffer35.resetWithEmpty();
        char[] charArray39 = textBuffer35.getCurrentSegment();
        textBuffer31.resetWithShared(charArray39, (int) (short) 1, (int) '4');
        textBuffer28.resetWithShared(charArray39, (int) ' ', (int) (short) 0);
        textBuffer19.resetWithCopy(charArray39, (int) (short) 1, (int) (byte) 10);
        textBuffer13.resetWithShared(charArray39, 1, 1000);
        textBuffer1.resetWithShared(charArray39, 100, 262144);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray55 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.emptyAndGetCurrentSegment();
        java.lang.String str9 = textBuffer7.toString();
        textBuffer7.setCurrentLength(52);
        textBuffer7.releaseBuffers();
        char[] charArray13 = textBuffer7.emptyAndGetCurrentSegment();
        char[] charArray15 = textBuffer7.expandCurrentSegment((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray15, 1000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.setCurrentAndReturn(10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength((int) (short) 0);
        char[] charArray14 = textBuffer11.getTextBuffer();
        java.lang.String str15 = textBuffer11.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        boolean boolean18 = textBuffer17.hasTextAsCharacters();
        int int19 = textBuffer17.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        boolean boolean22 = textBuffer21.hasTextAsCharacters();
        int int23 = textBuffer21.size();
        textBuffer21.resetWithEmpty();
        char[] charArray25 = textBuffer21.getCurrentSegment();
        textBuffer17.resetWithShared(charArray25, (int) (short) 1, (int) '4');
        textBuffer11.resetWithShared(charArray25, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray25, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        int int13 = textBuffer11.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        int int17 = textBuffer15.size();
        textBuffer15.resetWithEmpty();
        char[] charArray19 = textBuffer15.getCurrentSegment();
        textBuffer11.resetWithShared(charArray19, (int) (short) 1, (int) '4');
        textBuffer8.resetWithShared(charArray19, (int) ' ', (int) (short) 0);
        textBuffer1.resetWithShared(charArray19, (int) (byte) 1, (int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        boolean boolean31 = textBuffer30.hasTextAsCharacters();
        int int32 = textBuffer30.size();
        textBuffer30.resetWithEmpty();
        textBuffer30.resetWithEmpty();
        boolean boolean35 = textBuffer30.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        boolean boolean38 = textBuffer37.hasTextAsCharacters();
        char[] charArray39 = textBuffer37.getCurrentSegment();
        textBuffer30.resetWithShared(charArray39, (int) '4', (int) (short) 100);
        textBuffer30.resetWithEmpty();
        char[] charArray44 = textBuffer30.getCurrentSegment();
        char[] charArray45 = textBuffer30.getCurrentSegment();
        char[] charArray46 = textBuffer30.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray46, 3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 103 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getTextBuffer();
        java.lang.String str11 = textBuffer8.contentsAsString();
        boolean boolean12 = textBuffer8.hasTextAsCharacters();
        textBuffer8.append('4');
        char[] charArray15 = textBuffer8.contentsAsArray();
        char[] charArray16 = textBuffer8.contentsAsArray();
        char[] charArray17 = textBuffer8.getTextBuffer();
        char[] charArray18 = textBuffer8.contentsAsArray();
        textBuffer1.resetWithShared(charArray18, (int) '4', (int) '#');
        int int22 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 87 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.expandCurrentSegment((int) '#');
        java.lang.Class<?> wildcardClass10 = charArray9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        char[] charArray12 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("a");
        int int15 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 101, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        int int14 = textBuffer12.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        int int18 = textBuffer16.size();
        textBuffer16.resetWithEmpty();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        textBuffer12.resetWithShared(charArray20, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray20, 262144, (int) (byte) 1);
        boolean boolean27 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = textBuffer1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 262144, count 1, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = textBuffer1.setCurrentAndReturn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength((int) (short) 0);
        int int12 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.resetWithString("");
        boolean boolean15 = textBuffer9.hasTextAsCharacters();
        textBuffer9.setCurrentLength((int) (byte) 100);
        textBuffer9.ensureNotShared();
        textBuffer9.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength((int) (short) 0);
        char[] charArray24 = textBuffer21.getTextBuffer();
        int int25 = textBuffer21.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        boolean boolean28 = textBuffer27.hasTextAsCharacters();
        int int29 = textBuffer27.size();
        textBuffer27.resetWithEmpty();
        char[] charArray31 = textBuffer27.getCurrentSegment();
        textBuffer27.resetWithString("");
        int int34 = textBuffer27.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        boolean boolean40 = textBuffer39.hasTextAsCharacters();
        int int41 = textBuffer39.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        boolean boolean44 = textBuffer43.hasTextAsCharacters();
        int int45 = textBuffer43.size();
        textBuffer43.resetWithEmpty();
        char[] charArray47 = textBuffer43.getCurrentSegment();
        textBuffer39.resetWithShared(charArray47, (int) (short) 1, (int) '4');
        textBuffer36.resetWithShared(charArray47, (int) ' ', (int) (short) 0);
        textBuffer27.resetWithCopy(charArray47, (int) (short) 1, (int) (byte) 10);
        textBuffer21.resetWithShared(charArray47, (int) (short) 100, (int) '#');
        textBuffer9.resetWithShared(charArray47, 10, (int) (byte) 10);
        textBuffer1.resetWithCopy(charArray47, (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass66 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        int int11 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        char[] charArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray13, (int) (byte) -1, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray8, 0, 0);
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("hi!");
        char[] charArray15 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass16 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.getTextBuffer();
        java.lang.String str11 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str5 = textBuffer1.toString();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        int int13 = textBuffer11.size();
        textBuffer11.resetWithEmpty();
        char[] charArray15 = textBuffer11.getCurrentSegment();
        textBuffer11.resetWithString("");
        char[] charArray18 = textBuffer11.getCurrentSegment();
        char[] charArray19 = textBuffer11.getTextBuffer();
        java.lang.String str20 = textBuffer11.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        boolean boolean23 = textBuffer22.hasTextAsCharacters();
        char[] charArray24 = textBuffer22.getTextBuffer();
        java.lang.String str25 = textBuffer22.contentsAsString();
        boolean boolean26 = textBuffer22.hasTextAsCharacters();
        textBuffer22.append('4');
        char[] charArray29 = textBuffer22.contentsAsArray();
        textBuffer11.resetWithShared(charArray29, (int) (short) 1, (int) ' ');
        char[] charArray33 = textBuffer11.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray33, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 3 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4' });
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(0);
        textBuffer1.setCurrentLength(52);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 152, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        char[] charArray7 = textBuffer5.getTextBuffer();
        java.lang.String str8 = textBuffer5.contentsAsString();
        boolean boolean9 = textBuffer5.hasTextAsCharacters();
        java.lang.String str11 = textBuffer5.setCurrentAndReturn(0);
        char[] charArray12 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (int) (short) 1, (int) (short) 1);
        textBuffer1.ensureNotShared();
        int int17 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal18 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"?\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray8, 262144, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        int int19 = textBuffer1.size();
        char[] charArray20 = textBuffer1.emptyAndGetCurrentSegment();
        int int21 = textBuffer1.getTextOffset();
        int int22 = textBuffer1.getTextOffset();
        char[] charArray23 = textBuffer1.contentsAsArray();
        char[] charArray24 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        int int8 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        int int11 = textBuffer1.size();
        java.lang.Class<?> wildcardClass12 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.append('4');
        int int7 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 42, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        int int11 = textBuffer1.getTextOffset();
        char[] charArray12 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        boolean boolean15 = textBuffer14.hasTextAsCharacters();
        int int16 = textBuffer14.size();
        textBuffer14.resetWithEmpty();
        char[] charArray18 = textBuffer14.getCurrentSegment();
        textBuffer14.resetWithString("");
        char[] charArray21 = textBuffer14.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray21, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.setCurrentAndReturn(10);
        char[] charArray10 = textBuffer1.getTextBuffer();
        java.lang.String str11 = textBuffer1.toString();
        java.lang.String str13 = textBuffer1.setCurrentAndReturn((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"??????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str11, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = textBuffer1.expandCurrentSegment((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        int int8 = textBuffer1.getCurrentSegmentSize();
        char[] charArray9 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        int int7 = textBuffer5.size();
        textBuffer5.resetWithEmpty();
        char[] charArray9 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, (int) (short) 1, (int) '4');
        int int13 = textBuffer1.getTextOffset();
        java.lang.String str14 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = textBuffer1.expandCurrentSegment((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        char[] charArray12 = textBuffer10.getTextBuffer();
        java.lang.String str13 = textBuffer10.contentsAsString();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        int int15 = textBuffer10.getTextOffset();
        textBuffer10.resetWithEmpty();
        int int17 = textBuffer10.getCurrentSegmentSize();
        char[] charArray18 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray18, (int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.lang.String str10 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 110, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = textBuffer1.setCurrentAndReturn((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getTextBuffer();
        java.lang.String str11 = textBuffer8.contentsAsString();
        boolean boolean12 = textBuffer8.hasTextAsCharacters();
        textBuffer8.append('4');
        char[] charArray15 = textBuffer8.contentsAsArray();
        char[] charArray16 = textBuffer8.contentsAsArray();
        char[] charArray17 = textBuffer8.getTextBuffer();
        char[] charArray18 = textBuffer8.contentsAsArray();
        textBuffer1.resetWithShared(charArray18, (int) '4', (int) '#');
        int int22 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray23 = textBuffer1.contentsAsArray();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -51 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        int int19 = textBuffer1.size();
        char[] charArray20 = textBuffer1.emptyAndGetCurrentSegment();
        int int21 = textBuffer1.getTextOffset();
        int int22 = textBuffer1.getTextOffset();
        char[] charArray23 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        textBuffer1.setCurrentLength(1000);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        int int3 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.append("hi!", 0, 1);
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        char[] charArray12 = textBuffer10.getTextBuffer();
        java.lang.String str13 = textBuffer10.contentsAsString();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        java.lang.String str16 = textBuffer10.setCurrentAndReturn(0);
        char[] charArray18 = new char[] { '#' };
        textBuffer10.resetWithShared(charArray18, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray18, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#' });
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        boolean boolean6 = textBuffer5.hasTextAsCharacters();
        char[] charArray7 = textBuffer5.getTextBuffer();
        java.lang.String str8 = textBuffer5.contentsAsString();
        boolean boolean9 = textBuffer5.hasTextAsCharacters();
        java.lang.String str11 = textBuffer5.setCurrentAndReturn(0);
        char[] charArray12 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (int) (short) 1, (int) (short) 1);
        int int16 = textBuffer1.size();
        java.lang.Class<?> wildcardClass17 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.expandCurrentSegment((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        textBuffer11.resetWithEmpty();
        char[] charArray14 = textBuffer11.contentsAsArray();
        char[] charArray15 = textBuffer11.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray15, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (short) 1);
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray10 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        int int17 = textBuffer15.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        textBuffer19.resetWithEmpty();
        char[] charArray23 = textBuffer19.getCurrentSegment();
        textBuffer15.resetWithShared(charArray23, (int) (short) 1, (int) '4');
        textBuffer12.resetWithShared(charArray23, (int) ' ', (int) (short) 0);
        int int30 = textBuffer12.size();
        char[] charArray31 = textBuffer12.emptyAndGetCurrentSegment();
        int int32 = textBuffer12.getTextOffset();
        int int33 = textBuffer12.getTextOffset();
        char[] charArray34 = textBuffer12.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray34, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        char[] charArray8 = textBuffer6.getTextBuffer();
        java.lang.String str9 = textBuffer6.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        textBuffer6.resetWithCopy(charArray13, 0, 0);
        textBuffer6.ensureNotShared();
        java.lang.String str19 = textBuffer6.setCurrentAndReturn((int) (short) 0);
        java.lang.String str20 = textBuffer6.toString();
        char[] charArray21 = textBuffer6.getTextBuffer();
        textBuffer6.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        char[] charArray25 = textBuffer24.emptyAndGetCurrentSegment();
        java.lang.String str26 = textBuffer24.toString();
        int int27 = textBuffer24.size();
        textBuffer24.ensureNotShared();
        char[] charArray29 = textBuffer24.getTextBuffer();
        char[] charArray30 = textBuffer24.getCurrentSegment();
        textBuffer6.append(charArray30, 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray30, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.append('4');
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 262144, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 262144, end 262176, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        int int19 = textBuffer1.size();
        char[] charArray20 = textBuffer1.emptyAndGetCurrentSegment();
        int int21 = textBuffer1.getTextOffset();
        int int22 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int9 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        char[] charArray14 = textBuffer12.getTextBuffer();
        java.lang.String str15 = textBuffer12.contentsAsString();
        boolean boolean16 = textBuffer12.hasTextAsCharacters();
        textBuffer12.append('4');
        char[] charArray19 = textBuffer12.contentsAsArray();
        char[] charArray20 = textBuffer12.contentsAsArray();
        char[] charArray21 = textBuffer12.getTextBuffer();
        char[] charArray22 = textBuffer12.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        boolean boolean25 = textBuffer24.hasTextAsCharacters();
        char[] charArray26 = textBuffer24.getTextBuffer();
        java.lang.String str27 = textBuffer24.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        boolean boolean30 = textBuffer29.hasTextAsCharacters();
        char[] charArray31 = textBuffer29.getCurrentSegment();
        textBuffer24.resetWithCopy(charArray31, 0, 0);
        char[] charArray36 = textBuffer24.expandCurrentSegment(0);
        textBuffer12.resetWithShared(charArray36, (int) (byte) 100, (int) '#');
        textBuffer1.resetWithShared(charArray36, 1, (int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer44 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler43);
        char[] charArray45 = textBuffer44.emptyAndGetCurrentSegment();
        int int46 = textBuffer44.getTextOffset();
        char[] charArray47 = textBuffer44.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        boolean boolean50 = textBuffer49.hasTextAsCharacters();
        textBuffer49.resetWithEmpty();
        char[] charArray52 = textBuffer49.contentsAsArray();
        char[] charArray53 = textBuffer49.contentsAsArray();
        int int54 = textBuffer49.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler55 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer56 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler55);
        boolean boolean57 = textBuffer56.hasTextAsCharacters();
        char[] charArray58 = textBuffer56.getTextBuffer();
        java.lang.String str59 = textBuffer56.contentsAsString();
        boolean boolean60 = textBuffer56.hasTextAsCharacters();
        textBuffer56.append('4');
        char[] charArray63 = textBuffer56.contentsAsArray();
        char[] charArray64 = textBuffer56.contentsAsArray();
        char[] charArray65 = textBuffer56.getTextBuffer();
        char[] charArray66 = textBuffer56.contentsAsArray();
        textBuffer49.resetWithShared(charArray66, (int) '4', (int) '#');
        textBuffer44.resetWithShared(charArray66, 52, (int) (byte) -1);
        textBuffer1.resetWithShared(charArray66, (-1), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal76 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(charArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '4' });
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        char[] charArray10 = textBuffer1.getTextBuffer();
        double double11 = textBuffer1.contentsAsDouble();
        textBuffer1.resetWithEmpty();
        char[] charArray13 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) (byte) 10, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 1010, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str7 = textBuffer1.contentsAsString();
        int int8 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        char[] charArray5 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        char[] charArray13 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 10, count 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.expandCurrentSegment(262144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.expandCurrentSegment((int) (short) 10);
        int int7 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray9 = new char[] { '#' };
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 1);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithEmpty();
        java.lang.Class<?> wildcardClass15 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getTextBuffer();
        java.lang.String str11 = textBuffer8.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        boolean boolean14 = textBuffer13.hasTextAsCharacters();
        char[] charArray15 = textBuffer13.getCurrentSegment();
        textBuffer8.resetWithCopy(charArray15, 0, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        boolean boolean21 = textBuffer20.hasTextAsCharacters();
        char[] charArray22 = textBuffer20.getTextBuffer();
        java.lang.String str23 = textBuffer20.contentsAsString();
        boolean boolean24 = textBuffer20.hasTextAsCharacters();
        java.lang.String str25 = textBuffer20.contentsAsString();
        char[] charArray26 = textBuffer20.getTextBuffer();
        char[] charArray27 = textBuffer20.getCurrentSegment();
        textBuffer8.resetWithShared(charArray27, (int) 'a', (int) (byte) 1);
        textBuffer1.resetWithShared(charArray27, (int) (short) 10, (int) (byte) 0);
        char[] charArray34 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass35 = charArray34.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.lang.String str10 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        char[] charArray14 = textBuffer12.getTextBuffer();
        java.lang.String str15 = textBuffer12.contentsAsString();
        boolean boolean16 = textBuffer12.hasTextAsCharacters();
        textBuffer12.append('4');
        char[] charArray19 = textBuffer12.contentsAsArray();
        textBuffer1.resetWithShared(charArray19, (int) (short) 1, (int) ' ');
        char[] charArray23 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass24 = charArray23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4' });
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (short) 1);
        java.lang.String str8 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        java.lang.String str7 = textBuffer1.contentsAsString();
        java.lang.String str8 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        boolean boolean8 = textBuffer7.hasTextAsCharacters();
        int int9 = textBuffer7.size();
        textBuffer7.resetWithEmpty();
        char[] charArray11 = textBuffer7.getCurrentSegment();
        textBuffer7.resetWithString("");
        int int14 = textBuffer7.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        int int21 = textBuffer19.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        boolean boolean24 = textBuffer23.hasTextAsCharacters();
        int int25 = textBuffer23.size();
        textBuffer23.resetWithEmpty();
        char[] charArray27 = textBuffer23.getCurrentSegment();
        textBuffer19.resetWithShared(charArray27, (int) (short) 1, (int) '4');
        textBuffer16.resetWithShared(charArray27, (int) ' ', (int) (short) 0);
        textBuffer7.resetWithCopy(charArray27, (int) (short) 1, (int) (byte) 10);
        textBuffer1.resetWithShared(charArray27, (int) (short) 100, (int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        textBuffer41.setCurrentLength((int) (short) 0);
        char[] charArray44 = textBuffer41.getTextBuffer();
        int int45 = textBuffer41.size();
        char[] charArray46 = textBuffer41.getCurrentSegment();
        char[] charArray47 = textBuffer41.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray47, (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 38 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNull(charArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.size();
        int int9 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength((int) (short) 0);
        int int14 = textBuffer11.getCurrentSegmentSize();
        textBuffer11.resetWithString("");
        boolean boolean17 = textBuffer11.hasTextAsCharacters();
        textBuffer11.setCurrentLength((int) (byte) 100);
        textBuffer11.ensureNotShared();
        textBuffer11.setCurrentLength((int) (short) -1);
        char[] charArray23 = textBuffer11.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray23, 97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        boolean boolean5 = textBuffer4.hasTextAsCharacters();
        int int6 = textBuffer4.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        int int10 = textBuffer8.size();
        textBuffer8.resetWithEmpty();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer4.resetWithShared(charArray12, (int) (short) 1, (int) '4');
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) (short) 0);
        int int19 = textBuffer1.size();
        char[] charArray20 = textBuffer1.emptyAndGetCurrentSegment();
        int int21 = textBuffer1.getTextOffset();
        int int22 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        char[] charArray24 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray6, 1000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, (int) '4', (int) (short) 100);
        textBuffer1.resetWithEmpty();
        java.lang.Class<?> wildcardClass15 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        int int9 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        java.lang.String str11 = textBuffer1.toString();
        java.lang.Class<?> wildcardClass12 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

