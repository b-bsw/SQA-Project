package com.fasterxml.jackson.core.util;

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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        java.lang.String str8 = textBuffer1.contentsAsString();
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
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.finishCurrentSegment();
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
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000 ", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507");
        char[] charArray18 = textBuffer1.contentsAsArray();
        char[] charArray19 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray10 = textBuffer1.contentsAsArray();
        int int11 = textBuffer1.getTextOffset();
        boolean boolean12 = textBuffer1.hasTextAsCharacters();
        java.lang.String str13 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.2250738585072012e-308" + "'", str13, "2.2250738585072012e-308");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        int int3 = textBuffer1.getCurrentSegmentSize();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.contentsAsArray();
        java.lang.String str11 = textBuffer9.toString();
        int int12 = textBuffer9.getTextOffset();
        char[] charArray13 = textBuffer9.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        int int16 = textBuffer15.getCurrentSegmentSize();
        java.lang.String str17 = textBuffer15.toString();
        char[] charArray18 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer15.resetWithShared(charArray18, (int) ' ', (int) (byte) 10);
        char[] charArray22 = textBuffer15.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        int int25 = textBuffer24.getCurrentSegmentSize();
        java.lang.String str26 = textBuffer24.toString();
        char[] charArray27 = textBuffer24.contentsAsArray();
        textBuffer15.resetWithShared(charArray27, (int) (byte) 100, 100);
        textBuffer9.resetWithShared(charArray27, (int) 'a', 35);
        textBuffer1.resetWithShared(charArray27, (int) (byte) -1, (int) (byte) 100);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        char[] charArray13 = textBuffer11.emptyAndGetCurrentSegment();
        int int14 = textBuffer11.getTextOffset();
        char[] charArray15 = textBuffer11.emptyAndGetCurrentSegment();
        boolean boolean19 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray15, (int) (short) 0, (int) (short) 100, false);
        textBuffer1.resetWithShared(charArray15, 52, (-48));
        char[] charArray23 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
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
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.append('a');
        java.lang.String str9 = textBuffer1.toString();
        textBuffer1.setCurrentLength(100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        int int14 = textBuffer13.getCurrentSegmentSize();
        java.lang.String str15 = textBuffer13.toString();
        textBuffer13.ensureNotShared();
        boolean boolean17 = textBuffer13.hasTextAsCharacters();
        textBuffer13.setCurrentLength((int) (short) 0);
        textBuffer13.resetWithEmpty();
        char[] charArray21 = textBuffer13.getTextBuffer();
        textBuffer1.resetWithShared(charArray21, (int) 'a', (int) (byte) 0);
        int int25 = textBuffer1.size();
        int int26 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000 ", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.getTextBuffer();
        int int8 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.contentsAsArray();
        int int7 = textBuffer1.size();
        java.lang.Class<?> wildcardClass8 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        java.lang.String str8 = textBuffer1.contentsAsString();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.releaseBuffers();
        char[] charArray11 = textBuffer9.emptyAndGetCurrentSegment();
        boolean boolean15 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray11, 3, (-2133333328), true);
        int int18 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray11, 0, (int) (byte) 10);
        textBuffer1.resetWithCopy(charArray11, (int) '#', (int) (short) 10);
        int int24 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray11, 53, 136);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1038366032) + "'", int18 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1038366032) + "'", int24 == (-1038366032));
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
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
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
        int int25 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getCurrentSegmentSize();
        java.lang.String str30 = textBuffer28.contentsAsString();
        char[] charArray31 = textBuffer28.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        int int34 = textBuffer33.getCurrentSegmentSize();
        java.lang.String str35 = textBuffer33.toString();
        boolean boolean36 = textBuffer33.hasTextAsCharacters();
        char[] charArray37 = textBuffer33.contentsAsArray();
        textBuffer28.resetWithShared(charArray37, (int) (byte) 10, 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        int int43 = textBuffer42.getCurrentSegmentSize();
        java.lang.String str44 = textBuffer42.contentsAsString();
        char[] charArray45 = textBuffer42.getCurrentSegment();
        char[] charArray46 = textBuffer42.contentsAsArray();
        textBuffer28.resetWithShared(charArray46, 262144, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray46, 2, 182250738);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1002 out of bounds for char[0]");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("");
        textBuffer1.resetWithString("");
        java.lang.String str13 = textBuffer1.toString();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        int int15 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str16 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.toString();
        int int7 = textBuffer1.size();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        java.lang.String str10 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        boolean boolean14 = textBuffer12.hasTextAsCharacters();
        textBuffer12.releaseBuffers();
        textBuffer12.releaseBuffers();
        char[] charArray17 = textBuffer12.getTextBuffer();
        char[] charArray18 = textBuffer12.contentsAsArray();
        char[] charArray19 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray19, (int) (byte) 10, (int) '#');
        char[] charArray23 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2.2250738585072012e-308" + "'", str10, "2.2250738585072012e-308");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("");
        textBuffer1.resetWithString("");
        java.lang.String str13 = textBuffer1.toString();
        textBuffer1.setCurrentLength((-1));
        textBuffer1.resetWithEmpty();
        int int17 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        int int3 = textBuffer1.getCurrentSegmentSize();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean8 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, (int) (byte) 100, (int) '4', true);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
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
        textBuffer1.resetWithEmpty();
        char[] charArray12 = textBuffer1.getCurrentSegment();
        int int13 = textBuffer1.size();
        java.lang.String str14 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = null;
        textBuffer1.resetWithShared(charArray6, 23, (int) (byte) 100);
        int int10 = textBuffer1.getCurrentSegmentSize();
        int int11 = textBuffer1.size();
        char[] charArray12 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean16 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray12, 1000, 100, false);
        int int19 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray12, 23, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-48) + "'", int19 == (-48));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        java.lang.String str17 = textBuffer1.contentsAsString();
        char[] charArray18 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str17, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        textBuffer1.resetWithEmpty();
        char[] charArray12 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean11 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray7, (-48), 35, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.append(' ');
        textBuffer1.append('4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int6 = textBuffer1.size();
        int int7 = textBuffer1.size();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        long long11 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray8, 97, 53);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1038366033038366032L) + "'", long11 == (-1038366033038366032L));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.setCurrentLength((int) (short) 0);
        textBuffer1.setCurrentLength(10);
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        char[] charArray14 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(charArray14);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
        boolean boolean21 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = textBuffer1.contentsAsDouble();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
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
        int int11 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000#", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
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
        char[] charArray35 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal36 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray35);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        int int40 = textBuffer39.getCurrentSegmentSize();
        java.lang.String str41 = textBuffer39.toString();
        textBuffer39.ensureNotShared();
        int int43 = textBuffer39.getCurrentSegmentSize();
        char[] charArray44 = textBuffer39.contentsAsArray();
        int int45 = textBuffer39.getCurrentSegmentSize();
        char[] charArray46 = textBuffer39.getCurrentSegment();
        boolean boolean50 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray46, 49, 32, true);
        textBuffer1.resetWithShared(charArray46, (int) (byte) 10, 100);
        textBuffer1.resetWithString(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("2.2250738585072012e-308", (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 51, length 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
        int int26 = textBuffer1.size();
        textBuffer1.setCurrentLength(35);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.contentsAsArray();
        java.lang.String str9 = textBuffer1.toString();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        int int24 = textBuffer1.getTextOffset();
        boolean boolean25 = textBuffer1.hasTextAsCharacters();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
        int int19 = textBuffer1.getTextOffset();
        char[] charArray20 = textBuffer1.contentsAsArray();
        boolean boolean24 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray20, 4, 0, false);
        boolean boolean28 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray20, (-5328), (int) (byte) 1, false);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray20, (-53328), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -53328 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 4, (int) (byte) 1);
        textBuffer1.append('a');
        int int30 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("2.2250738585072012e-308", 35, (-2133333328));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end -2133333293, length 23");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer1.contentsAsString();
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
        char[] charArray24 = textBuffer8.emptyAndGetCurrentSegment();
        long long27 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray24, (int) (byte) 10, (int) (short) 0);
        textBuffer1.resetWithCopy(charArray24, (int) (short) 1, (int) (short) 0);
        char[] charArray31 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-49038366032L) + "'", long27 == (-49038366032L));
        org.junit.Assert.assertNotNull(charArray31);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
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
        char[] charArray27 = textBuffer1.getCurrentSegment();
        char[] charArray28 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass29 = charArray28.getClass();
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
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        double double6 = textBuffer1.contentsAsDouble();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        char[] charArray10 = textBuffer1.getTextBuffer();
        char[] charArray11 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
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
            double double46 = textBuffer1.contentsAsDouble();
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
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("2.2250738585072012e-308", (double) (-533333328L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        char[] charArray19 = textBuffer1.contentsAsArray();
        boolean boolean23 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray19, 97, (int) (short) 0, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        int int6 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        int int9 = textBuffer1.getTextOffset();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray10, 1000, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1000 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
    }
}

