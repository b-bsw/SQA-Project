package com.fasterxml.jackson.core.util;

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
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("a");
        java.lang.String str22 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a" + "'", str22, "a");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
            textBuffer1.append(' ');
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
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        char[] charArray12 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int14 = textBuffer1.size();
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
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str11, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.setCurrentLength(53);
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
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("");
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithEmpty();
        java.lang.String str15 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        char[] charArray4 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        textBuffer6.resetWithEmpty();
        char[] charArray9 = textBuffer6.contentsAsArray();
        char[] charArray10 = textBuffer6.contentsAsArray();
        int int11 = textBuffer6.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        boolean boolean14 = textBuffer13.hasTextAsCharacters();
        char[] charArray15 = textBuffer13.getTextBuffer();
        java.lang.String str16 = textBuffer13.contentsAsString();
        boolean boolean17 = textBuffer13.hasTextAsCharacters();
        textBuffer13.append('4');
        char[] charArray20 = textBuffer13.contentsAsArray();
        char[] charArray21 = textBuffer13.contentsAsArray();
        char[] charArray22 = textBuffer13.getTextBuffer();
        char[] charArray23 = textBuffer13.contentsAsArray();
        textBuffer6.resetWithShared(charArray23, (int) '4', (int) '#');
        textBuffer1.resetWithShared(charArray23, 52, (int) (byte) -1);
        char[] charArray30 = textBuffer1.getTextBuffer();
        int int31 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        java.lang.String str8 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        int int7 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        textBuffer9.resetWithEmpty();
        char[] charArray12 = textBuffer9.contentsAsArray();
        char[] charArray13 = textBuffer9.contentsAsArray();
        int int14 = textBuffer9.size();
        char[] charArray15 = textBuffer9.contentsAsArray();
        textBuffer9.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        boolean boolean19 = textBuffer18.hasTextAsCharacters();
        int int20 = textBuffer18.size();
        textBuffer18.resetWithEmpty();
        char[] charArray22 = textBuffer18.getCurrentSegment();
        textBuffer18.resetWithString("");
        char[] charArray25 = textBuffer18.getCurrentSegment();
        java.lang.String str26 = textBuffer18.contentsAsString();
        textBuffer18.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray30 = textBuffer18.expandCurrentSegment((int) '#');
        textBuffer18.setCurrentLength(0);
        int int33 = textBuffer18.getCurrentSegmentSize();
        char[] charArray34 = textBuffer18.getCurrentSegment();
        textBuffer9.resetWithShared(charArray34, 262144, 3);
        char[] charArray38 = textBuffer9.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray38, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray38);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        char[] charArray19 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        boolean boolean22 = textBuffer21.hasTextAsCharacters();
        char[] charArray23 = textBuffer21.getTextBuffer();
        java.lang.String str24 = textBuffer21.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        boolean boolean27 = textBuffer26.hasTextAsCharacters();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer21.resetWithCopy(charArray28, 0, 0);
        char[] charArray32 = textBuffer21.emptyAndGetCurrentSegment();
        char[] charArray33 = textBuffer21.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray33, (int) (byte) 0, 32);
        java.lang.String str37 = textBuffer1.toString();
        java.lang.String str38 = textBuffer1.contentsAsString();
        int int39 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str37, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str38, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.size();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000 \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray13 = textBuffer1.getCurrentSegment();
        int int14 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        textBuffer1.ensureNotShared();
        char[] charArray23 = textBuffer1.getCurrentSegment();
        java.lang.String str24 = textBuffer1.toString();
        java.lang.String str26 = textBuffer1.setCurrentAndReturn((int) (byte) 1);
        textBuffer1.setCurrentLength(262144);
        java.lang.String str29 = textBuffer1.contentsAsString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000" + "'", str26, "\000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000" + "'", str29, "\000");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn((int) '4');
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        int int10 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.emptyAndGetCurrentSegment();
        int int14 = textBuffer12.getTextOffset();
        textBuffer12.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray17 = textBuffer12.getCurrentSegment();
        textBuffer12.append('4');
        char[] charArray20 = textBuffer12.emptyAndGetCurrentSegment();
        char[] charArray21 = textBuffer12.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray21, 52, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1052 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str7, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 99, length 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        textBuffer1.resetWithEmpty();
        int int13 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getTextBuffer();
        java.lang.String str18 = textBuffer15.contentsAsString();
        textBuffer15.append('4');
        int int21 = textBuffer15.getTextOffset();
        char[] charArray23 = textBuffer15.expandCurrentSegment((int) '#');
        textBuffer1.resetWithCopy(charArray23, 1, (int) (byte) 100);
        char[] charArray28 = textBuffer1.expandCurrentSegment((int) ' ');
        java.lang.String str29 = textBuffer1.toString();
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str29, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        int int6 = textBuffer1.getCurrentSegmentSize();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.emptyAndGetCurrentSegment();
        int int11 = textBuffer9.getTextOffset();
        textBuffer9.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray14 = textBuffer9.getCurrentSegment();
        textBuffer9.append('4');
        char[] charArray17 = textBuffer9.getTextBuffer();
        textBuffer1.append(charArray17, (int) '#', 0);
        char[] charArray21 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (short) 0, 149);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 149, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.append('4');
        java.lang.String str12 = textBuffer1.setCurrentAndReturn(2);
        double double13 = textBuffer1.contentsAsDouble();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4\000" + "'", str12, "4\000");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        textBuffer1.setCurrentLength((int) (short) 10);
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray15 = textBuffer1.getTextBuffer();
        textBuffer1.append('a');
        int int18 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        textBuffer8.resetWithEmpty();
        char[] charArray11 = textBuffer8.contentsAsArray();
        char[] charArray12 = textBuffer8.emptyAndGetCurrentSegment();
        int int13 = textBuffer8.getCurrentSegmentSize();
        boolean boolean14 = textBuffer8.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.emptyAndGetCurrentSegment();
        int int18 = textBuffer16.getTextOffset();
        textBuffer16.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray21 = textBuffer16.getCurrentSegment();
        textBuffer16.append('4');
        char[] charArray24 = textBuffer16.getTextBuffer();
        textBuffer8.append(charArray24, (int) '#', 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        char[] charArray30 = textBuffer29.emptyAndGetCurrentSegment();
        java.lang.String str31 = textBuffer29.toString();
        textBuffer29.setCurrentLength(52);
        textBuffer29.releaseBuffers();
        char[] charArray35 = textBuffer29.getCurrentSegment();
        char[] charArray36 = textBuffer29.contentsAsArray();
        textBuffer8.resetWithShared(charArray36, (int) (short) 1, 0);
        textBuffer1.resetWithShared(charArray36, (int) (short) 0, (int) '4');
        int int43 = textBuffer1.size();
        int int44 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = textBuffer1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 52, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        java.lang.String str13 = textBuffer1.setCurrentAndReturn((int) (byte) 10);
        int int14 = textBuffer1.size();
        textBuffer1.append("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str13, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        int int6 = textBuffer1.getCurrentSegmentSize();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.emptyAndGetCurrentSegment();
        int int11 = textBuffer9.getTextOffset();
        textBuffer9.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray14 = textBuffer9.getCurrentSegment();
        textBuffer9.append('4');
        char[] charArray17 = textBuffer9.getTextBuffer();
        textBuffer1.append(charArray17, (int) '#', 0);
        char[] charArray21 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        int int3 = textBuffer1.getCurrentSegmentSize();
        char[] charArray4 = textBuffer1.getTextBuffer();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        int int8 = textBuffer7.getTextOffset();
        int int9 = textBuffer7.getCurrentSegmentSize();
        char[] charArray10 = textBuffer7.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray10, 97, 52);
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        int int15 = textBuffer1.getTextOffset();
        char[] charArray16 = textBuffer1.getCurrentSegment();
        char[] charArray17 = textBuffer1.getCurrentSegment();
        boolean boolean18 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.setCurrentAndReturn(10);
        int int10 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str11 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str11, "\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        char[] charArray17 = textBuffer1.expandCurrentSegment((-1));
        textBuffer1.resetWithString(" \000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        boolean boolean22 = textBuffer21.hasTextAsCharacters();
        int int23 = textBuffer21.size();
        textBuffer21.resetWithEmpty();
        char[] charArray25 = textBuffer21.getCurrentSegment();
        textBuffer21.resetWithString("");
        char[] charArray28 = textBuffer21.getCurrentSegment();
        textBuffer21.append('4');
        textBuffer21.releaseBuffers();
        textBuffer21.ensureNotShared();
        int int33 = textBuffer21.getTextOffset();
        int int34 = textBuffer21.size();
        textBuffer21.releaseBuffers();
        textBuffer21.ensureNotShared();
        char[] charArray37 = textBuffer21.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray37, 53, (int) '#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray37);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        char[] charArray12 = textBuffer1.getCurrentSegment();
        java.lang.String str14 = textBuffer1.setCurrentAndReturn(52);
        textBuffer1.ensureNotShared();
        java.lang.String str16 = textBuffer1.toString();
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
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str16, "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        int int9 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        java.lang.Class<?> wildcardClass11 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        boolean boolean20 = textBuffer1.hasTextAsCharacters();
        char[] charArray22 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray23 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray24 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        textBuffer26.setCurrentLength((int) (short) 0);
        char[] charArray29 = textBuffer26.getTextBuffer();
        int int30 = textBuffer26.size();
        char[] charArray31 = textBuffer26.getCurrentSegment();
        boolean boolean32 = textBuffer26.hasTextAsCharacters();
        char[] charArray33 = textBuffer26.emptyAndGetCurrentSegment();
        textBuffer26.ensureNotShared();
        textBuffer26.ensureNotShared();
        java.lang.String str37 = textBuffer26.setCurrentAndReturn((int) (short) 1);
        char[] charArray38 = textBuffer26.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler39);
        int int41 = textBuffer40.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        boolean boolean44 = textBuffer43.hasTextAsCharacters();
        int int45 = textBuffer43.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer47 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler46);
        boolean boolean48 = textBuffer47.hasTextAsCharacters();
        int int49 = textBuffer47.size();
        textBuffer47.resetWithEmpty();
        char[] charArray51 = textBuffer47.getCurrentSegment();
        textBuffer43.resetWithShared(charArray51, (int) (short) 1, (int) '4');
        textBuffer40.resetWithShared(charArray51, (int) ' ', (int) (short) 0);
        char[] charArray58 = textBuffer40.getTextBuffer();
        char[] charArray59 = textBuffer40.getCurrentSegment();
        int int60 = textBuffer40.getCurrentSegmentSize();
        char[] charArray61 = textBuffer40.getCurrentSegment();
        textBuffer26.append(charArray61, 2, 53);
        textBuffer1.resetWithCopy(charArray61, 52, 36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str19, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNull(charArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\000" + "'", str37, "\000");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '\000' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(charArray61);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        int int12 = textBuffer10.size();
        textBuffer10.resetWithEmpty();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        java.lang.String str15 = textBuffer10.contentsAsString();
        textBuffer10.setCurrentLength((int) (byte) 10);
        textBuffer10.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength((int) (short) 0);
        int int24 = textBuffer21.getCurrentSegmentSize();
        textBuffer21.resetWithString("");
        boolean boolean27 = textBuffer21.hasTextAsCharacters();
        textBuffer21.setCurrentLength((int) (byte) 100);
        char[] charArray30 = textBuffer21.emptyAndGetCurrentSegment();
        textBuffer10.resetWithCopy(charArray30, 0, 1);
        textBuffer1.resetWithCopy(charArray30, 0, 0);
        char[] charArray38 = textBuffer1.expandCurrentSegment(184);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal39 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray38);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        int int8 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer1.toString();
        int int10 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        char[] charArray16 = textBuffer1.getCurrentSegment();
        char[] charArray17 = textBuffer1.getTextBuffer();
        textBuffer1.append('a');
        java.lang.String str20 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a" + "'", str20, "a");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getTextBuffer();
        java.lang.String str18 = textBuffer15.contentsAsString();
        int int19 = textBuffer15.getTextOffset();
        char[] charArray20 = textBuffer15.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray20, (int) '#', (int) (byte) 1);
        int int24 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.append(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        java.lang.String str22 = textBuffer1.setCurrentAndReturn((int) (short) 100);
        char[] charArray24 = textBuffer1.expandCurrentSegment(35);
        textBuffer1.append('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str22, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        char[] charArray9 = textBuffer1.getTextBuffer();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str8 = textBuffer1.contentsAsString();
        char[] charArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray9, 33, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.setCurrentLength((int) (short) 0);
        int int21 = textBuffer18.getCurrentSegmentSize();
        java.lang.String str22 = textBuffer18.toString();
        char[] charArray23 = textBuffer18.getCurrentSegment();
        char[] charArray24 = textBuffer18.emptyAndGetCurrentSegment();
        char[] charArray25 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray25, (int) (byte) 10, (int) '4');
        textBuffer1.resetWithEmpty();
        boolean boolean30 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer32 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler31);
        boolean boolean33 = textBuffer32.hasTextAsCharacters();
        textBuffer32.resetWithEmpty();
        char[] charArray35 = textBuffer32.contentsAsArray();
        char[] charArray36 = textBuffer32.contentsAsArray();
        textBuffer32.setCurrentLength((int) (short) 1);
        char[] charArray39 = textBuffer32.emptyAndGetCurrentSegment();
        java.lang.String str40 = textBuffer32.toString();
        char[] charArray42 = textBuffer32.expandCurrentSegment((int) '#');
        textBuffer1.resetWithCopy(charArray42, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray42);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        char[] charArray11 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithString("hi!");
        java.lang.String str14 = textBuffer9.contentsAsString();
        java.lang.String str15 = textBuffer9.toString();
        char[] charArray16 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray16, (int) 'a', (int) (short) 10);
        char[] charArray20 = textBuffer1.contentsAsArray();
        int int21 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        java.lang.String str11 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray12 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        boolean boolean23 = textBuffer22.hasTextAsCharacters();
        textBuffer22.resetWithEmpty();
        char[] charArray25 = textBuffer22.contentsAsArray();
        char[] charArray26 = textBuffer22.contentsAsArray();
        int int27 = textBuffer22.size();
        char[] charArray28 = textBuffer22.contentsAsArray();
        textBuffer22.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        char[] charArray33 = textBuffer31.getTextBuffer();
        java.lang.String str34 = textBuffer31.contentsAsString();
        boolean boolean35 = textBuffer31.hasTextAsCharacters();
        textBuffer31.append('4');
        char[] charArray38 = textBuffer31.contentsAsArray();
        char[] charArray39 = textBuffer31.contentsAsArray();
        char[] charArray40 = textBuffer31.getTextBuffer();
        textBuffer22.resetWithShared(charArray40, (int) (byte) -1, (int) 'a');
        textBuffer1.resetWithShared(charArray40, 0, 100);
        java.lang.Class<?> wildcardClass47 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4' });
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        boolean boolean8 = textBuffer7.hasTextAsCharacters();
        char[] charArray9 = textBuffer7.getTextBuffer();
        java.lang.String str10 = textBuffer7.contentsAsString();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        java.lang.String str13 = textBuffer7.setCurrentAndReturn(0);
        char[] charArray15 = new char[] { '#' };
        textBuffer7.resetWithShared(charArray15, (int) (short) 10, (int) (short) 1);
        textBuffer7.releaseBuffers();
        int int20 = textBuffer7.getCurrentSegmentSize();
        char[] charArray21 = textBuffer7.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray21, (int) (byte) -1, (int) 'a');
        char[] charArray25 = textBuffer1.getCurrentSegment();
        char[] charArray26 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        int int28 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        char[] charArray12 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray14 = textBuffer1.expandCurrentSegment(52);
        char[] charArray15 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int17 = textBuffer1.getTextOffset();
        java.lang.String str18 = textBuffer1.toString();
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        java.lang.String str21 = textBuffer1.setCurrentAndReturn(10);
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
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4\000\000\000\000\000\000\000\000\000" + "'", str21, "4\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        int int8 = textBuffer1.size();
        java.lang.Class<?> wildcardClass9 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray8 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        char[] charArray13 = textBuffer11.getTextBuffer();
        java.lang.String str14 = textBuffer11.contentsAsString();
        boolean boolean15 = textBuffer11.hasTextAsCharacters();
        textBuffer11.append('4');
        char[] charArray18 = textBuffer11.contentsAsArray();
        char[] charArray19 = textBuffer11.contentsAsArray();
        char[] charArray20 = textBuffer11.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        textBuffer22.setCurrentLength((int) (short) 0);
        int int25 = textBuffer22.getCurrentSegmentSize();
        textBuffer22.resetWithString("");
        boolean boolean28 = textBuffer22.hasTextAsCharacters();
        int int29 = textBuffer22.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        int int33 = textBuffer31.size();
        textBuffer31.resetWithEmpty();
        char[] charArray35 = textBuffer31.getCurrentSegment();
        textBuffer31.resetWithString("");
        char[] charArray38 = textBuffer31.emptyAndGetCurrentSegment();
        char[] charArray39 = textBuffer31.getCurrentSegment();
        textBuffer22.resetWithCopy(charArray39, 0, (int) (byte) 10);
        textBuffer11.resetWithCopy(charArray39, (int) (byte) 0, (int) '4');
        textBuffer1.resetWithShared(charArray39, 52, (int) (short) 1);
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (short) 100, (int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler53 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer54 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler53);
        char[] charArray55 = textBuffer54.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray55, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray55);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        boolean boolean7 = textBuffer6.hasTextAsCharacters();
        int int8 = textBuffer6.size();
        textBuffer6.resetWithEmpty();
        char[] charArray10 = textBuffer6.getCurrentSegment();
        textBuffer6.resetWithString("");
        char[] charArray13 = textBuffer6.getCurrentSegment();
        textBuffer6.append('4');
        char[] charArray16 = textBuffer6.contentsAsArray();
        textBuffer1.resetWithShared(charArray16, 52, (int) (short) -1);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        textBuffer25.setCurrentLength((int) (short) 0);
        int int28 = textBuffer25.getCurrentSegmentSize();
        textBuffer25.resetWithString("");
        boolean boolean31 = textBuffer25.hasTextAsCharacters();
        textBuffer25.setCurrentLength((int) (byte) 100);
        char[] charArray34 = textBuffer25.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        boolean boolean37 = textBuffer36.hasTextAsCharacters();
        int int38 = textBuffer36.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler39);
        boolean boolean41 = textBuffer40.hasTextAsCharacters();
        int int42 = textBuffer40.size();
        textBuffer40.resetWithEmpty();
        char[] charArray44 = textBuffer40.getCurrentSegment();
        textBuffer36.resetWithShared(charArray44, (int) (short) 1, (int) '4');
        textBuffer25.resetWithShared(charArray44, 262144, (int) (byte) 1);
        char[] charArray52 = textBuffer25.expandCurrentSegment(10);
        textBuffer12.append(charArray52, 3, (int) (byte) 100);
        char[] charArray57 = textBuffer12.expandCurrentSegment((int) '4');
        textBuffer1.resetWithShared(charArray57, (int) (short) 100, 52);
        char[] charArray61 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertNotNull(charArray61);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        int int7 = textBuffer1.size();
        int int8 = textBuffer1.getTextOffset();
        java.lang.String str10 = textBuffer1.setCurrentAndReturn((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str10, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray11 = textBuffer1.getCurrentSegment();
        int int12 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        boolean boolean15 = textBuffer14.hasTextAsCharacters();
        int int16 = textBuffer14.size();
        textBuffer14.resetWithString("hi!");
        java.lang.String str19 = textBuffer14.toString();
        char[] charArray20 = textBuffer14.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray20, 36, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 133 out of bounds for char[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.contentsAsArray();
        int int9 = textBuffer1.getCurrentSegmentSize();
        int int10 = textBuffer1.size();
        int int11 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        textBuffer1.append(' ');
        java.lang.String str14 = textBuffer1.setCurrentAndReturn((int) '#');
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray16 = textBuffer1.getCurrentSegment();
        int int17 = textBuffer1.size();
        char[] charArray18 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.expandCurrentSegment((int) (byte) -1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        int int9 = textBuffer8.getTextOffset();
        int int10 = textBuffer8.getTextOffset();
        char[] charArray11 = textBuffer8.getTextBuffer();
        java.lang.String str12 = textBuffer8.toString();
        char[] charArray13 = textBuffer8.getTextBuffer();
        textBuffer8.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        int int18 = textBuffer17.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        boolean boolean21 = textBuffer20.hasTextAsCharacters();
        int int22 = textBuffer20.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        boolean boolean25 = textBuffer24.hasTextAsCharacters();
        int int26 = textBuffer24.size();
        textBuffer24.resetWithEmpty();
        char[] charArray28 = textBuffer24.getCurrentSegment();
        textBuffer20.resetWithShared(charArray28, (int) (short) 1, (int) '4');
        textBuffer17.resetWithShared(charArray28, (int) ' ', (int) (short) 0);
        int int35 = textBuffer17.size();
        char[] charArray36 = textBuffer17.emptyAndGetCurrentSegment();
        int int37 = textBuffer17.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        char[] charArray40 = textBuffer39.emptyAndGetCurrentSegment();
        int int41 = textBuffer39.getTextOffset();
        textBuffer39.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray44 = textBuffer39.getCurrentSegment();
        textBuffer39.append('4');
        char[] charArray47 = textBuffer39.getTextBuffer();
        textBuffer17.append(charArray47, (int) ' ', 10);
        char[] charArray51 = textBuffer17.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler52 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer53 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler52);
        boolean boolean54 = textBuffer53.hasTextAsCharacters();
        int int55 = textBuffer53.size();
        textBuffer53.resetWithEmpty();
        char[] charArray57 = textBuffer53.getCurrentSegment();
        textBuffer53.resetWithString("");
        char[] charArray60 = textBuffer53.getCurrentSegment();
        char[] charArray61 = textBuffer53.getTextBuffer();
        java.lang.String str63 = textBuffer53.setCurrentAndReturn((int) '#');
        char[] charArray64 = textBuffer53.contentsAsArray();
        char[] charArray65 = textBuffer53.getTextBuffer();
        textBuffer17.resetWithShared(charArray65, (int) (byte) 100, 52);
        char[] charArray70 = textBuffer17.expandCurrentSegment(0);
        textBuffer8.resetWithCopy(charArray70, 97, (int) '4');
        textBuffer1.resetWithShared(charArray70, (int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] {});
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str63, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] {});
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] {});
        org.junit.Assert.assertNotNull(charArray70);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        java.lang.String str16 = textBuffer1.toString();
        textBuffer1.append('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str16, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('4');
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.append('#');
        java.lang.String str13 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("#", 149, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 149, end 152, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        int int41 = textBuffer1.size();
        int int42 = textBuffer1.getCurrentSegmentSize();
        int int43 = textBuffer1.size();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        java.lang.String str47 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        int int49 = textBuffer1.getTextOffset();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str47, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        java.lang.String str22 = textBuffer1.setCurrentAndReturn((int) (short) 100);
        char[] charArray23 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        char[] charArray25 = textBuffer1.emptyAndGetCurrentSegment();
        int int26 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str22, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.append('4');
        double double10 = textBuffer1.contentsAsDouble();
        textBuffer1.append('a');
        int int13 = textBuffer1.getCurrentSegmentSize();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        int int15 = textBuffer1.size();
        textBuffer1.append('a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal18 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"4aa\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        textBuffer1.setCurrentLength(1000);
        char[] charArray21 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray22 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray15);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        int int20 = textBuffer1.size();
        java.lang.String str22 = textBuffer1.setCurrentAndReturn(3);
        char[] charArray24 = textBuffer1.expandCurrentSegment((int) (byte) 100);
        java.lang.String str25 = textBuffer1.contentsAsString();
        char[] charArray26 = textBuffer1.getCurrentSegment();
        int int27 = textBuffer1.getTextOffset();
        char[] charArray28 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000\000\000" + "'", str22, "\000\000\000");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\000\000" + "'", str25, "\000\000\000");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) '4');
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        boolean boolean8 = textBuffer7.hasTextAsCharacters();
        char[] charArray9 = textBuffer7.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray9, (int) '#', (int) '#');
        textBuffer1.setCurrentLength((int) (byte) 10);
        java.lang.String str15 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str15, "\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("hi!");
        char[] charArray11 = textBuffer1.contentsAsArray();
        int int12 = textBuffer1.getCurrentSegmentSize();
        int int13 = textBuffer1.size();
        java.lang.String str14 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        int int18 = textBuffer16.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        boolean boolean21 = textBuffer20.hasTextAsCharacters();
        int int22 = textBuffer20.size();
        textBuffer20.resetWithEmpty();
        char[] charArray24 = textBuffer20.getCurrentSegment();
        textBuffer16.resetWithShared(charArray24, (int) (short) 1, (int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        textBuffer29.setCurrentLength((int) (short) 0);
        int int32 = textBuffer29.getCurrentSegmentSize();
        textBuffer29.resetWithString("");
        boolean boolean35 = textBuffer29.hasTextAsCharacters();
        textBuffer29.setCurrentLength((int) (byte) 100);
        char[] charArray38 = textBuffer29.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler39);
        boolean boolean41 = textBuffer40.hasTextAsCharacters();
        int int42 = textBuffer40.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer44 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler43);
        boolean boolean45 = textBuffer44.hasTextAsCharacters();
        int int46 = textBuffer44.size();
        textBuffer44.resetWithEmpty();
        char[] charArray48 = textBuffer44.getCurrentSegment();
        textBuffer40.resetWithShared(charArray48, (int) (short) 1, (int) '4');
        textBuffer29.resetWithShared(charArray48, 262144, (int) (byte) 1);
        char[] charArray56 = textBuffer29.expandCurrentSegment(10);
        textBuffer16.append(charArray56, 3, (int) (byte) 100);
        textBuffer16.ensureNotShared();
        char[] charArray62 = textBuffer16.expandCurrentSegment(1000);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray62, 33, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertNotNull(charArray62);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        java.lang.String str21 = textBuffer1.contentsAsString();
        char[] charArray23 = textBuffer1.expandCurrentSegment(2);
        java.lang.String str24 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        char[] charArray27 = textBuffer26.emptyAndGetCurrentSegment();
        java.lang.String str28 = textBuffer26.contentsAsString();
        char[] charArray29 = textBuffer26.contentsAsArray();
        boolean boolean30 = textBuffer26.hasTextAsCharacters();
        int int31 = textBuffer26.getTextOffset();
        char[] charArray32 = textBuffer26.contentsAsArray();
        textBuffer1.resetWithShared(charArray32, 100, 53);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str21, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str24, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) '4');
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.expandCurrentSegment(97);
        textBuffer1.append('#');
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        int int8 = textBuffer1.getCurrentSegmentSize();
        char[] charArray9 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        java.lang.String str11 = textBuffer1.contentsAsString();
        textBuffer1.releaseBuffers();
        int int13 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        char[] charArray15 = textBuffer1.getTextBuffer();
        char[] charArray16 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass17 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        java.lang.String str8 = textBuffer1.toString();
        char[] charArray10 = textBuffer1.expandCurrentSegment((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = charArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        boolean boolean50 = textBuffer49.hasTextAsCharacters();
        int int51 = textBuffer49.size();
        textBuffer49.resetWithEmpty();
        char[] charArray53 = textBuffer49.getCurrentSegment();
        textBuffer49.resetWithString("");
        char[] charArray56 = textBuffer49.getCurrentSegment();
        java.lang.String str57 = textBuffer49.contentsAsString();
        int int58 = textBuffer49.getTextOffset();
        char[] charArray59 = textBuffer49.getTextBuffer();
        textBuffer1.resetWithShared(charArray59, 0, 0);
        char[] charArray63 = textBuffer1.getTextBuffer();
        char[] charArray65 = textBuffer1.expandCurrentSegment(100);
        textBuffer1.setCurrentLength(53);
        textBuffer1.ensureNotShared();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] {});
        org.junit.Assert.assertNotNull(charArray65);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        textBuffer1.resetWithEmpty();
        int int21 = textBuffer1.getTextOffset();
        java.lang.String str22 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str19, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        java.lang.String str8 = textBuffer1.toString();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        java.lang.String str12 = textBuffer1.contentsAsString();
        char[] charArray13 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        java.lang.String str47 = textBuffer1.toString();
        char[] charArray48 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str47, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray48);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        textBuffer1.resetWithEmpty();
        char[] charArray12 = textBuffer1.getTextBuffer();
        int int13 = textBuffer1.size();
        textBuffer1.append('a');
        int int16 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        char[] charArray16 = textBuffer1.getTextBuffer();
        int int17 = textBuffer1.size();
        textBuffer1.setCurrentLength((int) (short) 10);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        int int5 = textBuffer1.size();
        java.lang.String str6 = textBuffer1.toString();
        int int7 = textBuffer1.size();
        int int8 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        boolean boolean25 = textBuffer1.hasTextAsCharacters();
        java.lang.String str26 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        textBuffer28.setCurrentLength((int) (short) 0);
        int int31 = textBuffer28.getCurrentSegmentSize();
        textBuffer28.resetWithString("");
        boolean boolean34 = textBuffer28.hasTextAsCharacters();
        int int35 = textBuffer28.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        boolean boolean38 = textBuffer37.hasTextAsCharacters();
        int int39 = textBuffer37.size();
        textBuffer37.resetWithEmpty();
        char[] charArray41 = textBuffer37.getCurrentSegment();
        textBuffer37.resetWithString("");
        char[] charArray44 = textBuffer37.emptyAndGetCurrentSegment();
        char[] charArray45 = textBuffer37.getCurrentSegment();
        textBuffer28.resetWithCopy(charArray45, 0, (int) (byte) 10);
        char[] charArray49 = textBuffer28.getTextBuffer();
        textBuffer1.append(charArray49, 100, 1);
        char[] charArray54 = textBuffer1.expandCurrentSegment(100);
        char[] charArray55 = textBuffer1.emptyAndGetCurrentSegment();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str26, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertNotNull(charArray55);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        char[] charArray12 = textBuffer1.contentsAsArray();
        java.lang.String str13 = textBuffer1.contentsAsString();
        java.lang.String str14 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        int int8 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        java.lang.String str10 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000", 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 10, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        int int12 = textBuffer10.size();
        textBuffer10.resetWithEmpty();
        char[] charArray14 = textBuffer10.getCurrentSegment();
        textBuffer10.resetWithString("");
        char[] charArray17 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray18 = textBuffer10.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray18, 0, (int) (byte) 10);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        char[] charArray30 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("a");
        char[] charArray11 = textBuffer1.getTextBuffer();
        int int12 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        textBuffer19.resetWithEmpty();
        char[] charArray22 = textBuffer19.contentsAsArray();
        char[] charArray23 = textBuffer19.contentsAsArray();
        textBuffer19.releaseBuffers();
        char[] charArray25 = textBuffer19.emptyAndGetCurrentSegment();
        textBuffer19.resetWithEmpty();
        textBuffer19.setCurrentLength(0);
        int int29 = textBuffer19.size();
        boolean boolean30 = textBuffer19.hasTextAsCharacters();
        textBuffer19.resetWithString("4\000\000\000\000\000\000\000\000\000");
        char[] charArray33 = textBuffer19.getTextBuffer();
        textBuffer1.resetWithShared(charArray33, 2, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) (byte) 0, 1);
        char[] charArray12 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        int int11 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        textBuffer1.append('#');
        char[] charArray16 = textBuffer1.contentsAsArray();
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str18 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.getTextBuffer();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (int) (short) 10, (int) (short) -1);
        java.lang.String str17 = textBuffer1.setCurrentAndReturn((int) (byte) 10);
        char[] charArray19 = textBuffer1.expandCurrentSegment((int) (byte) -1);
        textBuffer1.releaseBuffers();
        int int21 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str17, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        textBuffer1.resetWithEmpty();
        char[] charArray25 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        java.lang.String str23 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        java.lang.String str12 = textBuffer1.toString();
        int int13 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str12, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        textBuffer1.append('#');
        char[] charArray16 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        boolean boolean18 = textBuffer1.hasTextAsCharacters();
        char[] charArray19 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        int int9 = textBuffer1.getCurrentSegmentSize();
        int int10 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        char[] charArray76 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(53);
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
        org.junit.Assert.assertNotNull(charArray76);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
            textBuffer1.append("", (int) '#', (int) ' ');
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
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        int int13 = textBuffer1.getTextOffset();
        int int14 = textBuffer1.size();
        int int15 = textBuffer1.size();
        java.lang.String str16 = textBuffer1.contentsAsString();
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 1, 87);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        char[] charArray7 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        textBuffer1.setCurrentLength((int) (short) 1);
        java.lang.String str24 = textBuffer1.contentsAsString();
        int int25 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000" + "'", str24, "\000");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
        textBuffer1.ensureNotShared();
        boolean boolean46 = textBuffer1.hasTextAsCharacters();
        java.lang.String str48 = textBuffer1.setCurrentAndReturn(100);
        char[] charArray49 = textBuffer1.contentsAsArray();
        char[] charArray50 = textBuffer1.getTextBuffer();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str48, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertNotNull(charArray50);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray13 = textBuffer1.getCurrentSegment();
        java.lang.String str15 = textBuffer1.setCurrentAndReturn(0);
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        textBuffer30.setCurrentLength((int) (short) 0);
        int int33 = textBuffer30.getCurrentSegmentSize();
        textBuffer30.resetWithString("");
        boolean boolean36 = textBuffer30.hasTextAsCharacters();
        textBuffer30.setCurrentLength((int) (byte) 100);
        char[] charArray39 = textBuffer30.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        boolean boolean42 = textBuffer41.hasTextAsCharacters();
        int int43 = textBuffer41.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        boolean boolean46 = textBuffer45.hasTextAsCharacters();
        int int47 = textBuffer45.size();
        textBuffer45.resetWithEmpty();
        char[] charArray49 = textBuffer45.getCurrentSegment();
        textBuffer41.resetWithShared(charArray49, (int) (short) 1, (int) '4');
        textBuffer30.resetWithShared(charArray49, 262144, (int) (byte) 1);
        char[] charArray57 = textBuffer30.expandCurrentSegment(10);
        textBuffer17.append(charArray57, 3, (int) (byte) 100);
        textBuffer17.ensureNotShared();
        char[] charArray63 = textBuffer17.expandCurrentSegment(97);
        char[] charArray64 = textBuffer17.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray64, 97, 36);
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertNotNull(charArray64);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        java.lang.String str13 = textBuffer1.setCurrentAndReturn((int) (byte) 1);
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        char[] charArray19 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength((int) (short) 0);
        int int24 = textBuffer21.getCurrentSegmentSize();
        java.lang.String str25 = textBuffer21.toString();
        char[] charArray26 = textBuffer21.getCurrentSegment();
        char[] charArray27 = textBuffer21.emptyAndGetCurrentSegment();
        char[] charArray28 = textBuffer21.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray28, 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        textBuffer1.setCurrentLength(87);
        char[] charArray9 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        char[] charArray17 = textBuffer1.expandCurrentSegment((-1));
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", (int) (short) 0, 152);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 152, length 1");
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
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        int int7 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        int int3 = textBuffer1.getCurrentSegmentSize();
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        char[] charArray13 = textBuffer9.getCurrentSegment();
        textBuffer9.resetWithString("");
        char[] charArray16 = textBuffer9.getCurrentSegment();
        java.lang.String str17 = textBuffer9.contentsAsString();
        java.lang.String str18 = textBuffer9.toString();
        char[] charArray19 = textBuffer9.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        boolean boolean22 = textBuffer21.hasTextAsCharacters();
        char[] charArray23 = textBuffer21.getTextBuffer();
        java.lang.String str24 = textBuffer21.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        boolean boolean27 = textBuffer26.hasTextAsCharacters();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer21.resetWithCopy(charArray28, 0, 0);
        textBuffer21.ensureNotShared();
        textBuffer21.resetWithString("hi!");
        textBuffer21.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray37 = textBuffer21.getCurrentSegment();
        textBuffer9.resetWithShared(charArray37, 184, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray37, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray37);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.getTextBuffer();
        java.lang.String str8 = textBuffer1.contentsAsString();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        boolean boolean12 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(1000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str10 = textBuffer1.setCurrentAndReturn(10);
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " \000\000\000\000\000\000\000\000\000" + "'", str10, " \000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        textBuffer1.append('#');
        java.lang.Class<?> wildcardClass9 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        int int12 = textBuffer1.size();
        textBuffer1.append('#');
        int int15 = textBuffer1.size();
        char[] charArray16 = textBuffer1.getTextBuffer();
        int int17 = textBuffer1.getTextOffset();
        boolean boolean18 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"#\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        char[] charArray19 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        boolean boolean22 = textBuffer21.hasTextAsCharacters();
        char[] charArray23 = textBuffer21.getTextBuffer();
        java.lang.String str24 = textBuffer21.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        boolean boolean27 = textBuffer26.hasTextAsCharacters();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer21.resetWithCopy(charArray28, 0, 0);
        char[] charArray32 = textBuffer21.emptyAndGetCurrentSegment();
        char[] charArray33 = textBuffer21.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray33, (int) (byte) 0, 32);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray33);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        textBuffer1.setCurrentLength(52);
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
        int int46 = textBuffer28.size();
        char[] charArray47 = textBuffer28.emptyAndGetCurrentSegment();
        int int48 = textBuffer28.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer50 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler49);
        char[] charArray51 = textBuffer50.emptyAndGetCurrentSegment();
        int int52 = textBuffer50.getTextOffset();
        textBuffer50.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray55 = textBuffer50.getCurrentSegment();
        textBuffer50.append('4');
        char[] charArray58 = textBuffer50.getTextBuffer();
        textBuffer28.append(charArray58, (int) ' ', 10);
        textBuffer1.resetWithCopy(charArray58, 1, 10);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertNotNull(charArray58);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.getTextBuffer();
        java.lang.String str8 = textBuffer1.contentsAsString();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        boolean boolean12 = textBuffer1.hasTextAsCharacters();
        int int13 = textBuffer1.size();
        java.lang.String str14 = textBuffer1.contentsAsString();
        java.lang.String str16 = textBuffer1.setCurrentAndReturn((int) (byte) 100);
        boolean boolean17 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str16, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str12 = textBuffer1.setCurrentAndReturn((int) (short) 1);
        char[] charArray13 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        int int16 = textBuffer15.getTextOffset();
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
        textBuffer15.resetWithShared(charArray26, (int) ' ', (int) (short) 0);
        char[] charArray33 = textBuffer15.getTextBuffer();
        char[] charArray34 = textBuffer15.getCurrentSegment();
        int int35 = textBuffer15.getCurrentSegmentSize();
        char[] charArray36 = textBuffer15.getCurrentSegment();
        textBuffer1.append(charArray36, 2, 53);
        int int40 = textBuffer1.size();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\000' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 54 + "'", int40 == 54);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.setCurrentAndReturn(10);
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        textBuffer1.append("hi!", 2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 35, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end 88, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        char[] charArray19 = textBuffer1.getTextBuffer();
        char[] charArray20 = textBuffer1.getCurrentSegment();
        int int21 = textBuffer1.getCurrentSegmentSize();
        char[] charArray22 = textBuffer1.getCurrentSegment();
        char[] charArray23 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        char[] charArray26 = textBuffer25.emptyAndGetCurrentSegment();
        java.lang.String str27 = textBuffer25.toString();
        int int28 = textBuffer25.size();
        textBuffer25.ensureNotShared();
        char[] charArray30 = textBuffer25.getTextBuffer();
        textBuffer1.resetWithShared(charArray30, (int) '#', 52);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 87 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        char[] charArray13 = textBuffer1.expandCurrentSegment(0);
        textBuffer1.ensureNotShared();
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
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        char[] charArray5 = textBuffer1.getTextBuffer();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str8 = textBuffer1.setCurrentAndReturn(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str8, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        textBuffer1.append(' ');
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        java.lang.String str23 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 1);
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray28 = textBuffer1.getTextBuffer();
        java.lang.String str29 = textBuffer1.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str29, "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.expandCurrentSegment((int) (short) 1);
        textBuffer1.setCurrentLength(1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.emptyAndGetCurrentSegment();
        java.lang.String str14 = textBuffer12.toString();
        int int15 = textBuffer12.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        boolean boolean18 = textBuffer17.hasTextAsCharacters();
        char[] charArray19 = textBuffer17.getTextBuffer();
        java.lang.String str20 = textBuffer17.contentsAsString();
        boolean boolean21 = textBuffer17.hasTextAsCharacters();
        textBuffer17.append('4');
        char[] charArray24 = textBuffer17.contentsAsArray();
        char[] charArray25 = textBuffer17.contentsAsArray();
        textBuffer12.resetWithCopy(charArray25, (int) (byte) 1, 0);
        char[] charArray29 = textBuffer12.emptyAndGetCurrentSegment();
        char[] charArray30 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray30, (int) (short) 0, 100);
        char[] charArray34 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray34);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        int int5 = textBuffer1.size();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) '4');
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        char[] charArray24 = textBuffer23.emptyAndGetCurrentSegment();
        int int25 = textBuffer23.getTextOffset();
        textBuffer23.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray28 = textBuffer23.getCurrentSegment();
        textBuffer23.append('4');
        char[] charArray31 = textBuffer23.getTextBuffer();
        textBuffer1.append(charArray31, (int) ' ', 10);
        int int35 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.append('4');
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        char[] charArray13 = textBuffer9.getCurrentSegment();
        textBuffer9.resetWithString("");
        char[] charArray16 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray16, (int) (short) 1, 1);
        java.lang.String str20 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"?\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000" + "'", str20, "\000");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
        textBuffer1.setCurrentLength((int) (short) 0);
        textBuffer1.resetWithEmpty();
        boolean boolean23 = textBuffer1.hasTextAsCharacters();
        java.lang.String str25 = textBuffer1.setCurrentAndReturn(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000" + "'", str25, "\000");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getTextBuffer();
        java.lang.String str18 = textBuffer15.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        boolean boolean21 = textBuffer20.hasTextAsCharacters();
        char[] charArray22 = textBuffer20.getCurrentSegment();
        textBuffer15.resetWithCopy(charArray22, 0, 0);
        textBuffer1.append(charArray22, 1000, 0);
        java.lang.String str29 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str29, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.expandCurrentSegment((int) (short) 10);
        textBuffer1.append('4');
        textBuffer1.append('#');
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        textBuffer1.setCurrentLength((int) (byte) 1);
        textBuffer1.ensureNotShared();
        java.lang.String str23 = textBuffer1.setCurrentAndReturn(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str23, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.append('a');
        java.lang.String str11 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"a\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        textBuffer1.ensureNotShared();
        char[] charArray10 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.emptyAndGetCurrentSegment();
        java.lang.String str15 = textBuffer13.toString();
        int int16 = textBuffer13.size();
        textBuffer13.ensureNotShared();
        int int18 = textBuffer13.getTextOffset();
        int int19 = textBuffer13.getTextOffset();
        textBuffer13.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray22 = textBuffer13.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray22, 87, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 119 out of bounds for char[97]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray22);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.getTextBuffer();
        char[] charArray12 = textBuffer1.expandCurrentSegment((int) (short) 1);
        char[] charArray14 = textBuffer1.expandCurrentSegment((int) (byte) 0);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) 'a');
        textBuffer1.setCurrentLength((-1));
        int int12 = textBuffer1.getTextOffset();
        char[] charArray14 = textBuffer1.expandCurrentSegment(0);
        char[] charArray15 = textBuffer1.getTextBuffer();
        char[] charArray17 = textBuffer1.expandCurrentSegment((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        textBuffer1.resetWithString("hi!");
        char[] charArray6 = textBuffer1.getTextBuffer();
        int int7 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        int int6 = textBuffer1.getCurrentSegmentSize();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.emptyAndGetCurrentSegment();
        int int11 = textBuffer9.getTextOffset();
        textBuffer9.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray14 = textBuffer9.getCurrentSegment();
        textBuffer9.append('4');
        char[] charArray17 = textBuffer9.getTextBuffer();
        textBuffer1.append(charArray17, (int) '#', 0);
        char[] charArray21 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        boolean boolean27 = textBuffer26.hasTextAsCharacters();
        char[] charArray28 = textBuffer26.emptyAndGetCurrentSegment();
        char[] charArray30 = textBuffer26.expandCurrentSegment((-1));
        textBuffer1.resetWithCopy(charArray30, (int) (short) 10, 10);
        char[] charArray35 = textBuffer1.expandCurrentSegment(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray35);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        boolean boolean18 = textBuffer17.hasTextAsCharacters();
        int int19 = textBuffer17.size();
        textBuffer17.resetWithEmpty();
        textBuffer17.resetWithEmpty();
        boolean boolean22 = textBuffer17.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        boolean boolean25 = textBuffer24.hasTextAsCharacters();
        char[] charArray26 = textBuffer24.getCurrentSegment();
        textBuffer17.resetWithShared(charArray26, (int) '4', (int) (short) 100);
        java.lang.String str30 = textBuffer17.toString();
        textBuffer17.ensureNotShared();
        char[] charArray33 = textBuffer17.expandCurrentSegment((int) (short) 0);
        int int34 = textBuffer17.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        boolean boolean37 = textBuffer36.hasTextAsCharacters();
        int int38 = textBuffer36.size();
        textBuffer36.resetWithEmpty();
        char[] charArray40 = textBuffer36.getCurrentSegment();
        textBuffer36.resetWithString("");
        char[] charArray43 = textBuffer36.getCurrentSegment();
        java.lang.String str44 = textBuffer36.contentsAsString();
        textBuffer36.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray48 = textBuffer36.expandCurrentSegment((int) '#');
        textBuffer36.setCurrentLength(0);
        int int51 = textBuffer36.getCurrentSegmentSize();
        char[] charArray52 = textBuffer36.getCurrentSegment();
        textBuffer17.resetWithShared(charArray52, 262144, (int) '#');
        char[] charArray57 = textBuffer17.expandCurrentSegment(3);
        textBuffer1.resetWithCopy(charArray57, 33, (int) (short) 1);
        textBuffer1.resetWithString("\000#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str30, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray57);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str9 = textBuffer1.toString();
        char[] charArray11 = textBuffer1.expandCurrentSegment((int) '#');
        textBuffer1.ensureNotShared();
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        java.lang.String str9 = textBuffer1.setCurrentAndReturn(32);
        java.lang.String str11 = textBuffer1.setCurrentAndReturn((int) (byte) 10);
        java.lang.String str12 = textBuffer1.toString();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str11, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str12, "\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.String str10 = textBuffer1.setCurrentAndReturn(97);
        textBuffer1.append(' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str10, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        char[] charArray12 = textBuffer1.contentsAsArray();
        char[] charArray13 = textBuffer1.getTextBuffer();
        textBuffer1.append('a');
        textBuffer1.append("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str11, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        int int20 = textBuffer1.getTextOffset();
        boolean boolean21 = textBuffer1.hasTextAsCharacters();
        int int22 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) '4');
        int int8 = textBuffer1.size();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(3);
        textBuffer1.resetWithEmpty();
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray11 = textBuffer1.expandCurrentSegment((int) (byte) -1);
        char[] charArray12 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000\000" + "'", str7, "\000\000\000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(3);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str8 = textBuffer1.toString();
        textBuffer1.setCurrentLength((int) (short) 1);
        char[] charArray11 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray10 = textBuffer1.expandCurrentSegment((int) (byte) -1);
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray13 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        textBuffer15.resetWithEmpty();
        char[] charArray18 = textBuffer15.contentsAsArray();
        char[] charArray19 = textBuffer15.contentsAsArray();
        textBuffer15.releaseBuffers();
        textBuffer15.ensureNotShared();
        char[] charArray22 = textBuffer15.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray22, 87, 152);
        char[] charArray26 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        java.lang.String str13 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        java.lang.String str15 = textBuffer1.setCurrentAndReturn(87);
        boolean boolean16 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str15, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(0);
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(0);
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str5 = textBuffer1.setCurrentAndReturn((int) (byte) 10);
        char[] charArray7 = textBuffer1.expandCurrentSegment(1000);
        java.lang.String str8 = textBuffer1.toString();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"??????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str5, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str8, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.append('a');
        java.lang.String str11 = textBuffer1.toString();
        java.lang.String str12 = textBuffer1.contentsAsString();
        java.lang.String str13 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            double double22 = textBuffer1.contentsAsDouble();
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
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.expandCurrentSegment((int) (short) 1);
        textBuffer1.setCurrentLength((int) 'a');
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
        java.lang.String str34 = textBuffer12.contentsAsString();
        char[] charArray35 = textBuffer12.getCurrentSegment();
        textBuffer1.append(charArray35, 0, (int) '4');
        char[] charArray39 = textBuffer1.getCurrentSegment();
        java.lang.String str41 = textBuffer1.setCurrentAndReturn((int) '#');
        char[] charArray42 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray8);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str41, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray42);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        boolean boolean50 = textBuffer49.hasTextAsCharacters();
        int int51 = textBuffer49.size();
        textBuffer49.resetWithEmpty();
        char[] charArray53 = textBuffer49.getCurrentSegment();
        textBuffer49.resetWithString("");
        char[] charArray56 = textBuffer49.getCurrentSegment();
        java.lang.String str57 = textBuffer49.contentsAsString();
        int int58 = textBuffer49.getTextOffset();
        char[] charArray59 = textBuffer49.getTextBuffer();
        textBuffer1.resetWithShared(charArray59, 0, 0);
        char[] charArray63 = textBuffer1.getTextBuffer();
        char[] charArray65 = textBuffer1.expandCurrentSegment(100);
        textBuffer1.resetWithEmpty();
        boolean boolean67 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler68 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer69 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler68);
        char[] charArray70 = textBuffer69.emptyAndGetCurrentSegment();
        java.lang.String str71 = textBuffer69.toString();
        textBuffer69.setCurrentLength(52);
        textBuffer69.releaseBuffers();
        char[] charArray75 = textBuffer69.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler76 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer77 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler76);
        boolean boolean78 = textBuffer77.hasTextAsCharacters();
        int int79 = textBuffer77.size();
        textBuffer77.resetWithString("hi!");
        java.lang.String str82 = textBuffer77.contentsAsString();
        char[] charArray83 = textBuffer77.emptyAndGetCurrentSegment();
        char[] charArray85 = textBuffer77.expandCurrentSegment((int) '#');
        textBuffer69.append(charArray85, 87, 52);
        textBuffer1.append(charArray85, 3, (int) '#');
        textBuffer1.ensureNotShared();
        char[] charArray94 = textBuffer1.expandCurrentSegment(100);
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] {});
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertNotNull(charArray94);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        java.lang.String str11 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray12 = textBuffer1.contentsAsArray();
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        char[] charArray18 = textBuffer16.getTextBuffer();
        java.lang.String str19 = textBuffer16.contentsAsString();
        boolean boolean20 = textBuffer16.hasTextAsCharacters();
        int int21 = textBuffer16.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        int int24 = textBuffer23.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        boolean boolean27 = textBuffer26.hasTextAsCharacters();
        int int28 = textBuffer26.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        boolean boolean31 = textBuffer30.hasTextAsCharacters();
        int int32 = textBuffer30.size();
        textBuffer30.resetWithEmpty();
        char[] charArray34 = textBuffer30.getCurrentSegment();
        textBuffer26.resetWithShared(charArray34, (int) (short) 1, (int) '4');
        textBuffer23.resetWithShared(charArray34, (int) ' ', (int) (short) 0);
        textBuffer16.resetWithShared(charArray34, (int) (byte) 1, (int) '4');
        char[] charArray44 = textBuffer16.emptyAndGetCurrentSegment();
        char[] charArray45 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer16.releaseBuffers();
        char[] charArray47 = textBuffer16.getTextBuffer();
        textBuffer1.resetWithShared(charArray47, 100, 33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray47);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        textBuffer1.append('4');
        java.lang.String str43 = textBuffer1.toString();
        char[] charArray44 = textBuffer1.contentsAsArray();
        char[] charArray45 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "4" + "'", str43, "4");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("");
        java.lang.String str18 = textBuffer1.setCurrentAndReturn((int) (short) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.setCurrentLength((int) (short) 0);
        int int23 = textBuffer20.getCurrentSegmentSize();
        textBuffer20.resetWithString("");
        boolean boolean26 = textBuffer20.hasTextAsCharacters();
        textBuffer20.setCurrentLength((int) (byte) 100);
        char[] charArray29 = textBuffer20.emptyAndGetCurrentSegment();
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
        textBuffer20.resetWithShared(charArray39, 262144, (int) (byte) 1);
        boolean boolean46 = textBuffer20.hasTextAsCharacters();
        textBuffer20.releaseBuffers();
        textBuffer20.append('#');
        char[] charArray50 = textBuffer20.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray50, 54, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(charArray50);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getTextBuffer();
        java.lang.String str18 = textBuffer15.contentsAsString();
        int int19 = textBuffer15.getTextOffset();
        char[] charArray20 = textBuffer15.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray20, (int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"?\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength((int) (short) -1);
        char[] charArray13 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        int int21 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray23 = textBuffer1.expandCurrentSegment((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("a");
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray12 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        java.lang.String str11 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray12 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        java.lang.String str10 = textBuffer1.contentsAsString();
        java.lang.String str11 = textBuffer1.contentsAsString();
        java.lang.String str12 = textBuffer1.contentsAsString();
        char[] charArray13 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        java.lang.String str12 = textBuffer1.toString();
        textBuffer1.append(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str12, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.setCurrentLength((int) (short) 0);
        int int11 = textBuffer8.getCurrentSegmentSize();
        char[] charArray12 = textBuffer8.getTextBuffer();
        char[] charArray13 = textBuffer8.emptyAndGetCurrentSegment();
        int int14 = textBuffer8.getCurrentSegmentSize();
        textBuffer8.setCurrentLength((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.setCurrentLength((int) (short) 0);
        int int21 = textBuffer18.getCurrentSegmentSize();
        textBuffer18.resetWithString("");
        boolean boolean24 = textBuffer18.hasTextAsCharacters();
        textBuffer18.setCurrentLength((int) (byte) 100);
        textBuffer18.ensureNotShared();
        boolean boolean28 = textBuffer18.hasTextAsCharacters();
        int int29 = textBuffer18.getCurrentSegmentSize();
        int int30 = textBuffer18.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer32 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler31);
        boolean boolean33 = textBuffer32.hasTextAsCharacters();
        char[] charArray34 = textBuffer32.getCurrentSegment();
        textBuffer18.resetWithShared(charArray34, (int) (short) -1, (int) (byte) 100);
        textBuffer8.resetWithCopy(charArray34, (int) 'a', (int) (short) 0);
        textBuffer1.resetWithShared(charArray34, (int) (short) 100, (int) ' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        boolean boolean46 = textBuffer45.hasTextAsCharacters();
        textBuffer45.resetWithEmpty();
        char[] charArray48 = textBuffer45.contentsAsArray();
        char[] charArray49 = textBuffer45.contentsAsArray();
        int int50 = textBuffer45.size();
        char[] charArray51 = textBuffer45.contentsAsArray();
        char[] charArray52 = textBuffer45.getCurrentSegment();
        char[] charArray54 = textBuffer45.expandCurrentSegment((int) (byte) -1);
        textBuffer45.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray57 = textBuffer45.getCurrentSegment();
        textBuffer1.append(charArray57, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] {});
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertNotNull(charArray57);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
        textBuffer1.setCurrentLength((int) (byte) 1);
        textBuffer1.ensureNotShared();
        char[] charArray22 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray22);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.contentsAsArray();
        int int9 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        textBuffer1.append(' ');
        int int13 = textBuffer1.size();
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        int int15 = textBuffer1.size();
        java.lang.String str16 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.expandCurrentSegment((int) (short) 1);
        textBuffer1.releaseBuffers();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.getCurrentSegment();
        int int12 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        char[] charArray24 = textBuffer1.contentsAsArray();
        boolean boolean25 = textBuffer1.hasTextAsCharacters();
        int int26 = textBuffer1.getTextOffset();
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
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        java.lang.String str8 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str5 = textBuffer1.setCurrentAndReturn((int) (byte) 10);
        char[] charArray7 = textBuffer1.expandCurrentSegment(1000);
        java.lang.String str9 = textBuffer1.setCurrentAndReturn((int) '4');
        int int10 = textBuffer1.size();
        textBuffer1.resetWithString("\000a");
        int int13 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str5, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) 'a');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        int int13 = textBuffer11.size();
        textBuffer11.resetWithEmpty();
        textBuffer11.resetWithEmpty();
        boolean boolean16 = textBuffer11.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        boolean boolean19 = textBuffer18.hasTextAsCharacters();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer11.resetWithShared(charArray20, (int) '4', (int) (short) 100);
        java.lang.String str24 = textBuffer11.toString();
        textBuffer11.ensureNotShared();
        char[] charArray27 = textBuffer11.expandCurrentSegment((int) (short) 0);
        int int28 = textBuffer11.size();
        textBuffer11.resetWithEmpty();
        int int30 = textBuffer11.getCurrentSegmentSize();
        java.lang.String str32 = textBuffer11.setCurrentAndReturn((int) (short) 100);
        char[] charArray33 = textBuffer11.contentsAsArray();
        char[] charArray34 = textBuffer11.contentsAsArray();
        textBuffer1.append(charArray34, (int) 'a', 0);
        java.lang.String str38 = textBuffer1.contentsAsString();
        textBuffer1.ensureNotShared();
        char[] charArray40 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str24, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str32, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str38, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray40);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.contentsAsArray();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        textBuffer1.ensureNotShared();
        int int10 = textBuffer1.size();
        char[] charArray12 = textBuffer1.expandCurrentSegment((int) (byte) 0);
        java.lang.String str13 = textBuffer1.contentsAsString();
        char[] charArray14 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.emptyAndGetCurrentSegment();
        int int12 = textBuffer10.getTextOffset();
        textBuffer10.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray15 = textBuffer10.getCurrentSegment();
        textBuffer10.append('4');
        char[] charArray18 = textBuffer10.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray18, (-1), (int) (byte) -1);
        boolean boolean22 = textBuffer1.hasTextAsCharacters();
        java.lang.String str24 = textBuffer1.setCurrentAndReturn(32);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str24, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        java.lang.String str5 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        boolean boolean13 = textBuffer9.hasTextAsCharacters();
        java.lang.String str14 = textBuffer9.contentsAsString();
        textBuffer9.setCurrentLength((int) (byte) 10);
        textBuffer9.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.setCurrentLength((int) (short) 0);
        int int23 = textBuffer20.getCurrentSegmentSize();
        textBuffer20.resetWithString("");
        boolean boolean26 = textBuffer20.hasTextAsCharacters();
        textBuffer20.setCurrentLength((int) (byte) 100);
        char[] charArray29 = textBuffer20.emptyAndGetCurrentSegment();
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
        textBuffer20.resetWithShared(charArray39, 262144, (int) (byte) 1);
        char[] charArray47 = textBuffer20.expandCurrentSegment(10);
        textBuffer9.resetWithShared(charArray47, (int) (short) 1, 0);
        textBuffer1.resetWithShared(charArray47, (int) (byte) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4 ", (int) '#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray47);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.setCurrentAndReturn(10);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray12 = textBuffer1.expandCurrentSegment((int) (byte) 0);
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str14 = textBuffer1.toString();
        java.lang.String str16 = textBuffer1.setCurrentAndReturn(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.setCurrentLength((int) (short) 0);
        int int15 = textBuffer12.getCurrentSegmentSize();
        textBuffer12.resetWithString("");
        boolean boolean18 = textBuffer12.hasTextAsCharacters();
        textBuffer12.setCurrentLength((int) (byte) 100);
        char[] charArray21 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray21, 0, 1);
        textBuffer1.setCurrentLength((int) (short) 100);
        char[] charArray27 = textBuffer1.getTextBuffer();
        int int28 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        textBuffer1.releaseBuffers();
        char[] charArray14 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        java.lang.String str23 = textBuffer1.contentsAsString();
        char[] charArray24 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000");
        char[] charArray28 = textBuffer1.expandCurrentSegment((int) ' ');
        int int29 = textBuffer1.getTextOffset();
        char[] charArray30 = textBuffer1.getCurrentSegment();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
        boolean boolean25 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray27 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal28 = textBuffer1.contentsAsDecimal();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        char[] charArray66 = textBuffer1.contentsAsArray();
        char[] charArray67 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.append('4');
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
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertNotNull(charArray67);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        int int7 = textBuffer1.size();
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength(33);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 52, 149);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 201, length 87");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        textBuffer1.ensureNotShared();
        java.lang.String str13 = textBuffer1.setCurrentAndReturn((int) (byte) 0);
        textBuffer1.append(' ');
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        int int12 = textBuffer10.size();
        textBuffer10.resetWithEmpty();
        char[] charArray14 = textBuffer10.getCurrentSegment();
        textBuffer10.resetWithString("");
        char[] charArray17 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray18 = textBuffer10.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray18, 0, (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.setCurrentLength((int) (short) 0);
        int int26 = textBuffer23.getCurrentSegmentSize();
        textBuffer23.resetWithString("");
        boolean boolean29 = textBuffer23.hasTextAsCharacters();
        textBuffer23.setCurrentLength((int) (byte) 100);
        textBuffer23.ensureNotShared();
        textBuffer23.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        textBuffer35.setCurrentLength((int) (short) 0);
        char[] charArray38 = textBuffer35.getTextBuffer();
        java.lang.String str39 = textBuffer35.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        boolean boolean42 = textBuffer41.hasTextAsCharacters();
        int int43 = textBuffer41.size();
        textBuffer41.resetWithEmpty();
        char[] charArray45 = textBuffer41.getCurrentSegment();
        textBuffer41.resetWithString("");
        int int48 = textBuffer41.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer50 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler49);
        int int51 = textBuffer50.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler52 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer53 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler52);
        boolean boolean54 = textBuffer53.hasTextAsCharacters();
        int int55 = textBuffer53.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler56 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer57 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler56);
        boolean boolean58 = textBuffer57.hasTextAsCharacters();
        int int59 = textBuffer57.size();
        textBuffer57.resetWithEmpty();
        char[] charArray61 = textBuffer57.getCurrentSegment();
        textBuffer53.resetWithShared(charArray61, (int) (short) 1, (int) '4');
        textBuffer50.resetWithShared(charArray61, (int) ' ', (int) (short) 0);
        textBuffer41.resetWithCopy(charArray61, (int) (short) 1, (int) (byte) 10);
        textBuffer35.resetWithShared(charArray61, 1, 1000);
        textBuffer23.resetWithShared(charArray61, 100, 262144);
        textBuffer1.append(charArray61, (int) (byte) 0, 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler80 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer81 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler80);
        boolean boolean82 = textBuffer81.hasTextAsCharacters();
        char[] charArray83 = textBuffer81.emptyAndGetCurrentSegment();
        char[] charArray84 = textBuffer81.contentsAsArray();
        textBuffer1.resetWithShared(charArray84, 35, 0);
        textBuffer1.append('#');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(charArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] {});
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        textBuffer1.resetWithEmpty();
        int int13 = textBuffer1.getCurrentSegmentSize();
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        char[] charArray17 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        java.lang.String str8 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = textBuffer1.setCurrentAndReturn(100);
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
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
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
        textBuffer1.ensureNotShared();
        char[] charArray23 = textBuffer1.getCurrentSegment();
        char[] charArray24 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        char[] charArray27 = textBuffer1.contentsAsArray();
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
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray27);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getCurrentSegmentSize();
        int int9 = textBuffer1.getCurrentSegmentSize();
        char[] charArray10 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass11 = textBuffer1.getClass();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.append(' ');
        java.lang.String str12 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        int int11 = textBuffer1.size();
        textBuffer1.append('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
        textBuffer1.resetWithEmpty();
        char[] charArray12 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = textBuffer1.contentsAsDecimal();
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
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        textBuffer1.releaseBuffers();
        int int19 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        java.lang.String str9 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("");
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) 'a', 46);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 143, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        int int14 = textBuffer13.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        boolean boolean17 = textBuffer16.hasTextAsCharacters();
        int int18 = textBuffer16.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        boolean boolean21 = textBuffer20.hasTextAsCharacters();
        int int22 = textBuffer20.size();
        textBuffer20.resetWithEmpty();
        char[] charArray24 = textBuffer20.getCurrentSegment();
        textBuffer16.resetWithShared(charArray24, (int) (short) 1, (int) '4');
        textBuffer13.resetWithShared(charArray24, (int) ' ', (int) (short) 0);
        textBuffer13.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        boolean boolean34 = textBuffer33.hasTextAsCharacters();
        char[] charArray35 = textBuffer33.getTextBuffer();
        java.lang.String str36 = textBuffer33.contentsAsString();
        boolean boolean37 = textBuffer33.hasTextAsCharacters();
        textBuffer33.append('4');
        char[] charArray40 = textBuffer33.contentsAsArray();
        char[] charArray41 = textBuffer33.contentsAsArray();
        char[] charArray42 = textBuffer33.getTextBuffer();
        textBuffer33.setCurrentLength(100);
        char[] charArray45 = textBuffer33.getCurrentSegment();
        char[] charArray46 = textBuffer33.emptyAndGetCurrentSegment();
        textBuffer13.resetWithShared(charArray46, (int) ' ', (int) (short) 100);
        textBuffer1.resetWithShared(charArray46, (int) (byte) -1, (int) '4');
        textBuffer1.append("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (short) 0, 10);
        char[] charArray57 = textBuffer1.getTextBuffer();
        char[] charArray58 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(charArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        boolean boolean14 = textBuffer13.hasTextAsCharacters();
        int int15 = textBuffer13.size();
        textBuffer13.resetWithEmpty();
        char[] charArray17 = textBuffer13.getCurrentSegment();
        textBuffer9.resetWithShared(charArray17, (int) (short) 1, (int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        textBuffer22.setCurrentLength((int) (short) 0);
        int int25 = textBuffer22.getCurrentSegmentSize();
        textBuffer22.resetWithString("");
        boolean boolean28 = textBuffer22.hasTextAsCharacters();
        textBuffer22.setCurrentLength((int) (byte) 100);
        char[] charArray31 = textBuffer22.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        boolean boolean34 = textBuffer33.hasTextAsCharacters();
        int int35 = textBuffer33.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        boolean boolean38 = textBuffer37.hasTextAsCharacters();
        int int39 = textBuffer37.size();
        textBuffer37.resetWithEmpty();
        char[] charArray41 = textBuffer37.getCurrentSegment();
        textBuffer33.resetWithShared(charArray41, (int) (short) 1, (int) '4');
        textBuffer22.resetWithShared(charArray41, 262144, (int) (byte) 1);
        char[] charArray49 = textBuffer22.expandCurrentSegment(10);
        textBuffer9.append(charArray49, 3, (int) (byte) 100);
        textBuffer1.resetWithCopy(charArray49, (int) (byte) 0, (int) (byte) 10);
        int int56 = textBuffer1.size();
        int int57 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(184);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        int int11 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str5 = textBuffer1.setCurrentAndReturn((int) (byte) 10);
        char[] charArray7 = textBuffer1.expandCurrentSegment(1000);
        int int8 = textBuffer1.size();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str5, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        int int3 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 32, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 35, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
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
        textBuffer1.setCurrentLength((int) (short) 100);
        double double15 = textBuffer1.contentsAsDouble();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.emptyAndGetCurrentSegment();
        int int12 = textBuffer10.getTextOffset();
        textBuffer10.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray15 = textBuffer10.getCurrentSegment();
        textBuffer10.append('4');
        char[] charArray18 = textBuffer10.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray18, (-1), (int) (byte) -1);
        java.lang.String str22 = textBuffer1.toString();
        boolean boolean23 = textBuffer1.hasTextAsCharacters();
        char[] charArray24 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass25 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        textBuffer1.append('#');
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        java.lang.String str11 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        int int12 = textBuffer1.size();
        textBuffer1.append('#');
        int int15 = textBuffer1.size();
        char[] charArray16 = textBuffer1.getTextBuffer();
        int int17 = textBuffer1.getTextOffset();
        boolean boolean18 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.expandCurrentSegment((int) (short) 10);
        java.lang.String str9 = textBuffer1.toString();
        textBuffer1.append('a');
        char[] charArray13 = textBuffer1.expandCurrentSegment(97);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
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
        java.lang.String str13 = textBuffer1.setCurrentAndReturn((int) (short) 0);
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        java.lang.String str3 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        java.lang.String str7 = textBuffer1.contentsAsString();
        java.lang.String str8 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        char[] charArray12 = textBuffer10.getTextBuffer();
        java.lang.String str13 = textBuffer10.contentsAsString();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        textBuffer10.append('4');
        char[] charArray17 = textBuffer10.contentsAsArray();
        char[] charArray18 = textBuffer10.contentsAsArray();
        char[] charArray19 = textBuffer10.getTextBuffer();
        double double20 = textBuffer10.contentsAsDouble();
        textBuffer10.resetWithEmpty();
        textBuffer10.append('4');
        char[] charArray24 = textBuffer10.getTextBuffer();
        textBuffer1.resetWithShared(charArray24, 0, 33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
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
        java.lang.String str23 = textBuffer1.contentsAsString();
        char[] charArray24 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000");
        char[] charArray28 = textBuffer1.expandCurrentSegment((int) ' ');
        textBuffer1.ensureNotShared();
        textBuffer1.append("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 10, (int) (byte) 1);
        textBuffer1.setCurrentLength(33);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        char[] charArray16 = textBuffer1.getCurrentSegment();
        char[] charArray17 = textBuffer1.getTextBuffer();
        textBuffer1.append('a');
        int int20 = textBuffer1.getCurrentSegmentSize();
        char[] charArray21 = textBuffer1.getCurrentSegment();
        textBuffer1.append('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        char[] charArray13 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, 100, (int) (short) 1);
        int int17 = textBuffer1.size();
        char[] charArray18 = textBuffer1.getCurrentSegment();
        char[] charArray19 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (short) 1);
        textBuffer1.resetWithEmpty();
        int int9 = textBuffer1.getTextOffset();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass11 = charArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.ensureNotShared();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.emptyAndGetCurrentSegment();
        java.lang.String str15 = textBuffer13.toString();
        int int16 = textBuffer13.size();
        textBuffer13.ensureNotShared();
        java.lang.String str19 = textBuffer13.setCurrentAndReturn((int) '4');
        char[] charArray20 = textBuffer13.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray20, (int) (byte) 0, (int) (byte) 100);
        char[] charArray25 = textBuffer1.expandCurrentSegment((int) (short) 0);
        java.lang.String str26 = textBuffer1.toString();
        char[] charArray28 = textBuffer1.expandCurrentSegment(100);
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 53, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str19, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str26, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
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
        textBuffer1.resetWithEmpty();
        int int13 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getTextBuffer();
        java.lang.String str18 = textBuffer15.contentsAsString();
        textBuffer15.append('4');
        int int21 = textBuffer15.getTextOffset();
        char[] charArray23 = textBuffer15.expandCurrentSegment((int) '#');
        textBuffer1.resetWithCopy(charArray23, 1, (int) (byte) 100);
        char[] charArray28 = textBuffer1.expandCurrentSegment((int) ' ');
        java.lang.String str29 = textBuffer1.toString();
        java.lang.String str31 = textBuffer1.setCurrentAndReturn(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str29, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\000\000" + "'", str31, "\000\000\000");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        char[] charArray12 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.emptyAndGetCurrentSegment();
        int int18 = textBuffer16.getTextOffset();
        char[] charArray19 = textBuffer16.getTextBuffer();
        textBuffer1.resetWithShared(charArray19, (int) 'a', (int) (short) 1);
        char[] charArray23 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('4');
        java.lang.String str10 = textBuffer1.setCurrentAndReturn((int) (byte) 10);
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        boolean boolean14 = textBuffer13.hasTextAsCharacters();
        int int15 = textBuffer13.size();
        textBuffer13.resetWithEmpty();
        char[] charArray17 = textBuffer13.getCurrentSegment();
        char[] charArray18 = textBuffer13.getCurrentSegment();
        char[] charArray19 = textBuffer13.contentsAsArray();
        textBuffer1.resetWithShared(charArray19, (int) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4\000\000\000\000\000\000\000\000\000" + "'", str10, "4\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal33 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
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
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (short) 1);
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000");
        int int10 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("#");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        boolean boolean15 = textBuffer14.hasTextAsCharacters();
        int int16 = textBuffer14.size();
        textBuffer14.resetWithEmpty();
        char[] charArray18 = textBuffer14.getCurrentSegment();
        textBuffer14.resetWithString("");
        char[] charArray21 = textBuffer14.getCurrentSegment();
        java.lang.String str22 = textBuffer14.contentsAsString();
        char[] charArray23 = textBuffer14.getTextBuffer();
        textBuffer14.append(' ');
        int int26 = textBuffer14.size();
        int int27 = textBuffer14.getTextOffset();
        char[] charArray28 = textBuffer14.contentsAsArray();
        textBuffer1.resetWithShared(charArray28, (int) (short) 0, 11);
        textBuffer1.setCurrentLength(11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { ' ' });
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.append('4');
        int int7 = textBuffer1.getTextOffset();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        java.lang.String str9 = textBuffer1.toString();
        double double10 = textBuffer1.contentsAsDouble();
        char[] charArray11 = textBuffer1.contentsAsArray();
        int int12 = textBuffer1.size();
        int int13 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        textBuffer1.append(' ');
        java.lang.String str14 = textBuffer1.setCurrentAndReturn((int) '#');
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray16 = textBuffer1.getCurrentSegment();
        int int17 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        textBuffer19.setCurrentLength((int) (short) 0);
        char[] charArray22 = textBuffer19.getTextBuffer();
        textBuffer19.resetWithString("hi!");
        boolean boolean25 = textBuffer19.hasTextAsCharacters();
        char[] charArray26 = textBuffer19.getTextBuffer();
        char[] charArray27 = textBuffer19.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray27, 54, 54);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray27);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.getTextBuffer();
        int int11 = textBuffer1.getTextOffset();
        java.lang.String str12 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str12, "\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
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
        java.lang.String str12 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        int int15 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", 0, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 1000, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str12, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        textBuffer1.setCurrentLength(1);
        textBuffer1.setCurrentLength(52);
        int int17 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.setCurrentLength((int) (short) 0);
        int int23 = textBuffer20.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer20.toString();
        char[] charArray25 = textBuffer20.getCurrentSegment();
        char[] charArray26 = textBuffer20.emptyAndGetCurrentSegment();
        char[] charArray27 = textBuffer20.emptyAndGetCurrentSegment();
        char[] charArray28 = textBuffer20.getTextBuffer();
        textBuffer1.resetWithShared(charArray28, (int) '#', (int) (short) -1);
        int int32 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        char[] charArray25 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass26 = textBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("");
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.resetWithString("hi!");
        char[] charArray11 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("a");
        textBuffer1.setCurrentLength(1000);
        java.lang.String str16 = textBuffer1.contentsAsString();
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
        char[] charArray30 = textBuffer18.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray30, 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "a" + "'", str16, "a");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.releaseBuffers();
        java.lang.String str17 = textBuffer1.setCurrentAndReturn((int) (short) 10);
        char[] charArray19 = textBuffer1.expandCurrentSegment(0);
        int int20 = textBuffer1.getTextOffset();
        char[] charArray21 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str17, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
        java.lang.Class<?> wildcardClass45 = charArray41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        char[] charArray10 = textBuffer1.contentsAsArray();
        double double11 = textBuffer1.contentsAsDouble();
        java.lang.String str13 = textBuffer1.setCurrentAndReturn(100);
        int int14 = textBuffer1.getTextOffset();
        double double15 = textBuffer1.contentsAsDouble();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str13, "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        textBuffer1.resetWithEmpty();
        int int13 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        boolean boolean16 = textBuffer15.hasTextAsCharacters();
        char[] charArray17 = textBuffer15.getTextBuffer();
        java.lang.String str18 = textBuffer15.contentsAsString();
        textBuffer15.append('4');
        int int21 = textBuffer15.getTextOffset();
        char[] charArray23 = textBuffer15.expandCurrentSegment((int) '#');
        textBuffer1.resetWithCopy(charArray23, 1, (int) (byte) 100);
        java.lang.String str27 = textBuffer1.toString();
        int int28 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str27, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.append('#');
        int int11 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000#", 52, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 1051, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        int int9 = textBuffer1.getCurrentSegmentSize();
        int int10 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
        char[] charArray17 = textBuffer1.expandCurrentSegment((int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (short) 1);
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000");
        double double10 = textBuffer1.contentsAsDouble();
        char[] charArray11 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
        textBuffer1.releaseBuffers();
        textBuffer1.append('#');
        char[] charArray31 = textBuffer1.getCurrentSegment();
        char[] charArray32 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray32);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.size();
        textBuffer1.append(' ');
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.String str11 = textBuffer1.setCurrentAndReturn((int) '4');
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        boolean boolean15 = textBuffer14.hasTextAsCharacters();
        int int16 = textBuffer14.size();
        textBuffer14.resetWithString("hi!");
        java.lang.String str19 = textBuffer14.contentsAsString();
        char[] charArray20 = textBuffer14.emptyAndGetCurrentSegment();
        char[] charArray22 = textBuffer14.expandCurrentSegment((int) '#');
        textBuffer1.resetWithShared(charArray22, 1000, 52);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1000, count 52, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str11, " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
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
        boolean boolean47 = textBuffer1.hasTextAsCharacters();
        java.lang.String str49 = textBuffer1.setCurrentAndReturn(36);
        textBuffer1.releaseBuffers();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str49, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append(' ');
        textBuffer1.releaseBuffers();
        int int14 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
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
        textBuffer1.setCurrentLength((int) (short) 0);
        textBuffer1.resetWithEmpty();
        char[] charArray23 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(262144);
        textBuffer1.append(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.append('4');
        int int7 = textBuffer1.getTextOffset();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        java.lang.String str9 = textBuffer1.toString();
        double double10 = textBuffer1.contentsAsDouble();
        textBuffer1.releaseBuffers();
        java.lang.String str12 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        textBuffer1.ensureNotShared();
        char[] charArray23 = textBuffer1.getCurrentSegment();
        char[] charArray24 = textBuffer1.getTextBuffer();
        char[] charArray25 = textBuffer1.emptyAndGetCurrentSegment();
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
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
        textBuffer1.releaseBuffers();
        char[] charArray16 = textBuffer1.expandCurrentSegment((int) (short) 100);
        char[] charArray17 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (short) 1);
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        char[] charArray12 = textBuffer1.getTextBuffer();
        java.lang.String str13 = textBuffer1.toString();
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str13, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        int int9 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        char[] charArray14 = textBuffer12.getTextBuffer();
        java.lang.String str15 = textBuffer12.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        boolean boolean18 = textBuffer17.hasTextAsCharacters();
        char[] charArray19 = textBuffer17.getCurrentSegment();
        textBuffer12.resetWithCopy(charArray19, 0, 0);
        textBuffer12.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        boolean boolean27 = textBuffer26.hasTextAsCharacters();
        int int28 = textBuffer26.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        boolean boolean31 = textBuffer30.hasTextAsCharacters();
        int int32 = textBuffer30.size();
        textBuffer30.resetWithEmpty();
        char[] charArray34 = textBuffer30.getCurrentSegment();
        textBuffer26.resetWithShared(charArray34, (int) (short) 1, (int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        textBuffer39.setCurrentLength((int) (short) 0);
        int int42 = textBuffer39.getCurrentSegmentSize();
        textBuffer39.resetWithString("");
        boolean boolean45 = textBuffer39.hasTextAsCharacters();
        textBuffer39.setCurrentLength((int) (byte) 100);
        char[] charArray48 = textBuffer39.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer50 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler49);
        boolean boolean51 = textBuffer50.hasTextAsCharacters();
        int int52 = textBuffer50.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler53 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer54 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler53);
        boolean boolean55 = textBuffer54.hasTextAsCharacters();
        int int56 = textBuffer54.size();
        textBuffer54.resetWithEmpty();
        char[] charArray58 = textBuffer54.getCurrentSegment();
        textBuffer50.resetWithShared(charArray58, (int) (short) 1, (int) '4');
        textBuffer39.resetWithShared(charArray58, 262144, (int) (byte) 1);
        char[] charArray66 = textBuffer39.expandCurrentSegment(10);
        textBuffer26.append(charArray66, 3, (int) (byte) 100);
        textBuffer12.append(charArray66, (int) (byte) 1, (int) (short) 10);
        java.lang.String str73 = textBuffer12.toString();
        java.lang.String str75 = textBuffer12.setCurrentAndReturn(100);
        textBuffer12.setCurrentLength(52);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler78 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer79 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler78);
        boolean boolean80 = textBuffer79.hasTextAsCharacters();
        textBuffer79.resetWithEmpty();
        char[] charArray82 = textBuffer79.contentsAsArray();
        char[] charArray83 = textBuffer79.contentsAsArray();
        textBuffer79.releaseBuffers();
        char[] charArray85 = textBuffer79.emptyAndGetCurrentSegment();
        boolean boolean86 = textBuffer79.hasTextAsCharacters();
        char[] charArray87 = textBuffer79.emptyAndGetCurrentSegment();
        textBuffer12.append(charArray87, 10, 0);
        textBuffer1.append(charArray87, 54, (int) '#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str73, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str75, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertArrayEquals(charArray82, new char[] {});
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] {});
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(charArray87);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("a\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
        textBuffer1.setCurrentLength((int) (short) 0);
        textBuffer1.releaseBuffers();
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
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
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
        char[] charArray15 = textBuffer1.getCurrentSegment();
        char[] charArray16 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("");
        java.lang.String str19 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.expandCurrentSegment((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 52, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 149, length 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.expandCurrentSegment((int) (short) 1);
        char[] charArray9 = textBuffer1.getTextBuffer();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        java.lang.String str15 = textBuffer1.contentsAsString();
        textBuffer1.releaseBuffers();
        char[] charArray17 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4" + "'", str15, "4");
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.getTextBuffer();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        java.lang.String str7 = textBuffer1.toString();
        java.lang.String str8 = textBuffer1.contentsAsString();
        java.lang.String str9 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        textBuffer1.append('#');
        char[] charArray10 = textBuffer1.expandCurrentSegment(52);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        char[] charArray14 = textBuffer12.getTextBuffer();
        java.lang.String str15 = textBuffer12.contentsAsString();
        boolean boolean16 = textBuffer12.hasTextAsCharacters();
        java.lang.String str17 = textBuffer12.contentsAsString();
        char[] charArray18 = textBuffer12.getTextBuffer();
        char[] charArray19 = textBuffer12.getCurrentSegment();
        textBuffer1.append(charArray19, 97, 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        boolean boolean25 = textBuffer24.hasTextAsCharacters();
        char[] charArray26 = textBuffer24.getTextBuffer();
        java.lang.String str27 = textBuffer24.contentsAsString();
        char[] charArray28 = textBuffer24.contentsAsArray();
        int int29 = textBuffer24.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        boolean boolean32 = textBuffer31.hasTextAsCharacters();
        textBuffer31.resetWithEmpty();
        char[] charArray34 = textBuffer31.contentsAsArray();
        char[] charArray35 = textBuffer31.contentsAsArray();
        textBuffer31.setCurrentLength((int) (short) 1);
        char[] charArray38 = textBuffer31.emptyAndGetCurrentSegment();
        java.lang.String str39 = textBuffer31.toString();
        char[] charArray41 = textBuffer31.expandCurrentSegment((int) '#');
        textBuffer24.resetWithShared(charArray41, (int) (byte) 0, (int) (short) -1);
        textBuffer1.resetWithCopy(charArray41, 33, 46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray41);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        char[] charArray9 = textBuffer1.expandCurrentSegment(3);
        char[] charArray10 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        boolean boolean25 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray27 = textBuffer1.contentsAsArray();
        int int28 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString(" \000\000\000\000\000\000\000\000\000");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
        char[] charArray16 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        java.lang.String str11 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray12 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("");
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str16 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        boolean boolean19 = textBuffer18.hasTextAsCharacters();
        textBuffer18.resetWithEmpty();
        int int21 = textBuffer18.getCurrentSegmentSize();
        int int22 = textBuffer18.getCurrentSegmentSize();
        java.lang.String str24 = textBuffer18.setCurrentAndReturn(0);
        char[] charArray25 = textBuffer18.getTextBuffer();
        char[] charArray26 = textBuffer18.getTextBuffer();
        textBuffer1.resetWithShared(charArray26, 1000, 87);
        java.lang.Class<?> wildcardClass30 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(0);
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray4 = textBuffer1.getTextBuffer();
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
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
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
        java.lang.String str19 = textBuffer1.setCurrentAndReturn((int) 'a');
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray22 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str19, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray22);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        char[] charArray14 = textBuffer1.expandCurrentSegment(1);
        int int15 = textBuffer1.getCurrentSegmentSize();
        java.lang.Class<?> wildcardClass16 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        int int8 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength((int) (short) 0);
        int int13 = textBuffer10.getCurrentSegmentSize();
        textBuffer10.resetWithString("");
        textBuffer10.releaseBuffers();
        char[] charArray17 = textBuffer10.getCurrentSegment();
        textBuffer1.resetWithShared(charArray17, (int) (byte) -1, 149);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        char[] charArray19 = textBuffer1.getTextBuffer();
        char[] charArray20 = textBuffer1.getCurrentSegment();
        char[] charArray21 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str23 = textBuffer1.setCurrentAndReturn(33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str23, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        int int9 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
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
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
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
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        int int21 = textBuffer1.getCurrentSegmentSize();
        char[] charArray22 = textBuffer1.getTextBuffer();
        int int23 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.append('4');
        double double10 = textBuffer1.contentsAsDouble();
        java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(bigDecimal11);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
        boolean boolean47 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        char[] charArray50 = textBuffer49.emptyAndGetCurrentSegment();
        textBuffer49.setCurrentLength((int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler53 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer54 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler53);
        textBuffer54.setCurrentLength((int) (short) 0);
        int int57 = textBuffer54.getCurrentSegmentSize();
        java.lang.String str58 = textBuffer54.toString();
        char[] charArray59 = textBuffer54.getCurrentSegment();
        textBuffer49.resetWithCopy(charArray59, 0, (int) (byte) 10);
        textBuffer1.append(charArray59, 0, 32);
        java.lang.String str66 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str66, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
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
        char[] charArray19 = textBuffer1.getTextBuffer();
        char[] charArray20 = textBuffer1.getCurrentSegment();
        int int21 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str22 = textBuffer1.contentsAsString();
        int int23 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        int int9 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("\000");
        java.lang.String str13 = textBuffer1.setCurrentAndReturn(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str13, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.append('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(0);
        java.lang.String str11 = textBuffer1.toString();
        java.lang.String str13 = textBuffer1.setCurrentAndReturn(32);
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str13, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.expandCurrentSegment(97);
        textBuffer1.append('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        textBuffer8.resetWithEmpty();
        char[] charArray11 = textBuffer8.contentsAsArray();
        char[] charArray12 = textBuffer8.contentsAsArray();
        textBuffer8.releaseBuffers();
        java.lang.String str14 = textBuffer8.contentsAsString();
        int int15 = textBuffer8.size();
        textBuffer8.ensureNotShared();
        boolean boolean17 = textBuffer8.hasTextAsCharacters();
        textBuffer8.setCurrentLength((-1));
        java.lang.String str20 = textBuffer8.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        char[] charArray23 = textBuffer22.emptyAndGetCurrentSegment();
        java.lang.String str24 = textBuffer22.contentsAsString();
        int int25 = textBuffer22.getCurrentSegmentSize();
        textBuffer22.ensureNotShared();
        textBuffer22.releaseBuffers();
        char[] charArray29 = textBuffer22.expandCurrentSegment(0);
        textBuffer8.resetWithCopy(charArray29, (int) '#', (int) 'a');
        char[] charArray33 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray33, (int) (byte) 1, 10);
        int int37 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str38 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str38, "\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
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
        textBuffer1.append('4');
        char[] charArray43 = textBuffer1.getTextBuffer();
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
        org.junit.Assert.assertNotNull(charArray43);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str5 = textBuffer1.setCurrentAndReturn((int) (byte) 10);
        char[] charArray7 = textBuffer1.expandCurrentSegment(1000);
        int int8 = textBuffer1.size();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithEmpty();
        char[] charArray12 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str5, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        boolean boolean31 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        char[] charArray13 = textBuffer11.getTextBuffer();
        java.lang.String str14 = textBuffer11.contentsAsString();
        int int15 = textBuffer11.getTextOffset();
        char[] charArray16 = textBuffer11.emptyAndGetCurrentSegment();
        textBuffer11.setCurrentLength((int) (short) 10);
        java.lang.String str19 = textBuffer11.contentsAsString();
        textBuffer11.ensureNotShared();
        java.lang.String str21 = textBuffer11.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        boolean boolean24 = textBuffer23.hasTextAsCharacters();
        int int25 = textBuffer23.size();
        textBuffer23.resetWithEmpty();
        textBuffer23.resetWithEmpty();
        boolean boolean28 = textBuffer23.hasTextAsCharacters();
        boolean boolean29 = textBuffer23.hasTextAsCharacters();
        int int30 = textBuffer23.size();
        char[] charArray31 = textBuffer23.emptyAndGetCurrentSegment();
        textBuffer11.resetWithShared(charArray31, 100, (int) (byte) 1);
        textBuffer1.resetWithCopy(charArray31, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str19, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str21, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray31);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        textBuffer1.setCurrentLength((int) (short) 1);
        boolean boolean12 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        char[] charArray15 = textBuffer14.emptyAndGetCurrentSegment();
        java.lang.String str16 = textBuffer14.toString();
        textBuffer14.setCurrentLength(52);
        textBuffer14.releaseBuffers();
        char[] charArray21 = textBuffer14.expandCurrentSegment((int) (short) 10);
        textBuffer1.append(charArray21, 10, 33);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        int int32 = textBuffer1.getTextOffset();
        char[] charArray33 = textBuffer1.contentsAsArray();
        java.lang.String str34 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str34, "\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        boolean boolean50 = textBuffer49.hasTextAsCharacters();
        int int51 = textBuffer49.size();
        textBuffer49.resetWithEmpty();
        char[] charArray53 = textBuffer49.getCurrentSegment();
        textBuffer49.resetWithString("");
        char[] charArray56 = textBuffer49.getCurrentSegment();
        java.lang.String str57 = textBuffer49.contentsAsString();
        int int58 = textBuffer49.getTextOffset();
        char[] charArray59 = textBuffer49.getTextBuffer();
        textBuffer1.resetWithShared(charArray59, 0, 0);
        char[] charArray63 = textBuffer1.getTextBuffer();
        char[] charArray65 = textBuffer1.expandCurrentSegment(100);
        textBuffer1.resetWithEmpty();
        boolean boolean67 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler68 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer69 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler68);
        char[] charArray70 = textBuffer69.emptyAndGetCurrentSegment();
        java.lang.String str71 = textBuffer69.toString();
        textBuffer69.setCurrentLength(52);
        textBuffer69.releaseBuffers();
        char[] charArray75 = textBuffer69.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler76 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer77 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler76);
        boolean boolean78 = textBuffer77.hasTextAsCharacters();
        int int79 = textBuffer77.size();
        textBuffer77.resetWithString("hi!");
        java.lang.String str82 = textBuffer77.contentsAsString();
        char[] charArray83 = textBuffer77.emptyAndGetCurrentSegment();
        char[] charArray85 = textBuffer77.expandCurrentSegment((int) '#');
        textBuffer69.append(charArray85, 87, 52);
        textBuffer1.append(charArray85, 3, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal92 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"???????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] {});
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertNotNull(charArray85);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.append('#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
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
        char[] charArray19 = textBuffer1.getTextBuffer();
        char[] charArray20 = textBuffer1.getCurrentSegment();
        int int21 = textBuffer1.getCurrentSegmentSize();
        char[] charArray22 = textBuffer1.getCurrentSegment();
        char[] charArray23 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        char[] charArray26 = textBuffer25.emptyAndGetCurrentSegment();
        java.lang.String str27 = textBuffer25.toString();
        int int28 = textBuffer25.size();
        textBuffer25.ensureNotShared();
        char[] charArray30 = textBuffer25.getTextBuffer();
        textBuffer1.resetWithShared(charArray30, (int) '#', 52);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 87 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        char[] charArray20 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        boolean boolean23 = textBuffer22.hasTextAsCharacters();
        int int24 = textBuffer22.size();
        textBuffer22.resetWithEmpty();
        textBuffer22.resetWithEmpty();
        boolean boolean27 = textBuffer22.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        boolean boolean30 = textBuffer29.hasTextAsCharacters();
        char[] charArray31 = textBuffer29.getCurrentSegment();
        textBuffer22.resetWithShared(charArray31, (int) '4', (int) (short) 100);
        java.lang.String str35 = textBuffer22.toString();
        textBuffer22.ensureNotShared();
        char[] charArray38 = textBuffer22.expandCurrentSegment((int) (short) 0);
        int int39 = textBuffer22.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        boolean boolean42 = textBuffer41.hasTextAsCharacters();
        int int43 = textBuffer41.size();
        textBuffer41.resetWithEmpty();
        char[] charArray45 = textBuffer41.getCurrentSegment();
        textBuffer41.resetWithString("");
        char[] charArray48 = textBuffer41.getCurrentSegment();
        java.lang.String str49 = textBuffer41.contentsAsString();
        textBuffer41.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray53 = textBuffer41.expandCurrentSegment((int) '#');
        textBuffer41.setCurrentLength(0);
        int int56 = textBuffer41.getCurrentSegmentSize();
        char[] charArray57 = textBuffer41.getCurrentSegment();
        textBuffer22.resetWithShared(charArray57, 262144, (int) '#');
        textBuffer1.resetWithCopy(charArray57, (int) (short) 1, (int) (short) 100);
        boolean boolean64 = textBuffer1.hasTextAsCharacters();
        char[] charArray66 = textBuffer1.expandCurrentSegment(100);
        char[] charArray67 = textBuffer1.getTextBuffer();
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str35, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertNotNull(charArray67);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        int int8 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str9 = textBuffer1.contentsAsString();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        boolean boolean14 = textBuffer13.hasTextAsCharacters();
        int int15 = textBuffer13.size();
        textBuffer13.resetWithEmpty();
        textBuffer13.resetWithEmpty();
        boolean boolean18 = textBuffer13.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        boolean boolean21 = textBuffer20.hasTextAsCharacters();
        char[] charArray22 = textBuffer20.getCurrentSegment();
        textBuffer13.resetWithShared(charArray22, (int) '4', (int) (short) 100);
        java.lang.String str26 = textBuffer13.toString();
        char[] charArray27 = textBuffer13.getTextBuffer();
        boolean boolean28 = textBuffer13.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        char[] charArray31 = textBuffer30.emptyAndGetCurrentSegment();
        java.lang.String str32 = textBuffer30.toString();
        textBuffer30.setCurrentLength(52);
        textBuffer30.releaseBuffers();
        char[] charArray36 = textBuffer30.getCurrentSegment();
        char[] charArray37 = textBuffer30.contentsAsArray();
        textBuffer30.ensureNotShared();
        int int39 = textBuffer30.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        textBuffer41.setCurrentLength((int) (short) 0);
        int int44 = textBuffer41.getCurrentSegmentSize();
        textBuffer41.resetWithString("");
        boolean boolean47 = textBuffer41.hasTextAsCharacters();
        textBuffer41.setCurrentLength((int) (byte) 100);
        char[] charArray50 = textBuffer41.emptyAndGetCurrentSegment();
        char[] charArray51 = textBuffer41.emptyAndGetCurrentSegment();
        textBuffer30.resetWithShared(charArray51, 1000, 100);
        textBuffer13.append(charArray51, (int) ' ', (int) (short) 1);
        textBuffer1.resetWithCopy(charArray51, 3, 0);
        char[] charArray61 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str26, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertNotNull(charArray61);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
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
        int int14 = textBuffer1.getCurrentSegmentSize();
        char[] charArray15 = textBuffer1.getTextBuffer();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4' });
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray4 = textBuffer1.getTextBuffer();
        java.lang.String str5 = textBuffer1.contentsAsString();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        int int8 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        int int8 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.append(' ');
        int int11 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str12 = textBuffer1.contentsAsString();
        char[] charArray13 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4 " + "'", str12, "4 ");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ' });
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        char[] charArray13 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, 100, (int) (short) 1);
        boolean boolean17 = textBuffer1.hasTextAsCharacters();
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray20 = textBuffer1.expandCurrentSegment((int) ' ');
        int int21 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        boolean boolean14 = textBuffer13.hasTextAsCharacters();
        int int15 = textBuffer13.size();
        textBuffer13.resetWithEmpty();
        char[] charArray17 = textBuffer13.getCurrentSegment();
        textBuffer9.resetWithShared(charArray17, (int) (short) 1, (int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        textBuffer22.setCurrentLength((int) (short) 0);
        int int25 = textBuffer22.getCurrentSegmentSize();
        textBuffer22.resetWithString("");
        boolean boolean28 = textBuffer22.hasTextAsCharacters();
        textBuffer22.setCurrentLength((int) (byte) 100);
        char[] charArray31 = textBuffer22.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        boolean boolean34 = textBuffer33.hasTextAsCharacters();
        int int35 = textBuffer33.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        boolean boolean38 = textBuffer37.hasTextAsCharacters();
        int int39 = textBuffer37.size();
        textBuffer37.resetWithEmpty();
        char[] charArray41 = textBuffer37.getCurrentSegment();
        textBuffer33.resetWithShared(charArray41, (int) (short) 1, (int) '4');
        textBuffer22.resetWithShared(charArray41, 262144, (int) (byte) 1);
        char[] charArray49 = textBuffer22.expandCurrentSegment(10);
        textBuffer9.append(charArray49, 3, (int) (byte) 100);
        textBuffer1.resetWithCopy(charArray49, (int) (byte) 0, (int) (byte) 10);
        textBuffer1.resetWithString("a");
        char[] charArray58 = textBuffer1.getCurrentSegment();
        char[] charArray60 = textBuffer1.expandCurrentSegment(149);
        textBuffer1.resetWithEmpty();
        java.lang.String str62 = textBuffer1.contentsAsString();
        char[] charArray63 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] {});
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        java.lang.String str11 = textBuffer1.setCurrentAndReturn(97);
        textBuffer1.resetWithString("4");
        textBuffer1.setCurrentLength((int) (short) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str11, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        textBuffer1.setCurrentLength(1000);
        char[] charArray11 = textBuffer1.expandCurrentSegment(2);
        java.lang.String str12 = textBuffer1.contentsAsString();
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        boolean boolean50 = textBuffer49.hasTextAsCharacters();
        int int51 = textBuffer49.size();
        textBuffer49.resetWithEmpty();
        char[] charArray53 = textBuffer49.getCurrentSegment();
        textBuffer49.resetWithString("");
        char[] charArray56 = textBuffer49.getCurrentSegment();
        java.lang.String str57 = textBuffer49.contentsAsString();
        int int58 = textBuffer49.getTextOffset();
        char[] charArray59 = textBuffer49.getTextBuffer();
        textBuffer1.resetWithShared(charArray59, 0, 0);
        char[] charArray63 = textBuffer1.getTextBuffer();
        char[] charArray65 = textBuffer1.expandCurrentSegment(100);
        int int66 = textBuffer1.getCurrentSegmentSize();
        char[] charArray67 = textBuffer1.contentsAsArray();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] {});
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] {});
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
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
        textBuffer1.append('4');
        double double43 = textBuffer1.contentsAsDouble();
        char[] charArray44 = textBuffer1.getCurrentSegment();
        char[] charArray45 = textBuffer1.emptyAndGetCurrentSegment();
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
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.0d + "'", double43 == 4.0d);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray45);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        boolean boolean22 = textBuffer21.hasTextAsCharacters();
        int int23 = textBuffer21.size();
        textBuffer21.resetWithEmpty();
        char[] charArray25 = textBuffer21.getCurrentSegment();
        textBuffer21.resetWithString("");
        char[] charArray28 = textBuffer21.getCurrentSegment();
        java.lang.String str29 = textBuffer21.contentsAsString();
        int int30 = textBuffer21.getTextOffset();
        char[] charArray31 = textBuffer21.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        boolean boolean34 = textBuffer33.hasTextAsCharacters();
        int int35 = textBuffer33.size();
        textBuffer33.resetWithEmpty();
        char[] charArray37 = textBuffer33.getCurrentSegment();
        textBuffer33.resetWithString("");
        int int40 = textBuffer33.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        int int43 = textBuffer42.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        boolean boolean46 = textBuffer45.hasTextAsCharacters();
        int int47 = textBuffer45.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        boolean boolean50 = textBuffer49.hasTextAsCharacters();
        int int51 = textBuffer49.size();
        textBuffer49.resetWithEmpty();
        char[] charArray53 = textBuffer49.getCurrentSegment();
        textBuffer45.resetWithShared(charArray53, (int) (short) 1, (int) '4');
        textBuffer42.resetWithShared(charArray53, (int) ' ', (int) (short) 0);
        textBuffer33.resetWithCopy(charArray53, (int) (short) 1, (int) (byte) 10);
        textBuffer21.resetWithCopy(charArray53, 0, (int) (byte) 1);
        textBuffer1.resetWithShared(charArray53, (int) (short) -1, (int) (short) -1);
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler70 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer71 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler70);
        boolean boolean72 = textBuffer71.hasTextAsCharacters();
        textBuffer71.resetWithEmpty();
        char[] charArray74 = textBuffer71.contentsAsArray();
        char[] charArray75 = textBuffer71.contentsAsArray();
        int int76 = textBuffer71.size();
        char[] charArray77 = textBuffer71.contentsAsArray();
        char[] charArray78 = textBuffer71.getCurrentSegment();
        char[] charArray80 = textBuffer71.expandCurrentSegment((int) (byte) -1);
        textBuffer71.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray83 = textBuffer71.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler84 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer85 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler84);
        boolean boolean86 = textBuffer85.hasTextAsCharacters();
        textBuffer85.resetWithEmpty();
        char[] charArray88 = textBuffer85.contentsAsArray();
        char[] charArray89 = textBuffer85.contentsAsArray();
        textBuffer85.releaseBuffers();
        textBuffer85.ensureNotShared();
        char[] charArray92 = textBuffer85.getCurrentSegment();
        textBuffer71.resetWithCopy(charArray92, 87, 152);
        char[] charArray96 = textBuffer71.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray96, 1000, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] {});
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] {});
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] {});
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertArrayEquals(charArray88, new char[] {});
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertArrayEquals(charArray89, new char[] {});
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertNotNull(charArray96);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        java.lang.String str19 = textBuffer1.setCurrentAndReturn((int) 'a');
        char[] charArray20 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str19, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithString("hi!");
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.contentsAsArray();
        int int9 = textBuffer1.size();
        char[] charArray10 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn((int) '4');
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        int int10 = textBuffer1.size();
        java.lang.String str11 = textBuffer1.contentsAsString();
        java.lang.String str13 = textBuffer1.setCurrentAndReturn((int) '#');
        textBuffer1.append('#');
        int int16 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str7, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str11, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str13, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36 + "'", int16 == 36);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(3);
        textBuffer1.resetWithEmpty();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        boolean boolean13 = textBuffer12.hasTextAsCharacters();
        int int14 = textBuffer12.size();
        textBuffer12.resetWithEmpty();
        textBuffer12.resetWithEmpty();
        boolean boolean17 = textBuffer12.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        boolean boolean20 = textBuffer19.hasTextAsCharacters();
        char[] charArray21 = textBuffer19.getCurrentSegment();
        textBuffer12.resetWithShared(charArray21, (int) '4', (int) (short) 100);
        textBuffer12.resetWithEmpty();
        char[] charArray26 = textBuffer12.getCurrentSegment();
        char[] charArray27 = textBuffer12.getCurrentSegment();
        char[] charArray28 = textBuffer12.getTextBuffer();
        textBuffer12.append('a');
        char[] charArray32 = textBuffer12.expandCurrentSegment(1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray32, 262144, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262179 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000\000" + "'", str7, "\000\000\000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray32);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
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
        char[] charArray25 = textBuffer1.expandCurrentSegment((int) 'a');
        boolean boolean26 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray8 = textBuffer1.getTextBuffer();
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getTextBuffer();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        int int12 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.emptyAndGetCurrentSegment();
        int int15 = textBuffer13.getTextOffset();
        textBuffer13.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray18 = textBuffer13.getCurrentSegment();
        textBuffer13.append('4');
        java.lang.String str22 = textBuffer13.setCurrentAndReturn((int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        boolean boolean25 = textBuffer24.hasTextAsCharacters();
        char[] charArray26 = textBuffer24.getTextBuffer();
        java.lang.String str27 = textBuffer24.contentsAsString();
        boolean boolean28 = textBuffer24.hasTextAsCharacters();
        int int29 = textBuffer24.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        int int32 = textBuffer31.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        boolean boolean35 = textBuffer34.hasTextAsCharacters();
        int int36 = textBuffer34.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler37 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer38 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler37);
        boolean boolean39 = textBuffer38.hasTextAsCharacters();
        int int40 = textBuffer38.size();
        textBuffer38.resetWithEmpty();
        char[] charArray42 = textBuffer38.getCurrentSegment();
        textBuffer34.resetWithShared(charArray42, (int) (short) 1, (int) '4');
        textBuffer31.resetWithShared(charArray42, (int) ' ', (int) (short) 0);
        textBuffer24.resetWithShared(charArray42, (int) (byte) 1, (int) '4');
        textBuffer13.append(charArray42, (int) '4', (int) '#');
        textBuffer1.append(charArray42, 52, (int) '#');
        textBuffer1.ensureNotShared();
        char[] charArray59 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4\000\000\000\000\000\000\000\000\000" + "'", str22, "4\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray59);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("");
        char[] charArray7 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        boolean boolean10 = textBuffer9.hasTextAsCharacters();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        char[] charArray13 = textBuffer9.getCurrentSegment();
        textBuffer9.ensureNotShared();
        java.lang.String str16 = textBuffer9.setCurrentAndReturn((int) (byte) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer18.setCurrentLength((int) '4');
        char[] charArray22 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer9.resetWithCopy(charArray22, (int) (byte) 100, 100);
        char[] charArray26 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithShared(charArray26, 100, 149);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        java.lang.String str4 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        boolean boolean9 = textBuffer8.hasTextAsCharacters();
        textBuffer8.resetWithEmpty();
        int int11 = textBuffer8.getCurrentSegmentSize();
        int int12 = textBuffer8.getCurrentSegmentSize();
        char[] charArray13 = textBuffer8.emptyAndGetCurrentSegment();
        char[] charArray14 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray14, 0, (int) 'a');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
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
        textBuffer1.resetWithEmpty();
        char[] charArray12 = textBuffer1.getTextBuffer();
        int int13 = textBuffer1.size();
        java.lang.String str15 = textBuffer1.setCurrentAndReturn(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str15, "\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
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
        int int15 = textBuffer1.getCurrentSegmentSize();
        char[] charArray16 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        int int19 = textBuffer18.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        boolean boolean22 = textBuffer21.hasTextAsCharacters();
        int int23 = textBuffer21.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        boolean boolean26 = textBuffer25.hasTextAsCharacters();
        int int27 = textBuffer25.size();
        textBuffer25.resetWithEmpty();
        char[] charArray29 = textBuffer25.getCurrentSegment();
        textBuffer21.resetWithShared(charArray29, (int) (short) 1, (int) '4');
        textBuffer18.resetWithShared(charArray29, (int) ' ', (int) (short) 0);
        int int36 = textBuffer18.size();
        char[] charArray37 = textBuffer18.emptyAndGetCurrentSegment();
        int int38 = textBuffer18.getTextOffset();
        int int39 = textBuffer18.getTextOffset();
        java.lang.String str40 = textBuffer18.contentsAsString();
        textBuffer18.setCurrentLength((int) (byte) 1);
        char[] charArray43 = textBuffer18.getTextBuffer();
        textBuffer1.resetWithShared(charArray43, 52, 53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] {});
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str7 = textBuffer1.setCurrentAndReturn(0);
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        char[] charArray12 = textBuffer10.getTextBuffer();
        java.lang.String str13 = textBuffer10.contentsAsString();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        java.lang.String str15 = textBuffer10.contentsAsString();
        char[] charArray16 = textBuffer10.getTextBuffer();
        char[] charArray17 = textBuffer10.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray17, (int) (byte) 100, (int) (byte) 1);
        java.lang.String str21 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000" + "'", str21, "\000");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) 'a');
        textBuffer1.setCurrentLength((-1));
        char[] charArray12 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        boolean boolean15 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append('#');
        textBuffer1.append('#');
        java.lang.String str16 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "##" + "'", str16, "##");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
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
        double double12 = textBuffer1.contentsAsDouble();
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        double double15 = textBuffer1.contentsAsDouble();
        int int16 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getTextOffset();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
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
        textBuffer1.resetWithEmpty();
        int int22 = textBuffer1.getCurrentSegmentSize();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        java.lang.String str8 = textBuffer1.setCurrentAndReturn((int) (byte) 0);
        int int9 = textBuffer1.getTextOffset();
        textBuffer1.append(" \000\000\000\000\000\000\000\000\000", 0, 0);
        int int14 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        int int9 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
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
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        boolean boolean50 = textBuffer49.hasTextAsCharacters();
        int int51 = textBuffer49.size();
        textBuffer49.resetWithEmpty();
        char[] charArray53 = textBuffer49.getCurrentSegment();
        textBuffer49.resetWithString("");
        char[] charArray56 = textBuffer49.getCurrentSegment();
        java.lang.String str57 = textBuffer49.contentsAsString();
        int int58 = textBuffer49.getTextOffset();
        char[] charArray59 = textBuffer49.getTextBuffer();
        textBuffer1.resetWithShared(charArray59, 0, 0);
        char[] charArray63 = textBuffer1.getTextBuffer();
        char[] charArray65 = textBuffer1.expandCurrentSegment(100);
        textBuffer1.resetWithEmpty();
        boolean boolean67 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler68 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer69 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler68);
        char[] charArray70 = textBuffer69.emptyAndGetCurrentSegment();
        java.lang.String str71 = textBuffer69.toString();
        textBuffer69.setCurrentLength(52);
        textBuffer69.releaseBuffers();
        char[] charArray75 = textBuffer69.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler76 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer77 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler76);
        boolean boolean78 = textBuffer77.hasTextAsCharacters();
        int int79 = textBuffer77.size();
        textBuffer77.resetWithString("hi!");
        java.lang.String str82 = textBuffer77.contentsAsString();
        char[] charArray83 = textBuffer77.emptyAndGetCurrentSegment();
        char[] charArray85 = textBuffer77.expandCurrentSegment((int) '#');
        textBuffer69.append(charArray85, 87, 52);
        textBuffer1.append(charArray85, 3, (int) '#');
        textBuffer1.ensureNotShared();
        textBuffer1.append('4');
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] {});
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertNotNull(charArray85);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        java.lang.String str7 = textBuffer1.contentsAsString();
        int int8 = textBuffer1.size();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        char[] charArray11 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        boolean boolean14 = textBuffer13.hasTextAsCharacters();
        char[] charArray15 = textBuffer13.getTextBuffer();
        java.lang.String str16 = textBuffer13.contentsAsString();
        boolean boolean17 = textBuffer13.hasTextAsCharacters();
        textBuffer13.append('4');
        char[] charArray20 = textBuffer13.contentsAsArray();
        char[] charArray21 = textBuffer13.contentsAsArray();
        int int22 = textBuffer13.getTextOffset();
        java.lang.String str24 = textBuffer13.setCurrentAndReturn((int) 'a');
        java.lang.String str25 = textBuffer13.contentsAsString();
        java.math.BigDecimal bigDecimal26 = textBuffer13.contentsAsDecimal();
        char[] charArray28 = textBuffer13.expandCurrentSegment(32);
        textBuffer1.resetWithCopy(charArray28, 152, (int) (short) 10);
        textBuffer1.append(' ');
        int int34 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str24, "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str25, "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 11 + "'", int34 == 11);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.setCurrentAndReturn(10);
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray12 = textBuffer1.expandCurrentSegment((int) (byte) 0);
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass14 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.getTextOffset();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        char[] charArray12 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        boolean boolean11 = textBuffer10.hasTextAsCharacters();
        char[] charArray12 = textBuffer10.getTextBuffer();
        java.lang.String str13 = textBuffer10.contentsAsString();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        textBuffer10.append('4');
        char[] charArray17 = textBuffer10.contentsAsArray();
        char[] charArray18 = textBuffer10.contentsAsArray();
        char[] charArray19 = textBuffer10.getTextBuffer();
        textBuffer1.resetWithShared(charArray19, (int) (byte) -1, (int) 'a');
        int int23 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
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
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        char[] charArray20 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        textBuffer1.append(' ');
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str3 = textBuffer1.toString();
        textBuffer1.setCurrentLength(52);
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        char[] charArray8 = textBuffer1.contentsAsArray();
        int int9 = textBuffer1.getTextOffset();
        java.lang.String str10 = textBuffer1.toString();
        char[] charArray11 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        java.lang.String str13 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 152, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 152, end 188, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 10);
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.ensureNotShared();
        int int11 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str9, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
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
        int int14 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = textBuffer1.expandCurrentSegment(10);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
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
        char[] charArray16 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.setCurrentLength((int) (short) 0);
        int int21 = textBuffer18.getCurrentSegmentSize();
        textBuffer18.resetWithString("");
        boolean boolean24 = textBuffer18.hasTextAsCharacters();
        textBuffer18.setCurrentLength((int) (byte) 100);
        textBuffer18.ensureNotShared();
        textBuffer18.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        textBuffer30.setCurrentLength((int) (short) 0);
        char[] charArray33 = textBuffer30.getTextBuffer();
        java.lang.String str34 = textBuffer30.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        boolean boolean37 = textBuffer36.hasTextAsCharacters();
        int int38 = textBuffer36.size();
        textBuffer36.resetWithEmpty();
        char[] charArray40 = textBuffer36.getCurrentSegment();
        textBuffer36.resetWithString("");
        int int43 = textBuffer36.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        int int46 = textBuffer45.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler47 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer48 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler47);
        boolean boolean49 = textBuffer48.hasTextAsCharacters();
        int int50 = textBuffer48.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        boolean boolean53 = textBuffer52.hasTextAsCharacters();
        int int54 = textBuffer52.size();
        textBuffer52.resetWithEmpty();
        char[] charArray56 = textBuffer52.getCurrentSegment();
        textBuffer48.resetWithShared(charArray56, (int) (short) 1, (int) '4');
        textBuffer45.resetWithShared(charArray56, (int) ' ', (int) (short) 0);
        textBuffer36.resetWithCopy(charArray56, (int) (short) 1, (int) (byte) 10);
        textBuffer30.resetWithShared(charArray56, 1, 1000);
        textBuffer18.resetWithShared(charArray56, 100, 262144);
        textBuffer1.resetWithCopy(charArray56, (int) (byte) 10, 10);
        java.lang.String str75 = textBuffer1.contentsAsString();
        char[] charArray76 = textBuffer1.getTextBuffer();
        textBuffer1.append(' ');
        char[] charArray80 = textBuffer1.expandCurrentSegment(100);
        char[] charArray81 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str75, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertNotNull(charArray81);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        int int16 = textBuffer15.getTextOffset();
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
        textBuffer15.resetWithShared(charArray26, (int) ' ', (int) (short) 0);
        char[] charArray33 = textBuffer15.getTextBuffer();
        char[] charArray34 = textBuffer15.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray34, 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(charArray34);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.emptyAndGetCurrentSegment();
        java.lang.String str15 = textBuffer13.toString();
        int int16 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        boolean boolean19 = textBuffer18.hasTextAsCharacters();
        char[] charArray20 = textBuffer18.getTextBuffer();
        java.lang.String str21 = textBuffer18.contentsAsString();
        boolean boolean22 = textBuffer18.hasTextAsCharacters();
        textBuffer18.append('4');
        char[] charArray25 = textBuffer18.contentsAsArray();
        char[] charArray26 = textBuffer18.contentsAsArray();
        textBuffer13.resetWithCopy(charArray26, (int) (byte) 1, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        char[] charArray32 = textBuffer31.emptyAndGetCurrentSegment();
        java.lang.String str33 = textBuffer31.toString();
        int int34 = textBuffer31.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        boolean boolean37 = textBuffer36.hasTextAsCharacters();
        char[] charArray38 = textBuffer36.getTextBuffer();
        java.lang.String str39 = textBuffer36.contentsAsString();
        boolean boolean40 = textBuffer36.hasTextAsCharacters();
        textBuffer36.append('4');
        char[] charArray43 = textBuffer36.contentsAsArray();
        char[] charArray44 = textBuffer36.contentsAsArray();
        textBuffer31.resetWithCopy(charArray44, (int) (byte) 1, 0);
        char[] charArray48 = textBuffer31.emptyAndGetCurrentSegment();
        textBuffer13.resetWithShared(charArray48, (int) 'a', 1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler52 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer53 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler52);
        boolean boolean54 = textBuffer53.hasTextAsCharacters();
        int int55 = textBuffer53.size();
        textBuffer53.resetWithString("hi!");
        java.lang.String str58 = textBuffer53.contentsAsString();
        java.lang.String str59 = textBuffer53.toString();
        char[] charArray60 = textBuffer53.getCurrentSegment();
        textBuffer13.resetWithCopy(charArray60, 0, (int) ' ');
        char[] charArray65 = textBuffer13.expandCurrentSegment(0);
        textBuffer1.resetWithShared(charArray65, (int) (byte) 100, (int) (short) 10);
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 262144, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 262144, end 262231, length 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(charArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertNotNull(charArray65);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        char[] charArray4 = textBuffer1.contentsAsArray();
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray10 = textBuffer1.expandCurrentSegment(0);
        java.lang.String str11 = textBuffer1.toString();
        int int12 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        char[] charArray10 = textBuffer1.getTextBuffer();
        java.lang.String str11 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength((int) (short) 0);
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("a\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
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
        java.lang.String str12 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.emptyAndGetCurrentSegment();
        int int19 = textBuffer17.getTextOffset();
        char[] charArray20 = textBuffer17.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        boolean boolean23 = textBuffer22.hasTextAsCharacters();
        textBuffer22.resetWithEmpty();
        char[] charArray25 = textBuffer22.contentsAsArray();
        char[] charArray26 = textBuffer22.contentsAsArray();
        int int27 = textBuffer22.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        boolean boolean30 = textBuffer29.hasTextAsCharacters();
        char[] charArray31 = textBuffer29.getTextBuffer();
        java.lang.String str32 = textBuffer29.contentsAsString();
        boolean boolean33 = textBuffer29.hasTextAsCharacters();
        textBuffer29.append('4');
        char[] charArray36 = textBuffer29.contentsAsArray();
        char[] charArray37 = textBuffer29.contentsAsArray();
        char[] charArray38 = textBuffer29.getTextBuffer();
        char[] charArray39 = textBuffer29.contentsAsArray();
        textBuffer22.resetWithShared(charArray39, (int) '4', (int) '#');
        textBuffer17.resetWithShared(charArray39, 52, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray39, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str12, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(charArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4' });
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.emptyAndGetCurrentSegment();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('4');
        int int9 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        boolean boolean12 = textBuffer11.hasTextAsCharacters();
        char[] charArray13 = textBuffer11.getTextBuffer();
        java.lang.String str14 = textBuffer11.contentsAsString();
        boolean boolean15 = textBuffer11.hasTextAsCharacters();
        textBuffer11.append('4');
        char[] charArray18 = textBuffer11.contentsAsArray();
        textBuffer11.resetWithEmpty();
        textBuffer11.setCurrentLength(32);
        char[] charArray22 = textBuffer11.getCurrentSegment();
        char[] charArray23 = textBuffer11.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray23, (int) '#', 10);
        int int27 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        boolean boolean2 = textBuffer1.hasTextAsCharacters();
        char[] charArray3 = textBuffer1.getTextBuffer();
        java.lang.String str4 = textBuffer1.contentsAsString();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.contentsAsArray();
        char[] charArray10 = textBuffer1.contentsAsArray();
        java.lang.String str11 = textBuffer1.toString();
        java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertNotNull(bigDecimal12);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
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
        textBuffer1.setCurrentLength(1);
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.setCurrentLength(87);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        java.lang.Class<?> wildcardClass14 = charArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

