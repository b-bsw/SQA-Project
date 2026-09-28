package com.fasterxml.jackson.core.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.contentsAsArray();
        java.lang.String str19 = textBuffer17.toString();
        int int20 = textBuffer17.getTextOffset();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        char[] charArray22 = textBuffer17.contentsAsArray();
        textBuffer1.resetWithShared(charArray22, (-1), (int) (byte) 10);
        int int26 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (byte) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        int int31 = textBuffer30.getCurrentSegmentSize();
        char[] charArray32 = textBuffer30.emptyAndGetCurrentSegment();
        int int33 = textBuffer30.getCurrentSegmentSize();
        int int34 = textBuffer30.getCurrentSegmentSize();
        char[] charArray35 = textBuffer30.getCurrentSegment();
        textBuffer30.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler37 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer38 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler37);
        java.lang.String str39 = textBuffer38.toString();
        char[] charArray40 = textBuffer38.getCurrentSegment();
        textBuffer30.resetWithShared(charArray40, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray40, 1000, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1035 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray40);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        java.lang.String str5 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength(10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("", (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.getTextBuffer();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, true);
        textBuffer6.resetWithShared(charArray13, 10, 0);
        boolean boolean24 = textBuffer6.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        java.lang.String str27 = textBuffer26.toString();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer6.append(charArray28, (int) (byte) 10, 100);
        textBuffer1.resetWithShared(charArray28, (int) (short) -1, 97);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        textBuffer36.resetWithString("");
        int int39 = textBuffer36.size();
        char[] charArray40 = textBuffer36.contentsAsArray();
        boolean boolean44 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray40, 35, 262144, true);
        boolean boolean48 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray40, (int) 'a', (int) (short) -1, true);
        textBuffer1.resetWithShared(charArray40, 35, (int) (byte) 100);
        textBuffer1.releaseBuffers();
        java.lang.String str53 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        java.lang.String str19 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        java.lang.String str22 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.append('#');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        java.lang.Class<?> wildcardClass9 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean8 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, 0, (int) (short) 0, false);
        boolean boolean12 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, 52, 0, false);
        boolean boolean16 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, 4, 136, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("2.2250738585072012e-308", 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        java.lang.String str7 = textBuffer1.toString();
        textBuffer1.append('a');
        char[] charArray10 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a' });
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.contentsAsArray();
        java.lang.String str19 = textBuffer17.toString();
        int int20 = textBuffer17.getTextOffset();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        char[] charArray22 = textBuffer17.contentsAsArray();
        textBuffer1.resetWithShared(charArray22, (-1), (int) (byte) 10);
        int int26 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.releaseBuffers();
        char[] charArray30 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("a");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.contentsAsArray();
        java.lang.String str14 = textBuffer12.toString();
        int int15 = textBuffer12.getTextOffset();
        char[] charArray16 = textBuffer12.getCurrentSegment();
        textBuffer1.append(charArray16, (int) ' ', (int) (short) 10);
        int int22 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray16, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray16, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-48) + "'", int22 == (-48));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        java.lang.Class<?> wildcardClass4 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        int int7 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer1.contentsAsString();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        textBuffer11.releaseBuffers();
        textBuffer11.setCurrentLength((int) (byte) 0);
        int int17 = textBuffer11.getCurrentSegmentSize();
        char[] charArray18 = textBuffer11.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray18, 1000, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("a", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, true);
        textBuffer6.resetWithShared(charArray13, 10, 0);
        boolean boolean24 = textBuffer6.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        java.lang.String str27 = textBuffer26.toString();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer6.append(charArray28, (int) (byte) 10, 100);
        textBuffer1.resetWithShared(charArray28, (int) (short) -1, 97);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.getCurrentSegmentSize();
        java.lang.String str38 = textBuffer36.contentsAsString();
        char[] charArray39 = textBuffer36.getCurrentSegment();
        boolean boolean43 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray39, (int) (short) 10, 52, false);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray39, (-1), 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        char[] charArray14 = textBuffer7.emptyAndGetCurrentSegment();
        boolean boolean18 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray14, (-1), 1000, true);
        textBuffer1.resetWithCopy(charArray14, (int) (short) 1, (int) (byte) 1);
        textBuffer1.setCurrentLength(100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        java.lang.String str26 = textBuffer25.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getCurrentSegmentSize();
        java.lang.String str30 = textBuffer28.toString();
        char[] charArray31 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer28.resetWithShared(charArray31, (int) ' ', (int) (byte) 10);
        textBuffer25.resetWithShared(charArray31, (int) (short) 10, (int) (short) 0);
        boolean boolean38 = textBuffer25.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler39);
        char[] charArray41 = textBuffer40.contentsAsArray();
        java.lang.String str42 = textBuffer40.toString();
        int int43 = textBuffer40.getTextOffset();
        char[] charArray44 = textBuffer40.getCurrentSegment();
        char[] charArray45 = textBuffer40.contentsAsArray();
        textBuffer25.resetWithShared(charArray45, 35, (int) (short) -1);
        char[] charArray49 = textBuffer25.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray49, 100, (-1038366032));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1038366032 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertNotNull(charArray49);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        char[] charArray11 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer8.resetWithShared(charArray11, (int) ' ', (int) (byte) 10);
        textBuffer8.resetWithString("2.2250738585072012e-308");
        int int17 = textBuffer8.getCurrentSegmentSize();
        textBuffer8.releaseBuffers();
        int int19 = textBuffer8.size();
        textBuffer8.ensureNotShared();
        char[] charArray21 = textBuffer8.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray21, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        char[] charArray14 = textBuffer7.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer16.toString();
        char[] charArray19 = textBuffer16.contentsAsArray();
        textBuffer7.resetWithShared(charArray19, (int) (byte) 100, 100);
        int int23 = textBuffer7.getTextOffset();
        char[] charArray24 = textBuffer7.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray24, 1000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1010 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        char[] charArray14 = textBuffer7.emptyAndGetCurrentSegment();
        boolean boolean18 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray14, (-1), 1000, true);
        textBuffer1.resetWithCopy(charArray14, (int) (short) 1, (int) (byte) 1);
        boolean boolean22 = textBuffer1.hasTextAsCharacters();
        char[] charArray23 = textBuffer1.emptyAndGetCurrentSegment();
        int int24 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray13, (int) (byte) 100, 100);
        int int17 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 100, count 100, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.setCurrentLength(100);
        textBuffer1.append('4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        textBuffer24.resetWithString("");
        int int27 = textBuffer24.size();
        char[] charArray28 = textBuffer24.contentsAsArray();
        boolean boolean32 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray28, 35, 262144, true);
        boolean boolean36 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray28, (int) 'a', (int) (short) -1, true);
        textBuffer1.resetWithShared(charArray28, (int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal42 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray28, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        boolean boolean30 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray23, (int) (short) 1, (int) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal31 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        java.lang.String str6 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, true);
        textBuffer6.resetWithShared(charArray13, 10, 0);
        boolean boolean24 = textBuffer6.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        java.lang.String str27 = textBuffer26.toString();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer6.append(charArray28, (int) (byte) 10, 100);
        textBuffer1.resetWithShared(charArray28, (int) (short) -1, 97);
        char[] charArray35 = textBuffer1.getTextBuffer();
        int int36 = textBuffer1.getTextOffset();
        int int37 = textBuffer1.getTextOffset();
        java.lang.Class<?> wildcardClass38 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("a");
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character a is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a' });
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        int int5 = textBuffer1.size();
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("");
        int int22 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        java.lang.String str8 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.releaseBuffers();
        textBuffer10.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        int int16 = textBuffer15.getCurrentSegmentSize();
        java.lang.String str17 = textBuffer15.toString();
        char[] charArray18 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer15.resetWithShared(charArray18, (int) ' ', (int) (byte) 10);
        textBuffer15.resetWithString("2.2250738585072012e-308");
        char[] charArray24 = textBuffer15.contentsAsArray();
        int int25 = textBuffer15.getTextOffset();
        char[] charArray26 = textBuffer15.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray26, (int) (byte) 100, (int) (short) 100);
        char[] charArray30 = textBuffer10.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray30, (int) (byte) 1, 23);
        textBuffer1.ensureNotShared();
        boolean boolean35 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer1.resetWithEmpty();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.getCurrentSegmentSize();
        char[] charArray12 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray12, 10, (-1038366032));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1038366031 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        textBuffer1.resetWithString("hi!");
        int int29 = textBuffer1.size();
        java.lang.Class<?> wildcardClass30 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        java.lang.String str4 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        java.lang.String str9 = textBuffer8.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray14, (int) ' ', (int) (byte) 10);
        textBuffer8.resetWithShared(charArray14, (int) (short) 10, (int) (short) 0);
        int int21 = textBuffer8.getTextOffset();
        char[] charArray22 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer8.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        textBuffer25.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        char[] charArray32 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer29.resetWithShared(charArray32, (int) ' ', (int) (byte) 10);
        boolean boolean39 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray32, (int) '#', 1, true);
        textBuffer25.resetWithShared(charArray32, 10, 0);
        boolean boolean43 = textBuffer25.hasTextAsCharacters();
        textBuffer25.resetWithEmpty();
        textBuffer25.setCurrentLength((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler47 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer48 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler47);
        int int49 = textBuffer48.getCurrentSegmentSize();
        java.lang.String str50 = textBuffer48.toString();
        textBuffer48.releaseBuffers();
        char[] charArray52 = textBuffer48.emptyAndGetCurrentSegment();
        textBuffer25.resetWithShared(charArray52, 23, (-1));
        boolean boolean59 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray52, (int) (byte) 0, (int) (short) 100, true);
        textBuffer8.append(charArray52, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray52, (int) (byte) 1, (int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler66 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer67 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler66);
        int int68 = textBuffer67.getCurrentSegmentSize();
        char[] charArray69 = textBuffer67.emptyAndGetCurrentSegment();
        textBuffer67.resetWithString("2.2250738585072012e-308");
        double double72 = textBuffer67.contentsAsDouble();
        char[] charArray73 = textBuffer67.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray73, (int) (byte) 100, 35);
        textBuffer1.append('#');
        textBuffer1.resetWithEmpty();
        char[] charArray80 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal83 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray80, 1000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 4.9E-324d + "'", double72 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertNotNull(charArray80);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        java.lang.String str9 = textBuffer1.toString();
        char[] charArray10 = textBuffer1.getTextBuffer();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        int int12 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        int int15 = textBuffer14.getCurrentSegmentSize();
        java.lang.String str16 = textBuffer14.toString();
        char[] charArray17 = textBuffer14.contentsAsArray();
        textBuffer14.resetWithEmpty();
        java.lang.String str19 = textBuffer14.contentsAsString();
        int int20 = textBuffer14.getTextOffset();
        textBuffer14.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        int int24 = textBuffer23.getCurrentSegmentSize();
        java.lang.String str25 = textBuffer23.toString();
        boolean boolean26 = textBuffer23.hasTextAsCharacters();
        char[] charArray27 = textBuffer23.contentsAsArray();
        textBuffer23.ensureNotShared();
        textBuffer23.ensureNotShared();
        char[] charArray30 = textBuffer23.contentsAsArray();
        textBuffer14.resetWithShared(charArray30, (int) (short) 10, 1);
        textBuffer1.resetWithShared(charArray30, (int) '#', (-2133333328));
        // The following exception was thrown during execution in test generation
        try {
            double double37 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        boolean boolean11 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, (int) '#', 1, true);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray4, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass10 = charArray9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        java.lang.String str8 = textBuffer7.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        textBuffer7.resetWithShared(charArray13, (int) (short) 10, (int) (short) 0);
        textBuffer1.resetWithShared(charArray13, (int) (short) 1, (int) (byte) 100);
        int int23 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        boolean boolean11 = textBuffer8.hasTextAsCharacters();
        char[] charArray12 = textBuffer8.contentsAsArray();
        java.lang.String str13 = textBuffer8.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        int int16 = textBuffer15.getCurrentSegmentSize();
        java.lang.String str17 = textBuffer15.toString();
        boolean boolean18 = textBuffer15.hasTextAsCharacters();
        int int19 = textBuffer15.size();
        int int20 = textBuffer15.getCurrentSegmentSize();
        int int21 = textBuffer15.size();
        char[] charArray22 = textBuffer15.emptyAndGetCurrentSegment();
        textBuffer8.append(charArray22, 0, (int) ' ');
        textBuffer1.resetWithShared(charArray22, (int) (byte) 1, 0);
        boolean boolean29 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        textBuffer8.releaseBuffers();
        char[] charArray12 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (int) (byte) 100, (int) '4');
        boolean boolean16 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.releaseBuffers();
        char[] charArray20 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, 1000, 100);
        java.lang.Class<?> wildcardClass24 = charArray20.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getTextOffset();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray7, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (long) 136);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 136L + "'", long2 == 136L);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((int) ' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        int int19 = textBuffer18.getCurrentSegmentSize();
        java.lang.String str20 = textBuffer18.contentsAsString();
        char[] charArray21 = textBuffer18.getCurrentSegment();
        int int24 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray21, 0, 10);
        textBuffer1.resetWithCopy(charArray21, (int) (short) 1, (int) ' ');
        int int30 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray21, (int) '4', 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1038366032) + "'", int24 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-533333328) + "'", int30 == (-533333328));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, true);
        textBuffer6.resetWithShared(charArray13, 10, 0);
        boolean boolean24 = textBuffer6.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        java.lang.String str27 = textBuffer26.toString();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer6.append(charArray28, (int) (byte) 10, 100);
        textBuffer1.resetWithShared(charArray28, (int) (short) -1, 97);
        char[] charArray35 = textBuffer1.getTextBuffer();
        int int36 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.Class<?> wildcardClass39 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        textBuffer1.resetWithString("hi!");
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 10, 23);
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double34 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("hi!", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("", (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        char[] charArray11 = textBuffer8.contentsAsArray();
        textBuffer8.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double16 = textBuffer8.contentsAsDouble();
        char[] charArray17 = textBuffer8.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray17, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("hi!", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("", (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.contentsAsArray();
        java.lang.String str19 = textBuffer17.toString();
        int int20 = textBuffer17.getTextOffset();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        char[] charArray22 = textBuffer17.contentsAsArray();
        textBuffer1.resetWithShared(charArray22, (-1), (int) (byte) 10);
        char[] charArray26 = textBuffer1.getCurrentSegment();
        char[] charArray27 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str28 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal29 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" ???????????????????????????????????????????????????4\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        int int6 = textBuffer1.size();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int9 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        java.lang.String str9 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("hi!", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer6.resetWithShared(charArray9, (int) ' ', (int) (byte) 10);
        textBuffer6.resetWithString("2.2250738585072012e-308");
        char[] charArray15 = textBuffer6.contentsAsArray();
        int int16 = textBuffer6.getTextOffset();
        char[] charArray17 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, (int) (byte) 100, (int) (short) 100);
        char[] charArray21 = textBuffer1.contentsAsArray();
        boolean boolean22 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        int int9 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 262144, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2.2250738585072012e-308" + "'", str7, "2.2250738585072012e-308");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double9 = textBuffer1.contentsAsDouble();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = textBuffer12.contentsAsArray();
        textBuffer12.releaseBuffers();
        java.lang.String str17 = textBuffer12.toString();
        textBuffer12.releaseBuffers();
        int int19 = textBuffer12.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        int int22 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str23 = textBuffer21.toString();
        textBuffer21.ensureNotShared();
        int int25 = textBuffer21.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray30, (int) ' ', (int) (byte) 10);
        char[] charArray34 = textBuffer27.emptyAndGetCurrentSegment();
        boolean boolean38 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray34, (-1), 1000, true);
        textBuffer21.resetWithCopy(charArray34, (int) (short) 1, (int) (byte) 1);
        long long44 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray34, (int) '#', 52);
        textBuffer12.resetWithShared(charArray34, 10, (int) ' ');
        textBuffer1.resetWithShared(charArray34, (int) (short) 1, (int) (byte) -1);
        int int51 = textBuffer1.size();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1038366033038366032L) + "'", long44 == (-1038366033038366032L));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        java.lang.String str8 = textBuffer7.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        textBuffer7.resetWithShared(charArray13, (int) (short) 10, (int) (short) 0);
        textBuffer1.resetWithShared(charArray13, (int) (short) 1, (int) (byte) 100);
        char[] charArray23 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean24 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        char[] charArray27 = textBuffer26.contentsAsArray();
        java.lang.String str28 = textBuffer26.toString();
        int int29 = textBuffer26.getTextOffset();
        char[] charArray30 = textBuffer26.emptyAndGetCurrentSegment();
        char[] charArray31 = textBuffer26.getTextBuffer();
        long long34 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray31, (int) (byte) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray31, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1038366033038366032L) + "'", long34 == (-1038366033038366032L));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.setCurrentLength(100);
        textBuffer1.append('4');
        char[] charArray23 = textBuffer1.getTextBuffer();
        java.lang.String str24 = textBuffer1.contentsAsString();
        char[] charArray25 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray30, (int) ' ', (int) (byte) 10);
        textBuffer27.resetWithString("2.2250738585072012e-308");
        int int36 = textBuffer27.getCurrentSegmentSize();
        textBuffer27.releaseBuffers();
        int int38 = textBuffer27.size();
        textBuffer27.ensureNotShared();
        char[] charArray40 = textBuffer27.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray40, (int) '#', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray40, (int) (byte) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -6 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(charArray40);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        int int7 = textBuffer1.size();
        textBuffer1.resetWithString("a");
        textBuffer1.releaseBuffers();
        java.lang.String str11 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("", (double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        int int15 = textBuffer14.getCurrentSegmentSize();
        java.lang.String str16 = textBuffer14.toString();
        char[] charArray17 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer14.resetWithShared(charArray17, (int) ' ', (int) (byte) 10);
        boolean boolean24 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray17, (int) '#', 1, true);
        textBuffer10.resetWithShared(charArray17, 10, 0);
        java.lang.String str28 = textBuffer10.toString();
        char[] charArray29 = textBuffer10.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray29, (int) (byte) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 4 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.getTextBuffer();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.Class<?> wildcardClass12 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.getTextBuffer();
        java.lang.String str9 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.contentsAsString();
        char[] charArray14 = textBuffer11.getCurrentSegment();
        char[] charArray15 = textBuffer11.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray15, (-533333328), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -533333328 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray5, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getCurrentSegmentSize();
        int int7 = textBuffer1.size();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        int int9 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        int int11 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        int int10 = textBuffer7.getCurrentSegmentSize();
        textBuffer7.ensureNotShared();
        textBuffer7.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        int int15 = textBuffer14.getCurrentSegmentSize();
        java.lang.String str16 = textBuffer14.toString();
        char[] charArray17 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer14.resetWithShared(charArray17, (int) ' ', (int) (byte) 10);
        char[] charArray21 = textBuffer14.emptyAndGetCurrentSegment();
        textBuffer7.resetWithShared(charArray21, (-1), (int) (byte) 1);
        java.lang.String str25 = textBuffer7.toString();
        char[] charArray26 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray26, (-48), 262144);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray26, 8, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        textBuffer12.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        int int18 = textBuffer17.getCurrentSegmentSize();
        java.lang.String str19 = textBuffer17.toString();
        char[] charArray20 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer17.resetWithShared(charArray20, (int) ' ', (int) (byte) 10);
        textBuffer17.resetWithString("2.2250738585072012e-308");
        char[] charArray26 = textBuffer17.contentsAsArray();
        int int27 = textBuffer17.getTextOffset();
        char[] charArray28 = textBuffer17.getCurrentSegment();
        textBuffer12.resetWithCopy(charArray28, (int) (byte) 100, (int) (short) 100);
        char[] charArray32 = textBuffer12.emptyAndGetCurrentSegment();
        char[] charArray33 = textBuffer12.contentsAsArray();
        textBuffer1.resetWithShared(charArray33, (-2133333328), 262144);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal39 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray33, (-48), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(1);
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("aa", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        java.lang.String str19 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int21 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray22 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        int int7 = textBuffer1.size();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        int int7 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer1.contentsAsString();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray14, (int) ' ', (int) (byte) 10);
        textBuffer11.resetWithString("2.2250738585072012e-308");
        char[] charArray20 = textBuffer11.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        textBuffer22.releaseBuffers();
        textBuffer22.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray30, (int) ' ', (int) (byte) 10);
        textBuffer27.resetWithString("2.2250738585072012e-308");
        char[] charArray36 = textBuffer27.contentsAsArray();
        int int37 = textBuffer27.getTextOffset();
        char[] charArray38 = textBuffer27.getCurrentSegment();
        textBuffer22.resetWithCopy(charArray38, (int) (byte) 100, (int) (short) 100);
        char[] charArray42 = textBuffer22.emptyAndGetCurrentSegment();
        char[] charArray43 = textBuffer22.contentsAsArray();
        textBuffer11.resetWithShared(charArray43, (-2133333328), 262144);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray43, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 62 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] {});
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.append(' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        int int8 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        char[] charArray12 = textBuffer10.emptyAndGetCurrentSegment();
        int int13 = textBuffer10.getTextOffset();
        char[] charArray14 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray15 = textBuffer10.getTextBuffer();
        textBuffer1.resetWithCopy(charArray15, (int) (short) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        int int21 = textBuffer20.getCurrentSegmentSize();
        java.lang.String str22 = textBuffer20.toString();
        char[] charArray23 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer20.resetWithShared(charArray23, (int) ' ', (int) (byte) 10);
        char[] charArray27 = textBuffer20.emptyAndGetCurrentSegment();
        boolean boolean31 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray27, (-1), 1000, true);
        textBuffer1.resetWithShared(charArray27, 3, (int) (byte) 100);
        textBuffer1.resetWithString("\000");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        java.lang.Class<?> wildcardClass5 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray5 = new char[] { '4' };
        textBuffer1.resetWithShared(charArray5, 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.contentsAsArray();
        java.lang.String str19 = textBuffer17.toString();
        int int20 = textBuffer17.getTextOffset();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        char[] charArray22 = textBuffer17.contentsAsArray();
        textBuffer1.resetWithShared(charArray22, (-1), (int) (byte) 10);
        int int26 = textBuffer1.getTextOffset();
        java.lang.String str27 = textBuffer1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, true);
        textBuffer6.resetWithShared(charArray13, 10, 0);
        boolean boolean24 = textBuffer6.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        java.lang.String str27 = textBuffer26.toString();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer6.append(charArray28, (int) (byte) 10, 100);
        textBuffer1.resetWithShared(charArray28, (int) (short) -1, 97);
        char[] charArray35 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray35, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("aa", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("2.2250738585072012e-308", (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        java.lang.String str6 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        boolean boolean11 = textBuffer8.hasTextAsCharacters();
        int int12 = textBuffer8.size();
        int int13 = textBuffer8.getCurrentSegmentSize();
        int int14 = textBuffer8.size();
        char[] charArray15 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray15, 0, (int) ' ');
        textBuffer1.setCurrentLength(97);
        int int21 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        java.lang.String str24 = textBuffer23.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        int int27 = textBuffer26.getCurrentSegmentSize();
        java.lang.String str28 = textBuffer26.toString();
        char[] charArray29 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer26.resetWithShared(charArray29, (int) ' ', (int) (byte) 10);
        textBuffer23.resetWithShared(charArray29, (int) (short) 10, (int) (short) 0);
        int int36 = textBuffer23.getTextOffset();
        char[] charArray37 = textBuffer23.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        char[] charArray40 = textBuffer39.contentsAsArray();
        java.lang.String str41 = textBuffer39.toString();
        int int42 = textBuffer39.getTextOffset();
        char[] charArray43 = textBuffer39.getCurrentSegment();
        char[] charArray44 = textBuffer39.contentsAsArray();
        textBuffer23.resetWithShared(charArray44, (-1), (int) (byte) 10);
        char[] charArray48 = textBuffer23.getCurrentSegment();
        char[] charArray49 = textBuffer23.emptyAndGetCurrentSegment();
        int int50 = textBuffer23.getTextOffset();
        char[] charArray51 = textBuffer23.getCurrentSegment();
        boolean boolean52 = textBuffer23.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler53 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer54 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler53);
        int int55 = textBuffer54.getCurrentSegmentSize();
        java.lang.String str56 = textBuffer54.toString();
        textBuffer54.ensureNotShared();
        int int58 = textBuffer54.getCurrentSegmentSize();
        char[] charArray59 = textBuffer54.contentsAsArray();
        int int60 = textBuffer54.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler61 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer62 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler61);
        java.lang.String str63 = textBuffer62.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler64 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer65 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler64);
        int int66 = textBuffer65.getCurrentSegmentSize();
        java.lang.String str67 = textBuffer65.toString();
        char[] charArray68 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer65.resetWithShared(charArray68, (int) ' ', (int) (byte) 10);
        textBuffer62.resetWithShared(charArray68, (int) (short) 10, (int) (short) 0);
        int int75 = textBuffer62.getTextOffset();
        char[] charArray76 = textBuffer62.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler77 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer78 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler77);
        char[] charArray79 = textBuffer78.contentsAsArray();
        java.lang.String str80 = textBuffer78.toString();
        int int81 = textBuffer78.getTextOffset();
        char[] charArray82 = textBuffer78.getCurrentSegment();
        char[] charArray83 = textBuffer78.contentsAsArray();
        textBuffer62.resetWithShared(charArray83, (-1), (int) (byte) 10);
        textBuffer54.resetWithShared(charArray83, (int) ' ', (-48));
        textBuffer23.resetWithShared(charArray83, (int) (byte) 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray83, (int) (byte) 0, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -48 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] {});
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] {});
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] {});
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] {});
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("2.2250738585072012e-308", 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        char[] charArray11 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer8.resetWithShared(charArray11, (int) ' ', (int) (byte) 10);
        char[] charArray15 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray15, (-1), (int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        int int21 = textBuffer20.getCurrentSegmentSize();
        java.lang.String str22 = textBuffer20.toString();
        textBuffer20.ensureNotShared();
        int int24 = textBuffer20.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        int int27 = textBuffer26.getCurrentSegmentSize();
        java.lang.String str28 = textBuffer26.toString();
        char[] charArray29 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer26.resetWithShared(charArray29, (int) ' ', (int) (byte) 10);
        char[] charArray33 = textBuffer26.emptyAndGetCurrentSegment();
        boolean boolean37 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray33, (-1), 1000, true);
        textBuffer20.resetWithCopy(charArray33, (int) (short) 1, (int) (byte) 1);
        long long43 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray33, (int) '#', 52);
        textBuffer1.resetWithShared(charArray33, (int) '#', 0);
        char[] charArray47 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray47, 4, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1038366033038366032L) + "'", long43 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray13, (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray13, 35, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        int int10 = textBuffer7.getCurrentSegmentSize();
        textBuffer7.ensureNotShared();
        textBuffer7.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        int int15 = textBuffer14.getCurrentSegmentSize();
        java.lang.String str16 = textBuffer14.toString();
        char[] charArray17 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer14.resetWithShared(charArray17, (int) ' ', (int) (byte) 10);
        char[] charArray21 = textBuffer14.emptyAndGetCurrentSegment();
        textBuffer7.resetWithShared(charArray21, (-1), (int) (byte) 1);
        java.lang.String str25 = textBuffer7.toString();
        char[] charArray26 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray26, (-48), 262144);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal30 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("", (double) (-1038366032L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.038366032E9d) + "'", double2 == (-1.038366032E9d));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int6 = textBuffer1.size();
        int int7 = textBuffer1.getCurrentSegmentSize();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((-1));
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((-1038366032));
        textBuffer1.resetWithString("");
        char[] charArray14 = textBuffer1.getTextBuffer();
        int int15 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.fasterxml.jackson.core.io.NumberInput.parseInt("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getCurrentSegmentSize();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        textBuffer7.resetWithString("2.2250738585072012e-308");
        char[] charArray16 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray16, (-1), 1);
        boolean boolean20 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray22 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, true);
        textBuffer6.resetWithShared(charArray13, 10, 0);
        boolean boolean24 = textBuffer6.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        java.lang.String str27 = textBuffer26.toString();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer6.append(charArray28, (int) (byte) 10, 100);
        textBuffer1.resetWithShared(charArray28, (int) (short) -1, 97);
        char[] charArray35 = textBuffer1.contentsAsArray();
        java.lang.String str36 = textBuffer1.toString();
        int int37 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double38 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        char[] charArray11 = textBuffer8.contentsAsArray();
        textBuffer8.resetWithString("a");
        char[] charArray14 = textBuffer8.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray14, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a' });
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) (byte) -1, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -49, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("a");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("a", (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.contentsAsArray();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("a", (-1.038366032E9d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.038366032E9d) + "'", double2 == (-1.038366032E9d));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str4 = textBuffer1.toString();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        int int9 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray6, 10, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-48) + "'", int9 == (-48));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("4", 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer1.resetWithEmpty();
        int int10 = textBuffer1.getTextOffset();
        java.lang.String str11 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        int int14 = textBuffer13.getCurrentSegmentSize();
        java.lang.String str15 = textBuffer13.toString();
        char[] charArray16 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray16, (int) ' ', (int) (byte) 10);
        char[] charArray20 = textBuffer13.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        int int23 = textBuffer22.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer22.toString();
        char[] charArray25 = textBuffer22.contentsAsArray();
        textBuffer13.resetWithShared(charArray25, (int) (byte) 100, 100);
        int int29 = textBuffer13.getTextOffset();
        char[] charArray30 = textBuffer13.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray30, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str5 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("4", (-1038366033038366032L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.contentsAsArray();
        java.lang.String str18 = textBuffer16.toString();
        int int19 = textBuffer16.getTextOffset();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        char[] charArray21 = textBuffer16.contentsAsArray();
        textBuffer1.resetWithShared(charArray21, 35, (int) (short) -1);
        textBuffer1.resetWithEmpty();
        int int26 = textBuffer1.size();
        textBuffer1.setCurrentLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal29 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        long long8 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray5, 97, 35);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1038366033038366032L) + "'", long8 == (-1038366033038366032L));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass9 = charArray8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        java.lang.String str19 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character a is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = null;
        textBuffer1.resetWithShared(charArray7, (int) '4', (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.contentsAsArray();
        java.lang.String str14 = textBuffer12.toString();
        int int15 = textBuffer12.getTextOffset();
        char[] charArray16 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray16, 136, 23);
        int int20 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int21 = textBuffer1.getTextOffset();
        int int22 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray23 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray5, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray7, 262144, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 262144 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        java.lang.String str7 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        java.lang.String str10 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        int int8 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.resetWithString("");
        int int13 = textBuffer10.size();
        java.lang.String str14 = textBuffer10.contentsAsString();
        char[] charArray15 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray15, 23, (-533333328));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        java.lang.String str9 = textBuffer1.toString();
        char[] charArray10 = textBuffer1.getTextBuffer();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        char[] charArray12 = textBuffer1.getTextBuffer();
        char[] charArray13 = textBuffer1.contentsAsArray();
        java.lang.String str14 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("2.2250738585072012e-308", (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = null;
        textBuffer1.resetWithShared(charArray7, (int) '4', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("2.2250738585072012e-308", (-2133333328), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        java.lang.String str9 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2.2250738585072012e-308" + "'", str7, "2.2250738585072012e-308");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2.2250738585072012e-308" + "'", str9, "2.2250738585072012e-308");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        textBuffer7.ensureNotShared();
        int int11 = textBuffer7.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        int int14 = textBuffer13.getCurrentSegmentSize();
        java.lang.String str15 = textBuffer13.toString();
        char[] charArray16 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray16, (int) ' ', (int) (byte) 10);
        char[] charArray20 = textBuffer13.emptyAndGetCurrentSegment();
        boolean boolean24 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray20, (-1), 1000, true);
        textBuffer7.resetWithCopy(charArray20, (int) (short) 1, (int) (byte) 1);
        long long30 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray20, (int) '#', 52);
        textBuffer1.append(charArray20, 4, 100);
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1038366033038366032L) + "'", long30 == (-1038366033038366032L));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5073858507L + "'", long2 == 5073858507L);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.resetWithString("a");
        int int11 = textBuffer1.getTextOffset();
        int int12 = textBuffer1.getCurrentSegmentSize();
        char[] charArray13 = textBuffer1.contentsAsArray();
        char[] charArray14 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass15 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a' });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer6.resetWithShared(charArray9, (int) ' ', (int) (byte) 10);
        textBuffer6.resetWithString("2.2250738585072012e-308");
        char[] charArray15 = textBuffer6.contentsAsArray();
        int int16 = textBuffer6.getTextOffset();
        char[] charArray17 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, (int) (byte) 100, (int) (short) 100);
        char[] charArray21 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray22 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass23 = charArray22.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        int int7 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray4, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray4, 262144, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 262144 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1038366032) + "'", int7 == (-1038366032));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.setCurrentLength(100);
        textBuffer1.append('4');
        char[] charArray23 = textBuffer1.getTextBuffer();
        java.lang.String str24 = textBuffer1.contentsAsString();
        int int25 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = textBuffer27.contentsAsArray();
        textBuffer27.releaseBuffers();
        char[] charArray32 = textBuffer27.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray32, (-1038366032), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1038366032 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray32);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int21 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal22 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength(100);
        textBuffer1.resetWithEmpty();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass9 = charArray8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength((int) (byte) 100);
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.append(' ');
        char[] charArray9 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character   is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong("\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??????????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray5, (int) (short) -1, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("aa", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double9 = textBuffer1.contentsAsDouble();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = textBuffer12.contentsAsArray();
        textBuffer12.releaseBuffers();
        java.lang.String str17 = textBuffer12.toString();
        textBuffer12.releaseBuffers();
        int int19 = textBuffer12.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        int int22 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str23 = textBuffer21.toString();
        textBuffer21.ensureNotShared();
        int int25 = textBuffer21.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray30, (int) ' ', (int) (byte) 10);
        char[] charArray34 = textBuffer27.emptyAndGetCurrentSegment();
        boolean boolean38 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray34, (-1), 1000, true);
        textBuffer21.resetWithCopy(charArray34, (int) (short) 1, (int) (byte) 1);
        long long44 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray34, (int) '#', 52);
        textBuffer12.resetWithShared(charArray34, 10, (int) ' ');
        textBuffer1.resetWithShared(charArray34, (int) (short) 1, (int) (byte) -1);
        char[] charArray51 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1038366033038366032L) + "'", long44 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray51);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray14, (-2133333328), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2133333328 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double9 = textBuffer1.contentsAsDouble();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = textBuffer12.contentsAsArray();
        textBuffer12.releaseBuffers();
        java.lang.String str17 = textBuffer12.toString();
        textBuffer12.releaseBuffers();
        int int19 = textBuffer12.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        int int22 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str23 = textBuffer21.toString();
        textBuffer21.ensureNotShared();
        int int25 = textBuffer21.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray30, (int) ' ', (int) (byte) 10);
        char[] charArray34 = textBuffer27.emptyAndGetCurrentSegment();
        boolean boolean38 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray34, (-1), 1000, true);
        textBuffer21.resetWithCopy(charArray34, (int) (short) 1, (int) (byte) 1);
        long long44 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray34, (int) '#', 52);
        textBuffer12.resetWithShared(charArray34, 10, (int) ' ');
        textBuffer1.resetWithShared(charArray34, (int) (short) 1, (int) (byte) -1);
        char[] charArray51 = textBuffer1.getTextBuffer();
        char[] charArray52 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean53 = textBuffer1.hasTextAsCharacters();
        java.lang.String str54 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 110");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1038366033038366032L) + "'", long44 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        java.lang.String str9 = textBuffer8.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray14, (int) ' ', (int) (byte) 10);
        textBuffer8.resetWithShared(charArray14, (int) (short) 10, (int) (short) 0);
        int int21 = textBuffer8.getTextOffset();
        char[] charArray22 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer8.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        textBuffer25.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        char[] charArray32 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer29.resetWithShared(charArray32, (int) ' ', (int) (byte) 10);
        boolean boolean39 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray32, (int) '#', 1, true);
        textBuffer25.resetWithShared(charArray32, 10, 0);
        boolean boolean43 = textBuffer25.hasTextAsCharacters();
        textBuffer25.resetWithEmpty();
        textBuffer25.setCurrentLength((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler47 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer48 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler47);
        int int49 = textBuffer48.getCurrentSegmentSize();
        java.lang.String str50 = textBuffer48.toString();
        textBuffer48.releaseBuffers();
        char[] charArray52 = textBuffer48.emptyAndGetCurrentSegment();
        textBuffer25.resetWithShared(charArray52, 23, (-1));
        boolean boolean59 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray52, (int) (byte) 0, (int) (short) 100, true);
        textBuffer8.append(charArray52, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray52, (int) (byte) 1, (int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler66 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer67 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler66);
        int int68 = textBuffer67.getCurrentSegmentSize();
        char[] charArray69 = textBuffer67.emptyAndGetCurrentSegment();
        textBuffer67.resetWithString("2.2250738585072012e-308");
        double double72 = textBuffer67.contentsAsDouble();
        char[] charArray73 = textBuffer67.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray73, (int) (byte) 100, 35);
        textBuffer1.append('#');
        textBuffer1.resetWithEmpty();
        char[] charArray80 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal81 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 4.9E-324d + "'", double72 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertNotNull(charArray80);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer6.resetWithShared(charArray9, (int) ' ', (int) (byte) 10);
        textBuffer6.resetWithString("2.2250738585072012e-308");
        char[] charArray15 = textBuffer6.contentsAsArray();
        int int16 = textBuffer6.getTextOffset();
        char[] charArray17 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, (int) (byte) 100, (int) (short) 100);
        char[] charArray21 = textBuffer1.contentsAsArray();
        boolean boolean22 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 52, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.contentsAsArray();
        java.lang.String str18 = textBuffer16.toString();
        int int19 = textBuffer16.getTextOffset();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        char[] charArray21 = textBuffer16.contentsAsArray();
        textBuffer1.resetWithShared(charArray21, 35, (int) (short) -1);
        boolean boolean28 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray21, 35, (int) (byte) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal31 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray21, 3, (-2133333328));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        char[] charArray11 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer8.resetWithShared(charArray11, (int) ' ', (int) (byte) 10);
        char[] charArray15 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray15, (-1), (int) (byte) 1);
        java.lang.String str19 = textBuffer1.toString();
        char[] charArray20 = textBuffer1.contentsAsArray();
        boolean boolean24 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray20, (int) (byte) 10, (int) '#', false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        char[] charArray13 = textBuffer11.emptyAndGetCurrentSegment();
        long long16 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray13, (int) '4', 1);
        textBuffer1.resetWithShared(charArray13, (int) ' ', (-2133333328));
        boolean boolean20 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        int int23 = textBuffer22.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer22.toString();
        textBuffer22.releaseBuffers();
        int int26 = textBuffer22.getCurrentSegmentSize();
        java.lang.String str27 = textBuffer22.contentsAsString();
        char[] charArray28 = textBuffer22.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray28, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -2133333328 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-49038366032L) + "'", long16 == (-49038366032L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = null;
        textBuffer1.resetWithShared(charArray7, (int) '4', (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.contentsAsArray();
        java.lang.String str14 = textBuffer12.toString();
        int int15 = textBuffer12.getTextOffset();
        char[] charArray16 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray16, 136, 23);
        java.lang.String str20 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str20, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        java.lang.String str7 = textBuffer1.toString();
        java.lang.String str8 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.setCurrentLength((int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray15, (int) ' ', (int) (byte) 10);
        boolean boolean22 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray15, (int) '#', 1, true);
        textBuffer8.resetWithShared(charArray15, 10, 0);
        textBuffer8.setCurrentLength(100);
        textBuffer8.append('4');
        char[] charArray30 = textBuffer8.getTextBuffer();
        java.lang.String str31 = textBuffer8.contentsAsString();
        char[] charArray32 = textBuffer8.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        textBuffer34.resetWithString("");
        char[] charArray37 = textBuffer34.getTextBuffer();
        int int38 = textBuffer34.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler39);
        textBuffer40.resetWithString("");
        textBuffer40.resetWithEmpty();
        char[] charArray44 = textBuffer40.emptyAndGetCurrentSegment();
        textBuffer34.resetWithCopy(charArray44, 100, 0);
        textBuffer8.resetWithCopy(charArray44, 97, (int) 'a');
        textBuffer1.resetWithShared(charArray44, (int) (byte) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal54 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4" + "'", str31, "4");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(charArray44);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        int int7 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        textBuffer8.releaseBuffers();
        char[] charArray12 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (int) (byte) 100, (int) '4');
        char[] charArray16 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass17 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        int int10 = textBuffer9.getCurrentSegmentSize();
        java.lang.String str11 = textBuffer9.contentsAsString();
        char[] charArray12 = textBuffer9.getCurrentSegment();
        boolean boolean16 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray12, (int) (short) 10, 52, false);
        int int19 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray12, (int) (byte) 0, 262144);
        int int22 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray12, (int) '4', (int) (byte) 0);
        textBuffer1.resetWithShared(charArray12, (int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal26 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1038366032) + "'", int19 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-48) + "'", int22 == (-48));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        boolean boolean10 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray6, 1, 0, false);
        boolean boolean14 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray6, 35, (-1), true);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray6, (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        java.lang.String str15 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("hi!");
        java.lang.String str18 = textBuffer1.contentsAsString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("aa", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" ???????????????????????????????????????????????????4\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.size();
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        textBuffer7.resetWithString("2.2250738585072012e-308");
        char[] charArray16 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray16, (-1), 1);
        boolean boolean20 = textBuffer1.hasTextAsCharacters();
        int int21 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        int int24 = textBuffer23.getCurrentSegmentSize();
        java.lang.String str25 = textBuffer23.toString();
        char[] charArray26 = textBuffer23.contentsAsArray();
        textBuffer23.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        char[] charArray31 = textBuffer23.emptyAndGetCurrentSegment();
        int int34 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray31, 3, 52);
        textBuffer1.resetWithShared(charArray31, 4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double38 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1038366032) + "'", int34 == (-1038366032));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = textBuffer10.contentsAsArray();
        boolean boolean17 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, 0, (int) (short) 0, false);
        boolean boolean21 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) (byte) 10, (int) '4', true);
        textBuffer1.resetWithShared(charArray13, 0, 1000);
        int int25 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double28 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 1000, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean10 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray6, 23, (int) (short) 1, true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray6, (int) (byte) -1, (-533333328));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        textBuffer1.resetWithString("hi!");
        char[] charArray29 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("");
        textBuffer1.setCurrentLength((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.Class<?> wildcardClass6 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.getTextBuffer();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray6, 262144, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 262144 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", (double) 136);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.073858507E9d + "'", double2 == 5.073858507E9d);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        textBuffer7.resetWithString("2.2250738585072012e-308");
        char[] charArray16 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray16, (-1), 1);
        textBuffer1.resetWithEmpty();
        java.lang.String str21 = textBuffer1.contentsAsString();
        int int22 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        int int20 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        textBuffer1.append(' ');
        int int25 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        int int9 = textBuffer6.size();
        java.lang.String str10 = textBuffer6.contentsAsString();
        char[] charArray11 = textBuffer6.getCurrentSegment();
        textBuffer6.resetWithEmpty();
        char[] charArray13 = textBuffer6.contentsAsArray();
        char[] charArray14 = textBuffer6.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray14, 0, (-1038366032));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1038366032 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        char[] charArray14 = textBuffer7.emptyAndGetCurrentSegment();
        boolean boolean18 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray14, (-1), 1000, true);
        textBuffer1.resetWithCopy(charArray14, (int) (short) 1, (int) (byte) 1);
        textBuffer1.setCurrentLength(100);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray30, (int) ' ', (int) (byte) 10);
        char[] charArray34 = textBuffer27.emptyAndGetCurrentSegment();
        boolean boolean38 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray34, (-1), 1000, true);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray34, (-48), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -48 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        int int20 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        int int24 = textBuffer23.getCurrentSegmentSize();
        java.lang.String str25 = textBuffer23.toString();
        char[] charArray26 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer23.resetWithShared(charArray26, (int) ' ', (int) (byte) 10);
        char[] charArray30 = textBuffer23.emptyAndGetCurrentSegment();
        textBuffer23.resetWithString("a");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        char[] charArray35 = textBuffer34.contentsAsArray();
        java.lang.String str36 = textBuffer34.toString();
        int int37 = textBuffer34.getTextOffset();
        char[] charArray38 = textBuffer34.getCurrentSegment();
        textBuffer23.append(charArray38, (int) ' ', (int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        int int44 = textBuffer43.getCurrentSegmentSize();
        java.lang.String str45 = textBuffer43.toString();
        textBuffer43.ensureNotShared();
        int int47 = textBuffer43.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        int int50 = textBuffer49.getCurrentSegmentSize();
        java.lang.String str51 = textBuffer49.toString();
        char[] charArray52 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer49.resetWithShared(charArray52, (int) ' ', (int) (byte) 10);
        char[] charArray56 = textBuffer49.emptyAndGetCurrentSegment();
        boolean boolean60 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray56, (-1), 1000, true);
        textBuffer43.resetWithCopy(charArray56, (int) (short) 1, (int) (byte) 1);
        textBuffer23.resetWithShared(charArray56, 23, 52);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray56, 1000, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1004 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        char[] charArray7 = textBuffer5.emptyAndGetCurrentSegment();
        int int8 = textBuffer5.getCurrentSegmentSize();
        boolean boolean9 = textBuffer5.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        textBuffer11.ensureNotShared();
        int int15 = textBuffer11.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        int int18 = textBuffer17.getCurrentSegmentSize();
        java.lang.String str19 = textBuffer17.toString();
        char[] charArray20 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer17.resetWithShared(charArray20, (int) ' ', (int) (byte) 10);
        char[] charArray24 = textBuffer17.emptyAndGetCurrentSegment();
        boolean boolean28 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray24, (-1), 1000, true);
        textBuffer11.resetWithCopy(charArray24, (int) (short) 1, (int) (byte) 1);
        long long34 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray24, (int) '#', 52);
        textBuffer5.append(charArray24, 4, 100);
        int int40 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray24, (int) '#', 100);
        textBuffer1.resetWithShared(charArray24, 97, 32);
        char[] charArray44 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1038366033038366032L) + "'", long34 == (-1038366033038366032L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1038366032) + "'", int40 == (-1038366032));
        org.junit.Assert.assertNotNull(charArray44);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        int int6 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.ensureNotShared();
        java.lang.String str9 = textBuffer1.toString();
        textBuffer1.resetWithString("a");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray8, (-1), 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray6, 97, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getCurrentSegmentSize();
        int int7 = textBuffer1.size();
        textBuffer1.setCurrentLength((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.resetWithString("");
        textBuffer11.resetWithEmpty();
        char[] charArray15 = textBuffer11.emptyAndGetCurrentSegment();
        boolean boolean19 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray15, (int) 'a', 52, true);
        boolean boolean23 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray15, 35, 3, false);
        textBuffer1.append(charArray15, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        boolean boolean10 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray6, 1, 0, false);
        boolean boolean14 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray6, 35, (-1), true);
        boolean boolean18 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray6, (-2133333328), 100, false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray6, (int) 'a', (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        java.lang.String str14 = textBuffer1.toString();
        char[] charArray15 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.ensureNotShared();
        java.lang.String str9 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.getTextBuffer();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray12 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray13, (int) (byte) 100, 100);
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000", (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        textBuffer1.resetWithString("hi!");
        char[] charArray29 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("");
        java.lang.Class<?> wildcardClass32 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        char[] charArray0 = null;
        boolean boolean4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray0, (int) (short) 0, (int) (short) 100, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        char[] charArray14 = textBuffer7.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer16.toString();
        char[] charArray19 = textBuffer16.contentsAsArray();
        textBuffer7.resetWithShared(charArray19, (int) (byte) 100, 100);
        textBuffer1.resetWithShared(charArray19, (int) 'a', 35);
        textBuffer1.setCurrentLength((int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray13, (int) (byte) 100, 100);
        int int17 = textBuffer1.getTextOffset();
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.getTextBuffer();
        long long9 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray6, (int) (byte) 10, (int) '4');
        int int12 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray6, (int) (short) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray6, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1038366033038366032L) + "'", long9 == (-1038366033038366032L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1038366032) + "'", int12 == (-1038366032));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        int int7 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer1.toString();
        java.lang.Class<?> wildcardClass9 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("a", (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        boolean boolean13 = textBuffer10.hasTextAsCharacters();
        char[] charArray14 = textBuffer10.contentsAsArray();
        int int15 = textBuffer10.getCurrentSegmentSize();
        char[] charArray16 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray16, 52, 23);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray20 = textBuffer1.getCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 75 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", 5.073858507E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???????????????????????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        java.lang.String str19 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        java.lang.String str23 = textBuffer22.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        int int26 = textBuffer25.getCurrentSegmentSize();
        java.lang.String str27 = textBuffer25.toString();
        char[] charArray28 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer25.resetWithShared(charArray28, (int) ' ', (int) (byte) 10);
        textBuffer22.resetWithShared(charArray28, (int) (short) 10, (int) (short) 0);
        boolean boolean35 = textBuffer22.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        char[] charArray38 = textBuffer37.contentsAsArray();
        java.lang.String str39 = textBuffer37.toString();
        int int40 = textBuffer37.getTextOffset();
        char[] charArray41 = textBuffer37.getCurrentSegment();
        char[] charArray42 = textBuffer37.contentsAsArray();
        textBuffer22.resetWithShared(charArray42, 35, (int) (short) -1);
        boolean boolean49 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray42, 35, (int) (byte) 0, false);
        boolean boolean53 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray42, (int) (short) 0, (int) ' ', false);
        textBuffer1.resetWithShared(charArray42, (int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray57 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.contentsAsArray();
        java.lang.String str18 = textBuffer16.toString();
        int int19 = textBuffer16.getTextOffset();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        char[] charArray21 = textBuffer16.contentsAsArray();
        textBuffer1.resetWithShared(charArray21, 35, (int) (short) -1);
        char[] charArray25 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str26 = textBuffer1.contentsAsString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5073858507L + "'", long2 == 5073858507L);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        int int7 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        textBuffer10.ensureNotShared();
        char[] charArray14 = textBuffer10.getTextBuffer();
        int int15 = textBuffer10.getCurrentSegmentSize();
        int int16 = textBuffer10.getTextOffset();
        char[] charArray17 = textBuffer10.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray17, 4, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getTextOffset();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 51, length 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        int int16 = textBuffer15.getCurrentSegmentSize();
        java.lang.String str17 = textBuffer15.contentsAsString();
        char[] charArray18 = textBuffer15.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        int int25 = textBuffer24.getCurrentSegmentSize();
        java.lang.String str26 = textBuffer24.toString();
        char[] charArray27 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer24.resetWithShared(charArray27, (int) ' ', (int) (byte) 10);
        boolean boolean34 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray27, (int) '#', 1, true);
        textBuffer20.resetWithShared(charArray27, 10, 0);
        boolean boolean38 = textBuffer20.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler39);
        java.lang.String str41 = textBuffer40.toString();
        char[] charArray42 = textBuffer40.getCurrentSegment();
        textBuffer20.append(charArray42, (int) (byte) 10, 100);
        textBuffer15.resetWithShared(charArray42, (int) (short) -1, 97);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer50 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler49);
        int int51 = textBuffer50.getCurrentSegmentSize();
        java.lang.String str52 = textBuffer50.contentsAsString();
        java.lang.String str53 = textBuffer50.toString();
        char[] charArray54 = textBuffer50.getCurrentSegment();
        textBuffer15.resetWithShared(charArray54, (int) (short) 1, (int) (byte) 1);
        boolean boolean61 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray54, (int) (short) -1, (int) (short) 100, true);
        textBuffer1.resetWithCopy(charArray54, 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal67 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray54, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        textBuffer7.ensureNotShared();
        int int11 = textBuffer7.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        int int14 = textBuffer13.getCurrentSegmentSize();
        java.lang.String str15 = textBuffer13.toString();
        char[] charArray16 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray16, (int) ' ', (int) (byte) 10);
        char[] charArray20 = textBuffer13.emptyAndGetCurrentSegment();
        boolean boolean24 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray20, (-1), 1000, true);
        textBuffer7.resetWithCopy(charArray20, (int) (short) 1, (int) (byte) 1);
        long long30 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray20, (int) '#', 52);
        textBuffer1.append(charArray20, 4, 100);
        char[] charArray34 = textBuffer1.getCurrentSegment();
        int int35 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1038366033038366032L) + "'", long30 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        java.lang.String str7 = textBuffer1.toString();
        java.lang.String str8 = textBuffer1.contentsAsString();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        char[] charArray27 = textBuffer1.getCurrentSegment();
        int int28 = textBuffer1.getTextOffset();
        int int29 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        int int32 = textBuffer31.getCurrentSegmentSize();
        java.lang.String str33 = textBuffer31.toString();
        char[] charArray34 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer31.resetWithShared(charArray34, (int) ' ', (int) (byte) 10);
        textBuffer31.resetWithString("2.2250738585072012e-308");
        char[] charArray40 = textBuffer31.contentsAsArray();
        int int41 = textBuffer31.getTextOffset();
        char[] charArray42 = textBuffer31.getCurrentSegment();
        long long45 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray42, 97, 0);
        textBuffer1.resetWithShared(charArray42, 8, 52);
        int int49 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 152, length 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-49038366032L) + "'", long45 == (-49038366032L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????????????????????????????????????????????????????????????????????????????????????????????????????5073858507\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 51, length 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.setCurrentLength(100);
        textBuffer1.append('4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        textBuffer24.resetWithString("");
        int int27 = textBuffer24.size();
        char[] charArray28 = textBuffer24.contentsAsArray();
        boolean boolean32 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray28, 35, 262144, true);
        boolean boolean36 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray28, (int) 'a', (int) (short) -1, true);
        textBuffer1.resetWithShared(charArray28, (int) (short) 10, (int) 'a');
        int int40 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 107 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        char[] charArray11 = textBuffer1.getTextBuffer();
        int int12 = textBuffer1.getTextOffset();
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        int int14 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.getTextBuffer();
        char[] charArray8 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.contentsAsString();
        char[] charArray11 = textBuffer8.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        int int18 = textBuffer17.getCurrentSegmentSize();
        java.lang.String str19 = textBuffer17.toString();
        char[] charArray20 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer17.resetWithShared(charArray20, (int) ' ', (int) (byte) 10);
        boolean boolean27 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray20, (int) '#', 1, true);
        textBuffer13.resetWithShared(charArray20, 10, 0);
        boolean boolean31 = textBuffer13.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        java.lang.String str34 = textBuffer33.toString();
        char[] charArray35 = textBuffer33.getCurrentSegment();
        textBuffer13.append(charArray35, (int) (byte) 10, 100);
        textBuffer8.resetWithShared(charArray35, (int) (short) -1, 97);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        int int44 = textBuffer43.getCurrentSegmentSize();
        java.lang.String str45 = textBuffer43.contentsAsString();
        java.lang.String str46 = textBuffer43.toString();
        char[] charArray47 = textBuffer43.getCurrentSegment();
        textBuffer8.resetWithShared(charArray47, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray47, 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray47);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int6 = textBuffer1.size();
        int int7 = textBuffer1.getCurrentSegmentSize();
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        textBuffer1.setCurrentLength(97);
        int int23 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        char[] charArray9 = textBuffer8.contentsAsArray();
        java.lang.String str10 = textBuffer8.toString();
        int int11 = textBuffer8.getTextOffset();
        char[] charArray12 = textBuffer8.emptyAndGetCurrentSegment();
        char[] charArray13 = textBuffer8.getTextBuffer();
        textBuffer1.resetWithShared(charArray13, 0, (int) 'a');
        textBuffer1.setCurrentLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 152, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("4", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        int int7 = textBuffer1.getTextOffset();
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        java.lang.String str10 = textBuffer1.toString();
        java.lang.String str11 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength(136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.getTextBuffer();
        long long9 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray6, (int) (byte) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray6, (-48), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1038366033038366032L) + "'", long9 == (-1038366033038366032L));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("", 262144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262144 + "'", int2 == 262144);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getTextBuffer();
        java.lang.String str7 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        int int26 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray23, (int) (byte) 100, (int) (byte) 10);
        textBuffer1.resetWithCopy(charArray23, 1, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        int int32 = textBuffer31.getCurrentSegmentSize();
        java.lang.String str33 = textBuffer31.toString();
        char[] charArray34 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer31.resetWithShared(charArray34, (int) ' ', (int) (byte) 10);
        char[] charArray38 = textBuffer31.emptyAndGetCurrentSegment();
        boolean boolean42 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray38, (-1), 1000, true);
        textBuffer1.resetWithShared(charArray38, (-48), 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal46 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1038366032) + "'", int26 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        char[] charArray14 = textBuffer7.emptyAndGetCurrentSegment();
        boolean boolean18 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray14, (-1), 1000, true);
        textBuffer1.resetWithCopy(charArray14, (int) (short) 1, (int) (byte) 1);
        textBuffer1.setCurrentLength(100);
        textBuffer1.releaseBuffers();
        char[] charArray25 = textBuffer1.getTextBuffer();
        int int26 = textBuffer1.getTextOffset();
        int int27 = textBuffer1.size();
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 97, (int) (short) 1);
        java.lang.String str32 = textBuffer1.toString();
        int int33 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000" + "'", str32, "\000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        textBuffer7.resetWithString("2.2250738585072012e-308");
        char[] charArray16 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray16, (-1), 1);
        textBuffer1.resetWithEmpty();
        java.lang.String str21 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        int int24 = textBuffer23.getCurrentSegmentSize();
        java.lang.String str25 = textBuffer23.toString();
        char[] charArray26 = textBuffer23.contentsAsArray();
        textBuffer23.releaseBuffers();
        java.lang.String str28 = textBuffer23.toString();
        int int29 = textBuffer23.getCurrentSegmentSize();
        java.lang.String str30 = textBuffer23.contentsAsString();
        boolean boolean31 = textBuffer23.hasTextAsCharacters();
        int int32 = textBuffer23.getTextOffset();
        char[] charArray33 = textBuffer23.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray33, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray33);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.contentsAsArray();
        java.lang.String str19 = textBuffer17.toString();
        int int20 = textBuffer17.getTextOffset();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        char[] charArray22 = textBuffer17.contentsAsArray();
        textBuffer1.resetWithShared(charArray22, (-1), (int) (byte) 10);
        char[] charArray26 = textBuffer1.getCurrentSegment();
        char[] charArray27 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 1000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1000, end 1000, length 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        textBuffer1.resetWithString("hi!");
        char[] charArray29 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        char[] charArray32 = textBuffer31.contentsAsArray();
        java.lang.String str33 = textBuffer31.toString();
        int int34 = textBuffer31.getTextOffset();
        char[] charArray35 = textBuffer31.getCurrentSegment();
        textBuffer1.resetWithShared(charArray35, 4, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double39 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray35);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 262144L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 262144L + "'", long2 == 262144L);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        textBuffer1.resetWithString("hi!");
        char[] charArray29 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        char[] charArray32 = textBuffer31.contentsAsArray();
        java.lang.String str33 = textBuffer31.toString();
        int int34 = textBuffer31.getTextOffset();
        char[] charArray35 = textBuffer31.getCurrentSegment();
        textBuffer1.resetWithShared(charArray35, 4, 1);
        java.lang.String str39 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        char[] charArray41 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\000" + "'", str39, "\000");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer6.resetWithShared(charArray9, (int) ' ', (int) (byte) 10);
        textBuffer6.resetWithString("2.2250738585072012e-308");
        char[] charArray15 = textBuffer6.contentsAsArray();
        int int16 = textBuffer6.getTextOffset();
        char[] charArray17 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, (int) (byte) 100, (int) (short) 100);
        char[] charArray21 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray21, (int) (short) -1, (-2133333328));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((-533333328));
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        boolean boolean15 = textBuffer12.hasTextAsCharacters();
        char[] charArray16 = textBuffer12.contentsAsArray();
        textBuffer12.ensureNotShared();
        int int18 = textBuffer12.getCurrentSegmentSize();
        textBuffer12.resetWithEmpty();
        textBuffer12.resetWithString("");
        textBuffer12.resetWithString("");
        java.lang.String str24 = textBuffer12.toString();
        char[] charArray25 = textBuffer12.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray25, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -533333328 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.contentsAsArray();
        java.lang.String str18 = textBuffer16.toString();
        int int19 = textBuffer16.getTextOffset();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        char[] charArray21 = textBuffer16.contentsAsArray();
        textBuffer1.resetWithShared(charArray21, 35, (int) (short) -1);
        char[] charArray25 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean26 = textBuffer1.hasTextAsCharacters();
        int int27 = textBuffer1.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        java.lang.String str9 = textBuffer8.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray14, (int) ' ', (int) (byte) 10);
        textBuffer8.resetWithShared(charArray14, (int) (short) 10, (int) (short) 0);
        int int21 = textBuffer8.getTextOffset();
        char[] charArray22 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer8.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        textBuffer25.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        char[] charArray32 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer29.resetWithShared(charArray32, (int) ' ', (int) (byte) 10);
        boolean boolean39 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray32, (int) '#', 1, true);
        textBuffer25.resetWithShared(charArray32, 10, 0);
        boolean boolean43 = textBuffer25.hasTextAsCharacters();
        textBuffer25.resetWithEmpty();
        textBuffer25.setCurrentLength((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler47 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer48 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler47);
        int int49 = textBuffer48.getCurrentSegmentSize();
        java.lang.String str50 = textBuffer48.toString();
        textBuffer48.releaseBuffers();
        char[] charArray52 = textBuffer48.emptyAndGetCurrentSegment();
        textBuffer25.resetWithShared(charArray52, 23, (-1));
        boolean boolean59 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray52, (int) (byte) 0, (int) (short) 100, true);
        textBuffer8.append(charArray52, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray52, (int) (byte) 1, (int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler66 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer67 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler66);
        int int68 = textBuffer67.getCurrentSegmentSize();
        char[] charArray69 = textBuffer67.emptyAndGetCurrentSegment();
        textBuffer67.resetWithString("2.2250738585072012e-308");
        double double72 = textBuffer67.contentsAsDouble();
        char[] charArray73 = textBuffer67.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray73, (int) (byte) 100, 35);
        textBuffer1.append('#');
        textBuffer1.append('a');
        java.lang.Class<?> wildcardClass81 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 4.9E-324d + "'", double72 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer1.resetWithEmpty();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        int int14 = textBuffer13.getCurrentSegmentSize();
        char[] charArray15 = textBuffer13.emptyAndGetCurrentSegment();
        int int16 = textBuffer13.getCurrentSegmentSize();
        boolean boolean17 = textBuffer13.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        int int20 = textBuffer19.getCurrentSegmentSize();
        java.lang.String str21 = textBuffer19.toString();
        textBuffer19.ensureNotShared();
        int int23 = textBuffer19.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        int int26 = textBuffer25.getCurrentSegmentSize();
        java.lang.String str27 = textBuffer25.toString();
        char[] charArray28 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer25.resetWithShared(charArray28, (int) ' ', (int) (byte) 10);
        char[] charArray32 = textBuffer25.emptyAndGetCurrentSegment();
        boolean boolean36 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray32, (-1), 1000, true);
        textBuffer19.resetWithCopy(charArray32, (int) (short) 1, (int) (byte) 1);
        long long42 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray32, (int) '#', 52);
        textBuffer13.append(charArray32, 4, 100);
        char[] charArray46 = textBuffer13.getCurrentSegment();
        textBuffer1.append(charArray46, 8, 0);
        textBuffer1.append('#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1038366033038366032L) + "'", long42 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray46);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean10 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray6, (int) (byte) 0, 23, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        java.lang.String str7 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        java.lang.String str10 = textBuffer1.toString();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray7, 3, (-533333328));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000", (int) ' ', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 36, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        textBuffer1.resetWithString("hi!");
        char[] charArray29 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        char[] charArray32 = textBuffer31.contentsAsArray();
        java.lang.String str33 = textBuffer31.toString();
        int int34 = textBuffer31.getTextOffset();
        char[] charArray35 = textBuffer31.getCurrentSegment();
        textBuffer1.resetWithShared(charArray35, 4, 1);
        java.lang.String str39 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        char[] charArray41 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        int int44 = textBuffer43.getCurrentSegmentSize();
        java.lang.String str45 = textBuffer43.toString();
        textBuffer43.ensureNotShared();
        textBuffer43.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        textBuffer49.releaseBuffers();
        textBuffer49.resetWithString("2.2250738585072012e-308");
        int int53 = textBuffer49.getCurrentSegmentSize();
        textBuffer49.setCurrentLength((-1));
        char[] charArray56 = textBuffer49.contentsAsArray();
        textBuffer43.resetWithShared(charArray56, 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray56, 32, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 42 out of bounds for char[23]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\000" + "'", str39, "\000");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        textBuffer6.ensureNotShared();
        int int10 = textBuffer6.getCurrentSegmentSize();
        char[] charArray11 = textBuffer6.contentsAsArray();
        textBuffer6.setCurrentLength(52);
        int int14 = textBuffer6.getCurrentSegmentSize();
        int int15 = textBuffer6.size();
        char[] charArray16 = textBuffer6.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray16, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.fasterxml.jackson.core.io.NumberInput.parseInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????????????????????????????????????????????????????????????????????????????????????????????????????5073858507\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.getTextBuffer();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        char[] charArray11 = textBuffer8.contentsAsArray();
        textBuffer8.releaseBuffers();
        java.lang.String str13 = textBuffer8.toString();
        textBuffer8.releaseBuffers();
        int int15 = textBuffer8.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        int int18 = textBuffer17.getCurrentSegmentSize();
        java.lang.String str19 = textBuffer17.toString();
        textBuffer17.ensureNotShared();
        int int21 = textBuffer17.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        int int24 = textBuffer23.getCurrentSegmentSize();
        java.lang.String str25 = textBuffer23.toString();
        char[] charArray26 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer23.resetWithShared(charArray26, (int) ' ', (int) (byte) 10);
        char[] charArray30 = textBuffer23.emptyAndGetCurrentSegment();
        boolean boolean34 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray30, (-1), 1000, true);
        textBuffer17.resetWithCopy(charArray30, (int) (short) 1, (int) (byte) 1);
        long long40 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray30, (int) '#', 52);
        textBuffer8.resetWithShared(charArray30, 10, (int) ' ');
        textBuffer1.resetWithShared(charArray30, (int) (byte) 0, (-1038366032));
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal47 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1038366033038366032L) + "'", long40 == (-1038366033038366032L));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000", (-49038366032L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49038366032L) + "'", long2 == (-49038366032L));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength((int) ' ');
        textBuffer1.append('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("2.2250738585072012e-308", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.getTextBuffer();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        int int26 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray23, (int) (byte) 100, (int) (byte) 10);
        textBuffer1.resetWithCopy(charArray23, 1, 0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) 'a');
        textBuffer1.releaseBuffers();
        char[] charArray34 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        textBuffer36.resetWithString("");
        textBuffer36.releaseBuffers();
        int int40 = textBuffer36.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        java.lang.String str43 = textBuffer42.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        int int46 = textBuffer45.getCurrentSegmentSize();
        java.lang.String str47 = textBuffer45.toString();
        char[] charArray48 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer45.resetWithShared(charArray48, (int) ' ', (int) (byte) 10);
        textBuffer42.resetWithShared(charArray48, (int) (short) 10, (int) (short) 0);
        textBuffer36.resetWithShared(charArray48, (int) (short) 1, (int) (byte) 100);
        char[] charArray58 = textBuffer36.emptyAndGetCurrentSegment();
        boolean boolean62 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray58, 35, (int) ' ', false);
        textBuffer1.append(charArray58, 97, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long68 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray58, (-1038366032), (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1038366032 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1038366032) + "'", int26 == (-1038366032));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str4 = textBuffer1.toString();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.contentsAsArray();
        java.lang.String str9 = textBuffer7.toString();
        int int10 = textBuffer7.getTextOffset();
        char[] charArray11 = textBuffer7.getCurrentSegment();
        char[] charArray12 = textBuffer7.contentsAsArray();
        textBuffer7.append('a');
        java.lang.String str15 = textBuffer7.toString();
        textBuffer7.setCurrentLength(100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        int int20 = textBuffer19.getCurrentSegmentSize();
        java.lang.String str21 = textBuffer19.toString();
        textBuffer19.ensureNotShared();
        boolean boolean23 = textBuffer19.hasTextAsCharacters();
        textBuffer19.setCurrentLength((int) (short) 0);
        textBuffer19.resetWithEmpty();
        char[] charArray27 = textBuffer19.getTextBuffer();
        textBuffer7.resetWithShared(charArray27, (int) 'a', (int) (byte) 0);
        int int31 = textBuffer7.size();
        char[] charArray32 = textBuffer7.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray32, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            double double36 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray32);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        char[] charArray9 = textBuffer8.contentsAsArray();
        java.lang.String str10 = textBuffer8.toString();
        int int11 = textBuffer8.getTextOffset();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (int) (short) -1, (-1));
        boolean boolean19 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray12, 52, 0, false);
        boolean boolean23 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray12, (-1), (int) (short) 100, true);
        boolean boolean27 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray12, (-533333328), 0, true);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray12, 262144, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 262144 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        java.lang.String str4 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        char[] charArray9 = textBuffer6.contentsAsArray();
        boolean boolean13 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray9, 0, (int) (short) 0, false);
        boolean boolean17 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray9, (int) (byte) 10, (int) '4', true);
        boolean boolean21 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray9, (int) (short) 100, (int) (short) 100, false);
        textBuffer1.resetWithShared(charArray9, (int) (short) 10, (int) (short) 0);
        java.lang.String str25 = textBuffer1.contentsAsString();
        boolean boolean26 = textBuffer1.hasTextAsCharacters();
        char[] charArray27 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray27, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        textBuffer7.resetWithString("2.2250738585072012e-308");
        char[] charArray16 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray16, (-1), 1);
        boolean boolean20 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        int int23 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        int int26 = textBuffer25.getCurrentSegmentSize();
        java.lang.String str27 = textBuffer25.toString();
        textBuffer25.ensureNotShared();
        boolean boolean29 = textBuffer25.hasTextAsCharacters();
        textBuffer25.setCurrentLength((int) (short) 0);
        char[] charArray32 = textBuffer25.getCurrentSegment();
        boolean boolean36 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray32, (int) (short) 0, 0, true);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray32, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.resetWithString("a");
        int int11 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        int int14 = textBuffer13.getCurrentSegmentSize();
        java.lang.String str15 = textBuffer13.toString();
        char[] charArray16 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray16, (int) ' ', (int) (byte) 10);
        textBuffer13.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        int int24 = textBuffer23.getCurrentSegmentSize();
        char[] charArray25 = textBuffer23.emptyAndGetCurrentSegment();
        long long28 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray25, (int) '4', 1);
        textBuffer13.resetWithShared(charArray25, (int) ' ', (-2133333328));
        textBuffer1.resetWithShared(charArray25, (int) ' ', (-1038366032));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-49038366032L) + "'", long28 == (-49038366032L));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("4", (double) 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.contentsAsString();
        char[] charArray13 = textBuffer10.getCurrentSegment();
        boolean boolean17 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) (short) 10, 52, false);
        int int20 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray13, (int) (byte) 0, 262144);
        int int23 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray13, (int) '4', (int) (byte) 0);
        textBuffer1.resetWithShared(charArray13, 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal29 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray13, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1038366032) + "'", int20 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-48) + "'", int23 == (-48));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000", 136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 136 + "'", int2 == 136);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        textBuffer1.append("a", 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", (-533333328), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -533333328, end -533333328, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("4", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        java.lang.String str10 = textBuffer9.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray15, (int) ' ', (int) (byte) 10);
        textBuffer9.resetWithShared(charArray15, (int) (short) 10, (int) (short) 0);
        boolean boolean22 = textBuffer9.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        char[] charArray25 = textBuffer24.contentsAsArray();
        java.lang.String str26 = textBuffer24.toString();
        int int27 = textBuffer24.getTextOffset();
        char[] charArray28 = textBuffer24.getCurrentSegment();
        char[] charArray29 = textBuffer24.contentsAsArray();
        textBuffer9.resetWithShared(charArray29, 35, (int) (short) -1);
        textBuffer1.resetWithShared(charArray29, (int) (short) 100, 23);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray29, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        char[] charArray14 = textBuffer7.emptyAndGetCurrentSegment();
        boolean boolean18 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray14, (-1), 1000, true);
        textBuffer1.resetWithCopy(charArray14, (int) (short) 1, (int) (byte) 1);
        textBuffer1.setCurrentLength(100);
        char[] charArray24 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray24, (int) (short) 100, (-1038366032));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("a", (double) 136L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 136.0d + "'", double2 == 136.0d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength(1000);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        java.lang.String str14 = textBuffer13.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer16.toString();
        char[] charArray19 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer16.resetWithShared(charArray19, (int) ' ', (int) (byte) 10);
        textBuffer13.resetWithShared(charArray19, (int) (short) 10, (int) (short) 0);
        boolean boolean26 = textBuffer13.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        char[] charArray29 = textBuffer28.contentsAsArray();
        java.lang.String str30 = textBuffer28.toString();
        int int31 = textBuffer28.getTextOffset();
        char[] charArray32 = textBuffer28.getCurrentSegment();
        char[] charArray33 = textBuffer28.contentsAsArray();
        textBuffer13.resetWithShared(charArray33, 35, (int) (short) -1);
        char[] charArray37 = textBuffer13.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray37, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal41 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(charArray37);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.append('a');
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray7, (-1), 136);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a' });
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((-1));
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((-1038366032));
        textBuffer1.resetWithString("");
        int int14 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray7, 3, (-1038366032));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("4");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        textBuffer10.ensureNotShared();
        int int14 = textBuffer10.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer16.toString();
        char[] charArray19 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer16.resetWithShared(charArray19, (int) ' ', (int) (byte) 10);
        char[] charArray23 = textBuffer16.emptyAndGetCurrentSegment();
        boolean boolean27 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray23, (-1), 1000, true);
        textBuffer10.resetWithCopy(charArray23, (int) (short) 1, (int) (byte) 1);
        textBuffer1.resetWithShared(charArray23, 100, (int) (short) 1);
        textBuffer1.append('a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        int int7 = textBuffer1.size();
        textBuffer1.resetWithString("a");
        int int10 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("4", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double9 = textBuffer1.contentsAsDouble();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = textBuffer12.contentsAsArray();
        textBuffer12.releaseBuffers();
        java.lang.String str17 = textBuffer12.toString();
        textBuffer12.releaseBuffers();
        int int19 = textBuffer12.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        int int22 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str23 = textBuffer21.toString();
        textBuffer21.ensureNotShared();
        int int25 = textBuffer21.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray30, (int) ' ', (int) (byte) 10);
        char[] charArray34 = textBuffer27.emptyAndGetCurrentSegment();
        boolean boolean38 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray34, (-1), 1000, true);
        textBuffer21.resetWithCopy(charArray34, (int) (short) 1, (int) (byte) 1);
        long long44 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray34, (int) '#', 52);
        textBuffer12.resetWithShared(charArray34, 10, (int) ' ');
        textBuffer1.resetWithShared(charArray34, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1038366033038366032L) + "'", long44 == (-1038366033038366032L));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        int int8 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, true);
        textBuffer6.resetWithShared(charArray13, 10, 0);
        boolean boolean24 = textBuffer6.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        java.lang.String str27 = textBuffer26.toString();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer6.append(charArray28, (int) (byte) 10, 100);
        textBuffer1.resetWithShared(charArray28, (int) (short) -1, 97);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.getCurrentSegmentSize();
        java.lang.String str38 = textBuffer36.contentsAsString();
        java.lang.String str39 = textBuffer36.toString();
        char[] charArray40 = textBuffer36.getCurrentSegment();
        textBuffer1.resetWithShared(charArray40, (int) (short) 1, (int) (byte) 1);
        boolean boolean47 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray40, (int) (short) -1, (int) (short) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal50 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray40, 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        java.lang.String str6 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.contentsAsString();
        java.lang.String str11 = textBuffer8.toString();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        char[] charArray13 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray13, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        java.lang.String str7 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        java.lang.String str10 = textBuffer1.toString();
        java.lang.Class<?> wildcardClass11 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.setCurrentLength(100);
        textBuffer1.append('4');
        char[] charArray23 = textBuffer1.getTextBuffer();
        java.lang.String str24 = textBuffer1.contentsAsString();
        char[] charArray25 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray25, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        java.lang.String str8 = textBuffer7.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        textBuffer7.resetWithShared(charArray13, (int) (short) 10, (int) (short) 0);
        textBuffer1.resetWithShared(charArray13, (int) (short) 1, (int) (byte) 100);
        char[] charArray23 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) (byte) 10);
        java.lang.String str26 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal27 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str26, "\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("hi!");
        int int8 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        double double6 = textBuffer1.contentsAsDouble();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        int int8 = textBuffer1.getCurrentSegmentSize();
        char[] charArray9 = textBuffer1.contentsAsArray();
        char[] charArray10 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        textBuffer12.ensureNotShared();
        char[] charArray16 = textBuffer12.contentsAsArray();
        textBuffer1.resetWithShared(charArray16, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean10 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray6, (int) (byte) 100, 97, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray13, (int) (byte) 100, 100);
        textBuffer1.releaseBuffers();
        java.lang.Class<?> wildcardClass18 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("aa", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getCurrentSegmentSize();
        int int7 = textBuffer1.size();
        textBuffer1.setCurrentLength((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.resetWithString("");
        textBuffer11.resetWithEmpty();
        char[] charArray15 = textBuffer11.emptyAndGetCurrentSegment();
        boolean boolean19 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray15, (int) 'a', 52, true);
        boolean boolean23 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray15, 35, 3, false);
        textBuffer1.append(charArray15, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal27 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("aa", 32, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.setCurrentLength(100);
        textBuffer1.append('4');
        char[] charArray23 = textBuffer1.getTextBuffer();
        java.lang.String str24 = textBuffer1.contentsAsString();
        char[] charArray25 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        textBuffer27.resetWithString("");
        char[] charArray30 = textBuffer27.getTextBuffer();
        int int31 = textBuffer27.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        textBuffer33.resetWithString("");
        textBuffer33.resetWithEmpty();
        char[] charArray37 = textBuffer33.emptyAndGetCurrentSegment();
        textBuffer27.resetWithCopy(charArray37, 100, 0);
        textBuffer1.resetWithCopy(charArray37, 97, (int) 'a');
        boolean boolean47 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray37, 97, 4, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.setCurrentLength(100);
        textBuffer1.append('4');
        char[] charArray23 = textBuffer1.getTextBuffer();
        int int26 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray23, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1038366032) + "'", int26 == (-1038366032));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        int int7 = textBuffer1.getCurrentSegmentSize();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        double double6 = textBuffer1.contentsAsDouble();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        int int9 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        int int9 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray6, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1038366032) + "'", int9 == (-1038366032));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((-1));
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((-1038366032));
        textBuffer1.resetWithString("");
        int int14 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("4");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        int int14 = textBuffer13.getCurrentSegmentSize();
        java.lang.String str15 = textBuffer13.contentsAsString();
        java.lang.String str16 = textBuffer13.toString();
        char[] charArray17 = textBuffer13.getCurrentSegment();
        char[] charArray18 = textBuffer13.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        int int23 = textBuffer22.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer22.toString();
        char[] charArray25 = textBuffer22.contentsAsArray();
        textBuffer22.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double30 = textBuffer22.contentsAsDouble();
        char[] charArray31 = textBuffer22.emptyAndGetCurrentSegment();
        textBuffer20.resetWithShared(charArray31, (-1038366032), (int) (short) -1);
        textBuffer13.resetWithShared(charArray31, (-1038366032), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray31, (-48), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -48 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 8.0d + "'", double30 == 8.0d);
        org.junit.Assert.assertNotNull(charArray31);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int6 = textBuffer1.size();
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        int int10 = textBuffer9.getCurrentSegmentSize();
        java.lang.String str11 = textBuffer9.toString();
        int int12 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.resetWithEmpty();
        char[] charArray14 = textBuffer9.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer16.toString();
        int int19 = textBuffer16.getCurrentSegmentSize();
        int int20 = textBuffer16.getTextOffset();
        int int21 = textBuffer16.getTextOffset();
        java.lang.String str22 = textBuffer16.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        int int25 = textBuffer24.getCurrentSegmentSize();
        java.lang.String str26 = textBuffer24.toString();
        char[] charArray27 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer24.resetWithShared(charArray27, (int) ' ', (int) (byte) 10);
        boolean boolean34 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray27, (int) '#', 1, true);
        textBuffer16.resetWithShared(charArray27, 1000, (-48));
        textBuffer9.resetWithShared(charArray27, (int) (byte) 1, (int) (short) -1);
        boolean boolean44 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray27, 3, 0, false);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray27, 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 4 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double9 = textBuffer1.contentsAsDouble();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = textBuffer12.contentsAsArray();
        textBuffer12.releaseBuffers();
        java.lang.String str17 = textBuffer12.toString();
        textBuffer12.releaseBuffers();
        int int19 = textBuffer12.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        int int22 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str23 = textBuffer21.toString();
        textBuffer21.ensureNotShared();
        int int25 = textBuffer21.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray30, (int) ' ', (int) (byte) 10);
        char[] charArray34 = textBuffer27.emptyAndGetCurrentSegment();
        boolean boolean38 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray34, (-1), 1000, true);
        textBuffer21.resetWithCopy(charArray34, (int) (short) 1, (int) (byte) 1);
        long long44 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray34, (int) '#', 52);
        textBuffer12.resetWithShared(charArray34, 10, (int) ' ');
        textBuffer1.resetWithShared(charArray34, (int) (short) 1, (int) (byte) -1);
        char[] charArray51 = textBuffer1.getTextBuffer();
        char[] charArray52 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal55 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray52, (int) (byte) 10, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1038366033038366032L) + "'", long44 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertNotNull(charArray52);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double9 = textBuffer1.contentsAsDouble();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = textBuffer12.contentsAsArray();
        textBuffer12.releaseBuffers();
        java.lang.String str17 = textBuffer12.toString();
        textBuffer12.releaseBuffers();
        int int19 = textBuffer12.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        int int22 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str23 = textBuffer21.toString();
        textBuffer21.ensureNotShared();
        int int25 = textBuffer21.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray30, (int) ' ', (int) (byte) 10);
        char[] charArray34 = textBuffer27.emptyAndGetCurrentSegment();
        boolean boolean38 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray34, (-1), 1000, true);
        textBuffer21.resetWithCopy(charArray34, (int) (short) 1, (int) (byte) 1);
        long long44 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray34, (int) '#', 52);
        textBuffer12.resetWithShared(charArray34, 10, (int) ' ');
        textBuffer1.resetWithShared(charArray34, (int) (short) 1, (int) (byte) -1);
        char[] charArray51 = textBuffer1.getTextBuffer();
        char[] charArray52 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean53 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 45, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1038366033038366032L) + "'", long44 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength(1000);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (-48), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -48, end -49, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 10, (-48));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end -38, length 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray7, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        textBuffer8.releaseBuffers();
        textBuffer8.setCurrentLength((int) (byte) 0);
        int int14 = textBuffer8.getCurrentSegmentSize();
        char[] charArray15 = textBuffer8.emptyAndGetCurrentSegment();
        char[] charArray16 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray16, 97, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        int int22 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str23 = textBuffer21.toString();
        textBuffer21.ensureNotShared();
        int int25 = textBuffer21.getCurrentSegmentSize();
        char[] charArray26 = textBuffer21.contentsAsArray();
        boolean boolean30 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray26, 1, 0, false);
        boolean boolean34 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray26, 35, (-1), true);
        textBuffer1.resetWithShared(charArray26, (int) (byte) 10, 23);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal40 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray26, 35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.size();
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 0);
        int int16 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        int int7 = textBuffer1.getTextOffset();
        int int8 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.fasterxml.jackson.core.io.NumberInput.parseInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???????????????????????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getCurrentSegmentSize();
        int int7 = textBuffer1.size();
        int int8 = textBuffer1.getCurrentSegmentSize();
        int int9 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        char[] charArray8 = textBuffer6.emptyAndGetCurrentSegment();
        int int9 = textBuffer6.getCurrentSegmentSize();
        int int10 = textBuffer6.getCurrentSegmentSize();
        int int11 = textBuffer6.size();
        textBuffer6.ensureNotShared();
        char[] charArray13 = textBuffer6.getCurrentSegment();
        int int14 = textBuffer6.getTextOffset();
        char[] charArray15 = textBuffer6.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray15, (int) '#', 8);
        boolean boolean22 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray15, 97, 100, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.contentsAsArray();
        java.lang.String str18 = textBuffer16.toString();
        int int19 = textBuffer16.getTextOffset();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        char[] charArray21 = textBuffer16.contentsAsArray();
        textBuffer1.resetWithShared(charArray21, 35, (int) (short) -1);
        boolean boolean28 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray21, 35, (int) (byte) 0, false);
        boolean boolean32 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray21, (int) (short) 0, (int) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray21, 97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.contentsAsArray();
        java.lang.String str19 = textBuffer17.toString();
        int int20 = textBuffer17.getTextOffset();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        char[] charArray22 = textBuffer17.contentsAsArray();
        textBuffer1.resetWithShared(charArray22, (-1), (int) (byte) 10);
        char[] charArray26 = textBuffer1.getCurrentSegment();
        char[] charArray27 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str28 = textBuffer1.contentsAsString();
        char[] charArray29 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("\000");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000", 136, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 136, end 168, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.fasterxml.jackson.core.io.NumberInput.parseInt("\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??????????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(52);
        int int9 = textBuffer1.getCurrentSegmentSize();
        int int10 = textBuffer1.size();
        textBuffer1.setCurrentLength((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((-1));
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        int int11 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray13, (int) (byte) 100, 100);
        int int17 = textBuffer1.getTextOffset();
        char[] charArray18 = textBuffer1.getTextBuffer();
        int int19 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        int int10 = textBuffer9.getCurrentSegmentSize();
        java.lang.String str11 = textBuffer9.toString();
        int int12 = textBuffer9.getCurrentSegmentSize();
        int int13 = textBuffer9.getTextOffset();
        int int14 = textBuffer9.getTextOffset();
        java.lang.String str15 = textBuffer9.toString();
        int int16 = textBuffer9.getCurrentSegmentSize();
        char[] charArray17 = textBuffer9.contentsAsArray();
        boolean boolean21 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray17, 4, (-48), false);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray17, 32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(52);
        textBuffer1.resetWithEmpty();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer6.resetWithShared(charArray9, (int) ' ', (int) (byte) 10);
        textBuffer6.resetWithString("2.2250738585072012e-308");
        char[] charArray15 = textBuffer6.contentsAsArray();
        int int16 = textBuffer6.getTextOffset();
        char[] charArray17 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, (int) (byte) 100, (int) (short) 100);
        char[] charArray21 = textBuffer1.contentsAsArray();
        char[] charArray22 = textBuffer1.contentsAsArray();
        long long25 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray22, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-49038366032L) + "'", long25 == (-49038366032L));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        boolean boolean9 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray5, 97, 10, true);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.getTextBuffer();
        java.lang.String str8 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        int int3 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal4 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray3, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.contentsAsArray();
        java.lang.String str9 = textBuffer7.toString();
        int int10 = textBuffer7.getTextOffset();
        int int11 = textBuffer7.getCurrentSegmentSize();
        int int12 = textBuffer7.getTextOffset();
        textBuffer7.resetWithEmpty();
        int int14 = textBuffer7.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        char[] charArray18 = textBuffer16.emptyAndGetCurrentSegment();
        int int19 = textBuffer16.getTextOffset();
        char[] charArray20 = textBuffer16.emptyAndGetCurrentSegment();
        char[] charArray21 = textBuffer16.getTextBuffer();
        textBuffer7.resetWithCopy(charArray21, (int) (short) 10, (int) (short) 100);
        char[] charArray25 = textBuffer7.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray25, 1000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1010 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (long) (-48));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-48L) + "'", long2 == (-48L));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", 262144, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 262144, end 262145, length 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000", (double) 136);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 136.0d + "'", double2 == 136.0d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.append(' ');
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        java.lang.Class<?> wildcardClass12 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        int int26 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray23, (int) (byte) 100, (int) (byte) 10);
        textBuffer1.resetWithCopy(charArray23, 1, 0);
        boolean boolean30 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        int int32 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 10, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1038366032) + "'", int26 == (-1038366032));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(52);
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        int int9 = textBuffer1.getTextOffset();
        int int10 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 103, length 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        textBuffer7.resetWithString("2.2250738585072012e-308");
        char[] charArray16 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray16, (-1), 1);
        textBuffer1.resetWithEmpty();
        java.lang.String str21 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.releaseBuffers();
        boolean boolean25 = textBuffer23.hasTextAsCharacters();
        textBuffer23.releaseBuffers();
        char[] charArray27 = textBuffer23.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray27, 4, (int) (byte) 1);
        int int33 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray27, 10, (-48));
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray27, (-2133333328), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2133333328 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-48) + "'", int33 == (-48));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        java.lang.String str5 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        boolean boolean11 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, (int) '#', 1, true);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, 52, 8, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass10 = charArray9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(52);
        int int9 = textBuffer1.getCurrentSegmentSize();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.getCurrentSegment();
        int int14 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray11, 1, (-533333328));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-48) + "'", int14 == (-48));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        java.lang.String str9 = textBuffer8.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray14, (int) ' ', (int) (byte) 10);
        textBuffer8.resetWithShared(charArray14, (int) (short) 10, (int) (short) 0);
        int int21 = textBuffer8.getTextOffset();
        char[] charArray22 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer8.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        textBuffer25.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        char[] charArray32 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer29.resetWithShared(charArray32, (int) ' ', (int) (byte) 10);
        boolean boolean39 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray32, (int) '#', 1, true);
        textBuffer25.resetWithShared(charArray32, 10, 0);
        boolean boolean43 = textBuffer25.hasTextAsCharacters();
        textBuffer25.resetWithEmpty();
        textBuffer25.setCurrentLength((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler47 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer48 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler47);
        int int49 = textBuffer48.getCurrentSegmentSize();
        java.lang.String str50 = textBuffer48.toString();
        textBuffer48.releaseBuffers();
        char[] charArray52 = textBuffer48.emptyAndGetCurrentSegment();
        textBuffer25.resetWithShared(charArray52, 23, (-1));
        boolean boolean59 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray52, (int) (byte) 0, (int) (short) 100, true);
        textBuffer8.append(charArray52, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray52, (int) (byte) 1, (int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler66 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer67 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler66);
        int int68 = textBuffer67.getCurrentSegmentSize();
        char[] charArray69 = textBuffer67.emptyAndGetCurrentSegment();
        textBuffer67.resetWithString("2.2250738585072012e-308");
        double double72 = textBuffer67.contentsAsDouble();
        char[] charArray73 = textBuffer67.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray73, (int) (byte) 100, 35);
        textBuffer1.append('#');
        int int79 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 4.9E-324d + "'", double72 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.contentsAsArray();
        java.lang.String str19 = textBuffer17.toString();
        int int20 = textBuffer17.getTextOffset();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        char[] charArray22 = textBuffer17.contentsAsArray();
        textBuffer1.resetWithShared(charArray22, (-1), (int) (byte) 10);
        int int26 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double30 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, true);
        textBuffer6.resetWithShared(charArray13, 10, 0);
        boolean boolean24 = textBuffer6.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        java.lang.String str27 = textBuffer26.toString();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer6.append(charArray28, (int) (byte) 10, 100);
        textBuffer1.resetWithShared(charArray28, (int) (short) -1, 97);
        char[] charArray35 = textBuffer1.getTextBuffer();
        int int36 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double37 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("aa", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double9 = textBuffer1.contentsAsDouble();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = textBuffer12.contentsAsArray();
        textBuffer12.releaseBuffers();
        java.lang.String str17 = textBuffer12.toString();
        textBuffer12.releaseBuffers();
        int int19 = textBuffer12.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        int int22 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str23 = textBuffer21.toString();
        textBuffer21.ensureNotShared();
        int int25 = textBuffer21.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        int int28 = textBuffer27.getCurrentSegmentSize();
        java.lang.String str29 = textBuffer27.toString();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray30, (int) ' ', (int) (byte) 10);
        char[] charArray34 = textBuffer27.emptyAndGetCurrentSegment();
        boolean boolean38 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray34, (-1), 1000, true);
        textBuffer21.resetWithCopy(charArray34, (int) (short) 1, (int) (byte) 1);
        long long44 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray34, (int) '#', 52);
        textBuffer12.resetWithShared(charArray34, 10, (int) ' ');
        textBuffer1.resetWithShared(charArray34, (int) (short) 1, (int) (byte) -1);
        char[] charArray51 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1038366033038366032L) + "'", long44 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray51);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        int int26 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray23, (int) (byte) 100, (int) (byte) 10);
        textBuffer1.resetWithCopy(charArray23, 1, 0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) 'a');
        int int33 = textBuffer1.getCurrentSegmentSize();
        java.lang.Class<?> wildcardClass34 = textBuffer1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1038366032) + "'", int26 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        int int11 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.resetWithString("");
        textBuffer13.releaseBuffers();
        int int17 = textBuffer13.size();
        boolean boolean18 = textBuffer13.hasTextAsCharacters();
        int int19 = textBuffer13.size();
        int int20 = textBuffer13.getTextOffset();
        textBuffer13.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        int int24 = textBuffer23.getCurrentSegmentSize();
        java.lang.String str25 = textBuffer23.toString();
        char[] charArray26 = textBuffer23.contentsAsArray();
        textBuffer23.releaseBuffers();
        java.lang.String str28 = textBuffer23.toString();
        textBuffer23.releaseBuffers();
        textBuffer23.ensureNotShared();
        java.lang.String str31 = textBuffer23.toString();
        char[] charArray32 = textBuffer23.getTextBuffer();
        textBuffer13.resetWithShared(charArray32, (-48), 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray32, 35, (-2133333328));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2133333328 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        boolean boolean27 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getTextBuffer();
        java.lang.String str7 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.append('4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        java.lang.String str10 = textBuffer9.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray15, (int) ' ', (int) (byte) 10);
        textBuffer9.resetWithShared(charArray15, (int) (short) 10, (int) (short) 0);
        int int22 = textBuffer9.getTextOffset();
        char[] charArray23 = textBuffer9.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        char[] charArray26 = textBuffer25.contentsAsArray();
        java.lang.String str27 = textBuffer25.toString();
        int int28 = textBuffer25.getTextOffset();
        char[] charArray29 = textBuffer25.getCurrentSegment();
        char[] charArray30 = textBuffer25.contentsAsArray();
        textBuffer9.resetWithShared(charArray30, (-1), (int) (byte) 10);
        textBuffer1.resetWithShared(charArray30, (int) ' ', (-48));
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray6, 0, (-2133333328));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength(100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        int int27 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.contentsAsArray();
        java.lang.String str19 = textBuffer17.toString();
        int int20 = textBuffer17.getTextOffset();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        char[] charArray22 = textBuffer17.contentsAsArray();
        textBuffer1.resetWithShared(charArray22, (-1), (int) (byte) 10);
        char[] charArray26 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getCurrentSegmentSize();
        char[] charArray30 = textBuffer28.emptyAndGetCurrentSegment();
        long long33 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray30, (int) '4', 1);
        boolean boolean37 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray30, 100, (int) (short) -1, false);
        int int40 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray30, 10, (int) (short) 100);
        textBuffer1.append(charArray30, 1, 35);
        int int46 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray30, (int) '#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-49038366032L) + "'", long33 == (-49038366032L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1038366032) + "'", int40 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-48) + "'", int46 == (-48));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.getTextBuffer();
        java.lang.String str9 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 99, length 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getCurrentSegmentSize();
        int int7 = textBuffer1.size();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 23, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 23, end 23, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer6.resetWithShared(charArray9, (int) ' ', (int) (byte) 10);
        textBuffer6.resetWithString("2.2250738585072012e-308");
        char[] charArray15 = textBuffer6.contentsAsArray();
        int int16 = textBuffer6.getTextOffset();
        char[] charArray17 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, (int) (byte) 100, (int) (short) 100);
        char[] charArray21 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        textBuffer1.resetWithString("hi!");
        char[] charArray29 = textBuffer1.contentsAsArray();
        textBuffer1.append('a');
        int int32 = textBuffer1.getTextOffset();
        boolean boolean33 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(136);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", 0, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 136, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", (long) 136);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5073858507L + "'", long2 == 5073858507L);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.contentsAsArray();
        java.lang.String str19 = textBuffer17.toString();
        int int20 = textBuffer17.getTextOffset();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        char[] charArray22 = textBuffer17.contentsAsArray();
        textBuffer1.resetWithShared(charArray22, (-1), (int) (byte) 10);
        char[] charArray26 = textBuffer1.getCurrentSegment();
        char[] charArray27 = textBuffer1.getTextBuffer();
        int int28 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        int int31 = textBuffer30.getCurrentSegmentSize();
        java.lang.String str32 = textBuffer30.contentsAsString();
        char[] charArray33 = textBuffer30.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        int int36 = textBuffer35.getCurrentSegmentSize();
        java.lang.String str37 = textBuffer35.toString();
        boolean boolean38 = textBuffer35.hasTextAsCharacters();
        char[] charArray39 = textBuffer35.contentsAsArray();
        textBuffer30.resetWithShared(charArray39, (int) (byte) 10, 1);
        textBuffer1.resetWithShared(charArray39, 10, 136);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray46 = textBuffer1.getCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 146 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.setCurrentLength(100);
        textBuffer1.append('4');
        char[] charArray23 = textBuffer1.getTextBuffer();
        char[] charArray24 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal27 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray24, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        int int11 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray15 = textBuffer1.getCurrentSegment();
        boolean boolean16 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("aa", 8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 8, end 8, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        java.lang.String str8 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("2.2250738585072012e-308", (-1.038366032E9d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        textBuffer7.resetWithString("2.2250738585072012e-308");
        char[] charArray16 = textBuffer7.emptyAndGetCurrentSegment();
        textBuffer7.resetWithString("4");
        char[] charArray19 = textBuffer7.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray19, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray19, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer6.resetWithShared(charArray9, (int) ' ', (int) (byte) 10);
        textBuffer6.resetWithString("2.2250738585072012e-308");
        char[] charArray15 = textBuffer6.contentsAsArray();
        int int16 = textBuffer6.getTextOffset();
        char[] charArray17 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, (int) (byte) 100, (int) (short) 100);
        char[] charArray21 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray21, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer6.resetWithShared(charArray9, (int) ' ', (int) (byte) 10);
        textBuffer6.resetWithString("2.2250738585072012e-308");
        char[] charArray15 = textBuffer6.contentsAsArray();
        int int16 = textBuffer6.getTextOffset();
        char[] charArray17 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, (int) (byte) 100, (int) (short) 100);
        char[] charArray21 = textBuffer1.contentsAsArray();
        boolean boolean22 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            double double26 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 136, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 136, end 159, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int8 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        textBuffer10.ensureNotShared();
        int int14 = textBuffer10.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer16.toString();
        char[] charArray19 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer16.resetWithShared(charArray19, (int) ' ', (int) (byte) 10);
        char[] charArray23 = textBuffer16.emptyAndGetCurrentSegment();
        boolean boolean27 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray23, (-1), 1000, true);
        textBuffer10.resetWithCopy(charArray23, (int) (short) 1, (int) (byte) 1);
        long long33 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray23, (int) '#', 52);
        textBuffer1.resetWithShared(charArray23, 10, (int) ' ');
        char[] charArray37 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        textBuffer41.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        int int46 = textBuffer45.getCurrentSegmentSize();
        java.lang.String str47 = textBuffer45.toString();
        char[] charArray48 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer45.resetWithShared(charArray48, (int) ' ', (int) (byte) 10);
        boolean boolean55 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray48, (int) '#', 1, true);
        textBuffer41.resetWithShared(charArray48, 10, 0);
        textBuffer41.setCurrentLength(100);
        textBuffer41.append('4');
        char[] charArray63 = textBuffer41.getTextBuffer();
        java.lang.String str64 = textBuffer41.contentsAsString();
        char[] charArray65 = textBuffer41.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray65, 23, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 123 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1038366033038366032L) + "'", long33 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "4" + "'", str64, "4");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4' });
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getCurrentSegmentSize();
        int int7 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("4");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        textBuffer10.ensureNotShared();
        int int14 = textBuffer10.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer16.toString();
        char[] charArray19 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer16.resetWithShared(charArray19, (int) ' ', (int) (byte) 10);
        char[] charArray23 = textBuffer16.emptyAndGetCurrentSegment();
        boolean boolean27 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray23, (-1), 1000, true);
        textBuffer10.resetWithCopy(charArray23, (int) (short) 1, (int) (byte) 1);
        textBuffer1.resetWithShared(charArray23, 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal34 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        char[] charArray13 = textBuffer11.emptyAndGetCurrentSegment();
        long long16 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray13, (int) '4', 1);
        textBuffer1.resetWithShared(charArray13, (int) ' ', (-2133333328));
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-49038366032L) + "'", long16 == (-49038366032L));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.contentsAsArray();
        java.lang.String str19 = textBuffer17.toString();
        int int20 = textBuffer17.getTextOffset();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        char[] charArray22 = textBuffer17.contentsAsArray();
        textBuffer1.resetWithShared(charArray22, (-1), (int) (byte) 10);
        int int26 = textBuffer1.getCurrentSegmentSize();
        int int27 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.contentsAsArray();
        java.lang.String str18 = textBuffer16.toString();
        int int19 = textBuffer16.getTextOffset();
        char[] charArray20 = textBuffer16.getCurrentSegment();
        char[] charArray21 = textBuffer16.contentsAsArray();
        textBuffer1.resetWithShared(charArray21, 35, (int) (short) -1);
        textBuffer1.resetWithEmpty();
        char[] charArray26 = textBuffer1.getTextBuffer();
        char[] charArray27 = textBuffer1.contentsAsArray();
        boolean boolean31 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray27, (int) '#', (-533333328), true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        int int7 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer1.contentsAsString();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        java.lang.String str11 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        char[] charArray14 = textBuffer7.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer16.toString();
        char[] charArray19 = textBuffer16.contentsAsArray();
        textBuffer7.resetWithShared(charArray19, (int) (byte) 100, 100);
        textBuffer1.resetWithShared(charArray19, (int) 'a', 35);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal26 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("hi!", (double) 23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.0d + "'", double2 == 23.0d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int21 = textBuffer1.getTextOffset();
        int int22 = textBuffer1.getTextOffset();
        java.lang.Class<?> wildcardClass23 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, true);
        textBuffer6.resetWithShared(charArray13, 10, 0);
        boolean boolean24 = textBuffer6.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        java.lang.String str27 = textBuffer26.toString();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer6.append(charArray28, (int) (byte) 10, 100);
        textBuffer1.resetWithShared(charArray28, (int) (short) -1, 97);
        int int37 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray28, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal38 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-48) + "'", int37 == (-48));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        int int7 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer1.append(charArray23, (int) (byte) 10, 100);
        textBuffer1.resetWithString("hi!");
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 10, 23);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        textBuffer34.resetWithString("");
        int int37 = textBuffer34.size();
        java.lang.String str38 = textBuffer34.contentsAsString();
        char[] charArray39 = textBuffer34.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray39, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charArray39);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        int int26 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray23, (int) (byte) 100, (int) (byte) 10);
        textBuffer1.resetWithCopy(charArray23, 1, 0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) 'a');
        int int33 = textBuffer1.getCurrentSegmentSize();
        char[] charArray34 = textBuffer1.contentsAsArray();
        int int35 = textBuffer1.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1038366032) + "'", int26 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((-1));
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((-1038366032));
        textBuffer1.resetWithString("");
        int int14 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        int int18 = textBuffer17.getCurrentSegmentSize();
        java.lang.String str19 = textBuffer17.toString();
        char[] charArray20 = textBuffer17.contentsAsArray();
        textBuffer17.releaseBuffers();
        textBuffer17.resetWithString("hi!");
        char[] charArray24 = textBuffer17.contentsAsArray();
        char[] charArray25 = textBuffer17.contentsAsArray();
        textBuffer17.releaseBuffers();
        char[] charArray27 = textBuffer17.getTextBuffer();
        int int28 = textBuffer17.size();
        char[] charArray29 = textBuffer17.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray29, 23, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1023 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNull(charArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = null;
        textBuffer1.resetWithShared(charArray7, (int) '4', (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.contentsAsArray();
        java.lang.String str14 = textBuffer12.toString();
        int int15 = textBuffer12.getTextOffset();
        char[] charArray16 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray16, 136, 23);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        int int7 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("aa", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        java.lang.String str9 = textBuffer1.toString();
        char[] charArray10 = textBuffer1.getTextBuffer();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        int int12 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((-48));
        int int15 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        int int18 = textBuffer17.getCurrentSegmentSize();
        java.lang.String str19 = textBuffer17.toString();
        textBuffer17.ensureNotShared();
        int int21 = textBuffer17.getTextOffset();
        char[] charArray22 = textBuffer17.getCurrentSegment();
        textBuffer1.resetWithShared(charArray22, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray22);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        java.lang.String str19 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        java.lang.String str23 = textBuffer22.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        int int26 = textBuffer25.getCurrentSegmentSize();
        java.lang.String str27 = textBuffer25.toString();
        char[] charArray28 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer25.resetWithShared(charArray28, (int) ' ', (int) (byte) 10);
        textBuffer22.resetWithShared(charArray28, (int) (short) 10, (int) (short) 0);
        boolean boolean35 = textBuffer22.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        char[] charArray38 = textBuffer37.contentsAsArray();
        java.lang.String str39 = textBuffer37.toString();
        int int40 = textBuffer37.getTextOffset();
        char[] charArray41 = textBuffer37.getCurrentSegment();
        char[] charArray42 = textBuffer37.contentsAsArray();
        textBuffer22.resetWithShared(charArray42, 35, (int) (short) -1);
        boolean boolean49 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray42, 35, (int) (byte) 0, false);
        boolean boolean53 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray42, (int) (short) 0, (int) ' ', false);
        textBuffer1.resetWithShared(charArray42, (int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 10, count 10, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray5, (int) '4', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        java.lang.String str6 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.contentsAsString();
        java.lang.String str11 = textBuffer8.toString();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        char[] charArray13 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, (int) (byte) 1, 0);
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        char[] charArray20 = textBuffer19.contentsAsArray();
        java.lang.String str21 = textBuffer19.toString();
        textBuffer19.setCurrentLength((int) (byte) 100);
        char[] charArray24 = textBuffer19.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray24, (-1038366032), (-533333328));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1038366032 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int21 = textBuffer1.getTextOffset();
        int int22 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray23 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray9, 1, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray10, (int) ' ', (int) (byte) 10);
        char[] charArray14 = textBuffer7.emptyAndGetCurrentSegment();
        boolean boolean18 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray14, (-1), 1000, true);
        textBuffer1.resetWithCopy(charArray14, (int) (short) 1, (int) (byte) 1);
        textBuffer1.setCurrentLength(100);
        textBuffer1.resetWithString("");
        char[] charArray26 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass27 = charArray26.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        int int10 = textBuffer7.getCurrentSegmentSize();
        textBuffer7.ensureNotShared();
        textBuffer7.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        int int15 = textBuffer14.getCurrentSegmentSize();
        java.lang.String str16 = textBuffer14.toString();
        char[] charArray17 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer14.resetWithShared(charArray17, (int) ' ', (int) (byte) 10);
        char[] charArray21 = textBuffer14.emptyAndGetCurrentSegment();
        textBuffer7.resetWithShared(charArray21, (-1), (int) (byte) 1);
        java.lang.String str25 = textBuffer7.toString();
        char[] charArray26 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray26, (-48), 262144);
        boolean boolean30 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.setCurrentLength(100);
        textBuffer1.append('4');
        char[] charArray23 = textBuffer1.getTextBuffer();
        java.lang.String str24 = textBuffer1.contentsAsString();
        char[] charArray25 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        textBuffer27.resetWithString("");
        char[] charArray30 = textBuffer27.getTextBuffer();
        int int31 = textBuffer27.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        textBuffer33.resetWithString("");
        textBuffer33.resetWithEmpty();
        char[] charArray37 = textBuffer33.emptyAndGetCurrentSegment();
        textBuffer27.resetWithCopy(charArray37, 100, 0);
        textBuffer1.resetWithCopy(charArray37, 97, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal44 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray37);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        int int8 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        char[] charArray12 = textBuffer10.emptyAndGetCurrentSegment();
        int int13 = textBuffer10.getTextOffset();
        char[] charArray14 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray15 = textBuffer10.getTextBuffer();
        textBuffer1.resetWithCopy(charArray15, (int) (short) 10, (int) (short) 100);
        char[] charArray19 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray19, (int) (short) 100, (-2133333328));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2133333237 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int6 = textBuffer1.size();
        int int7 = textBuffer1.size();
        java.lang.Class<?> wildcardClass8 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean8 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, 0, (int) (short) 0, false);
        boolean boolean12 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, 52, 0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray4, 1000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        int int6 = textBuffer5.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer5.toString();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray8, (int) ' ', (int) (byte) 10);
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '#', 1, true);
        textBuffer1.resetWithShared(charArray8, 10, 0);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int21 = textBuffer1.getTextOffset();
        int int22 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        int int10 = textBuffer9.getCurrentSegmentSize();
        java.lang.String str11 = textBuffer9.toString();
        char[] charArray12 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer9.resetWithShared(charArray12, (int) ' ', (int) (byte) 10);
        boolean boolean19 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray12, (int) '#', 1, true);
        textBuffer5.resetWithShared(charArray12, 10, 0);
        boolean boolean23 = textBuffer5.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        java.lang.String str26 = textBuffer25.toString();
        char[] charArray27 = textBuffer25.getCurrentSegment();
        textBuffer5.append(charArray27, (int) (byte) 10, 100);
        char[] charArray31 = textBuffer5.getCurrentSegment();
        textBuffer1.resetWithShared(charArray31, (int) (byte) -1, (-1038366032));
        textBuffer1.append(' ');
        textBuffer1.setCurrentLength(97);
        char[] charArray39 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray39);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        int int8 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        char[] charArray12 = textBuffer10.emptyAndGetCurrentSegment();
        int int13 = textBuffer10.getTextOffset();
        char[] charArray14 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray15 = textBuffer10.getTextBuffer();
        textBuffer1.resetWithCopy(charArray15, (int) (short) 10, (int) (short) 100);
        char[] charArray19 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        int int22 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str23 = textBuffer21.contentsAsString();
        char[] charArray25 = new char[] { '4' };
        textBuffer21.resetWithShared(charArray25, 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray25, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 135 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        double double6 = textBuffer1.contentsAsDouble();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        boolean boolean12 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, 0, (int) (byte) 1, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getCurrentSegmentSize();
        int int7 = textBuffer1.size();
        java.lang.String str8 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        char[] charArray4 = textBuffer1.contentsAsArray();
        java.lang.String str5 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("a");
        char[] charArray7 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass8 = charArray7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a' });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5073858507L + "'", long2 == 5073858507L);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        char[] charArray9 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.releaseBuffers();
        boolean boolean13 = textBuffer11.hasTextAsCharacters();
        textBuffer11.releaseBuffers();
        textBuffer11.releaseBuffers();
        char[] charArray16 = textBuffer11.getTextBuffer();
        boolean boolean17 = textBuffer11.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        int int20 = textBuffer19.getCurrentSegmentSize();
        textBuffer19.setCurrentLength((int) (short) 100);
        textBuffer19.resetWithEmpty();
        textBuffer19.releaseBuffers();
        char[] charArray25 = textBuffer19.emptyAndGetCurrentSegment();
        textBuffer11.resetWithShared(charArray25, 0, (int) (byte) 100);
        textBuffer1.resetWithShared(charArray25, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        double double6 = textBuffer1.contentsAsDouble();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        int int9 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        java.lang.String str22 = textBuffer21.toString();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        int int26 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray23, (int) (byte) 100, (int) (byte) 10);
        textBuffer1.resetWithCopy(charArray23, 1, 0);
        textBuffer1.resetWithEmpty();
        int int31 = textBuffer1.getCurrentSegmentSize();
        char[] charArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray32, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1038366032) + "'", int26 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        int int5 = textBuffer4.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer4.toString();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray7, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithShared(charArray7, (int) (short) 10, (int) (short) 0);
        int int14 = textBuffer1.getTextOffset();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        int int23 = textBuffer22.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer22.toString();
        char[] charArray25 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer22.resetWithShared(charArray25, (int) ' ', (int) (byte) 10);
        boolean boolean32 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray25, (int) '#', 1, true);
        textBuffer18.resetWithShared(charArray25, 10, 0);
        boolean boolean36 = textBuffer18.hasTextAsCharacters();
        textBuffer18.resetWithEmpty();
        textBuffer18.setCurrentLength((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        int int42 = textBuffer41.getCurrentSegmentSize();
        java.lang.String str43 = textBuffer41.toString();
        textBuffer41.releaseBuffers();
        char[] charArray45 = textBuffer41.emptyAndGetCurrentSegment();
        textBuffer18.resetWithShared(charArray45, 23, (-1));
        boolean boolean52 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray45, (int) (byte) 0, (int) (short) 100, true);
        textBuffer1.append(charArray45, (int) ' ', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray45, 1000, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1000 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        int int7 = textBuffer6.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer6.toString();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer6.resetWithShared(charArray9, (int) ' ', (int) (byte) 10);
        textBuffer6.resetWithString("2.2250738585072012e-308");
        char[] charArray15 = textBuffer6.contentsAsArray();
        int int16 = textBuffer6.getTextOffset();
        char[] charArray17 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, (int) (byte) 100, (int) (short) 100);
        char[] charArray21 = textBuffer1.contentsAsArray();
        boolean boolean22 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.append('#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        char[] charArray9 = textBuffer7.emptyAndGetCurrentSegment();
        int int10 = textBuffer7.getCurrentSegmentSize();
        int int11 = textBuffer7.getCurrentSegmentSize();
        int int12 = textBuffer7.size();
        textBuffer7.ensureNotShared();
        char[] charArray14 = textBuffer7.getCurrentSegment();
        int int15 = textBuffer7.getTextOffset();
        char[] charArray16 = textBuffer7.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray16, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 62 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, true);
        textBuffer6.resetWithShared(charArray13, 10, 0);
        boolean boolean24 = textBuffer6.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        java.lang.String str27 = textBuffer26.toString();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer6.append(charArray28, (int) (byte) 10, 100);
        textBuffer1.resetWithShared(charArray28, (int) (short) -1, 97);
        char[] charArray35 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray37 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        int int40 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.073858507E9d + "'", double1 == 5.073858507E9d);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        int int7 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer1.contentsAsString();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.getTextOffset();
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray12 = textBuffer1.getTextBuffer();
        int int15 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray12, (int) (short) 1, (int) (short) 0);
        boolean boolean19 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray12, 262144, 32, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-48) + "'", int15 == (-48));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        int int11 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray15 = textBuffer1.getCurrentSegment();
        boolean boolean16 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000", 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 4, end 104, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray14);
    }
}

