package com.fasterxml.jackson.core.base;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 39);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 45);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("hi!");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 0);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\000\ufffd\001\001\000");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -3, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\ufffd\001\001\000" + "'", str2, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\001\001\000" + "'", str3, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\ufffd\001\001\000" + "'", str4, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\001\001\000" + "'", str5, "\000\ufffd\001\001\000");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 93);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 32);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("']' (code 93)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 93, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 51, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "']' (code 93)" + "'", str2, "']' (code 93)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "']' (code 93)" + "'", str3, "']' (code 93)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "']' (code 93)" + "'", str4, "']' (code 93)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "']' (code 93)" + "'", str5, "']' (code 93)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "']' (code 93)" + "'", str6, "']' (code 93)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "']' (code 93)" + "'", str7, "']' (code 93)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "']' (code 93)" + "'", str8, "']' (code 93)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "']' (code 93)" + "'", str9, "']' (code 93)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "']' (code 93)" + "'", str10, "']' (code 93)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "']' (code 93)" + "'", str11, "']' (code 93)");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 9);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\u0100' (code 256 / 0x100)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "1) test2015(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 0, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 53, (byte) 54, (byte) 32, (byte) 47, (byte) 32, (byte) 48, (byte) 120, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
// flaky "1) test2015(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str2, "'\000' (code 256 / 0x100)");
// flaky "1) test2015(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str3, "'\000' (code 256 / 0x100)");
// flaky "1) test2015(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str4, "'\000' (code 256 / 0x100)");
// flaky "1) test2015(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str5, "'\000' (code 256 / 0x100)");
// flaky "1) test2015(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str6, "'\000' (code 256 / 0x100)");
// flaky "1) test2015(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str7, "'\000' (code 256 / 0x100)");
// flaky "1) test2015(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str8, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) -1);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 58);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 125);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 256);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 48);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 123);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '\000');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) 'a');
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 48);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 93);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 93);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 32);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) '\000');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 42);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 256);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 0);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 10);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 9);
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 69);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 44);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 10);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 100);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 58);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 44);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 93);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 32);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 1);
        java.lang.Class<?> wildcardClass28 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 91);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 16);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 35);
        java.lang.Class<?> wildcardClass26 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '4');
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) -1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 92);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 69);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) 0);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 45);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 256);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 58);
        int[] intArray35 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray33, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 32);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 69);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 9);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
        java.lang.Class<?> wildcardClass26 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 69);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 42);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 69);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        java.lang.Class<?> wildcardClass30 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) 'a');
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 92);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 92);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 91);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        java.lang.Class<?> wildcardClass28 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 123);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 35);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 13);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 10);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (-1));
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 9);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 35);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 125);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 125);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 101);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 39);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 8);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 46);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 34);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) '4');
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, (int) (byte) 10);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (-1));
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 39);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16 });
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 35);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 1);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 16);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 8);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 92);
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) 'a');
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 101);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 69);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 0);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray31, 57);
        int[] intArray35 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray31, (int) '\000');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 48);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 13);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 125);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 93);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 32);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 9);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 91);
        java.lang.Class<?> wildcardClass20 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 4)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str2, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str3, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str4, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str5, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str6, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str7, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str8, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str9, "(CTRL-CHAR, code 4)");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '\000');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 48);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.Class<?> wildcardClass8 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d\000\000" + "'", str4, "d\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d\000\000" + "'", str5, "d\000\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d\000\000" + "'", str6, "d\000\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d\000\000" + "'", str7, "d\000\000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'}' (code 125)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str12 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str13 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 125, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 50, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'}' (code 125)" + "'", str2, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'}' (code 125)" + "'", str3, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'}' (code 125)" + "'", str4, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'}' (code 125)" + "'", str5, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'}' (code 125)" + "'", str6, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'}' (code 125)" + "'", str7, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'}' (code 125)" + "'", str8, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'}' (code 125)" + "'", str9, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'}' (code 125)" + "'", str10, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'}' (code 125)" + "'", str11, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'}' (code 125)" + "'", str12, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'}' (code 125)" + "'", str13, "'}' (code 125)");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 100);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 16)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 54, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str2, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str3, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str4, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 34);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 34);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 256);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 9);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 125);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 1);
        int[] intArray16 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray14, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 45);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 32);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 4);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 91);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 57);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 35);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 1);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (short) -1);
        java.lang.Class<?> wildcardClass30 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 2);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 47);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) '#');
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) -1);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 123);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 57);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 32);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 45);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 123);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 46);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'[' (code 91)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 91, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'[' (code 91)" + "'", str2, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'[' (code 91)" + "'", str3, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'[' (code 91)" + "'", str4, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'[' (code 91)" + "'", str5, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'[' (code 91)" + "'", str6, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'[' (code 91)" + "'", str7, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'[' (code 91)" + "'", str8, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'[' (code 91)" + "'", str9, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'[' (code 91)" + "'", str10, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'[' (code 91)" + "'", str11, "'[' (code 91)");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) ' ');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 39);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("d\000d\001");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass12 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\000d\001" + "'", str2, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d\000d\001" + "'", str3, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d\000d\001" + "'", str4, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d\000d\001" + "'", str5, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d\000d\001" + "'", str6, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d\000d\001" + "'", str7, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d\000d\001" + "'", str8, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d\000d\001" + "'", str9, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d\000d\001" + "'", str10, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\000d\001" + "'", str11, "d\000d\001");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 45);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        java.lang.Class<?> wildcardClass26 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'}' (code 125)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 125, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 50, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'}' (code 125)" + "'", str2, "'}' (code 125)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) 'a');
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 69);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 9);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '\000');
        java.lang.Class<?> wildcardClass26 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'{' (code 123)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass11 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 123, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 50, (byte) 51, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'{' (code 123)" + "'", str2, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'{' (code 123)" + "'", str3, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'{' (code 123)" + "'", str4, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'{' (code 123)" + "'", str5, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'{' (code 123)" + "'", str6, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'{' (code 123)" + "'", str7, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'{' (code 123)" + "'", str8, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'{' (code 123)" + "'", str9, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'{' (code 123)" + "'", str10, "'{' (code 123)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 46);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) -1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (-1));
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 57);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (-1));
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 34);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 256);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) 'a');
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 39);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) -1);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) -1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 125);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 125);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 2);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 100);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 16);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) '\000');
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 256);
        int[] intArray16 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray14, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 1);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 32);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 58);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 9);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 101);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 123);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 48);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 57);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 9);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 123);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 34);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 9);
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1 });
// flaky "2) test2183(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\001\ufffd\001\ufffd" + "'", str7, "\ufffd\001\ufffd\001\ufffd");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 42);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 93);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 35);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 1);
        java.lang.Class<?> wildcardClass28 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 44);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 123);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 92);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 69);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'-' (code 45)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str12 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str13 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str14 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str15 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str16 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str17 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str18 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 45, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'-' (code 45)" + "'", str2, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'-' (code 45)" + "'", str3, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'-' (code 45)" + "'", str4, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'-' (code 45)" + "'", str5, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'-' (code 45)" + "'", str6, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'-' (code 45)" + "'", str7, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'-' (code 45)" + "'", str8, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'-' (code 45)" + "'", str9, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'-' (code 45)" + "'", str10, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'-' (code 45)" + "'", str11, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'-' (code 45)" + "'", str12, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'-' (code 45)" + "'", str13, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'-' (code 45)" + "'", str14, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'-' (code 45)" + "'", str15, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'-' (code 45)" + "'", str16, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "'-' (code 45)" + "'", str17, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'-' (code 45)" + "'", str18, "'-' (code 45)");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 39);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("d\000d\001");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str12 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str13 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str14 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\000d\001" + "'", str2, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d\000d\001" + "'", str3, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d\000d\001" + "'", str4, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d\000d\001" + "'", str5, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d\000d\001" + "'", str6, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d\000d\001" + "'", str7, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d\000d\001" + "'", str8, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d\000d\001" + "'", str9, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d\000d\001" + "'", str10, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\000d\001" + "'", str11, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\000d\001" + "'", str12, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "d\000d\001" + "'", str13, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d\000d\001" + "'", str14, "d\000d\001");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 69);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 0);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        java.lang.Class<?> wildcardClass28 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 69);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) 0);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 45);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 32);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\"' (code 34)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 34, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"' (code 34)" + "'", str2, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\"' (code 34)" + "'", str3, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"' (code 34)" + "'", str4, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\"' (code 34)" + "'", str5, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\"' (code 34)" + "'", str6, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'\"' (code 34)" + "'", str7, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'\"' (code 34)" + "'", str8, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'\"' (code 34)" + "'", str9, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"' (code 34)" + "'", str10, "'\"' (code 34)");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\\' (code 92)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass10 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 92, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\' (code 92)" + "'", str2, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\\' (code 92)" + "'", str3, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\\' (code 92)" + "'", str4, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\\' (code 92)" + "'", str5, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\' (code 92)" + "'", str6, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'\\' (code 92)" + "'", str7, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'\\' (code 92)" + "'", str8, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'\\' (code 92)" + "'", str9, "'\\' (code 92)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        byte[] byteArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_BYTES;
        java.lang.String str1 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str12 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (-1));
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) 100);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 9);
        java.lang.Class<?> wildcardClass30 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'{' (code 123)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass12 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 123, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 50, (byte) 51, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'{' (code 123)" + "'", str2, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'{' (code 123)" + "'", str3, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'{' (code 123)" + "'", str4, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'{' (code 123)" + "'", str5, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'{' (code 123)" + "'", str6, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'{' (code 123)" + "'", str7, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'{' (code 123)" + "'", str8, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'{' (code 123)" + "'", str9, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'{' (code 123)" + "'", str10, "'{' (code 123)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'{' (code 123)" + "'", str11, "'{' (code 123)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 42);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 48);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '#');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 58);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 91);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 35);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 58);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (-1));
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 123);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 91);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
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
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 39);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 69);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 46);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 45);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\"' (code 34)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 34, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"' (code 34)" + "'", str2, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\"' (code 34)" + "'", str3, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"' (code 34)" + "'", str4, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\"' (code 34)" + "'", str5, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\"' (code 34)" + "'", str6, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'\"' (code 34)" + "'", str7, "'\"' (code 34)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '#');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 44);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 69);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 125);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 256);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 0);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '\000');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 46);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 123);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 9);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 10);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 256);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 58);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 8);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 92);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 123);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '4');
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 2);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 125);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 16)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 54, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str2, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str3, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str4, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str5, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str6, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str7, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str8, "(CTRL-CHAR, code 16)");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 32);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 42);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 35);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) '\000');
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 125);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 57);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 57);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 125);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 42);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 4);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 1);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 100 });
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 32);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 125);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 93);
        int[] intArray16 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 46);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) 'a');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 8);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 48);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 256);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 57);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 69);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 91);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 35);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 39);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 34);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 45);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 39);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 44);
        java.lang.Class<?> wildcardClass26 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\ufffd\001\ufffd\001\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "3) test2290(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) 1, (byte) -3, (byte) 1, (byte) 100, (byte) -3 });
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 123);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 125);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 101);
        java.lang.Class<?> wildcardClass26 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 125);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 32);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 93);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 32);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 256);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '#');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 46);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 34);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) '4');
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 39);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 256);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray33);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 125);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 35);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 10);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 101);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, (int) 'a');
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        byte[] byteArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_BYTES;
        java.lang.String str1 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.Class<?> wildcardClass10 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) ' ');
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 44);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 42);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 69);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 100);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 69);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) -1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 13);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) -1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 46);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 44);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 57);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 43);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) -1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 69);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 100);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 256);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 125);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 69);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 8);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 42);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 13);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) -1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 47);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\000\ufffd\n\ufffd" + "'", str6, "\ufffd\000\ufffd\n\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\000\ufffd\n\ufffd" + "'", str7, "\ufffd\000\ufffd\n\ufffd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\000\ufffd\n\ufffd" + "'", str8, "\ufffd\000\ufffd\n\ufffd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\000\ufffd\n\ufffd" + "'", str9, "\ufffd\000\ufffd\n\ufffd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ufffd\000\ufffd\n\ufffd" + "'", str10, "\ufffd\000\ufffd\n\ufffd");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 57);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 93);
        java.lang.Class<?> wildcardClass34 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 9);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 45);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '#');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 32);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 34);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'4' (code 52)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str12 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str13 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str14 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str15 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str16 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 52, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4' (code 52)" + "'", str2, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'4' (code 52)" + "'", str3, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'4' (code 52)" + "'", str4, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'4' (code 52)" + "'", str5, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'4' (code 52)" + "'", str6, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'4' (code 52)" + "'", str7, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'4' (code 52)" + "'", str8, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'4' (code 52)" + "'", str9, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'4' (code 52)" + "'", str10, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'4' (code 52)" + "'", str11, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'4' (code 52)" + "'", str12, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'4' (code 52)" + "'", str13, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'4' (code 52)" + "'", str14, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'4' (code 52)" + "'", str15, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'4' (code 52)" + "'", str16, "'4' (code 52)");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 9);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 39);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 69);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 32);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 16);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 42);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 100);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 32);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'+' (code 43)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 43, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 51, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'+' (code 43)" + "'", str2, "'+' (code 43)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 101);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '#');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 46);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 34);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) '4');
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 44);
        java.lang.Class<?> wildcardClass32 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 256);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 256);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 43);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 9);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 45);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 125);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 9);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 2);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 9);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("':' (code 58)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 58, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 56, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "':' (code 58)" + "'", str2, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "':' (code 58)" + "'", str3, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "':' (code 58)" + "'", str4, "':' (code 58)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 45);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\ufffd' (code -1)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "4) test2376(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) -3, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 45, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd' (code -1)" + "'", str2, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd' (code -1)" + "'", str3, "\ufffd' (code -1)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 100);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 92);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 35);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '\000');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 10 };
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000d\n" + "'", str4, "\000d\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000d\n" + "'", str5, "\000d\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000d\n" + "'", str6, "\000d\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000d\n" + "'", str7, "\000d\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000d\n" + "'", str8, "\000d\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000d\n" + "'", str9, "\000d\n");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str12 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str13 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str14 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str15 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str16 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1 });
// flaky "5) test2386(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str7, "\001\n\ufffd\ufffd\001");
// flaky "2) test2386(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str8, "\001\n\ufffd\ufffd\001");
// flaky "2) test2386(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str9, "\001\n\ufffd\ufffd\001");
// flaky "2) test2386(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str10, "\001\n\ufffd\ufffd\001");
// flaky "2) test2386(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str11, "\001\n\ufffd\ufffd\001");
// flaky "2) test2386(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str12, "\001\n\ufffd\ufffd\001");
// flaky "2) test2386(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str13, "\001\n\ufffd\ufffd\001");
// flaky "2) test2386(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str14, "\001\n\ufffd\ufffd\001");
// flaky "1) test2386(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str15, "\001\n\ufffd\ufffd\001");
// flaky "1) test2386(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str16, "\001\n\ufffd\ufffd\001");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 69);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 16);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '#');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 48);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 69);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 123);
        java.lang.Class<?> wildcardClass28 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) ' ');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'#' (code 35)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 35, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'#' (code 35)" + "'", str2, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'#' (code 35)" + "'", str3, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'#' (code 35)" + "'", str4, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'#' (code 35)" + "'", str5, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'#' (code 35)" + "'", str6, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'#' (code 35)" + "'", str7, "'#' (code 35)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 35);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 101);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 93);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 44);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'-' (code 45)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass12 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 45, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'-' (code 45)" + "'", str2, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'-' (code 45)" + "'", str3, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'-' (code 45)" + "'", str4, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'-' (code 45)" + "'", str5, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'-' (code 45)" + "'", str6, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'-' (code 45)" + "'", str7, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'-' (code 45)" + "'", str8, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'-' (code 45)" + "'", str9, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'-' (code 45)" + "'", str10, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'-' (code 45)" + "'", str11, "'-' (code 45)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 34);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 92);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\u0100' (code 256 / 0x100)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass12 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "6) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 0, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 53, (byte) 54, (byte) 32, (byte) 47, (byte) 32, (byte) 48, (byte) 120, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
// flaky "3) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str2, "'\000' (code 256 / 0x100)");
// flaky "3) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str3, "'\000' (code 256 / 0x100)");
// flaky "3) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str4, "'\000' (code 256 / 0x100)");
// flaky "3) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str5, "'\000' (code 256 / 0x100)");
// flaky "3) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str6, "'\000' (code 256 / 0x100)");
// flaky "3) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str7, "'\000' (code 256 / 0x100)");
// flaky "3) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str8, "'\000' (code 256 / 0x100)");
// flaky "2) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str9, "'\000' (code 256 / 0x100)");
// flaky "2) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str10, "'\000' (code 256 / 0x100)");
// flaky "1) test2399(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str11, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '#');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 57);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) '4');
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 32);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 43);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 100);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 35);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 13);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 39);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 93);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 35);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 256);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) '#');
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) -1);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 93);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 16);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 9);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 43);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 43);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '\000');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 69);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 35);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '\000');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1 });
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 123);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 123);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '\000');
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\001\n\ufffd\000d");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 10, (byte) -3, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\001\n\ufffd\000d" + "'", str2, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\n\ufffd\000d" + "'", str3, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\001\n\ufffd\000d" + "'", str4, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\n\ufffd\000d" + "'", str5, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001\n\ufffd\000d" + "'", str6, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n\ufffd\000d" + "'", str7, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001\n\ufffd\000d" + "'", str8, "\001\n\ufffd\000d");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 123);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("':' (code 58)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 58, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 56, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "':' (code 58)" + "'", str2, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "':' (code 58)" + "'", str3, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "':' (code 58)" + "'", str4, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "':' (code 58)" + "'", str5, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "':' (code 58)" + "'", str6, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "':' (code 58)" + "'", str7, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "':' (code 58)" + "'", str8, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "':' (code 58)" + "'", str9, "':' (code 58)");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 0);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 57);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 57);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 69);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 48);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 48);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 1);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray31, 39);
        java.lang.Class<?> wildcardClass34 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\uffff' (code -1)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "7) test2432(com.fasterxml.jackson.core.base.RegressionTest4)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) -1, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 45, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd' (code -1)" + "'", str2, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd' (code -1)" + "'", str3, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd' (code -1)" + "'", str4, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd' (code -1)" + "'", str5, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd' (code -1)" + "'", str6, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd' (code -1)" + "'", str7, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd' (code -1)" + "'", str8, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd' (code -1)" + "'", str9, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ufffd' (code -1)" + "'", str10, "\ufffd' (code -1)");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 101);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 42);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 101);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 44);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 10);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (-1));
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 44);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 4);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 57);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 1);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 123);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 92);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 2);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) 'a');
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 101);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 69);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 101);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray31, 32);
        java.lang.Class<?> wildcardClass34 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 125);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 8);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 46);
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 92);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 2);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 100);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 13);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 91);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 92);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '#');
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 92);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 45);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 4);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 34);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 45);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '\000');
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '\000');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'#' (code 35)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 35, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'#' (code 35)" + "'", str2, "'#' (code 35)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("',' (code 44)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 44, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "',' (code 44)" + "'", str2, "',' (code 44)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "',' (code 44)" + "'", str3, "',' (code 44)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "',' (code 44)" + "'", str4, "',' (code 44)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "',' (code 44)" + "'", str5, "',' (code 44)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "',' (code 44)" + "'", str6, "',' (code 44)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "',' (code 44)" + "'", str7, "',' (code 44)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "',' (code 44)" + "'", str8, "',' (code 44)");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 9);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 8);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 91);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 32);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 58);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 101);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'*' (code 42)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 42, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'*' (code 42)" + "'", str2, "'*' (code 42)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'*' (code 42)" + "'", str3, "'*' (code 42)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'*' (code 42)" + "'", str4, "'*' (code 42)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'*' (code 42)" + "'", str5, "'*' (code 42)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'*' (code 42)" + "'", str6, "'*' (code 42)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'*' (code 42)" + "'", str7, "'*' (code 42)");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '#');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 47);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 123);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '\000');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) 'a');
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 48);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 42);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '4');
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 101);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 16);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 9);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str1 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.Class<?> wildcardClass12 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 58);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 69);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 42);
        java.lang.Class<?> wildcardClass24 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 34);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 125);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, (int) 'a');
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
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
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '#');
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 48);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 47);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 69);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) -1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 45);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 0);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 32);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 92);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }
}
