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
        char[] charArray2 = textBuffer1.contentsAsArray();
        textBuffer1.append('a');
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.append(' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        int int7 = textBuffer1.getTextOffset();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        textBuffer1.append('#');
        int int12 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        java.lang.String str4 = textBuffer1.contentsAsString();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        boolean boolean13 = textBuffer10.hasTextAsCharacters();
        int int14 = textBuffer10.getTextOffset();
        char[] charArray15 = textBuffer10.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        textBuffer17.releaseBuffers();
        char[] charArray19 = textBuffer17.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray19, 97, 100);
        textBuffer1.resetWithShared(charArray19, 100, 0);
        java.lang.String str26 = textBuffer1.contentsAsString();
        char[] charArray28 = textBuffer1.expandCurrentSegment(32);
        java.lang.Class<?> wildcardClass29 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        int int12 = textBuffer1.size();
        char[] charArray13 = textBuffer1.contentsAsArray();
        int int14 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        int int7 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str10 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getCurrentSegment();
        textBuffer12.resetWithString("hi!");
        java.lang.String str16 = textBuffer12.toString();
        char[] charArray18 = textBuffer12.expandCurrentSegment((int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.releaseBuffers();
        textBuffer20.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        textBuffer25.setCurrentLength(1);
        char[] charArray28 = textBuffer25.getCurrentSegment();
        char[] charArray29 = textBuffer25.contentsAsArray();
        char[] charArray30 = textBuffer25.getTextBuffer();
        textBuffer20.resetWithShared(charArray30, 100, (int) (byte) 0);
        textBuffer12.resetWithShared(charArray30, 262144, (int) (byte) 10);
        char[] charArray37 = textBuffer12.getTextBuffer();
        textBuffer1.resetWithShared(charArray37, (int) (short) 100, 102);
        boolean boolean41 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (byte) 0);
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000 ", 0, 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        char[] charArray16 = textBuffer15.getCurrentSegment();
        char[] charArray17 = textBuffer15.getCurrentSegment();
        java.lang.String str18 = textBuffer15.toString();
        textBuffer15.resetWithString("hi!");
        textBuffer15.releaseBuffers();
        char[] charArray22 = textBuffer15.getTextBuffer();
        char[] charArray24 = textBuffer15.expandCurrentSegment(1000);
        textBuffer1.resetWithCopy(charArray24, 10, 0);
        char[] charArray28 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        int int13 = textBuffer1.size();
        char[] charArray15 = textBuffer1.expandCurrentSegment((int) 'a');
        char[] charArray16 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a#", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 99, length 2");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { 'a' });
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        int int7 = textBuffer1.size();
        int int8 = textBuffer1.getTextOffset();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.getCurrentSegment();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        java.lang.String str14 = textBuffer11.toString();
        textBuffer11.resetWithEmpty();
        char[] charArray16 = textBuffer11.getTextBuffer();
        textBuffer11.resetWithEmpty();
        char[] charArray18 = textBuffer11.getCurrentSegment();
        textBuffer1.append(charArray18, (int) (byte) 0, 3);
        char[] charArray22 = textBuffer1.getTextBuffer();
        java.lang.String str23 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\000\000" + "'", str23, "\000\000\000");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        char[] charArray9 = textBuffer8.getCurrentSegment();
        char[] charArray10 = textBuffer8.getCurrentSegment();
        java.lang.String str11 = textBuffer8.toString();
        textBuffer8.resetWithString("hi!");
        int int14 = textBuffer8.size();
        int int15 = textBuffer8.getTextOffset();
        char[] charArray16 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray16, 2, (int) (byte) 1);
        char[] charArray20 = textBuffer1.getCurrentSegment();
        char[] charArray21 = textBuffer1.getTextBuffer();
        char[] charArray23 = textBuffer1.expandCurrentSegment((int) (short) 100);
        char[] charArray24 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray25 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        textBuffer27.setCurrentLength(1);
        boolean boolean30 = textBuffer27.hasTextAsCharacters();
        int int31 = textBuffer27.getTextOffset();
        textBuffer27.resetWithString("");
        int int34 = textBuffer27.getCurrentSegmentSize();
        boolean boolean35 = textBuffer27.hasTextAsCharacters();
        char[] charArray36 = textBuffer27.getCurrentSegment();
        char[] charArray37 = textBuffer27.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        char[] charArray40 = textBuffer39.getCurrentSegment();
        char[] charArray42 = textBuffer39.expandCurrentSegment((int) (byte) 1);
        char[] charArray43 = textBuffer39.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        textBuffer45.releaseBuffers();
        char[] charArray47 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer45.resetWithShared(charArray47, (int) '#', (int) (byte) 10);
        textBuffer45.resetWithString("");
        boolean boolean53 = textBuffer45.hasTextAsCharacters();
        int int54 = textBuffer45.size();
        textBuffer45.releaseBuffers();
        int int56 = textBuffer45.getTextOffset();
        char[] charArray57 = textBuffer45.contentsAsArray();
        textBuffer39.resetWithShared(charArray57, 0, 0);
        char[] charArray62 = textBuffer39.expandCurrentSegment((int) '#');
        textBuffer27.resetWithShared(charArray62, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray62, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] {});
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] {});
        org.junit.Assert.assertNotNull(charArray62);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        int int7 = textBuffer1.getCurrentSegmentSize();
        int int8 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.releaseBuffers();
        textBuffer10.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        textBuffer15.setCurrentLength(1);
        char[] charArray18 = textBuffer15.getCurrentSegment();
        char[] charArray19 = textBuffer15.contentsAsArray();
        char[] charArray20 = textBuffer15.getTextBuffer();
        textBuffer10.resetWithShared(charArray20, 100, (int) (byte) 0);
        textBuffer10.releaseBuffers();
        int int25 = textBuffer10.getCurrentSegmentSize();
        char[] charArray26 = textBuffer10.getCurrentSegment();
        textBuffer1.append(charArray26, (int) '4', 101);
        int int30 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 100);
        int int12 = textBuffer1.getCurrentSegmentSize();
        char[] charArray13 = textBuffer1.getTextBuffer();
        char[] charArray14 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        textBuffer16.releaseBuffers();
        char[] charArray18 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer16.resetWithShared(charArray18, (int) '#', (int) (byte) 10);
        textBuffer16.resetWithString("");
        boolean boolean24 = textBuffer16.hasTextAsCharacters();
        int int25 = textBuffer16.size();
        char[] charArray26 = textBuffer16.getTextBuffer();
        textBuffer16.releaseBuffers();
        char[] charArray28 = textBuffer16.getCurrentSegment();
        char[] charArray29 = textBuffer16.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        textBuffer31.releaseBuffers();
        textBuffer31.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        textBuffer36.setCurrentLength(1);
        char[] charArray39 = textBuffer36.getCurrentSegment();
        char[] charArray40 = textBuffer36.contentsAsArray();
        char[] charArray41 = textBuffer36.getTextBuffer();
        textBuffer31.resetWithShared(charArray41, 100, (int) (byte) 0);
        textBuffer31.releaseBuffers();
        int int46 = textBuffer31.getCurrentSegmentSize();
        char[] charArray47 = textBuffer31.getCurrentSegment();
        textBuffer31.setCurrentLength(10);
        textBuffer31.resetWithString(" ");
        char[] charArray52 = textBuffer31.getCurrentSegment();
        char[] charArray54 = textBuffer31.expandCurrentSegment(0);
        textBuffer16.resetWithShared(charArray54, 2, 0);
        textBuffer1.resetWithShared(charArray54, 1001, 13);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray54);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        java.math.BigDecimal bigDecimal28 = textBuffer1.contentsAsDecimal();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        char[] charArray31 = textBuffer30.getCurrentSegment();
        char[] charArray33 = textBuffer30.expandCurrentSegment((int) (byte) 1);
        char[] charArray34 = textBuffer30.emptyAndGetCurrentSegment();
        boolean boolean35 = textBuffer30.hasTextAsCharacters();
        java.lang.String str36 = textBuffer30.toString();
        int int37 = textBuffer30.getTextOffset();
        char[] charArray38 = textBuffer30.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray38, (int) '4', (int) (byte) 1);
        char[] charArray43 = textBuffer1.expandCurrentSegment(0);
        int int44 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.getTextOffset();
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.setCurrentLength(13);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        textBuffer15.releaseBuffers();
        char[] charArray17 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer15.resetWithShared(charArray17, (int) '#', (int) (byte) 10);
        textBuffer15.resetWithString("");
        char[] charArray23 = textBuffer15.getTextBuffer();
        char[] charArray24 = textBuffer15.getCurrentSegment();
        textBuffer15.resetWithString("");
        char[] charArray27 = textBuffer15.contentsAsArray();
        java.lang.String str28 = textBuffer15.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        textBuffer30.setCurrentLength(1);
        boolean boolean33 = textBuffer30.hasTextAsCharacters();
        int int34 = textBuffer30.getTextOffset();
        char[] charArray35 = textBuffer30.emptyAndGetCurrentSegment();
        textBuffer30.setCurrentLength(262144);
        textBuffer30.setCurrentLength((int) (short) 10);
        textBuffer30.releaseBuffers();
        char[] charArray42 = textBuffer30.expandCurrentSegment(100);
        char[] charArray43 = textBuffer30.contentsAsArray();
        textBuffer15.resetWithShared(charArray43, 1, 101);
        int int47 = textBuffer15.getTextOffset();
        char[] charArray49 = textBuffer15.expandCurrentSegment(1);
        char[] charArray51 = textBuffer15.expandCurrentSegment(1000);
        textBuffer1.resetWithCopy(charArray51, 0, 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertNotNull(charArray51);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        int int8 = textBuffer1.size();
        java.lang.String str9 = textBuffer1.contentsAsString();
        java.lang.String str10 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getCurrentSegment();
        char[] charArray15 = textBuffer12.expandCurrentSegment((int) (byte) 1);
        char[] charArray16 = textBuffer12.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.setCurrentLength(1);
        char[] charArray21 = textBuffer18.getCurrentSegment();
        boolean boolean22 = textBuffer18.hasTextAsCharacters();
        char[] charArray23 = textBuffer18.getCurrentSegment();
        char[] charArray24 = textBuffer18.getCurrentSegment();
        textBuffer12.resetWithCopy(charArray24, (int) (byte) 100, 10);
        char[] charArray28 = textBuffer12.contentsAsArray();
        char[] charArray29 = textBuffer12.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        textBuffer31.setCurrentLength(1);
        boolean boolean34 = textBuffer31.hasTextAsCharacters();
        int int35 = textBuffer31.getTextOffset();
        char[] charArray36 = textBuffer31.emptyAndGetCurrentSegment();
        textBuffer31.setCurrentLength(262144);
        textBuffer31.setCurrentLength((int) (short) 10);
        textBuffer31.releaseBuffers();
        textBuffer31.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer44 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler43);
        textBuffer44.setCurrentLength(1);
        boolean boolean47 = textBuffer44.hasTextAsCharacters();
        int int48 = textBuffer44.getTextOffset();
        char[] charArray49 = textBuffer44.emptyAndGetCurrentSegment();
        textBuffer44.setCurrentLength(262144);
        textBuffer44.setCurrentLength((int) (short) 10);
        textBuffer44.releaseBuffers();
        textBuffer44.ensureNotShared();
        boolean boolean56 = textBuffer44.hasTextAsCharacters();
        char[] charArray57 = textBuffer44.getCurrentSegment();
        textBuffer31.append(charArray57, 1, 3);
        textBuffer12.append(charArray57, 0, 3);
        int int64 = textBuffer12.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler65 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer66 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler65);
        char[] charArray67 = textBuffer66.getCurrentSegment();
        char[] charArray68 = textBuffer66.getCurrentSegment();
        textBuffer66.append(' ');
        char[] charArray71 = textBuffer66.getCurrentSegment();
        textBuffer12.resetWithCopy(charArray71, 13, 3);
        textBuffer1.append(charArray71, 10, 11);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 13 + "'", int64 == 13);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertNotNull(charArray71);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        textBuffer1.resetWithEmpty();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        int int8 = textBuffer1.getTextOffset();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        java.lang.String str10 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        int int7 = textBuffer1.getTextOffset();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        int int9 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        char[] charArray21 = textBuffer20.getCurrentSegment();
        char[] charArray22 = textBuffer20.getCurrentSegment();
        java.lang.String str23 = textBuffer20.toString();
        textBuffer20.resetWithString("hi!");
        int int26 = textBuffer20.size();
        int int27 = textBuffer20.getTextOffset();
        char[] charArray28 = textBuffer20.getCurrentSegment();
        textBuffer13.resetWithShared(charArray28, 2, (int) (byte) 1);
        char[] charArray32 = textBuffer13.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray32, (int) (short) 1, 52);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray32);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        int int7 = textBuffer1.size();
        int int8 = textBuffer1.getTextOffset();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.getCurrentSegment();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        java.lang.String str14 = textBuffer11.toString();
        textBuffer11.resetWithEmpty();
        char[] charArray16 = textBuffer11.getTextBuffer();
        textBuffer11.resetWithEmpty();
        char[] charArray18 = textBuffer11.getCurrentSegment();
        textBuffer1.append(charArray18, (int) (byte) 0, 3);
        char[] charArray22 = textBuffer1.getTextBuffer();
        java.lang.String str23 = textBuffer1.toString();
        char[] charArray24 = textBuffer1.contentsAsArray();
        java.lang.String str25 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\000\000" + "'", str23, "\000\000\000");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '\000', '\000', '\000' });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\000\000" + "'", str25, "\000\000\000");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        int int7 = textBuffer1.size();
        int int8 = textBuffer1.getTextOffset();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.getCurrentSegment();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        java.lang.String str14 = textBuffer11.toString();
        textBuffer11.resetWithEmpty();
        char[] charArray16 = textBuffer11.getTextBuffer();
        textBuffer11.resetWithEmpty();
        char[] charArray18 = textBuffer11.getCurrentSegment();
        textBuffer1.append(charArray18, (int) (byte) 0, 3);
        int int22 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        char[] charArray25 = textBuffer24.getCurrentSegment();
        char[] charArray27 = textBuffer24.expandCurrentSegment((int) (byte) 1);
        textBuffer24.resetWithString("hi!");
        textBuffer24.releaseBuffers();
        char[] charArray31 = textBuffer24.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        char[] charArray34 = textBuffer33.getCurrentSegment();
        char[] charArray36 = textBuffer33.expandCurrentSegment((int) (byte) 1);
        java.lang.String str37 = textBuffer33.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        char[] charArray40 = textBuffer39.getCurrentSegment();
        char[] charArray41 = textBuffer39.getCurrentSegment();
        textBuffer33.resetWithCopy(charArray41, (int) '4', 1);
        textBuffer24.append(charArray41, (int) (short) 0, 3);
        char[] charArray48 = textBuffer24.getCurrentSegment();
        textBuffer24.resetWithString("");
        boolean boolean51 = textBuffer24.hasTextAsCharacters();
        char[] charArray52 = textBuffer24.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray52, (int) ' ', (int) ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(charArray52);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.getCurrentSegment();
        char[] charArray16 = textBuffer13.expandCurrentSegment((int) (byte) 1);
        char[] charArray17 = textBuffer13.emptyAndGetCurrentSegment();
        boolean boolean18 = textBuffer13.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.setCurrentLength(1);
        char[] charArray23 = textBuffer20.getCurrentSegment();
        char[] charArray24 = textBuffer20.contentsAsArray();
        int int25 = textBuffer20.getTextOffset();
        char[] charArray27 = textBuffer20.expandCurrentSegment((int) ' ');
        textBuffer13.append(charArray27, (int) (byte) 100, (int) '4');
        textBuffer1.resetWithShared(charArray27, (int) (byte) -1, (int) ' ');
        char[] charArray34 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double35 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray34);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        boolean boolean15 = textBuffer1.hasTextAsCharacters();
        boolean boolean16 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.append(' ');
        char[] charArray11 = textBuffer1.expandCurrentSegment(100);
        char[] charArray12 = textBuffer1.getCurrentSegment();
        int int13 = textBuffer1.size();
        java.lang.String str14 = textBuffer1.toString();
        java.lang.String str15 = textBuffer1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        java.lang.String str8 = textBuffer1.toString();
        int int9 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength(1);
        char[] charArray16 = textBuffer13.getCurrentSegment();
        boolean boolean17 = textBuffer13.hasTextAsCharacters();
        char[] charArray18 = textBuffer13.getCurrentSegment();
        textBuffer10.resetWithShared(charArray18, 1, (int) '#');
        char[] charArray22 = textBuffer10.getCurrentSegment();
        char[] charArray23 = textBuffer10.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray23, 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal27 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"?\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.toString();
        int int8 = textBuffer1.getTextOffset();
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray11 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        char[] charArray36 = textBuffer31.emptyAndGetCurrentSegment();
        textBuffer31.setCurrentLength(262144);
        textBuffer31.setCurrentLength((int) (short) 10);
        char[] charArray41 = textBuffer31.contentsAsArray();
        textBuffer1.resetWithShared(charArray41, 0, (int) (short) 100);
        char[] charArray46 = textBuffer1.expandCurrentSegment((int) (byte) -1);
        char[] charArray47 = textBuffer1.emptyAndGetCurrentSegment();
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
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray47);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        int int7 = textBuffer1.size();
        textBuffer1.setCurrentLength((int) (short) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray14, (int) '#', (int) (byte) 10);
        textBuffer12.resetWithString("");
        textBuffer12.releaseBuffers();
        char[] charArray21 = textBuffer12.contentsAsArray();
        textBuffer1.resetWithShared(charArray21, (int) (byte) 10, 101);
        char[] charArray25 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        int int27 = textBuffer1.getCurrentSegmentSize();
        char[] charArray28 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        int int13 = textBuffer1.size();
        char[] charArray15 = textBuffer1.expandCurrentSegment((int) 'a');
        boolean boolean16 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray21 = textBuffer18.expandCurrentSegment((int) (byte) 1);
        textBuffer18.resetWithString("hi!");
        textBuffer18.releaseBuffers();
        char[] charArray25 = textBuffer18.getTextBuffer();
        textBuffer1.resetWithCopy(charArray25, 1, 0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("#");
        char[] charArray32 = textBuffer1.getTextBuffer();
        java.lang.String str33 = textBuffer1.contentsAsString();
        int int34 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#" + "'", str33, "#");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        textBuffer1.setCurrentLength(0);
        int int15 = textBuffer1.size();
        boolean boolean16 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.String str18 = textBuffer1.toString();
        char[] charArray19 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        char[] charArray18 = textBuffer1.expandCurrentSegment((int) (byte) 0);
        char[] charArray19 = textBuffer1.getCurrentSegment();
        textBuffer1.append('#');
        int int22 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getTextBuffer();
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray12 = textBuffer1.contentsAsArray();
        int int13 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        char[] charArray9 = textBuffer8.getCurrentSegment();
        char[] charArray11 = textBuffer8.expandCurrentSegment((int) (byte) 1);
        textBuffer8.resetWithString("hi!");
        textBuffer8.releaseBuffers();
        char[] charArray15 = textBuffer8.getCurrentSegment();
        textBuffer1.resetWithShared(charArray15, 0, (int) (byte) 1);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('#');
        char[] charArray22 = textBuffer1.getTextBuffer();
        int int23 = textBuffer1.getTextOffset();
        int int24 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        java.lang.String str5 = textBuffer1.toString();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray9 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        int int10 = textBuffer1.getTextOffset();
        char[] charArray12 = textBuffer1.expandCurrentSegment(97);
        int int13 = textBuffer1.getCurrentSegmentSize();
        char[] charArray14 = textBuffer1.getCurrentSegment();
        java.lang.String str15 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\0004");
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
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.toString();
        textBuffer1.append(' ');
        char[] charArray13 = textBuffer1.expandCurrentSegment(11);
        char[] charArray14 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass8 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        textBuffer1.append('#');
        boolean boolean27 = textBuffer1.hasTextAsCharacters();
        char[] charArray28 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        char[] charArray16 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        int int14 = textBuffer1.getTextOffset();
        int int15 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        char[] charArray18 = textBuffer1.expandCurrentSegment((int) (byte) 0);
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength(1);
        boolean boolean24 = textBuffer21.hasTextAsCharacters();
        int int25 = textBuffer21.getCurrentSegmentSize();
        char[] charArray26 = textBuffer21.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        char[] charArray29 = textBuffer28.getCurrentSegment();
        char[] charArray31 = textBuffer28.expandCurrentSegment((int) (byte) 1);
        textBuffer28.resetWithString("hi!");
        textBuffer28.releaseBuffers();
        char[] charArray35 = textBuffer28.getCurrentSegment();
        textBuffer21.resetWithShared(charArray35, 0, (int) (byte) 1);
        int int39 = textBuffer21.size();
        int int40 = textBuffer21.getCurrentSegmentSize();
        textBuffer21.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer43 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler42);
        textBuffer43.setCurrentLength(1);
        char[] charArray46 = textBuffer43.getCurrentSegment();
        char[] charArray47 = textBuffer43.contentsAsArray();
        int int48 = textBuffer43.getTextOffset();
        int int49 = textBuffer43.getCurrentSegmentSize();
        textBuffer43.resetWithEmpty();
        java.lang.String str51 = textBuffer43.toString();
        char[] charArray52 = textBuffer43.getCurrentSegment();
        textBuffer21.resetWithShared(charArray52, (int) 'a', 97);
        textBuffer1.append(charArray52, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charArray52);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        char[] charArray28 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(12);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("a#");
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.append(' ');
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        char[] charArray29 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        boolean boolean31 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
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
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("a");
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        int int25 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        textBuffer1.resetWithEmpty();
        int int14 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        char[] charArray19 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str20 = textBuffer1.contentsAsString();
        textBuffer1.append('4');
        java.lang.String str23 = textBuffer1.toString();
        char[] charArray25 = textBuffer1.expandCurrentSegment((int) (short) 1);
        textBuffer1.append('#');
        // The following exception was thrown during execution in test generation
        try {
            double double28 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#\"");
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength(100);
        char[] charArray11 = textBuffer1.expandCurrentSegment((int) '#');
        textBuffer1.ensureNotShared();
        char[] charArray13 = textBuffer1.getCurrentSegment();
        int int14 = textBuffer1.getTextOffset();
        int int15 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        textBuffer1.resetWithString("");
        textBuffer1.ensureNotShared();
        char[] charArray28 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        int int5 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithEmpty();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength(35);
        char[] charArray12 = textBuffer1.expandCurrentSegment((int) '#');
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(10);
        textBuffer1.resetWithEmpty();
        java.lang.String str11 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString(" ");
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        java.lang.String str23 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        boolean boolean25 = textBuffer1.hasTextAsCharacters();
        char[] charArray26 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength((int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        java.lang.String str23 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        textBuffer26.releaseBuffers();
        char[] charArray28 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer26.resetWithShared(charArray28, (int) '#', (int) (byte) 10);
        textBuffer26.resetWithString("");
        boolean boolean34 = textBuffer26.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        textBuffer36.setCurrentLength(1);
        char[] charArray39 = textBuffer36.getCurrentSegment();
        boolean boolean40 = textBuffer36.hasTextAsCharacters();
        textBuffer36.append('a');
        char[] charArray43 = textBuffer36.emptyAndGetCurrentSegment();
        char[] charArray44 = textBuffer36.getCurrentSegment();
        textBuffer26.resetWithCopy(charArray44, (int) (short) 0, (int) (short) 0);
        textBuffer1.resetWithCopy(charArray44, 1, 100);
        textBuffer1.ensureNotShared();
        char[] charArray52 = textBuffer1.getTextBuffer();
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", 3, 0);
        char[] charArray57 = textBuffer1.contentsAsArray();
        int int58 = textBuffer1.size();
        char[] charArray59 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(charArray59);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        boolean boolean15 = textBuffer11.hasTextAsCharacters();
        textBuffer11.append('a');
        boolean boolean18 = textBuffer11.hasTextAsCharacters();
        char[] charArray19 = textBuffer11.getCurrentSegment();
        int int20 = textBuffer11.size();
        char[] charArray22 = textBuffer11.expandCurrentSegment(35);
        textBuffer1.resetWithCopy(charArray22, (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass26 = charArray22.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.getTextOffset();
        java.lang.String str11 = textBuffer1.toString();
        textBuffer1.setCurrentLength(13);
        textBuffer1.setCurrentLength((int) ' ');
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        java.lang.String str15 = textBuffer1.contentsAsString();
        char[] charArray16 = textBuffer1.getTextBuffer();
        int int17 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        textBuffer19.releaseBuffers();
        char[] charArray21 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer19.resetWithShared(charArray21, (int) '#', (int) (byte) 10);
        textBuffer19.resetWithString("");
        char[] charArray27 = textBuffer19.getTextBuffer();
        char[] charArray28 = textBuffer19.getCurrentSegment();
        boolean boolean29 = textBuffer19.hasTextAsCharacters();
        char[] charArray31 = textBuffer19.expandCurrentSegment(1000);
        textBuffer1.resetWithCopy(charArray31, 97, (int) (byte) 100);
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        textBuffer37.releaseBuffers();
        char[] charArray39 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer37.resetWithShared(charArray39, (int) '#', (int) (byte) 10);
        textBuffer37.resetWithString("");
        boolean boolean45 = textBuffer37.hasTextAsCharacters();
        int int46 = textBuffer37.getTextOffset();
        char[] charArray47 = textBuffer37.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray47, 52, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 184 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength(262144);
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        int int13 = textBuffer1.size();
        java.lang.String str14 = textBuffer1.contentsAsString();
        char[] charArray15 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray15);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append('a');
        textBuffer1.setCurrentLength(4);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        char[] charArray28 = textBuffer27.getCurrentSegment();
        char[] charArray29 = textBuffer27.getCurrentSegment();
        textBuffer27.append(' ');
        textBuffer27.append(' ');
        char[] charArray34 = textBuffer27.emptyAndGetCurrentSegment();
        char[] charArray36 = textBuffer27.expandCurrentSegment((int) ' ');
        textBuffer1.resetWithShared(charArray36, (-1), (-1));
        int int40 = textBuffer1.getTextOffset();
        int int41 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        char[] charArray14 = textBuffer1.contentsAsArray();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean16 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        textBuffer1.setCurrentLength(0);
        textBuffer1.append('#');
        textBuffer1.setCurrentLength((int) '#');
        int int35 = textBuffer1.getCurrentSegmentSize();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.size();
        int int11 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString(" ");
        textBuffer1.setCurrentLength((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        int int14 = textBuffer1.size();
        java.lang.String str15 = textBuffer1.toString();
        textBuffer1.resetWithString("a\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        char[] charArray20 = textBuffer19.getCurrentSegment();
        textBuffer19.resetWithString("hi!");
        java.lang.String str23 = textBuffer19.toString();
        textBuffer19.append('#');
        char[] charArray26 = textBuffer19.emptyAndGetCurrentSegment();
        textBuffer19.setCurrentLength(3);
        char[] charArray29 = textBuffer19.getCurrentSegment();
        textBuffer1.resetWithShared(charArray29, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        java.lang.String str4 = textBuffer1.toString();
        char[] charArray5 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray10 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        textBuffer1.setCurrentLength(0);
        int int15 = textBuffer1.size();
        java.lang.String str16 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        textBuffer1.ensureNotShared();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.getCurrentSegment();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        java.lang.String str14 = textBuffer11.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        textBuffer16.setCurrentLength(1);
        char[] charArray19 = textBuffer16.getCurrentSegment();
        boolean boolean20 = textBuffer16.hasTextAsCharacters();
        char[] charArray21 = textBuffer16.getCurrentSegment();
        textBuffer16.resetWithString("");
        boolean boolean24 = textBuffer16.hasTextAsCharacters();
        char[] charArray25 = textBuffer16.getTextBuffer();
        char[] charArray26 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer11.resetWithCopy(charArray26, 0, (int) (byte) 10);
        int int30 = textBuffer11.getTextOffset();
        int int31 = textBuffer11.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        char[] charArray34 = textBuffer33.getCurrentSegment();
        char[] charArray36 = textBuffer33.expandCurrentSegment((int) (byte) 1);
        char[] charArray37 = textBuffer33.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        textBuffer39.setCurrentLength(1);
        char[] charArray42 = textBuffer39.getCurrentSegment();
        boolean boolean43 = textBuffer39.hasTextAsCharacters();
        char[] charArray44 = textBuffer39.getCurrentSegment();
        char[] charArray45 = textBuffer39.getCurrentSegment();
        textBuffer33.resetWithCopy(charArray45, (int) (byte) 100, 10);
        char[] charArray49 = textBuffer33.emptyAndGetCurrentSegment();
        textBuffer11.append(charArray49, (int) ' ', 13);
        textBuffer1.resetWithCopy(charArray49, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray49);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.setCurrentLength(1);
        char[] charArray11 = textBuffer8.getCurrentSegment();
        char[] charArray12 = textBuffer8.contentsAsArray();
        int int13 = textBuffer8.getTextOffset();
        textBuffer8.append(' ');
        char[] charArray16 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray16, (int) (short) 0, (int) '4');
        char[] charArray20 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithEmpty();
        char[] charArray21 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        char[] charArray24 = textBuffer1.expandCurrentSegment(97);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        int int5 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        textBuffer1.append('#');
        textBuffer1.append(' ');
        char[] charArray18 = textBuffer1.expandCurrentSegment(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.setCurrentLength(1);
        char[] charArray23 = textBuffer20.getCurrentSegment();
        boolean boolean24 = textBuffer20.hasTextAsCharacters();
        textBuffer20.append('a');
        boolean boolean27 = textBuffer20.hasTextAsCharacters();
        char[] charArray28 = textBuffer20.getCurrentSegment();
        boolean boolean29 = textBuffer20.hasTextAsCharacters();
        char[] charArray30 = textBuffer20.contentsAsArray();
        char[] charArray31 = textBuffer20.contentsAsArray();
        textBuffer20.ensureNotShared();
        textBuffer20.resetWithString("a");
        char[] charArray35 = textBuffer20.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray35, (int) ' ', 101);
        int int39 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        boolean boolean13 = textBuffer10.hasTextAsCharacters();
        int int14 = textBuffer10.getTextOffset();
        char[] charArray15 = textBuffer10.contentsAsArray();
        char[] charArray16 = textBuffer10.contentsAsArray();
        textBuffer10.append(' ');
        java.lang.String str19 = textBuffer10.contentsAsString();
        int int20 = textBuffer10.getTextOffset();
        textBuffer10.releaseBuffers();
        char[] charArray23 = textBuffer10.expandCurrentSegment((int) (short) -1);
        textBuffer1.resetWithShared(charArray23, 262144, (int) 'a');
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        java.lang.String str5 = textBuffer1.toString();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        int int8 = textBuffer1.size();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray10 = null;
        textBuffer1.resetWithShared(charArray10, (int) ' ', 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        char[] charArray16 = textBuffer15.getCurrentSegment();
        char[] charArray18 = textBuffer15.expandCurrentSegment((int) (byte) 1);
        textBuffer15.resetWithString("hi!");
        textBuffer15.releaseBuffers();
        int int22 = textBuffer15.size();
        char[] charArray23 = textBuffer15.emptyAndGetCurrentSegment();
        boolean boolean24 = textBuffer15.hasTextAsCharacters();
        char[] charArray25 = textBuffer15.getTextBuffer();
        textBuffer1.resetWithShared(charArray25, (int) (byte) 1, 97);
        int int29 = textBuffer1.getCurrentSegmentSize();
        char[] charArray30 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass31 = charArray30.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        boolean boolean15 = textBuffer1.hasTextAsCharacters();
        int int16 = textBuffer1.getTextOffset();
        java.lang.String str17 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        textBuffer19.setCurrentLength(1);
        char[] charArray22 = textBuffer19.getCurrentSegment();
        boolean boolean23 = textBuffer19.hasTextAsCharacters();
        char[] charArray24 = textBuffer19.getCurrentSegment();
        char[] charArray26 = textBuffer19.expandCurrentSegment(10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray26, (int) (byte) -1, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.append("hi!", 0, 0);
        java.lang.String str12 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength(0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        int int14 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength(13);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"?????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end 135, length 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getTextOffset();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray10 = textBuffer1.expandCurrentSegment((int) '4');
        textBuffer1.resetWithString("a\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        java.lang.String str7 = textBuffer1.toString();
        java.lang.String str8 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        int int10 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.size();
        textBuffer1.setCurrentLength((int) (byte) 1);
        int int13 = textBuffer1.getTextOffset();
        java.lang.String str14 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        textBuffer1.resetWithEmpty();
        java.lang.String str7 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.getTextOffset();
        int int11 = textBuffer1.size();
        java.lang.String str12 = textBuffer1.contentsAsString();
        int int13 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        textBuffer1.releaseBuffers();
        char[] charArray32 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray34 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray34);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        int int8 = textBuffer1.size();
        java.lang.String str9 = textBuffer1.contentsAsString();
        java.lang.String str10 = textBuffer1.toString();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        int int5 = textBuffer1.getTextOffset();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.contentsAsArray();
        int int7 = textBuffer1.getCurrentSegmentSize();
        char[] charArray8 = textBuffer1.contentsAsArray();
        java.lang.String str9 = textBuffer1.contentsAsString();
        int int10 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        java.lang.String str6 = textBuffer1.contentsAsString();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 0);
        char[] charArray10 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        textBuffer1.resetWithEmpty();
        int int14 = textBuffer1.size();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(0);
        int int18 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        int int8 = textBuffer1.size();
        int int9 = textBuffer1.getCurrentSegmentSize();
        char[] charArray11 = textBuffer1.expandCurrentSegment((int) (short) -1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray5 = textBuffer1.getCurrentSegment();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        textBuffer1.append('a');
        char[] charArray12 = textBuffer1.contentsAsArray();
        char[] charArray14 = textBuffer1.expandCurrentSegment(102);
        int int15 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        char[] charArray19 = textBuffer1.emptyAndGetCurrentSegment();
        int int20 = textBuffer1.getCurrentSegmentSize();
        int int21 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        char[] charArray24 = textBuffer23.getCurrentSegment();
        char[] charArray26 = textBuffer23.expandCurrentSegment((int) (byte) 1);
        textBuffer23.resetWithString("hi!");
        textBuffer23.releaseBuffers();
        int int30 = textBuffer23.size();
        textBuffer23.append('#');
        textBuffer23.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        char[] charArray36 = textBuffer35.getCurrentSegment();
        char[] charArray38 = textBuffer35.expandCurrentSegment((int) (byte) 1);
        java.lang.String str39 = textBuffer35.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        char[] charArray42 = textBuffer41.getCurrentSegment();
        char[] charArray43 = textBuffer41.getCurrentSegment();
        textBuffer35.resetWithCopy(charArray43, (int) '4', 1);
        char[] charArray47 = textBuffer35.contentsAsArray();
        char[] charArray48 = textBuffer35.emptyAndGetCurrentSegment();
        textBuffer23.append(charArray48, (int) '#', 10);
        textBuffer1.resetWithShared(charArray48, 3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 35");
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '\000' });
        org.junit.Assert.assertNotNull(charArray48);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
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
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        textBuffer29.setCurrentLength(1);
        char[] charArray32 = textBuffer29.getCurrentSegment();
        char[] charArray33 = textBuffer29.contentsAsArray();
        int int34 = textBuffer29.getTextOffset();
        char[] charArray35 = textBuffer29.contentsAsArray();
        char[] charArray36 = textBuffer29.contentsAsArray();
        textBuffer1.resetWithShared(charArray36, (int) '#', (-1));
        int int40 = textBuffer1.size();
        java.lang.String str41 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        boolean boolean43 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("4");
        boolean boolean46 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray13 = textBuffer1.expandCurrentSegment((int) '4');
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        textBuffer1.resetWithEmpty();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
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
        int int13 = textBuffer1.size();
        char[] charArray15 = textBuffer1.expandCurrentSegment((int) 'a');
        boolean boolean16 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray21 = textBuffer18.expandCurrentSegment((int) (byte) 1);
        textBuffer18.resetWithString("hi!");
        textBuffer18.releaseBuffers();
        char[] charArray25 = textBuffer18.getTextBuffer();
        textBuffer1.resetWithCopy(charArray25, 1, 0);
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        textBuffer31.releaseBuffers();
        char[] charArray33 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer31.resetWithShared(charArray33, (int) '#', (int) (byte) 10);
        textBuffer31.resetWithString("");
        boolean boolean39 = textBuffer31.hasTextAsCharacters();
        int int40 = textBuffer31.size();
        char[] charArray41 = textBuffer31.getTextBuffer();
        char[] charArray42 = textBuffer31.getCurrentSegment();
        char[] charArray44 = textBuffer31.expandCurrentSegment((int) (short) -1);
        textBuffer1.append(charArray44, 100, (int) '#');
        char[] charArray48 = textBuffer1.getCurrentSegment();
        java.lang.String str49 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str49, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        int int15 = textBuffer1.getTextOffset();
        char[] charArray16 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str17 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.append(' ');
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.append('4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass9 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        int int18 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        char[] charArray21 = textBuffer20.getCurrentSegment();
        char[] charArray22 = textBuffer20.getCurrentSegment();
        java.lang.String str23 = textBuffer20.toString();
        int int24 = textBuffer20.size();
        char[] charArray26 = textBuffer20.expandCurrentSegment((int) '4');
        textBuffer1.resetWithShared(charArray26, 3, 97);
        int int30 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer32 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler31);
        textBuffer32.setCurrentLength(1);
        boolean boolean35 = textBuffer32.hasTextAsCharacters();
        int int36 = textBuffer32.getCurrentSegmentSize();
        char[] charArray37 = textBuffer32.getTextBuffer();
        char[] charArray38 = textBuffer32.emptyAndGetCurrentSegment();
        char[] charArray44 = new char[] { 'a', '#', ' ', '#', '#' };
        textBuffer32.resetWithShared(charArray44, 1000, 262144);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        textBuffer49.setCurrentLength(1);
        char[] charArray52 = textBuffer49.getCurrentSegment();
        char[] charArray53 = textBuffer49.contentsAsArray();
        int int54 = textBuffer49.getTextOffset();
        int int55 = textBuffer49.getCurrentSegmentSize();
        textBuffer49.resetWithEmpty();
        char[] charArray57 = textBuffer49.emptyAndGetCurrentSegment();
        char[] charArray58 = textBuffer49.emptyAndGetCurrentSegment();
        textBuffer32.resetWithCopy(charArray58, (int) (byte) 100, (int) '#');
        textBuffer1.resetWithCopy(charArray58, (int) (short) 0, 97);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler65 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer66 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler65);
        textBuffer66.setCurrentLength(1);
        boolean boolean69 = textBuffer66.hasTextAsCharacters();
        int int70 = textBuffer66.getTextOffset();
        java.lang.String str71 = textBuffer66.contentsAsString();
        textBuffer66.setCurrentLength((int) (byte) 0);
        char[] charArray74 = textBuffer66.getCurrentSegment();
        char[] charArray75 = textBuffer66.getCurrentSegment();
        textBuffer1.append(charArray75, 10, 13);
        char[] charArray79 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal82 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"??????????????????????????????????????????????????????????????????????????????????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'a', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertNotNull(charArray79);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        java.lang.String str7 = textBuffer1.toString();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        int int9 = textBuffer1.getTextOffset();
        int int10 = textBuffer1.getTextOffset();
        char[] charArray11 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        char[] charArray36 = textBuffer31.emptyAndGetCurrentSegment();
        textBuffer31.setCurrentLength(262144);
        textBuffer31.setCurrentLength((int) (short) 10);
        char[] charArray41 = textBuffer31.contentsAsArray();
        textBuffer1.resetWithShared(charArray41, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double45 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 100, length 10");
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
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        char[] charArray8 = textBuffer1.getTextBuffer();
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int11 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("\000\000");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        char[] charArray28 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray29 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray30 = textBuffer1.getTextBuffer();
        boolean boolean31 = textBuffer1.hasTextAsCharacters();
        int int32 = textBuffer1.getTextOffset();
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
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.getTextOffset();
        char[] charArray11 = textBuffer1.contentsAsArray();
        int int12 = textBuffer1.size();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = textBuffer1.expandCurrentSegment((int) '#');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        char[] charArray29 = textBuffer28.getCurrentSegment();
        textBuffer28.resetWithString("hi!");
        java.lang.String str32 = textBuffer28.toString();
        textBuffer28.append('#');
        textBuffer28.ensureNotShared();
        char[] charArray36 = textBuffer28.contentsAsArray();
        textBuffer1.resetWithShared(charArray36, 262144, 2);
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.ensureNotShared();
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
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#' });
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        java.lang.String str20 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
        textBuffer1.setCurrentLength(0);
        char[] charArray31 = textBuffer1.getTextBuffer();
        textBuffer1.append('#');
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
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength(100);
        char[] charArray11 = textBuffer1.expandCurrentSegment((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength(1);
        char[] charArray16 = textBuffer13.getCurrentSegment();
        boolean boolean17 = textBuffer13.hasTextAsCharacters();
        textBuffer13.append('a');
        boolean boolean20 = textBuffer13.hasTextAsCharacters();
        char[] charArray21 = textBuffer13.getCurrentSegment();
        boolean boolean22 = textBuffer13.hasTextAsCharacters();
        int int23 = textBuffer13.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        textBuffer25.releaseBuffers();
        char[] charArray27 = textBuffer25.getCurrentSegment();
        textBuffer13.resetWithShared(charArray27, (int) 'a', 0);
        char[] charArray31 = textBuffer13.emptyAndGetCurrentSegment();
        int int32 = textBuffer13.getCurrentSegmentSize();
        char[] charArray33 = textBuffer13.getCurrentSegment();
        textBuffer1.resetWithShared(charArray33, 98, (int) (byte) 0);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray33);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        char[] charArray24 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        char[] charArray27 = textBuffer26.getCurrentSegment();
        char[] charArray29 = textBuffer26.expandCurrentSegment((int) (byte) 1);
        char[] charArray30 = textBuffer26.emptyAndGetCurrentSegment();
        boolean boolean31 = textBuffer26.hasTextAsCharacters();
        textBuffer26.releaseBuffers();
        boolean boolean33 = textBuffer26.hasTextAsCharacters();
        char[] charArray34 = textBuffer26.contentsAsArray();
        char[] charArray35 = textBuffer26.contentsAsArray();
        textBuffer1.resetWithShared(charArray35, 0, 262144);
        int int39 = textBuffer1.getCurrentSegmentSize();
        char[] charArray40 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray41 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        java.lang.Class<?> wildcardClass14 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        int int20 = textBuffer1.getCurrentSegmentSize();
        boolean boolean21 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        textBuffer1.append('#');
        boolean boolean27 = textBuffer1.hasTextAsCharacters();
        char[] charArray28 = textBuffer1.emptyAndGetCurrentSegment();
        int int29 = textBuffer1.size();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        char[] charArray22 = textBuffer21.getCurrentSegment();
        char[] charArray24 = textBuffer21.expandCurrentSegment((int) (byte) 1);
        textBuffer21.resetWithString("hi!");
        textBuffer21.releaseBuffers();
        char[] charArray28 = textBuffer21.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        char[] charArray31 = textBuffer30.getCurrentSegment();
        char[] charArray33 = textBuffer30.expandCurrentSegment((int) (byte) 1);
        java.lang.String str34 = textBuffer30.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        char[] charArray37 = textBuffer36.getCurrentSegment();
        char[] charArray38 = textBuffer36.getCurrentSegment();
        textBuffer30.resetWithCopy(charArray38, (int) '4', 1);
        textBuffer21.append(charArray38, (int) (short) 0, 3);
        char[] charArray45 = textBuffer21.getCurrentSegment();
        textBuffer21.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        textBuffer49.setCurrentLength(1);
        char[] charArray52 = textBuffer49.getCurrentSegment();
        char[] charArray53 = textBuffer49.contentsAsArray();
        int int54 = textBuffer49.getTextOffset();
        char[] charArray55 = textBuffer49.contentsAsArray();
        char[] charArray56 = textBuffer49.contentsAsArray();
        textBuffer21.resetWithShared(charArray56, (int) '#', (-1));
        int int60 = textBuffer21.size();
        java.lang.String str61 = textBuffer21.toString();
        char[] charArray62 = textBuffer21.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray62, 13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 65 out of bounds for char[0]");
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] {});
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] {});
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        java.lang.String str4 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        char[] charArray16 = textBuffer15.getCurrentSegment();
        textBuffer15.resetWithString("hi!");
        java.lang.String str19 = textBuffer15.toString();
        textBuffer15.append('#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.releaseBuffers();
        char[] charArray25 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer23.resetWithShared(charArray25, (int) '#', (int) (byte) 10);
        textBuffer23.resetWithString("");
        boolean boolean31 = textBuffer23.hasTextAsCharacters();
        int int32 = textBuffer23.size();
        textBuffer23.releaseBuffers();
        int int34 = textBuffer23.getTextOffset();
        textBuffer23.setCurrentLength((int) (byte) 100);
        char[] charArray37 = textBuffer23.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        textBuffer39.releaseBuffers();
        char[] charArray41 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer39.resetWithShared(charArray41, (int) '#', (int) (byte) 10);
        textBuffer39.resetWithString("");
        char[] charArray47 = textBuffer39.getTextBuffer();
        char[] charArray48 = textBuffer39.getCurrentSegment();
        boolean boolean49 = textBuffer39.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler50 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer51 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler50);
        char[] charArray52 = textBuffer51.getCurrentSegment();
        char[] charArray53 = textBuffer51.getCurrentSegment();
        textBuffer51.append(' ');
        java.lang.String str56 = textBuffer51.contentsAsString();
        char[] charArray57 = textBuffer51.emptyAndGetCurrentSegment();
        textBuffer39.resetWithShared(charArray57, (int) (short) 1, (int) (byte) 10);
        textBuffer23.append(charArray57, 0, (int) (byte) 1);
        textBuffer15.resetWithShared(charArray57, (-1), 35);
        char[] charArray68 = textBuffer15.expandCurrentSegment(101);
        textBuffer1.resetWithShared(charArray68, 0, 0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) (byte) -1);
        char[] charArray75 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("aa", 2, 262144);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + " " + "'", str56, " ");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertNull(charArray75);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        java.lang.String str8 = textBuffer1.toString();
        int int9 = textBuffer1.getCurrentSegmentSize();
        char[] charArray10 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength((int) ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        int int9 = textBuffer1.getTextOffset();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        textBuffer1.append('#');
        int int14 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) (short) 1);
        textBuffer1.resetWithEmpty();
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        char[] charArray22 = textBuffer21.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        textBuffer24.setCurrentLength(1);
        char[] charArray27 = textBuffer24.getCurrentSegment();
        boolean boolean28 = textBuffer24.hasTextAsCharacters();
        char[] charArray29 = textBuffer24.getCurrentSegment();
        textBuffer21.resetWithShared(charArray29, 1, (int) '#');
        char[] charArray33 = textBuffer21.getCurrentSegment();
        char[] charArray34 = textBuffer21.getTextBuffer();
        textBuffer1.append(charArray34, 1, 132);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(charArray34);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        int int9 = textBuffer1.getTextOffset();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.append(' ');
        int int9 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        textBuffer1.append(' ');
        int int14 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(100);
        textBuffer1.setCurrentLength(0);
        textBuffer1.setCurrentLength(0);
        char[] charArray16 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer18.append(' ');
        java.lang.String str23 = textBuffer18.contentsAsString();
        textBuffer18.append('#');
        textBuffer18.setCurrentLength((int) (byte) 10);
        textBuffer18.ensureNotShared();
        int int29 = textBuffer18.getCurrentSegmentSize();
        char[] charArray30 = textBuffer18.contentsAsArray();
        textBuffer1.resetWithShared(charArray30, 100, 3);
        char[] charArray34 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " " + "'", str23, " ");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { ' ', '#', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { ' ', '#', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        char[] charArray13 = textBuffer1.expandCurrentSegment((int) ' ');
        char[] charArray14 = textBuffer1.getTextBuffer();
        java.lang.String str15 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
        int int13 = textBuffer1.size();
        char[] charArray15 = textBuffer1.expandCurrentSegment((int) 'a');
        boolean boolean16 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray21 = textBuffer18.expandCurrentSegment((int) (byte) 1);
        textBuffer18.resetWithString("hi!");
        textBuffer18.releaseBuffers();
        char[] charArray25 = textBuffer18.getTextBuffer();
        textBuffer1.resetWithCopy(charArray25, 1, 0);
        boolean boolean29 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("#");
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
        char[] charArray13 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(1000);
        char[] charArray5 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.setCurrentLength(1);
        textBuffer7.setCurrentLength(1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.getCurrentSegment();
        char[] charArray15 = textBuffer13.getCurrentSegment();
        java.lang.String str16 = textBuffer13.toString();
        int int17 = textBuffer13.size();
        char[] charArray19 = textBuffer13.expandCurrentSegment((int) '4');
        textBuffer7.resetWithShared(charArray19, (int) (byte) -1, 101);
        textBuffer1.append(charArray19, (int) (short) 1, 10);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray11 = textBuffer1.contentsAsArray();
        int int12 = textBuffer1.getTextOffset();
        java.lang.String str13 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength(262144);
        textBuffer1.releaseBuffers();
        char[] charArray12 = textBuffer1.contentsAsArray();
        int int13 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        textBuffer1.releaseBuffers();
        char[] charArray16 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.setCurrentLength(1);
        char[] charArray21 = textBuffer18.getCurrentSegment();
        char[] charArray22 = textBuffer18.contentsAsArray();
        int int23 = textBuffer18.getTextOffset();
        char[] charArray24 = textBuffer18.contentsAsArray();
        char[] charArray25 = textBuffer18.contentsAsArray();
        textBuffer18.ensureNotShared();
        char[] charArray27 = textBuffer18.getTextBuffer();
        textBuffer1.resetWithShared(charArray27, 13, 12);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
        char[] charArray18 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithEmpty();
        int int22 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append("hi!", 0, (int) (byte) 0);
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        textBuffer16.releaseBuffers();
        char[] charArray18 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer16.resetWithShared(charArray18, (int) '#', (int) (byte) 10);
        textBuffer16.resetWithString("");
        boolean boolean24 = textBuffer16.hasTextAsCharacters();
        int int25 = textBuffer16.size();
        char[] charArray26 = textBuffer16.getTextBuffer();
        char[] charArray27 = textBuffer16.getCurrentSegment();
        char[] charArray29 = textBuffer16.expandCurrentSegment((int) (short) -1);
        textBuffer1.resetWithCopy(charArray29, (int) ' ', 2);
        textBuffer1.resetWithString(" ");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        int int8 = textBuffer1.size();
        textBuffer1.append('#');
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.getCurrentSegment();
        char[] charArray16 = textBuffer13.expandCurrentSegment((int) (byte) 1);
        java.lang.String str17 = textBuffer13.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        char[] charArray20 = textBuffer19.getCurrentSegment();
        char[] charArray21 = textBuffer19.getCurrentSegment();
        textBuffer13.resetWithCopy(charArray21, (int) '4', 1);
        char[] charArray25 = textBuffer13.contentsAsArray();
        char[] charArray26 = textBuffer13.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray26, (int) '#', 10);
        int int30 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '\000' });
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(100);
        textBuffer1.setCurrentLength(0);
        textBuffer1.setCurrentLength(0);
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 100, 100);
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
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        java.lang.String str7 = textBuffer1.contentsAsString();
        textBuffer1.ensureNotShared();
        int int9 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.getCurrentSegment();
        textBuffer11.resetWithString("hi!");
        char[] charArray15 = textBuffer11.emptyAndGetCurrentSegment();
        java.lang.String str16 = textBuffer11.toString();
        char[] charArray17 = textBuffer11.getTextBuffer();
        textBuffer1.resetWithShared(charArray17, 32, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithEmpty();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.size();
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.setCurrentLength(1);
        boolean boolean15 = textBuffer12.hasTextAsCharacters();
        int int16 = textBuffer12.getTextOffset();
        char[] charArray17 = textBuffer12.contentsAsArray();
        char[] charArray18 = textBuffer12.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.releaseBuffers();
        char[] charArray22 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer20.resetWithShared(charArray22, (int) '#', (int) (byte) 10);
        textBuffer20.resetWithString("");
        boolean boolean28 = textBuffer20.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        textBuffer30.setCurrentLength(1);
        char[] charArray33 = textBuffer30.getCurrentSegment();
        boolean boolean34 = textBuffer30.hasTextAsCharacters();
        textBuffer30.append('a');
        char[] charArray37 = textBuffer30.emptyAndGetCurrentSegment();
        char[] charArray38 = textBuffer30.getCurrentSegment();
        textBuffer20.resetWithCopy(charArray38, (int) (short) 0, (int) (short) 0);
        textBuffer12.resetWithCopy(charArray38, (int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray38, 4, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1004 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        char[] charArray20 = textBuffer1.contentsAsArray();
        java.lang.String str21 = textBuffer1.contentsAsString();
        textBuffer1.releaseBuffers();
        char[] charArray23 = textBuffer1.contentsAsArray();
        textBuffer1.append('4');
        char[] charArray27 = textBuffer1.expandCurrentSegment((int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray27);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        int int8 = textBuffer1.size();
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray11 = textBuffer1.expandCurrentSegment((int) ' ');
        java.lang.String str12 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append("hi!", 0, (int) (byte) 0);
        textBuffer1.ensureNotShared();
        int int14 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.releaseBuffers();
        char[] charArray23 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer21.resetWithShared(charArray23, (int) '#', (int) (byte) 10);
        textBuffer21.resetWithString("");
        boolean boolean29 = textBuffer21.hasTextAsCharacters();
        char[] charArray30 = textBuffer21.emptyAndGetCurrentSegment();
        textBuffer10.append(charArray30, (int) (short) 10, (int) (short) 1);
        textBuffer10.resetWithString("");
        char[] charArray36 = textBuffer10.getCurrentSegment();
        char[] charArray38 = textBuffer10.expandCurrentSegment(1000);
        char[] charArray39 = textBuffer10.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        textBuffer41.setCurrentLength(1);
        char[] charArray44 = textBuffer41.getCurrentSegment();
        boolean boolean45 = textBuffer41.hasTextAsCharacters();
        textBuffer41.append('a');
        boolean boolean48 = textBuffer41.hasTextAsCharacters();
        char[] charArray49 = textBuffer41.getCurrentSegment();
        boolean boolean50 = textBuffer41.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        textBuffer52.releaseBuffers();
        char[] charArray54 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer52.resetWithShared(charArray54, (int) '#', (int) (byte) 10);
        textBuffer52.resetWithString("");
        boolean boolean60 = textBuffer52.hasTextAsCharacters();
        char[] charArray61 = textBuffer52.emptyAndGetCurrentSegment();
        textBuffer41.append(charArray61, (int) (short) 10, (int) (short) 1);
        textBuffer41.resetWithString("");
        char[] charArray67 = textBuffer41.getCurrentSegment();
        char[] charArray69 = textBuffer41.expandCurrentSegment(1000);
        char[] charArray70 = textBuffer41.contentsAsArray();
        textBuffer10.resetWithShared(charArray70, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray70, 11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] {});
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.contentsAsArray();
        char[] charArray11 = textBuffer1.expandCurrentSegment((int) (short) 1);
        textBuffer1.append('a');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        int int41 = textBuffer1.getCurrentSegmentSize();
        char[] charArray42 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer44 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler43);
        textBuffer44.releaseBuffers();
        textBuffer44.resetWithString("hi!");
        char[] charArray48 = textBuffer44.getCurrentSegment();
        java.lang.String str49 = textBuffer44.toString();
        textBuffer44.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        textBuffer52.releaseBuffers();
        char[] charArray54 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer52.resetWithShared(charArray54, (int) '#', (int) (byte) 10);
        textBuffer52.resetWithString("");
        boolean boolean60 = textBuffer52.hasTextAsCharacters();
        int int61 = textBuffer52.size();
        textBuffer52.releaseBuffers();
        textBuffer52.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler64 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer65 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler64);
        textBuffer65.setCurrentLength(1);
        boolean boolean68 = textBuffer65.hasTextAsCharacters();
        int int69 = textBuffer65.getCurrentSegmentSize();
        char[] charArray70 = textBuffer65.getCurrentSegment();
        textBuffer65.append('a');
        char[] charArray73 = textBuffer65.getCurrentSegment();
        textBuffer52.resetWithShared(charArray73, (int) (short) 1, (int) (byte) 1);
        textBuffer44.resetWithShared(charArray73, 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray73, 98, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertNotNull(charArray73);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) ' ');
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength(1);
        boolean boolean12 = textBuffer9.hasTextAsCharacters();
        int int13 = textBuffer9.getCurrentSegmentSize();
        char[] charArray14 = textBuffer9.getCurrentSegment();
        textBuffer9.append('a');
        char[] charArray17 = textBuffer9.getTextBuffer();
        textBuffer9.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.releaseBuffers();
        char[] charArray23 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer21.resetWithShared(charArray23, (int) '#', (int) (byte) 10);
        textBuffer21.resetWithString("");
        boolean boolean29 = textBuffer21.hasTextAsCharacters();
        int int30 = textBuffer21.size();
        char[] charArray31 = textBuffer21.contentsAsArray();
        textBuffer9.resetWithShared(charArray31, 1, 0);
        java.lang.String str35 = textBuffer9.toString();
        java.lang.String str36 = textBuffer9.toString();
        textBuffer9.setCurrentLength(0);
        textBuffer9.append('#');
        char[] charArray41 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithShared(charArray41, (int) 'a', (int) 'a');
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray41);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.append(' ');
        java.lang.String str9 = textBuffer1.contentsAsString();
        char[] charArray10 = textBuffer1.contentsAsArray();
        int int11 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        int int11 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        char[] charArray15 = textBuffer14.getCurrentSegment();
        char[] charArray17 = textBuffer14.expandCurrentSegment((int) (byte) 1);
        char[] charArray18 = textBuffer14.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.setCurrentLength(1);
        char[] charArray23 = textBuffer20.getCurrentSegment();
        boolean boolean24 = textBuffer20.hasTextAsCharacters();
        char[] charArray25 = textBuffer20.getCurrentSegment();
        char[] charArray26 = textBuffer20.getCurrentSegment();
        textBuffer14.resetWithCopy(charArray26, (int) (byte) 100, 10);
        int int30 = textBuffer14.getCurrentSegmentSize();
        java.lang.String str31 = textBuffer14.contentsAsString();
        textBuffer14.releaseBuffers();
        boolean boolean33 = textBuffer14.hasTextAsCharacters();
        char[] charArray35 = textBuffer14.expandCurrentSegment((int) (byte) 1);
        textBuffer1.append(charArray35, 98, (int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str31, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(charArray35);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.expandCurrentSegment(98);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        textBuffer10.append('a');
        boolean boolean17 = textBuffer10.hasTextAsCharacters();
        textBuffer10.setCurrentLength((int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        char[] charArray22 = textBuffer21.getCurrentSegment();
        char[] charArray24 = textBuffer21.expandCurrentSegment((int) (byte) 1);
        java.lang.String str25 = textBuffer21.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        char[] charArray28 = textBuffer27.getCurrentSegment();
        char[] charArray29 = textBuffer27.getCurrentSegment();
        textBuffer21.resetWithCopy(charArray29, (int) '4', 1);
        textBuffer10.resetWithShared(charArray29, (int) (byte) 100, (int) (short) 10);
        int int36 = textBuffer10.getCurrentSegmentSize();
        textBuffer10.resetWithEmpty();
        java.lang.String str38 = textBuffer10.contentsAsString();
        char[] charArray39 = textBuffer10.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray39, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 42 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray8 = textBuffer1.expandCurrentSegment((int) ' ');
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.contentsAsArray();
        int int11 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        char[] charArray7 = textBuffer1.expandCurrentSegment((int) (byte) 10);
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.append(' ');
        char[] charArray11 = textBuffer1.expandCurrentSegment(100);
        char[] charArray12 = textBuffer1.getCurrentSegment();
        int int13 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.append(' ');
        int int17 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getCurrentSegment();
        char[] charArray9 = textBuffer7.getCurrentSegment();
        textBuffer7.append(' ');
        char[] charArray12 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithShared(charArray12, 101, 0);
        int int16 = textBuffer1.getCurrentSegmentSize();
        int int17 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray18 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        textBuffer1.append(' ');
        textBuffer1.resetWithString("");
        char[] charArray10 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass11 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        int int8 = textBuffer1.getCurrentSegmentSize();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray11 = textBuffer1.expandCurrentSegment((int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
    }
}

