package com.fasterxml.jackson.core.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        int int27 = textBuffer1.getTextOffset();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray24, 1000, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1000 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        int int12 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        textBuffer1.resetWithCopy(charArray30, 35, 10);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double45 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append('a');
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
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray24, (int) (byte) 100, (-1038366032));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1038366032 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-49038366032L) + "'", long27 == (-49038366032L));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        int int7 = textBuffer1.getTextOffset();
        int int8 = textBuffer1.getTextOffset();
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.contentsAsArray();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        int int6 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray3, (int) (byte) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray3, 8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1038366032) + "'", int6 == (-1038366032));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(52);
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = textBuffer1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getCurrentSegmentSize();
        java.lang.String str30 = textBuffer28.toString();
        char[] charArray31 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer28.resetWithShared(charArray31, (int) ' ', (int) (byte) 10);
        textBuffer28.resetWithString("2.2250738585072012e-308");
        int int37 = textBuffer28.getCurrentSegmentSize();
        textBuffer28.releaseBuffers();
        int int39 = textBuffer28.size();
        textBuffer28.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        int int43 = textBuffer42.getCurrentSegmentSize();
        java.lang.String str44 = textBuffer42.contentsAsString();
        char[] charArray45 = textBuffer42.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer47 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler46);
        textBuffer47.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler50 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer51 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler50);
        int int52 = textBuffer51.getCurrentSegmentSize();
        java.lang.String str53 = textBuffer51.toString();
        char[] charArray54 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer51.resetWithShared(charArray54, (int) ' ', (int) (byte) 10);
        boolean boolean61 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray54, (int) '#', 1, true);
        textBuffer47.resetWithShared(charArray54, 10, 0);
        boolean boolean65 = textBuffer47.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler66 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer67 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler66);
        java.lang.String str68 = textBuffer67.toString();
        char[] charArray69 = textBuffer67.getCurrentSegment();
        textBuffer47.append(charArray69, (int) (byte) 10, 100);
        textBuffer42.resetWithShared(charArray69, (int) (short) -1, 97);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler76 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer77 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler76);
        int int78 = textBuffer77.getCurrentSegmentSize();
        java.lang.String str79 = textBuffer77.contentsAsString();
        java.lang.String str80 = textBuffer77.toString();
        char[] charArray81 = textBuffer77.getCurrentSegment();
        textBuffer42.resetWithShared(charArray81, (int) (short) 1, (int) (byte) 1);
        boolean boolean88 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray81, (int) (short) -1, (int) (short) 100, true);
        textBuffer28.resetWithCopy(charArray81, 100, (int) (short) 100);
        textBuffer1.resetWithCopy(charArray81, 0, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray81, (-48), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -48 out of bounds for length 1000");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("", (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        int int7 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray0, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 9, length 110");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((-1));
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("a");
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        int int7 = textBuffer1.getTextOffset();
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
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        int int6 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.resetWithString("");
        int int11 = textBuffer8.size();
        char[] charArray12 = textBuffer8.contentsAsArray();
        boolean boolean16 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray12, 35, 262144, true);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray12, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        char[] charArray15 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.getTextBuffer();
        int int6 = textBuffer1.getCurrentSegmentSize();
        int int7 = textBuffer1.getTextOffset();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean12 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, 0, 0, true);
        boolean boolean16 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '4', (int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        int int30 = textBuffer1.size();
        char[] charArray31 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString(" ");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray31);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        char[] charArray11 = textBuffer8.contentsAsArray();
        textBuffer8.releaseBuffers();
        textBuffer8.resetWithString("hi!");
        java.lang.String str15 = textBuffer8.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        textBuffer17.releaseBuffers();
        textBuffer17.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        int int23 = textBuffer22.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer22.toString();
        char[] charArray25 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer22.resetWithShared(charArray25, (int) ' ', (int) (byte) 10);
        textBuffer22.resetWithString("2.2250738585072012e-308");
        char[] charArray31 = textBuffer22.contentsAsArray();
        int int32 = textBuffer22.getTextOffset();
        char[] charArray33 = textBuffer22.getCurrentSegment();
        textBuffer17.resetWithCopy(charArray33, (int) (byte) 100, (int) (short) 100);
        char[] charArray37 = textBuffer17.emptyAndGetCurrentSegment();
        textBuffer8.resetWithCopy(charArray37, (int) (byte) 1, 23);
        textBuffer1.resetWithCopy(charArray37, (int) 'a', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal46 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray37, 136, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(charArray37);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray8 = textBuffer1.contentsAsArray();
        int int9 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        char[] charArray14 = textBuffer11.contentsAsArray();
        textBuffer11.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double19 = textBuffer11.contentsAsDouble();
        char[] charArray20 = textBuffer11.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        int int23 = textBuffer22.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer22.toString();
        char[] charArray25 = textBuffer22.contentsAsArray();
        textBuffer22.releaseBuffers();
        java.lang.String str27 = textBuffer22.toString();
        textBuffer22.releaseBuffers();
        int int29 = textBuffer22.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        int int32 = textBuffer31.getCurrentSegmentSize();
        java.lang.String str33 = textBuffer31.toString();
        textBuffer31.ensureNotShared();
        int int35 = textBuffer31.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        int int38 = textBuffer37.getCurrentSegmentSize();
        java.lang.String str39 = textBuffer37.toString();
        char[] charArray40 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer37.resetWithShared(charArray40, (int) ' ', (int) (byte) 10);
        char[] charArray44 = textBuffer37.emptyAndGetCurrentSegment();
        boolean boolean48 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray44, (-1), 1000, true);
        textBuffer31.resetWithCopy(charArray44, (int) (short) 1, (int) (byte) 1);
        long long54 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray44, (int) '#', 52);
        textBuffer22.resetWithShared(charArray44, 10, (int) ' ');
        textBuffer11.resetWithShared(charArray44, (int) (short) 1, (int) (byte) -1);
        char[] charArray61 = textBuffer11.getTextBuffer();
        textBuffer1.resetWithCopy(charArray61, 35, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal67 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray61, (int) (byte) 0, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1038366033038366032L) + "'", long54 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray61);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        java.lang.String str17 = textBuffer16.toString();
        char[] charArray18 = textBuffer16.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray18, 3, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.getTextBuffer();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass11 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", (int) (byte) 100, 10);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        java.lang.String str8 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        char[] charArray14 = textBuffer11.contentsAsArray();
        textBuffer11.releaseBuffers();
        java.lang.String str16 = textBuffer11.toString();
        textBuffer11.releaseBuffers();
        textBuffer11.ensureNotShared();
        java.lang.String str19 = textBuffer11.toString();
        char[] charArray20 = textBuffer11.getTextBuffer();
        boolean boolean21 = textBuffer11.hasTextAsCharacters();
        char[] charArray22 = textBuffer11.getTextBuffer();
        char[] charArray23 = textBuffer11.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray23, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 149 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler82 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer83 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler82);
        int int84 = textBuffer83.getCurrentSegmentSize();
        java.lang.String str85 = textBuffer83.toString();
        boolean boolean86 = textBuffer83.hasTextAsCharacters();
        int int87 = textBuffer83.size();
        char[] charArray88 = textBuffer83.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray88, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 67 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertArrayEquals(charArray88, new char[] {});
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("a", (double) 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        int int26 = textBuffer25.getCurrentSegmentSize();
        java.lang.String str27 = textBuffer25.contentsAsString();
        java.lang.String str28 = textBuffer25.toString();
        char[] charArray29 = textBuffer25.getCurrentSegment();
        textBuffer1.resetWithShared(charArray29, 0, (int) (byte) 10);
        int int35 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray29, 4, (int) '#');
        java.lang.Class<?> wildcardClass36 = charArray29.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1038366032) + "'", int35 == (-1038366032));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray21, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        java.lang.String str7 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.releaseBuffers();
        textBuffer9.resetWithString("2.2250738585072012e-308");
        int int13 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.setCurrentLength((-1));
        char[] charArray16 = textBuffer9.contentsAsArray();
        char[] charArray17 = textBuffer9.getTextBuffer();
        textBuffer9.setCurrentLength((-1038366032));
        textBuffer9.resetWithString("");
        char[] charArray22 = textBuffer9.getTextBuffer();
        textBuffer1.resetWithCopy(charArray22, 0, (int) (short) 0);
        boolean boolean29 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray22, 100, (int) (short) -1, true);
        boolean boolean33 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray22, (int) (short) 100, 0, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray15, (int) ' ', (int) (byte) 10);
        char[] charArray19 = textBuffer12.emptyAndGetCurrentSegment();
        boolean boolean23 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray19, (-1), 1000, true);
        int int26 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray19, (int) (short) 10, (int) (short) 10);
        textBuffer1.resetWithShared(charArray19, (-1038366032), (int) (byte) 10);
        textBuffer1.setCurrentLength((-533333328));
        char[] charArray32 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1038366032) + "'", int26 == (-1038366032));
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        long long17 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray14, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray14, 100, (-533333328));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1038366033038366032L) + "'", long17 == (-1038366033038366032L));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        textBuffer1.append(' ');
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
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        int int26 = textBuffer1.getCurrentSegmentSize();
        char[] charArray27 = textBuffer1.getCurrentSegment();
        java.lang.String str28 = textBuffer1.contentsAsString();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str28, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        textBuffer1.resetWithString("4");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000", (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 1");
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        int int7 = textBuffer1.getCurrentSegmentSize();
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
        boolean boolean37 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray27, 136, (int) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray27, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 110 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = null;
        textBuffer1.resetWithShared(charArray6, 23, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.ensureNotShared();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = textBuffer1.contentsAsDouble();
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
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(1);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getTextBuffer();
        java.lang.String str7 = textBuffer1.toString();
        textBuffer1.setCurrentLength(262144);
        java.lang.String str10 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        // The following exception was thrown during execution in test generation
        try {
            long long37 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray31, 262144, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 262144 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        int int4 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = textBuffer1.getTextBuffer();
        java.lang.String str6 = textBuffer1.toString();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        int int15 = textBuffer14.getCurrentSegmentSize();
        java.lang.String str16 = textBuffer14.toString();
        textBuffer14.ensureNotShared();
        char[] charArray18 = textBuffer14.getTextBuffer();
        int int19 = textBuffer14.getCurrentSegmentSize();
        int int20 = textBuffer14.getTextOffset();
        char[] charArray21 = textBuffer14.emptyAndGetCurrentSegment();
        boolean boolean25 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray21, 0, 0, false);
        textBuffer1.resetWithShared(charArray21, 0, (-48));
        // The following exception was thrown during execution in test generation
        try {
            long long31 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray21, 262144, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 262144 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        boolean boolean12 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) '4', (int) (short) 100, true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        char[] charArray11 = textBuffer8.contentsAsArray();
        textBuffer8.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double16 = textBuffer8.contentsAsDouble();
        char[] charArray17 = textBuffer8.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        int int20 = textBuffer19.getCurrentSegmentSize();
        java.lang.String str21 = textBuffer19.toString();
        char[] charArray22 = textBuffer19.contentsAsArray();
        textBuffer19.releaseBuffers();
        java.lang.String str24 = textBuffer19.toString();
        textBuffer19.releaseBuffers();
        int int26 = textBuffer19.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getCurrentSegmentSize();
        java.lang.String str30 = textBuffer28.toString();
        textBuffer28.ensureNotShared();
        int int32 = textBuffer28.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        int int35 = textBuffer34.getCurrentSegmentSize();
        java.lang.String str36 = textBuffer34.toString();
        char[] charArray37 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer34.resetWithShared(charArray37, (int) ' ', (int) (byte) 10);
        char[] charArray41 = textBuffer34.emptyAndGetCurrentSegment();
        boolean boolean45 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray41, (-1), 1000, true);
        textBuffer28.resetWithCopy(charArray41, (int) (short) 1, (int) (byte) 1);
        long long51 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray41, (int) '#', 52);
        textBuffer19.resetWithShared(charArray41, 10, (int) ' ');
        textBuffer8.resetWithShared(charArray41, (int) (short) 1, (int) (byte) -1);
        char[] charArray58 = textBuffer8.getTextBuffer();
        textBuffer1.append(charArray58, 35, 0);
        java.lang.String str62 = textBuffer1.contentsAsString();
        java.lang.String str63 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1038366033038366032L) + "'", long51 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        int int3 = textBuffer1.getCurrentSegmentSize();
        char[] charArray4 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray4, (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        textBuffer21.releaseBuffers();
        boolean boolean23 = textBuffer21.hasTextAsCharacters();
        textBuffer21.releaseBuffers();
        textBuffer21.releaseBuffers();
        char[] charArray26 = textBuffer21.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getCurrentSegmentSize();
        java.lang.String str30 = textBuffer28.toString();
        textBuffer28.releaseBuffers();
        textBuffer28.setCurrentLength((int) (byte) 0);
        int int34 = textBuffer28.getCurrentSegmentSize();
        char[] charArray35 = textBuffer28.emptyAndGetCurrentSegment();
        char[] charArray36 = textBuffer28.getCurrentSegment();
        textBuffer21.resetWithCopy(charArray36, 97, 0);
        char[] charArray40 = textBuffer21.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray40, (-1), 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray40);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("2.2250738585072012e-308", (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("\000");
        // The following exception was thrown during execution in test generation
        try {
            double double21 = textBuffer1.contentsAsDouble();
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
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        int int23 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        long long68 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray52, (int) (byte) 10, (-1));
        boolean boolean72 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray52, (int) (byte) -1, 3, false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal73 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-49038366032L) + "'", long68 == (-49038366032L));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        char[] charArray32 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer29.resetWithShared(charArray32, (int) ' ', (int) (byte) 10);
        textBuffer29.resetWithString("2.2250738585072012e-308");
        char[] charArray38 = textBuffer29.contentsAsArray();
        char[] charArray39 = textBuffer29.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray39, 23, 8);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray39);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.lang.String str24 = textBuffer1.contentsAsString();
        int int25 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        java.lang.String str13 = textBuffer11.toString();
        textBuffer11.ensureNotShared();
        textBuffer11.ensureNotShared();
        char[] charArray16 = textBuffer11.emptyAndGetCurrentSegment();
        java.lang.String str17 = textBuffer11.contentsAsString();
        char[] charArray18 = textBuffer11.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray18, 32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("\000");
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = textBuffer1.contentsAsDouble();
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
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        int int54 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray51, 4, 23);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal55 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1038366032) + "'", int54 == (-1038366032));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        java.lang.Class<?> wildcardClass13 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.ensureNotShared();
        char[] charArray9 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray9, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 31, length 23");
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
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray6, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength(100);
        textBuffer1.resetWithEmpty();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        int int11 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray8, 4, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1038366032) + "'", int11 == (-1038366032));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        java.lang.String str11 = textBuffer10.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        int int14 = textBuffer13.getCurrentSegmentSize();
        java.lang.String str15 = textBuffer13.toString();
        char[] charArray16 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray16, (int) ' ', (int) (byte) 10);
        textBuffer10.resetWithShared(charArray16, (int) (short) 10, (int) (short) 0);
        boolean boolean23 = textBuffer10.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        char[] charArray26 = textBuffer25.contentsAsArray();
        java.lang.String str27 = textBuffer25.toString();
        int int28 = textBuffer25.getTextOffset();
        char[] charArray29 = textBuffer25.getCurrentSegment();
        char[] charArray30 = textBuffer25.contentsAsArray();
        textBuffer10.resetWithShared(charArray30, 35, (int) (short) -1);
        boolean boolean37 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray30, 35, (int) (byte) 0, false);
        boolean boolean41 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray30, 35, (-1038366032), true);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray30, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        textBuffer1.resetWithEmpty();
        char[] charArray82 = textBuffer1.getCurrentSegment();
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
        org.junit.Assert.assertNotNull(charArray82);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        char[] charArray21 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        java.lang.Class<?> wildcardClass23 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(charArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        int int16 = textBuffer15.getCurrentSegmentSize();
        char[] charArray17 = textBuffer15.emptyAndGetCurrentSegment();
        int int18 = textBuffer15.getCurrentSegmentSize();
        int int19 = textBuffer15.getCurrentSegmentSize();
        char[] charArray20 = textBuffer15.getCurrentSegment();
        textBuffer15.ensureNotShared();
        char[] charArray22 = textBuffer15.getCurrentSegment();
        textBuffer1.resetWithShared(charArray22, 0, (int) (byte) 0);
        int int28 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray22, 0, 8);
        int int31 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray22, (int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-533333328) + "'", int28 == (-533333328));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-48) + "'", int31 == (-48));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        textBuffer1.setCurrentLength(32);
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
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.toString();
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        boolean boolean14 = textBuffer11.hasTextAsCharacters();
        char[] charArray15 = textBuffer11.contentsAsArray();
        textBuffer11.ensureNotShared();
        int int17 = textBuffer11.getCurrentSegmentSize();
        int int18 = textBuffer11.getTextOffset();
        boolean boolean19 = textBuffer11.hasTextAsCharacters();
        boolean boolean20 = textBuffer11.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        textBuffer22.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        int int27 = textBuffer26.getCurrentSegmentSize();
        java.lang.String str28 = textBuffer26.toString();
        char[] charArray29 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer26.resetWithShared(charArray29, (int) ' ', (int) (byte) 10);
        boolean boolean36 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray29, (int) '#', 1, true);
        textBuffer22.resetWithShared(charArray29, 10, 0);
        boolean boolean40 = textBuffer22.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        java.lang.String str43 = textBuffer42.toString();
        char[] charArray44 = textBuffer42.getCurrentSegment();
        textBuffer22.append(charArray44, (int) (byte) 10, 100);
        char[] charArray48 = textBuffer22.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer50 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler49);
        int int51 = textBuffer50.getCurrentSegmentSize();
        java.lang.String str52 = textBuffer50.toString();
        char[] charArray53 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer50.resetWithShared(charArray53, (int) ' ', (int) (byte) 10);
        textBuffer50.resetWithString("2.2250738585072012e-308");
        char[] charArray59 = textBuffer50.contentsAsArray();
        textBuffer22.append(charArray59, 0, 1);
        textBuffer11.resetWithShared(charArray59, 136, (-48));
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray59, (-48), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -48 out of bounds for char[23]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
            char[] charArray10 = textBuffer1.finishCurrentSegment();
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        int int10 = textBuffer9.getCurrentSegmentSize();
        java.lang.String str11 = textBuffer9.toString();
        char[] charArray12 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer9.resetWithShared(charArray12, (int) ' ', (int) (byte) 10);
        boolean boolean19 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray12, (int) '#', 1, true);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray12, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" ???????????????????????????????????????????????????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(52);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        long long15 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray12, 35, 52);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1038366033038366032L) + "'", long15 == (-1038366033038366032L));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        textBuffer25.releaseBuffers();
        textBuffer25.resetWithString("2.2250738585072012e-308");
        int int29 = textBuffer25.getCurrentSegmentSize();
        textBuffer25.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer32 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler31);
        char[] charArray33 = textBuffer32.contentsAsArray();
        java.lang.String str34 = textBuffer32.toString();
        int int35 = textBuffer32.getTextOffset();
        char[] charArray36 = textBuffer32.getCurrentSegment();
        textBuffer25.resetWithShared(charArray36, (int) (short) -1, (-1));
        int int42 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray36, (int) (byte) 0, (int) (byte) 0);
        textBuffer1.resetWithCopy(charArray36, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal46 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-48) + "'", int42 == (-48));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        int int8 = textBuffer1.getCurrentSegmentSize();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        int int15 = textBuffer14.getCurrentSegmentSize();
        java.lang.String str16 = textBuffer14.toString();
        textBuffer14.ensureNotShared();
        boolean boolean18 = textBuffer14.hasTextAsCharacters();
        textBuffer14.setCurrentLength((int) (short) 0);
        char[] charArray21 = textBuffer14.getCurrentSegment();
        boolean boolean25 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray21, (int) (short) 0, 0, true);
        textBuffer1.resetWithShared(charArray21, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str7, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        int int26 = textBuffer25.getCurrentSegmentSize();
        java.lang.String str27 = textBuffer25.toString();
        char[] charArray28 = textBuffer25.contentsAsArray();
        textBuffer25.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer25.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        int int36 = textBuffer35.getCurrentSegmentSize();
        java.lang.String str37 = textBuffer35.toString();
        int int38 = textBuffer35.getCurrentSegmentSize();
        textBuffer35.ensureNotShared();
        textBuffer35.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        int int43 = textBuffer42.getCurrentSegmentSize();
        java.lang.String str44 = textBuffer42.toString();
        char[] charArray45 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer42.resetWithShared(charArray45, (int) ' ', (int) (byte) 10);
        char[] charArray49 = textBuffer42.emptyAndGetCurrentSegment();
        textBuffer35.resetWithShared(charArray49, (-1), (int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler53 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer54 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler53);
        int int55 = textBuffer54.getCurrentSegmentSize();
        java.lang.String str56 = textBuffer54.toString();
        textBuffer54.ensureNotShared();
        int int58 = textBuffer54.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler59 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer60 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler59);
        int int61 = textBuffer60.getCurrentSegmentSize();
        java.lang.String str62 = textBuffer60.toString();
        char[] charArray63 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer60.resetWithShared(charArray63, (int) ' ', (int) (byte) 10);
        char[] charArray67 = textBuffer60.emptyAndGetCurrentSegment();
        boolean boolean71 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray67, (-1), 1000, true);
        textBuffer54.resetWithCopy(charArray67, (int) (short) 1, (int) (byte) 1);
        long long77 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray67, (int) '#', 52);
        textBuffer35.resetWithShared(charArray67, (int) '#', 0);
        int int83 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray67, (int) (short) 10, (int) (short) 0);
        textBuffer25.resetWithShared(charArray67, (int) (byte) -1, 262144);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray67, 136, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] {});
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1038366033038366032L) + "'", long77 == (-1038366033038366032L));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-48) + "'", int83 == (-48));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        java.lang.Class<?> wildcardClass35 = textBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer1.toString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray7, 8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 0");
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
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        int int28 = textBuffer1.getTextOffset();
        char[] charArray29 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray29, (int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
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
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        int int16 = textBuffer15.getCurrentSegmentSize();
        java.lang.String str17 = textBuffer15.toString();
        char[] charArray18 = textBuffer15.contentsAsArray();
        textBuffer15.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer15.resetWithEmpty();
        boolean boolean24 = textBuffer15.hasTextAsCharacters();
        int int25 = textBuffer15.getCurrentSegmentSize();
        char[] charArray26 = textBuffer15.getTextBuffer();
        textBuffer1.resetWithShared(charArray26, 10, 35);
        char[] charArray30 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        double double6 = textBuffer1.contentsAsDouble();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        int int8 = textBuffer1.getCurrentSegmentSize();
        char[] charArray9 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray9, (int) (byte) 100, (-1038366032));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = textBuffer1.contentsAsDouble();
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("2.2250738585072012e-308", (-1038366032L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character   is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (double) (-533333328));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.33333328E8d) + "'", double2 == (-5.33333328E8d));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 262144, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 262144, end 262144, length 0");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
            long long42 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray28, 136, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 136 out of bounds for length 0");
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
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", (long) 23);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5073858507L + "'", long2 == 5073858507L);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        char[] charArray51 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal52 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
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
        org.junit.Assert.assertArrayEquals(charArray51, new char[] {});
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("aa", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getTextOffset();
        int int6 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = null;
        textBuffer1.resetWithShared(charArray6, 23, (int) (byte) 100);
        int int10 = textBuffer1.getCurrentSegmentSize();
        int int11 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray0, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray0, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        int int21 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        java.lang.String str5 = textBuffer1.contentsAsString();
        int int6 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("2.2250738585072012e-308", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        int int40 = textBuffer1.getCurrentSegmentSize();
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
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        java.lang.String str27 = textBuffer1.contentsAsString();
        char[] charArray28 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal31 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray28, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str27, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray5 = new char[] { '4' };
        textBuffer1.resetWithShared(charArray5, 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray5, (-1038366032), 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1038366032 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        int int6 = textBuffer1.size();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (byte) 1);
        textBuffer1.resetWithEmpty();
        int int11 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = textBuffer1.contentsAsDecimal();
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
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        java.lang.String str7 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        textBuffer1.ensureNotShared();
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        char[] charArray9 = textBuffer8.contentsAsArray();
        java.lang.String str10 = textBuffer8.toString();
        int int11 = textBuffer8.getTextOffset();
        int int12 = textBuffer8.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        int int15 = textBuffer14.getCurrentSegmentSize();
        java.lang.String str16 = textBuffer14.toString();
        char[] charArray17 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer14.resetWithShared(charArray17, (int) ' ', (int) (byte) 10);
        textBuffer14.resetWithString("2.2250738585072012e-308");
        char[] charArray23 = textBuffer14.contentsAsArray();
        textBuffer8.resetWithShared(charArray23, (-1), 1);
        boolean boolean27 = textBuffer8.hasTextAsCharacters();
        char[] charArray28 = textBuffer8.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray28, (-2133333328), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -2133333328 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        textBuffer1.setCurrentLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000", (-48), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -48, end -38, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        int int8 = textBuffer1.size();
        textBuffer1.append('a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (long) 1000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        int int16 = textBuffer15.getCurrentSegmentSize();
        char[] charArray17 = textBuffer15.emptyAndGetCurrentSegment();
        int int18 = textBuffer15.getCurrentSegmentSize();
        int int19 = textBuffer15.getCurrentSegmentSize();
        char[] charArray20 = textBuffer15.getCurrentSegment();
        textBuffer15.ensureNotShared();
        char[] charArray22 = textBuffer15.getCurrentSegment();
        textBuffer1.resetWithShared(charArray22, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = textBuffer1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        int int7 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        int int7 = textBuffer1.getTextOffset();
        int int8 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray8, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray5, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        char[] charArray44 = textBuffer1.getTextBuffer();
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
        org.junit.Assert.assertNotNull(charArray44);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.lang.String str27 = textBuffer1.contentsAsString();
        textBuffer1.append('a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str27, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        double double6 = textBuffer1.contentsAsDouble();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        java.lang.Class<?> wildcardClass17 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength(100);
        char[] charArray7 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        textBuffer29.releaseBuffers();
        textBuffer29.setCurrentLength((int) (byte) 0);
        textBuffer29.setCurrentLength(262144);
        textBuffer29.resetWithString("a");
        int int39 = textBuffer29.getTextOffset();
        int int40 = textBuffer29.getCurrentSegmentSize();
        char[] charArray41 = textBuffer29.contentsAsArray();
        textBuffer1.resetWithShared(charArray41, (-48), (int) (byte) 100);
        boolean boolean45 = textBuffer1.hasTextAsCharacters();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean12 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, (int) (short) 1, (int) '#', true);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8, (int) (short) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        int int7 = textBuffer1.getTextOffset();
        int int8 = textBuffer1.getTextOffset();
        char[] charArray9 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray9, (int) (short) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) '#', 1, false);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
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
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.getTextBuffer();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((-1));
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.math.BigDecimal bigDecimal12 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray9, (int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray9, 1000, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1000 out of bounds for length 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(bigDecimal12);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.contentsAsArray();
        int int7 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength(1000);
        textBuffer1.append('4');
        char[] charArray12 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray12, (-1), 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4' });
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getTextBuffer();
        java.lang.String str7 = textBuffer1.toString();
        textBuffer1.setCurrentLength(262144);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.finishCurrentSegment();
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
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal37 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
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
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        textBuffer1.resetWithEmpty();
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
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", 49, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getTextBuffer();
        java.lang.String str7 = textBuffer1.contentsAsString();
        java.lang.Class<?> wildcardClass8 = textBuffer1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("\000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer1.resetWithEmpty();
        int int10 = textBuffer1.getTextOffset();
        java.lang.String str11 = textBuffer1.toString();
        boolean boolean12 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        long long27 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray24, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1038366033038366032L) + "'", long27 == (-1038366033038366032L));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray25 = textBuffer1.getCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1000 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        int int12 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray9, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray9, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
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
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-48) + "'", int12 == (-48));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.lang.String str32 = textBuffer1.toString();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000" + "'", str32, "\000");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        int int9 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        int int11 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean8 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, (int) (short) 10, 52, false);
        int int11 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray4, 0, (int) (byte) 100);
        int int14 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray4, 32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1038366032) + "'", int11 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1038366032) + "'", int14 == (-1038366032));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        textBuffer1.setCurrentLength((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler54 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer55 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler54);
        int int56 = textBuffer55.getCurrentSegmentSize();
        java.lang.String str57 = textBuffer55.toString();
        textBuffer55.ensureNotShared();
        int int59 = textBuffer55.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler60 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer61 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler60);
        int int62 = textBuffer61.getCurrentSegmentSize();
        java.lang.String str63 = textBuffer61.toString();
        char[] charArray64 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer61.resetWithShared(charArray64, (int) ' ', (int) (byte) 10);
        char[] charArray68 = textBuffer61.emptyAndGetCurrentSegment();
        boolean boolean72 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray68, (-1), 1000, true);
        textBuffer55.resetWithCopy(charArray68, (int) (short) 1, (int) (byte) 1);
        boolean boolean76 = textBuffer55.hasTextAsCharacters();
        char[] charArray77 = textBuffer55.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray77, 136, 0);
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] {});
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(charArray77);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        java.lang.String str30 = textBuffer1.contentsAsString();
        char[] charArray31 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str32 = textBuffer1.contentsAsString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 1000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        textBuffer12.setCurrentLength((int) (short) 100);
        java.lang.String str16 = textBuffer12.toString();
        char[] charArray17 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, 3, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        textBuffer22.releaseBuffers();
        textBuffer22.resetWithString("2.2250738585072012e-308");
        int int26 = textBuffer22.getCurrentSegmentSize();
        int int27 = textBuffer22.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        char[] charArray32 = textBuffer29.contentsAsArray();
        textBuffer22.resetWithShared(charArray32, 3, (-533333328));
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray32, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
            textBuffer1.append(' ');
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
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 262144, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        char[] charArray26 = textBuffer1.contentsAsArray();
        java.math.BigDecimal bigDecimal27 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4' });
        org.junit.Assert.assertNotNull(bigDecimal27);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getTextOffset();
        int int6 = textBuffer1.getTextOffset();
        java.lang.String str7 = textBuffer1.toString();
        int int8 = textBuffer1.getCurrentSegmentSize();
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str11 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000", (-533333328));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-533333328) + "'", int2 == (-533333328));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        int int7 = textBuffer1.size();
        java.lang.String str8 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        textBuffer10.ensureNotShared();
        textBuffer10.ensureNotShared();
        char[] charArray15 = textBuffer10.getCurrentSegment();
        boolean boolean19 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray15, 23, (int) (short) 1, true);
        textBuffer1.resetWithShared(charArray15, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray15, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("\000");
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("2.2250738585072012e-308", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str9 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        int int24 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", 136, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 136, end 146, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        int int36 = textBuffer1.getTextOffset();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getCurrentSegmentSize();
        java.lang.String str30 = textBuffer28.toString();
        boolean boolean31 = textBuffer28.hasTextAsCharacters();
        char[] charArray32 = textBuffer28.contentsAsArray();
        textBuffer28.ensureNotShared();
        textBuffer28.ensureNotShared();
        char[] charArray35 = textBuffer28.contentsAsArray();
        char[] charArray36 = textBuffer28.getTextBuffer();
        char[] charArray37 = textBuffer28.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray37, (int) (byte) 1, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.getTextBuffer();
        int int7 = textBuffer1.getTextOffset();
        char[] charArray8 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("4", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("hi!");
        int int8 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.resetWithString("");
        textBuffer10.releaseBuffers();
        int int14 = textBuffer10.size();
        char[] charArray15 = textBuffer10.getTextBuffer();
        textBuffer10.ensureNotShared();
        char[] charArray17 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray18 = textBuffer10.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray18, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("2.2250738585072012e-308", (double) 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        textBuffer1.setCurrentLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int6 = textBuffer1.size();
        int int7 = textBuffer1.getCurrentSegmentSize();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        int int9 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength((-1038366032));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", 32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 33, length 1");
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
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        boolean boolean15 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        java.lang.String str5 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray9, 8, (-1038366032));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        int int25 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray15, 52, 32);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1038366032) + "'", int25 == (-1038366032));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        char[] charArray4 = textBuffer1.contentsAsArray();
        java.lang.String str5 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.releaseBuffers();
        boolean boolean10 = textBuffer8.hasTextAsCharacters();
        textBuffer8.releaseBuffers();
        textBuffer8.releaseBuffers();
        char[] charArray13 = textBuffer8.getTextBuffer();
        char[] charArray14 = textBuffer8.getTextBuffer();
        textBuffer8.releaseBuffers();
        char[] charArray16 = textBuffer8.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray16, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
            char[] charArray19 = textBuffer1.expandCurrentSegment();
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        boolean boolean10 = textBuffer7.hasTextAsCharacters();
        int int11 = textBuffer7.size();
        char[] charArray12 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray12, (int) (short) -1, 97);
        int int16 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        int int19 = textBuffer18.getCurrentSegmentSize();
        java.lang.String str20 = textBuffer18.toString();
        char[] charArray21 = textBuffer18.contentsAsArray();
        textBuffer18.releaseBuffers();
        java.lang.String str23 = textBuffer18.toString();
        int int24 = textBuffer18.getCurrentSegmentSize();
        java.lang.String str25 = textBuffer18.contentsAsString();
        char[] charArray26 = textBuffer18.getCurrentSegment();
        int int29 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray26, 1, (int) (short) 0);
        textBuffer1.resetWithCopy(charArray26, 8, (int) (byte) 0);
        char[] charArray33 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        int int36 = textBuffer35.getCurrentSegmentSize();
        java.lang.String str37 = textBuffer35.toString();
        char[] charArray38 = textBuffer35.contentsAsArray();
        textBuffer35.releaseBuffers();
        char[] charArray40 = textBuffer35.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray40, (-2133333328), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -2133333328 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-48) + "'", int29 == (-48));
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertNotNull(charArray40);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        textBuffer1.ensureNotShared();
        java.lang.Class<?> wildcardClass27 = textBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        java.lang.String str7 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.releaseBuffers();
        textBuffer9.resetWithString("2.2250738585072012e-308");
        int int13 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.setCurrentLength((-1));
        char[] charArray16 = textBuffer9.contentsAsArray();
        char[] charArray17 = textBuffer9.getTextBuffer();
        textBuffer9.setCurrentLength((-1038366032));
        textBuffer9.resetWithString("");
        char[] charArray22 = textBuffer9.getTextBuffer();
        textBuffer1.resetWithCopy(charArray22, 0, (int) (short) 0);
        boolean boolean29 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray22, 100, (int) (short) -1, true);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray22, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        int int31 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray22, 97, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal34 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray22, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1038366032) + "'", int31 == (-1038366032));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass4 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        int int22 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str23 = textBuffer21.toString();
        char[] charArray24 = textBuffer21.contentsAsArray();
        textBuffer21.releaseBuffers();
        textBuffer21.resetWithString("hi!");
        char[] charArray28 = textBuffer21.contentsAsArray();
        char[] charArray29 = textBuffer21.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray29, 10, (int) '4');
        boolean boolean36 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray29, (int) (short) 0, 1, false);
        java.lang.Class<?> wildcardClass37 = charArray29.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.contentsAsArray();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        textBuffer1.resetWithShared(charArray13, (int) 'a', (int) ' ');
        int int19 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray13, (int) (byte) 0, (int) '4');
        long long22 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray13, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1038366032) + "'", int19 == (-1038366032));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-49038366032L) + "'", long22 == (-49038366032L));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        int int31 = textBuffer1.getTextOffset();
        java.lang.Class<?> wildcardClass32 = textBuffer1.getClass();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        char[] charArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray21, (-1), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        java.lang.Class<?> wildcardClass5 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.getTextBuffer();
        int int6 = textBuffer1.getCurrentSegmentSize();
        int int7 = textBuffer1.getTextOffset();
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
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end 34, length 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("", 23.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.0d + "'", double2 == 23.0d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.getTextBuffer();
        java.lang.String str7 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getTextOffset();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 132, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        int int20 = textBuffer1.size();
        textBuffer1.setCurrentLength(4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double9 = textBuffer1.contentsAsDouble();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        long long13 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray10, (int) 'a', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray10, 97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1038366033038366032L) + "'", long13 == (-1038366033038366032L));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray23, 100, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1091 out of bounds for length 1000");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.append('a');
        int int9 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.resetWithString("");
        int int10 = textBuffer7.size();
        char[] charArray11 = textBuffer7.contentsAsArray();
        char[] charArray12 = textBuffer7.getTextBuffer();
        char[] charArray13 = textBuffer7.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        int int16 = textBuffer15.getCurrentSegmentSize();
        java.lang.String str17 = textBuffer15.contentsAsString();
        char[] charArray18 = textBuffer15.getCurrentSegment();
        boolean boolean22 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray18, (int) (short) 10, 52, false);
        int int25 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray18, (int) (byte) 0, 262144);
        int int28 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray18, (int) '4', (int) (byte) 0);
        textBuffer7.resetWithShared(charArray18, (int) (short) 0, 100);
        int int32 = textBuffer7.getCurrentSegmentSize();
        char[] charArray33 = textBuffer7.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray33, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1038366032) + "'", int25 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-48) + "'", int28 == (-48));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray33);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray3, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.getTextBuffer();
        long long9 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray6, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-49038366032L) + "'", long9 == (-49038366032L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        char[] charArray22 = null;
        textBuffer1.resetWithShared(charArray22, (int) (byte) 10, (int) (byte) 0);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double27 = textBuffer1.contentsAsDouble();
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
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
            char[] charArray10 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray8 = textBuffer1.contentsAsArray();
        int int9 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        char[] charArray14 = textBuffer11.contentsAsArray();
        textBuffer11.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double19 = textBuffer11.contentsAsDouble();
        char[] charArray20 = textBuffer11.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        int int23 = textBuffer22.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer22.toString();
        char[] charArray25 = textBuffer22.contentsAsArray();
        textBuffer22.releaseBuffers();
        java.lang.String str27 = textBuffer22.toString();
        textBuffer22.releaseBuffers();
        int int29 = textBuffer22.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        int int32 = textBuffer31.getCurrentSegmentSize();
        java.lang.String str33 = textBuffer31.toString();
        textBuffer31.ensureNotShared();
        int int35 = textBuffer31.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        int int38 = textBuffer37.getCurrentSegmentSize();
        java.lang.String str39 = textBuffer37.toString();
        char[] charArray40 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer37.resetWithShared(charArray40, (int) ' ', (int) (byte) 10);
        char[] charArray44 = textBuffer37.emptyAndGetCurrentSegment();
        boolean boolean48 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray44, (-1), 1000, true);
        textBuffer31.resetWithCopy(charArray44, (int) (short) 1, (int) (byte) 1);
        long long54 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray44, (int) '#', 52);
        textBuffer22.resetWithShared(charArray44, 10, (int) ' ');
        textBuffer11.resetWithShared(charArray44, (int) (short) 1, (int) (byte) -1);
        char[] charArray61 = textBuffer11.getTextBuffer();
        textBuffer1.resetWithCopy(charArray61, 35, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int67 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray61, (-533333328), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -533333328 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1038366033038366032L) + "'", long54 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray61);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString(" ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        int int7 = textBuffer1.size();
        java.lang.String str8 = textBuffer1.contentsAsString();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(52);
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        int int11 = textBuffer10.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer10.toString();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer10.resetWithShared(charArray13, (int) ' ', (int) (byte) 10);
        textBuffer10.resetWithString("2.2250738585072012e-308");
        int int19 = textBuffer10.getCurrentSegmentSize();
        textBuffer10.releaseBuffers();
        int int21 = textBuffer10.size();
        char[] charArray22 = textBuffer10.getCurrentSegment();
        long long25 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray22, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray22, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-49038366032L) + "'", long25 == (-49038366032L));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("aa", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        int int20 = textBuffer19.getCurrentSegmentSize();
        java.lang.String str21 = textBuffer19.toString();
        int int22 = textBuffer19.getCurrentSegmentSize();
        textBuffer19.ensureNotShared();
        textBuffer19.ensureNotShared();
        java.lang.String str25 = textBuffer19.contentsAsString();
        char[] charArray26 = textBuffer19.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray26, (int) 'a', 35);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        char[] charArray22 = textBuffer1.contentsAsArray();
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("hi!", (double) (-2133333328));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.133333328E9d) + "'", double2 == (-2.133333328E9d));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
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
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray10 = textBuffer1.contentsAsArray();
        int int11 = textBuffer1.getTextOffset();
        char[] charArray12 = textBuffer1.getCurrentSegment();
        long long15 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray12, 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1038366033038366032L) + "'", long15 == (-1038366033038366032L));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("aa", 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 9, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer47 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler46);
        textBuffer47.releaseBuffers();
        boolean boolean49 = textBuffer47.hasTextAsCharacters();
        textBuffer47.releaseBuffers();
        textBuffer47.releaseBuffers();
        char[] charArray52 = textBuffer47.getTextBuffer();
        char[] charArray53 = textBuffer47.getTextBuffer();
        textBuffer47.releaseBuffers();
        char[] charArray55 = textBuffer47.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray55, 3, (int) (short) 1);
        java.lang.Class<?> wildcardClass59 = textBuffer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNull(charArray53);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        char[] charArray13 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass14 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append('a');
        int int7 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character a is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        int int20 = textBuffer1.size();
        char[] charArray21 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.toString();
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        java.lang.String str31 = textBuffer1.toString();
        textBuffer1.resetWithString(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        char[] charArray37 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal38 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
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
        org.junit.Assert.assertNotNull(charArray37);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        int int40 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
            java.math.BigDecimal bigDecimal11 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8, (int) (short) 10, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.getTextBuffer();
        int int9 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray0, 262144, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.fasterxml.jackson.core.io.NumberInput.parseInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????????????????????????????????????????????????????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("aa", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        boolean boolean10 = textBuffer7.hasTextAsCharacters();
        int int11 = textBuffer7.size();
        char[] charArray12 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray12, (int) (short) -1, 97);
        int int16 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        int int19 = textBuffer18.getCurrentSegmentSize();
        java.lang.String str20 = textBuffer18.toString();
        char[] charArray21 = textBuffer18.contentsAsArray();
        textBuffer18.releaseBuffers();
        java.lang.String str23 = textBuffer18.toString();
        int int24 = textBuffer18.getCurrentSegmentSize();
        java.lang.String str25 = textBuffer18.contentsAsString();
        char[] charArray26 = textBuffer18.getCurrentSegment();
        int int29 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray26, 1, (int) (short) 0);
        textBuffer1.resetWithCopy(charArray26, 8, (int) (byte) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        textBuffer34.resetWithString("");
        java.lang.String str37 = textBuffer34.contentsAsString();
        char[] charArray38 = textBuffer34.getTextBuffer();
        java.lang.String str39 = textBuffer34.toString();
        char[] charArray40 = textBuffer34.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray40, 3, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-48) + "'", int29 == (-48));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray40);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        long long9 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray6, (int) '4', (int) (short) 100);
        int int12 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray6, 1, (int) '4');
        boolean boolean16 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray6, (-1038366032), (int) (short) -1, true);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray6, (int) (byte) 10, 100, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1038366033038366032L) + "'", long9 == (-1038366033038366032L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1038366032) + "'", int12 == (-1038366032));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        int int7 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        java.lang.String str9 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        char[] charArray0 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        textBuffer1.setCurrentLength(0);
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
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        char[] charArray10 = textBuffer7.contentsAsArray();
        textBuffer7.releaseBuffers();
        java.lang.String str12 = textBuffer7.toString();
        int int13 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer7.contentsAsString();
        char[] charArray15 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithShared(charArray15, 32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        int int4 = textBuffer1.size();
        java.lang.String str5 = textBuffer1.contentsAsString();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal23 = textBuffer1.contentsAsDecimal();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(" ", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(52);
        int int9 = textBuffer1.getCurrentSegmentSize();
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength(23);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        int int15 = textBuffer14.getCurrentSegmentSize();
        java.lang.String str16 = textBuffer14.toString();
        char[] charArray17 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer14.resetWithShared(charArray17, (int) ' ', (int) (byte) 10);
        char[] charArray21 = textBuffer14.emptyAndGetCurrentSegment();
        textBuffer14.resetWithString("a");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        char[] charArray26 = textBuffer25.contentsAsArray();
        java.lang.String str27 = textBuffer25.toString();
        int int28 = textBuffer25.getTextOffset();
        char[] charArray29 = textBuffer25.getCurrentSegment();
        textBuffer14.append(charArray29, (int) ' ', (int) (short) 10);
        int int35 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray29, (int) (byte) 0, 0);
        int int38 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray29, (int) (short) 10, 1000);
        textBuffer1.append(charArray29, 10, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-48) + "'", int35 == (-48));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1038366032) + "'", int38 == (-1038366032));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        int int23 = textBuffer1.getTextOffset();
        int int24 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        int int9 = textBuffer1.getTextOffset();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str11 = textBuffer1.toString();
        java.lang.String str12 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.contentsAsArray();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        textBuffer1.resetWithShared(charArray13, (int) 'a', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray13, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.String str31 = textBuffer1.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str31, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.size();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.append('#');
        textBuffer1.setCurrentLength(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(52);
        textBuffer1.resetWithEmpty();
        char[] charArray9 = textBuffer1.contentsAsArray();
        int int10 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.resetWithString("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("", (double) (-1038366033038366032L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.03836603303836608E18d) + "'", double2 == (-1.03836603303836608E18d));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("aa");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        textBuffer1.setCurrentLength(4);
        textBuffer1.setCurrentLength((int) '#');
        int int57 = textBuffer1.size();
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str4 = textBuffer1.toString();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        int int6 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.ensureNotShared();
        java.lang.String str9 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.resetWithString("");
        int int14 = textBuffer11.size();
        char[] charArray15 = textBuffer11.contentsAsArray();
        boolean boolean19 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray15, 35, 262144, true);
        boolean boolean23 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray15, (int) 'a', (int) (short) -1, true);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray15, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", 136, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 136, end 159, length 10");
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
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        // The following exception was thrown during execution in test generation
        try {
            double double27 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" ???????????????????????????????????????????????????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("4");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("aa", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength((-533333328));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        textBuffer1.resetWithString("a");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        int int21 = textBuffer20.getCurrentSegmentSize();
        java.lang.String str22 = textBuffer20.toString();
        char[] charArray23 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer20.resetWithShared(charArray23, (int) ' ', (int) (byte) 10);
        textBuffer20.resetWithString("2.2250738585072012e-308");
        int int29 = textBuffer20.getCurrentSegmentSize();
        textBuffer20.releaseBuffers();
        int int31 = textBuffer20.size();
        char[] charArray32 = textBuffer20.getCurrentSegment();
        long long35 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray32, 0, (int) (short) 10);
        textBuffer1.resetWithCopy(charArray32, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-49038366032L) + "'", long35 == (-49038366032L));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.getTextBuffer();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.contentsAsArray();
        java.lang.String str12 = textBuffer10.toString();
        int int13 = textBuffer10.getTextOffset();
        int int14 = textBuffer10.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer16.toString();
        char[] charArray19 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer16.resetWithShared(charArray19, (int) ' ', (int) (byte) 10);
        textBuffer16.resetWithString("2.2250738585072012e-308");
        char[] charArray25 = textBuffer16.contentsAsArray();
        textBuffer10.resetWithShared(charArray25, (-1), 1);
        java.math.BigDecimal bigDecimal29 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray25);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray25, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 98 out of bounds for char[23]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(bigDecimal29);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.resetWithString("a");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        char[] charArray14 = textBuffer12.emptyAndGetCurrentSegment();
        int int15 = textBuffer12.getCurrentSegmentSize();
        int int16 = textBuffer12.getCurrentSegmentSize();
        char[] charArray17 = textBuffer12.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray17, 8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        char[] charArray23 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass24 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.append('a');
        java.lang.String str9 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.contentsAsArray();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        textBuffer1.resetWithShared(charArray13, (int) ' ', 0);
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, 35, (int) (short) 100, true);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray22, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        java.lang.String str25 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4" + "'", str25, "4");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray9 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray9, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        java.lang.String str35 = textBuffer1.toString();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str35, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        boolean boolean23 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray16, (int) (byte) 100, 0, false);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray16, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        int int6 = textBuffer1.getTextOffset();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        int int4 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(0);
        int int6 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        char[] charArray11 = textBuffer8.contentsAsArray();
        textBuffer8.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double16 = textBuffer8.contentsAsDouble();
        char[] charArray17 = textBuffer8.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        int int20 = textBuffer19.getCurrentSegmentSize();
        java.lang.String str21 = textBuffer19.toString();
        char[] charArray22 = textBuffer19.contentsAsArray();
        textBuffer19.releaseBuffers();
        java.lang.String str24 = textBuffer19.toString();
        textBuffer19.releaseBuffers();
        int int26 = textBuffer19.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getCurrentSegmentSize();
        java.lang.String str30 = textBuffer28.toString();
        textBuffer28.ensureNotShared();
        int int32 = textBuffer28.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        int int35 = textBuffer34.getCurrentSegmentSize();
        java.lang.String str36 = textBuffer34.toString();
        char[] charArray37 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer34.resetWithShared(charArray37, (int) ' ', (int) (byte) 10);
        char[] charArray41 = textBuffer34.emptyAndGetCurrentSegment();
        boolean boolean45 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray41, (-1), 1000, true);
        textBuffer28.resetWithCopy(charArray41, (int) (short) 1, (int) (byte) 1);
        long long51 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray41, (int) '#', 52);
        textBuffer19.resetWithShared(charArray41, 10, (int) ' ');
        textBuffer8.resetWithShared(charArray41, (int) (short) 1, (int) (byte) -1);
        char[] charArray58 = textBuffer8.getTextBuffer();
        char[] charArray59 = textBuffer8.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray59, (int) '4', 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1052 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1038366033038366032L) + "'", long51 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray59);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("a", (double) (-48L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-48.0d) + "'", double2 == (-48.0d));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("2.2250738585072012e-308", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray9 = null;
        textBuffer1.resetWithShared(charArray9, (int) '#', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        textBuffer29.releaseBuffers();
        textBuffer29.setCurrentLength((int) (byte) 0);
        textBuffer29.setCurrentLength(262144);
        textBuffer29.resetWithString("a");
        int int39 = textBuffer29.getTextOffset();
        int int40 = textBuffer29.getCurrentSegmentSize();
        char[] charArray41 = textBuffer29.contentsAsArray();
        textBuffer1.resetWithShared(charArray41, (-48), (int) (byte) 100);
        boolean boolean48 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray41, 8, 23, false);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        java.lang.String str10 = textBuffer8.contentsAsString();
        java.lang.String str11 = textBuffer8.toString();
        char[] charArray12 = textBuffer8.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        char[] charArray15 = textBuffer14.contentsAsArray();
        java.lang.String str16 = textBuffer14.toString();
        int int17 = textBuffer14.getTextOffset();
        char[] charArray18 = textBuffer14.getCurrentSegment();
        char[] charArray19 = textBuffer14.contentsAsArray();
        textBuffer14.append('a');
        java.lang.String str22 = textBuffer14.toString();
        textBuffer14.setCurrentLength(100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        int int27 = textBuffer26.getCurrentSegmentSize();
        java.lang.String str28 = textBuffer26.toString();
        textBuffer26.ensureNotShared();
        boolean boolean30 = textBuffer26.hasTextAsCharacters();
        textBuffer26.setCurrentLength((int) (short) 0);
        textBuffer26.resetWithEmpty();
        char[] charArray34 = textBuffer26.getTextBuffer();
        textBuffer14.resetWithShared(charArray34, (int) 'a', (int) (byte) 0);
        int int38 = textBuffer14.size();
        char[] charArray39 = textBuffer14.emptyAndGetCurrentSegment();
        textBuffer8.resetWithShared(charArray39, (int) ' ', 0);
        textBuffer1.resetWithCopy(charArray39, 52, 97);
        // The following exception was thrown during execution in test generation
        try {
            double double46 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a" + "'", str22, "a");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(charArray39);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer7.toString();
        boolean boolean10 = textBuffer7.hasTextAsCharacters();
        int int11 = textBuffer7.size();
        char[] charArray12 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray12, (int) (short) -1, 97);
        int int16 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        int int19 = textBuffer18.getCurrentSegmentSize();
        java.lang.String str20 = textBuffer18.toString();
        char[] charArray21 = textBuffer18.contentsAsArray();
        textBuffer18.releaseBuffers();
        java.lang.String str23 = textBuffer18.toString();
        int int24 = textBuffer18.getCurrentSegmentSize();
        java.lang.String str25 = textBuffer18.contentsAsString();
        char[] charArray26 = textBuffer18.getCurrentSegment();
        int int29 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray26, 1, (int) (short) 0);
        textBuffer1.resetWithCopy(charArray26, 8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal33 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-48) + "'", int29 == (-48));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        char[] charArray77 = textBuffer1.contentsAsArray();
        int int78 = textBuffer1.size();
        java.lang.Class<?> wildcardClass79 = textBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 135 + "'", int78 == 135);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 9, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        java.lang.Class<?> wildcardClass9 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        int int4 = textBuffer3.getCurrentSegmentSize();
        java.lang.String str5 = textBuffer3.toString();
        char[] charArray6 = textBuffer3.contentsAsArray();
        textBuffer3.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        double double11 = textBuffer3.contentsAsDouble();
        char[] charArray12 = textBuffer3.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (-1038366032), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        textBuffer11.ensureNotShared();
        textBuffer11.resetWithEmpty();
        int int16 = textBuffer11.size();
        char[] charArray17 = textBuffer11.getTextBuffer();
        textBuffer1.resetWithShared(charArray17, (int) (byte) 0, (int) (short) 0);
        java.lang.String str21 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getTextOffset();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.contentsAsArray();
        int int7 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength(1000);
        textBuffer1.append('4');
        char[] charArray12 = textBuffer1.contentsAsArray();
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str16 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray21 = textBuffer1.expandCurrentSegment();
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
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\000", 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray19 = textBuffer1.getCurrentSegment();
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        char[] charArray10 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray10, 3, (-1038366032));
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        textBuffer1.append('#');
        int int12 = textBuffer1.size();
        java.lang.String str13 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        textBuffer1.append(' ');
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
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        char[] charArray9 = textBuffer1.getTextBuffer();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((-1));
        char[] charArray8 = textBuffer1.contentsAsArray();
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
        textBuffer1.resetWithShared(charArray29, 100, (int) (byte) 0);
        textBuffer1.append('a');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 100, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
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
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.String str9 = textBuffer1.toString();
        char[] charArray10 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray10, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -8 out of bounds for length 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        char[] charArray6 = textBuffer1.contentsAsArray();
        int int7 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((-2133333328));
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        char[] charArray25 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal26 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
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
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        int int9 = textBuffer1.getTextOffset();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean14 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray10, 0, (int) (short) 0, true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2.2250738585072012e-308" + "'", str7, "2.2250738585072012e-308");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        textBuffer1.append('a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        int int40 = textBuffer39.getCurrentSegmentSize();
        java.lang.String str41 = textBuffer39.toString();
        boolean boolean42 = textBuffer39.hasTextAsCharacters();
        int int43 = textBuffer39.size();
        textBuffer39.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer46 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler45);
        int int47 = textBuffer46.getCurrentSegmentSize();
        java.lang.String str48 = textBuffer46.toString();
        boolean boolean49 = textBuffer46.hasTextAsCharacters();
        char[] charArray50 = textBuffer46.contentsAsArray();
        java.lang.String str51 = textBuffer46.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler52 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer53 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler52);
        int int54 = textBuffer53.getCurrentSegmentSize();
        java.lang.String str55 = textBuffer53.toString();
        boolean boolean56 = textBuffer53.hasTextAsCharacters();
        int int57 = textBuffer53.size();
        int int58 = textBuffer53.getCurrentSegmentSize();
        int int59 = textBuffer53.size();
        char[] charArray60 = textBuffer53.emptyAndGetCurrentSegment();
        textBuffer46.append(charArray60, 0, (int) ' ');
        textBuffer39.resetWithShared(charArray60, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray60, (-1), (int) (short) 1);
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
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(charArray60);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("a", (double) 1000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1000.0d + "'", double2 == 1000.0d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        char[] charArray21 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
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
        org.junit.Assert.assertNull(charArray21);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        int int7 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer1.toString();
        int int9 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("#", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("#", (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getCurrentSegmentSize();
        java.lang.String str30 = textBuffer28.toString();
        textBuffer28.ensureNotShared();
        int int32 = textBuffer28.getCurrentSegmentSize();
        char[] charArray33 = textBuffer28.contentsAsArray();
        int int34 = textBuffer28.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        java.lang.String str37 = textBuffer36.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        int int40 = textBuffer39.getCurrentSegmentSize();
        java.lang.String str41 = textBuffer39.toString();
        char[] charArray42 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer39.resetWithShared(charArray42, (int) ' ', (int) (byte) 10);
        textBuffer36.resetWithShared(charArray42, (int) (short) 10, (int) (short) 0);
        int int49 = textBuffer36.getTextOffset();
        char[] charArray50 = textBuffer36.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        char[] charArray53 = textBuffer52.contentsAsArray();
        java.lang.String str54 = textBuffer52.toString();
        int int55 = textBuffer52.getTextOffset();
        char[] charArray56 = textBuffer52.getCurrentSegment();
        char[] charArray57 = textBuffer52.contentsAsArray();
        textBuffer36.resetWithShared(charArray57, (-1), (int) (byte) 10);
        textBuffer28.resetWithShared(charArray57, (int) ' ', (-48));
        textBuffer1.resetWithShared(charArray57, 262144, 97);
        int int67 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler68 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer69 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler68);
        int int70 = textBuffer69.getCurrentSegmentSize();
        java.lang.String str71 = textBuffer69.toString();
        textBuffer69.ensureNotShared();
        int int73 = textBuffer69.getTextOffset();
        int int74 = textBuffer69.getTextOffset();
        char[] charArray75 = textBuffer69.contentsAsArray();
        char[] charArray76 = textBuffer69.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray76, (int) '4', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long82 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray76, (-1), (-2133333328));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] {});
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] {});
        org.junit.Assert.assertNotNull(charArray76);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        java.lang.String str9 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.releaseBuffers();
        textBuffer11.resetWithString("2.2250738585072012e-308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        int int17 = textBuffer16.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer16.toString();
        char[] charArray19 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer16.resetWithShared(charArray19, (int) ' ', (int) (byte) 10);
        textBuffer16.resetWithString("2.2250738585072012e-308");
        char[] charArray25 = textBuffer16.contentsAsArray();
        int int26 = textBuffer16.getTextOffset();
        char[] charArray27 = textBuffer16.getCurrentSegment();
        textBuffer11.resetWithCopy(charArray27, (int) (byte) 100, (int) (short) 100);
        char[] charArray31 = textBuffer11.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray31, 32, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2.2250738585072012e-308" + "'", str7, "2.2250738585072012e-308");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2.2250738585072012e-308" + "'", str9, "2.2250738585072012e-308");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray31);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        textBuffer1.setCurrentLength((int) (byte) 1);
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
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        int int37 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray31, 35, 97);
        boolean boolean41 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray31, 52, 0, true);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1038366032) + "'", int37 == (-1038366032));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        long long58 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray45, (int) ' ', 97);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal61 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray45, 136, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
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
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1038366033038366032L) + "'", long58 == (-1038366033038366032L));
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        int int5 = textBuffer1.size();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray7, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        long long23 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray17, 32, (int) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1038366033038366032L) + "'", long23 == (-1038366033038366032L));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
            java.lang.String str36 = textBuffer1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 100, count 23, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("#", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        int int29 = textBuffer28.getCurrentSegmentSize();
        java.lang.String str30 = textBuffer28.toString();
        textBuffer28.ensureNotShared();
        int int32 = textBuffer28.getCurrentSegmentSize();
        char[] charArray33 = textBuffer28.contentsAsArray();
        int int34 = textBuffer28.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        java.lang.String str37 = textBuffer36.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        int int40 = textBuffer39.getCurrentSegmentSize();
        java.lang.String str41 = textBuffer39.toString();
        char[] charArray42 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer39.resetWithShared(charArray42, (int) ' ', (int) (byte) 10);
        textBuffer36.resetWithShared(charArray42, (int) (short) 10, (int) (short) 0);
        int int49 = textBuffer36.getTextOffset();
        char[] charArray50 = textBuffer36.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        char[] charArray53 = textBuffer52.contentsAsArray();
        java.lang.String str54 = textBuffer52.toString();
        int int55 = textBuffer52.getTextOffset();
        char[] charArray56 = textBuffer52.getCurrentSegment();
        char[] charArray57 = textBuffer52.contentsAsArray();
        textBuffer36.resetWithShared(charArray57, (-1), (int) (byte) 10);
        textBuffer28.resetWithShared(charArray57, (int) ' ', (-48));
        textBuffer1.resetWithShared(charArray57, 262144, 97);
        int int67 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler68 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer69 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler68);
        int int70 = textBuffer69.getCurrentSegmentSize();
        java.lang.String str71 = textBuffer69.toString();
        textBuffer69.ensureNotShared();
        int int73 = textBuffer69.getTextOffset();
        int int74 = textBuffer69.getTextOffset();
        char[] charArray75 = textBuffer69.contentsAsArray();
        char[] charArray76 = textBuffer69.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray76, (int) '4', (int) 'a');
        textBuffer1.releaseBuffers();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] {});
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] {});
        org.junit.Assert.assertNotNull(charArray76);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("a", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        int int26 = textBuffer25.getCurrentSegmentSize();
        java.lang.String str27 = textBuffer25.contentsAsString();
        java.lang.String str28 = textBuffer25.toString();
        char[] charArray29 = textBuffer25.getCurrentSegment();
        textBuffer1.resetWithShared(charArray29, 0, (int) (byte) 10);
        int int35 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray29, 4, (int) '#');
        boolean boolean39 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray29, 4, (int) (byte) -1, true);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal40 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray29);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1038366032) + "'", int35 == (-1038366032));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        int int23 = textBuffer22.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer22.toString();
        boolean boolean25 = textBuffer22.hasTextAsCharacters();
        char[] charArray26 = textBuffer22.contentsAsArray();
        java.lang.String str27 = textBuffer22.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        boolean boolean32 = textBuffer29.hasTextAsCharacters();
        int int33 = textBuffer29.size();
        int int34 = textBuffer29.getCurrentSegmentSize();
        int int35 = textBuffer29.size();
        char[] charArray36 = textBuffer29.emptyAndGetCurrentSegment();
        textBuffer22.append(charArray36, 0, (int) ' ');
        textBuffer1.resetWithShared(charArray36, (int) (short) 0, (-48));
        textBuffer1.setCurrentLength((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray36);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        int int8 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        textBuffer1.resetWithEmpty();
        java.lang.Class<?> wildcardClass23 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1038366032) + "'", int18 == (-1038366032));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        java.lang.String str7 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.releaseBuffers();
        textBuffer9.resetWithString("2.2250738585072012e-308");
        int int13 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.setCurrentLength((-1));
        char[] charArray16 = textBuffer9.contentsAsArray();
        char[] charArray17 = textBuffer9.getTextBuffer();
        textBuffer9.setCurrentLength((-1038366032));
        textBuffer9.resetWithString("");
        char[] charArray22 = textBuffer9.getTextBuffer();
        textBuffer1.resetWithCopy(charArray22, 0, (int) (short) 0);
        boolean boolean26 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
            java.math.BigDecimal bigDecimal8 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
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
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        textBuffer1.setCurrentLength((int) '#');
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
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
            java.math.BigDecimal bigDecimal66 = textBuffer1.contentsAsDecimal();
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
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        int int12 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        java.lang.String str15 = textBuffer14.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        int int18 = textBuffer17.getCurrentSegmentSize();
        java.lang.String str19 = textBuffer17.toString();
        char[] charArray20 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer17.resetWithShared(charArray20, (int) ' ', (int) (byte) 10);
        textBuffer14.resetWithShared(charArray20, (int) (short) 10, (int) (short) 0);
        int int27 = textBuffer14.getTextOffset();
        char[] charArray28 = textBuffer14.emptyAndGetCurrentSegment();
        textBuffer14.ensureNotShared();
        char[] charArray30 = textBuffer14.emptyAndGetCurrentSegment();
        long long33 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray30, (int) (byte) 10, (int) (short) 0);
        textBuffer1.resetWithShared(charArray30, (int) ' ', 23);
        boolean boolean40 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray30, 136, 8, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-49038366032L) + "'", long33 == (-49038366032L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.fasterxml.jackson.core.io.NumberInput.parseInt("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        int int26 = textBuffer1.getCurrentSegmentSize();
        char[] charArray27 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal28 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray27);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(charArray27);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        // The following exception was thrown during execution in test generation
        try {
            double double27 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
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
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
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
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", 0, (int) (short) 100);
        int int11 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = textBuffer1.getTextBuffer();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.getTextBuffer();
        java.lang.String str7 = textBuffer1.toString();
        textBuffer1.setCurrentLength(262144);
        java.lang.String str10 = textBuffer1.toString();
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
        char[] charArray32 = textBuffer12.contentsAsArray();
        textBuffer1.resetWithCopy(charArray32, (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray32);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 1000, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1000, end 1008, length 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.resetWithString("a");
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        textBuffer1.resetWithString("\000");
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
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.lang.String str10 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.contentsAsArray();
        java.lang.String str14 = textBuffer12.toString();
        int int15 = textBuffer12.getTextOffset();
        char[] charArray16 = textBuffer12.getCurrentSegment();
        boolean boolean17 = textBuffer12.hasTextAsCharacters();
        char[] charArray18 = textBuffer12.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray18, 8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 18 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        char[] charArray24 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(charArray24);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        textBuffer1.setCurrentLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        int int10 = textBuffer1.size();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        char[] charArray13 = textBuffer1.getCurrentSegment();
        long long16 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray13, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray13, 32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-49038366032L) + "'", long16 == (-49038366032L));
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray18, 23, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ? is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
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
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        int int9 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        textBuffer1.ensureNotShared();
        int int27 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            double double28 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
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
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("");
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
            textBuffer1.append(charArray17, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 135 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
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
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("2.2250738585072012e-308", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        char[] charArray14 = textBuffer11.contentsAsArray();
        textBuffer11.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer11.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        char[] charArray22 = textBuffer21.contentsAsArray();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer11.resetWithShared(charArray23, (int) 'a', (int) ' ');
        textBuffer1.resetWithCopy(charArray23, 100, (int) (byte) 100);
        java.lang.String str30 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 0, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 49, length 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str30, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray40 = textBuffer1.finishCurrentSegment();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1038366032) + "'", int34 == (-1038366032));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        int int7 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str8 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (short) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        int int3 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("a", 8.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        int int5 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        char[] charArray7 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.releaseBuffers();
        textBuffer9.resetWithString("2.2250738585072012e-308");
        int int13 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.setCurrentLength((-1));
        char[] charArray16 = textBuffer9.contentsAsArray();
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
        java.lang.String str36 = textBuffer18.toString();
        char[] charArray37 = textBuffer18.getTextBuffer();
        textBuffer9.resetWithShared(charArray37, 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray37, 0, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1000 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        char[] charArray9 = textBuffer1.getTextBuffer();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        java.lang.String str9 = textBuffer1.toString();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        int int14 = textBuffer13.getCurrentSegmentSize();
        java.lang.String str15 = textBuffer13.toString();
        char[] charArray16 = textBuffer13.contentsAsArray();
        boolean boolean20 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray16, 0, (int) (short) 0, false);
        boolean boolean24 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray16, (int) (byte) 10, (int) '4', true);
        boolean boolean28 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray16, (int) (short) 100, (int) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray16, (int) (short) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 108 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2.2250738585072012e-308" + "'", str7, "2.2250738585072012e-308");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2.2250738585072012e-308" + "'", str9, "2.2250738585072012e-308");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        int int12 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str13 = textBuffer11.toString();
        int int14 = textBuffer11.getCurrentSegmentSize();
        textBuffer11.ensureNotShared();
        textBuffer11.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        int int19 = textBuffer18.getCurrentSegmentSize();
        java.lang.String str20 = textBuffer18.toString();
        char[] charArray21 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer18.resetWithShared(charArray21, (int) ' ', (int) (byte) 10);
        char[] charArray25 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer11.resetWithShared(charArray25, (-1), (int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        int int31 = textBuffer30.getCurrentSegmentSize();
        java.lang.String str32 = textBuffer30.toString();
        textBuffer30.ensureNotShared();
        int int34 = textBuffer30.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.getCurrentSegmentSize();
        java.lang.String str38 = textBuffer36.toString();
        char[] charArray39 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer36.resetWithShared(charArray39, (int) ' ', (int) (byte) 10);
        char[] charArray43 = textBuffer36.emptyAndGetCurrentSegment();
        boolean boolean47 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray43, (-1), 1000, true);
        textBuffer30.resetWithCopy(charArray43, (int) (short) 1, (int) (byte) 1);
        long long53 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray43, (int) '#', 52);
        textBuffer11.resetWithShared(charArray43, (int) '#', 0);
        int int59 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray43, (int) (short) 10, (int) (short) 0);
        textBuffer1.resetWithShared(charArray43, (int) (byte) -1, 262144);
        int int65 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray43, 97, (int) (byte) 0);
        long long68 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray43, (int) (short) 10, (int) (byte) -1);
        boolean boolean72 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray43, 32, 8, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1038366033038366032L) + "'", long53 == (-1038366033038366032L));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-48) + "'", int59 == (-48));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-48) + "'", int65 == (-48));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-49038366032L) + "'", long68 == (-49038366032L));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        textBuffer1.setCurrentLength((int) (byte) 0);
        boolean boolean27 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (-2133333328));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2133333328) + "'", int2 == (-2133333328));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("a", (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.setCurrentLength((int) (short) 100);
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0005073858507", 23, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.contentsAsArray();
        int int7 = textBuffer1.size();
        int int8 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.append('#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.getTextBuffer();
        int int9 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.append(' ');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 262144, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 262144, end 262244, length 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment();
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
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004", (long) (-2133333328));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        textBuffer1.ensureNotShared();
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
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("");
        java.lang.String str6 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        int int13 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (-1038366032), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1038366032, end -1038366022, length 23");
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
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        int int6 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        boolean boolean11 = textBuffer8.hasTextAsCharacters();
        char[] charArray12 = textBuffer8.contentsAsArray();
        int int13 = textBuffer8.getCurrentSegmentSize();
        char[] charArray14 = textBuffer8.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray14, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getCurrentSegmentSize();
        java.lang.String str10 = textBuffer8.toString();
        char[] charArray11 = textBuffer8.contentsAsArray();
        textBuffer8.releaseBuffers();
        textBuffer8.resetWithString("hi!");
        char[] charArray15 = textBuffer8.contentsAsArray();
        char[] charArray16 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray16, (int) 'a', (int) (short) 100);
        textBuffer1.resetWithEmpty();
        java.lang.String str21 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.resetWithString("");
        textBuffer23.resetWithEmpty();
        char[] charArray27 = textBuffer23.emptyAndGetCurrentSegment();
        boolean boolean31 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray27, (int) (short) -1, (int) '#', true);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray27, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        char[] charArray22 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) (short) 0);
        int int25 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean8 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, 1, (int) (short) 10, true);
        boolean boolean12 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, (int) '4', 1000, false);
        boolean boolean16 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray4, (int) (byte) 100, (-533333328), true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        char[] charArray24 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray25 = textBuffer1.contentsAsArray();
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
        org.junit.Assert.assertNull(charArray24);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        int int7 = textBuffer1.getCurrentSegmentSize();
        int int8 = textBuffer1.getTextOffset();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 0);
        textBuffer1.setCurrentLength(262144);
        textBuffer1.resetWithString("a");
        char[] charArray11 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.getTextBuffer();
        long long9 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray6, (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1038366033038366032L) + "'", long9 == (-1038366033038366032L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        java.lang.Class<?> wildcardClass38 = textBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((-1));
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.math.BigDecimal bigDecimal12 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray9, (int) (short) 0, 10);
        java.math.BigDecimal bigDecimal13 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray9);
        int int16 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray9, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 182250738 + "'", int16 == 182250738);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        textBuffer29.releaseBuffers();
        textBuffer29.setCurrentLength((int) (byte) 0);
        textBuffer29.setCurrentLength(262144);
        textBuffer29.resetWithString("a");
        int int39 = textBuffer29.getTextOffset();
        int int40 = textBuffer29.getCurrentSegmentSize();
        char[] charArray41 = textBuffer29.contentsAsArray();
        textBuffer1.resetWithShared(charArray41, (-48), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal47 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray41, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { 'a' });
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean12 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray8, 10, 35, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        char[] charArray32 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer29.resetWithShared(charArray32, (int) ' ', (int) (byte) 10);
        textBuffer29.resetWithString("2.2250738585072012e-308");
        char[] charArray38 = textBuffer29.contentsAsArray();
        textBuffer1.append(charArray38, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray38, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 23");
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
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("4", (double) 136L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("aa", 5073858507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5073858507L + "'", long2 == 5073858507L);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray4, (int) ' ', (int) (byte) 10);
        textBuffer1.resetWithString("2.2250738585072012e-308");
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("4");
        double double13 = textBuffer1.contentsAsDouble();
        java.lang.String str14 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getTextOffset();
        java.lang.String str6 = textBuffer1.toString();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.contentsAsArray();
        int int7 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength(1000);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.finishCurrentSegment();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        textBuffer1.append('4');
        java.lang.String str28 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4" + "'", str28, "4");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        int int21 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray15, 49, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1038366032) + "'", int21 == (-1038366032));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        char[] charArray26 = textBuffer1.getTextBuffer();
        int int29 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray26, 10, 262144);
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
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1038366032) + "'", int29 == (-1038366032));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        char[] charArray17 = null;
        textBuffer1.resetWithShared(charArray17, (int) (byte) -1, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) ' ', (-533333328));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end -533333296, length 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(52);
        textBuffer1.resetWithEmpty();
        char[] charArray9 = textBuffer1.contentsAsArray();
        int int10 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.getCurrentSegmentSize();
        java.lang.String str14 = textBuffer12.toString();
        char[] charArray15 = textBuffer12.contentsAsArray();
        textBuffer12.append("2.2250738585072012e-308", (int) (byte) 10, (int) (short) 1);
        textBuffer12.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        int int23 = textBuffer22.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer22.toString();
        int int25 = textBuffer22.getCurrentSegmentSize();
        textBuffer22.ensureNotShared();
        textBuffer22.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        int int30 = textBuffer29.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer29.toString();
        char[] charArray32 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer29.resetWithShared(charArray32, (int) ' ', (int) (byte) 10);
        char[] charArray36 = textBuffer29.emptyAndGetCurrentSegment();
        textBuffer22.resetWithShared(charArray36, (-1), (int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        int int42 = textBuffer41.getCurrentSegmentSize();
        java.lang.String str43 = textBuffer41.toString();
        textBuffer41.ensureNotShared();
        int int45 = textBuffer41.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer47 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler46);
        int int48 = textBuffer47.getCurrentSegmentSize();
        java.lang.String str49 = textBuffer47.toString();
        char[] charArray50 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer47.resetWithShared(charArray50, (int) ' ', (int) (byte) 10);
        char[] charArray54 = textBuffer47.emptyAndGetCurrentSegment();
        boolean boolean58 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray54, (-1), 1000, true);
        textBuffer41.resetWithCopy(charArray54, (int) (short) 1, (int) (byte) 1);
        long long64 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray54, (int) '#', 52);
        textBuffer22.resetWithShared(charArray54, (int) '#', 0);
        int int70 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray54, (int) (short) 10, (int) (short) 0);
        textBuffer12.resetWithShared(charArray54, (int) (byte) -1, 262144);
        textBuffer1.resetWithShared(charArray54, (-48), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1038366033038366032L) + "'", long64 == (-1038366033038366032L));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-48) + "'", int70 == (-48));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        char[] charArray0 = null;
        boolean boolean4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray0, 35, (int) (byte) -1, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.append(' ');
        textBuffer1.ensureNotShared();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        int int14 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.append('#');
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: No digits found.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        boolean boolean60 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray42, 97, 0, true);
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        double double6 = textBuffer1.contentsAsDouble();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        int int8 = textBuffer1.getCurrentSegmentSize();
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        int int20 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray21 = textBuffer1.finishCurrentSegment();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        char[] charArray5 = textBuffer1.contentsAsArray();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(" \000\000\000\000\000\000\000\000\000", 262144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262144 + "'", int2 == 262144);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (long) (-533333328));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-533333328L) + "'", long2 == (-533333328L));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str3 = textBuffer1.toString();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.contentsAsArray();
        java.lang.String str7 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray0, (-533333328), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("a", (-49038366032L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49038366032L) + "'", long2 == (-49038366032L));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        textBuffer1.resetWithEmpty();
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
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        char[] charArray27 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
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
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("2.2250738585072012e-308");
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((-1));
        char[] charArray8 = textBuffer1.contentsAsArray();
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
        textBuffer1.resetWithShared(charArray29, 100, (int) (byte) 0);
        textBuffer1.append('a');
        java.lang.String str35 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '2', '.', '2', '2', '5', '0', '7', '3', '8', '5', '8', '5', '0', '7', '2', '0', '1', '2', 'e', '-', '3', '0', '8' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "a" + "'", str35, "a");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) ' ', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????????????????????????????????????????????????????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }
}

