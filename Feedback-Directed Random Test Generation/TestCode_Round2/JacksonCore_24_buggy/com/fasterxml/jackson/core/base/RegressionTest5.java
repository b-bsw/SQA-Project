package com.fasterxml.jackson.core.base;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 39);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
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
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
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
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\ufffd' (code -1)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "1) test2503(com.fasterxml.jackson.core.base.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) -3, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 45, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd' (code -1)" + "'", str2, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd' (code -1)" + "'", str3, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd' (code -1)" + "'", str4, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd' (code -1)" + "'", str5, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd' (code -1)" + "'", str6, "\ufffd' (code -1)");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 10);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
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
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 256);
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
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 46);
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
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'4' (code 52)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 52, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4' (code 52)" + "'", str2, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'4' (code 52)" + "'", str3, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'4' (code 52)" + "'", str4, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'4' (code 52)" + "'", str5, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'4' (code 52)" + "'", str6, "'4' (code 52)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 1)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str2, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str3, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str4, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str5, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str6, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str7, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str8, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 42);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 93);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '#');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
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
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
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
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
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
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, (int) (short) 100);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray31, (int) (short) 100);
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
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 45);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 39);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 91);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
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
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 256);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
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
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        int[] intArray35 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray33, 100);
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
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
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
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) 'a');
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
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 34);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '#');
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
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
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
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (-1));
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 69);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 69);
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
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
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
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 39);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 125);
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
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        java.lang.Class<?> wildcardClass32 = intArray29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 39);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
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
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '\000');
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
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
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
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 123);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
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
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 9);
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
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '#');
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
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 9);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 101);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (-1));
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
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
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '#');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 8);
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
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) ' ');
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
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 39);
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
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 10);
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
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
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
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 92);
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
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 256);
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
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 39);
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
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 4);
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
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
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
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 34);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (-1));
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
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
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
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
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'#' (code 35)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 35, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'#' (code 35)" + "'", str2, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'#' (code 35)" + "'", str3, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'#' (code 35)" + "'", str4, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'#' (code 35)" + "'", str5, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'#' (code 35)" + "'", str6, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'#' (code 35)" + "'", str7, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'#' (code 35)" + "'", str8, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'#' (code 35)" + "'", str9, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'#' (code 35)" + "'", str10, "'#' (code 35)");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
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
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 13);
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
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
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
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 34);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 93);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 125);
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
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '\000');
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        java.lang.Class<?> wildcardClass30 = intArray27.getClass();
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
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 13);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 32);
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
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
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
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
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
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'d' (code 100)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 100, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'d' (code 100)" + "'", str2, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'d' (code 100)" + "'", str3, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'d' (code 100)" + "'", str4, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'d' (code 100)" + "'", str5, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'d' (code 100)" + "'", str6, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'d' (code 100)" + "'", str7, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'d' (code 100)" + "'", str8, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'d' (code 100)" + "'", str9, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'d' (code 100)" + "'", str10, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'d' (code 100)" + "'", str11, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'d' (code 100)" + "'", str12, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'d' (code 100)" + "'", str13, "'d' (code 100)");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 35);
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
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 101);
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
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 58);
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
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 9);
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
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
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
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
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
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 8)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 56, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str2, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str3, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str4, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str5, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str6, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str7, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str8, "(CTRL-CHAR, code 8)");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 123);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 57);
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
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '#');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 39);
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
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) -1);
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 100);
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
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 0)");
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
        java.lang.Class<?> wildcardClass15 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 48, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str2, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str3, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str4, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str5, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str6, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str7, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str8, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str9, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str10, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str11, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str12, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str13, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(CTRL-CHAR, code 0)" + "'", str14, "(CTRL-CHAR, code 0)");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 10);
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
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) 'a');
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
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
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
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
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 42);
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
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 10);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123, 16, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 39, 16, 123, 16, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
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
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 10);
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
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 43);
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
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
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
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 44);
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
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) ' ');
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
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
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 32);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 43);
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
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (short) 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 47);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
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
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 92);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
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
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 34);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray31, 1);
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
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 100);
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
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
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
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 32);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 42);
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
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) '4');
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, (int) (byte) 100);
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
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 4);
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
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 100);
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
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        java.lang.Class<?> wildcardClass24 = intArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (-1));
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 10);
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
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 47);
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
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
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
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
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
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 13);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) -1);
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
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
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
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 1);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 69);
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
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) -1);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 9);
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
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 10 };
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000d\n" + "'", str4, "\000d\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 125);
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
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 1)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str2, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str3, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str4, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str5, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str6, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str7, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str8, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str9, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str10, "(CTRL-CHAR, code 1)");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 48);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
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
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("hi!");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 13);
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
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 35);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) '4');
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
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 1);
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
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (-1));
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
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
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
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
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
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\nd\000\n\000\n");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\nd\000\n\000\n" + "'", str2, "\nd\000\n\000\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nd\000\n\000\n" + "'", str3, "\nd\000\n\000\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\nd\000\n\000\n" + "'", str4, "\nd\000\n\000\n");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) 'a');
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 125);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
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
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 16);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 10);
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
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (-1));
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 13);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 0);
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
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 92);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 101);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) -1);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 1);
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
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
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
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 46);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 58);
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
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) ' ');
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 44);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
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
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 101);
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
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
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
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) 'a');
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
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 44);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (-1));
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 69);
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 125);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
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
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 57);
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
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 100);
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
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("' ' (code 32)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 32, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "' ' (code 32)" + "'", str2, "' ' (code 32)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "' ' (code 32)" + "'", str3, "' ' (code 32)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "' ' (code 32)" + "'", str4, "' ' (code 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "' ' (code 32)" + "'", str5, "' ' (code 32)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "' ' (code 32)" + "'", str6, "' ' (code 32)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "' ' (code 32)" + "'", str7, "' ' (code 32)");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'a' (code 97)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 97, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 55, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'a' (code 97)" + "'", str2, "'a' (code 97)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'a' (code 97)" + "'", str3, "'a' (code 97)");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 123);
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
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 45);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 101);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 123);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 93);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 1);
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
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
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
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) '\000');
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) -1);
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
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 91);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 93);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
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
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1 });
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 9)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str2, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str3, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str4, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str5, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str6, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str7, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str8, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str9, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str10, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str11, "(CTRL-CHAR, code 9)");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
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
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int[] intArray6 = new int[] { 8, (short) 1, (byte) 1, (byte) 0, 45, 16 };
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 47);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 8, 1, 1, 0, 45, 16 });
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'/' (code 47)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 47, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 55, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/' (code 47)" + "'", str2, "'/' (code 47)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'/' (code 47)" + "'", str3, "'/' (code 47)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'/' (code 47)" + "'", str4, "'/' (code 47)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'/' (code 47)" + "'", str5, "'/' (code 47)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 4);
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
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 42);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 42);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 10);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 48);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 93);
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
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 123);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 16);
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
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 32);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (short) 10);
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
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) -1);
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
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
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
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
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
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
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
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
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
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 69);
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
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 69);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str12 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str13 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000\ufffd\001\001\000" + "'", str6, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\001\001\000" + "'", str7, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\ufffd\001\001\000" + "'", str8, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\001\001\000" + "'", str9, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\ufffd\001\001\000" + "'", str10, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\001\001\000" + "'", str11, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\ufffd\001\001\000" + "'", str12, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\001\001\000" + "'", str13, "\000\ufffd\001\001\000");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
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
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 92);
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
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 93);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) -1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
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
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray31, 0);
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
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 10);
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
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 100);
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
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\uffff' (code -1)");
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
// flaky "2) test2695(com.fasterxml.jackson.core.base.RegressionTest5)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) -1, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 45, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd' (code -1)" + "'", str2, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd' (code -1)" + "'", str3, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd' (code -1)" + "'", str4, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd' (code -1)" + "'", str5, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd' (code -1)" + "'", str6, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd' (code -1)" + "'", str7, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd' (code -1)" + "'", str8, "\ufffd' (code -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd' (code -1)" + "'", str9, "\ufffd' (code -1)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 58);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
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
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 34);
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
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
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
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 8);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        java.lang.Class<?> wildcardClass26 = intArray13.getClass();
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
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 69);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
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
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
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
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
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
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 13);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
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
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
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
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 46);
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
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 45);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 39);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 42);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 4);
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
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'9' (code 57)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 57, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 55, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'9' (code 57)" + "'", str2, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'9' (code 57)" + "'", str3, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'9' (code 57)" + "'", str4, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'9' (code 57)" + "'", str5, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'9' (code 57)" + "'", str6, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'9' (code 57)" + "'", str7, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'9' (code 57)" + "'", str8, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'9' (code 57)" + "'", str9, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'9' (code 57)" + "'", str10, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'9' (code 57)" + "'", str11, "'9' (code 57)");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 43);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
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
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 34);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'/' (code 47)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 47, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 55, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/' (code 47)" + "'", str2, "'/' (code 47)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'/' (code 47)" + "'", str3, "'/' (code 47)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'/' (code 47)" + "'", str4, "'/' (code 47)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'/' (code 47)" + "'", str5, "'/' (code 47)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'/' (code 47)" + "'", str6, "'/' (code 47)");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 123);
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
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
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
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
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
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 39);
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
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (short) 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 39);
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
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 57);
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
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 256);
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
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
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
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
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
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 13);
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
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 42);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
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
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 16);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 16);
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
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) 'a');
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
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 43);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, (int) (short) 10);
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
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 256);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 43);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 10);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 42);
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
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 13);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 8);
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
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '\000');
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 4);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 93);
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
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '4');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 48);
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
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 42);
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
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 100);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
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
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 0);
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
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 32);
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
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("hi!");
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
        java.lang.Class<?> wildcardClass14 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 9);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '#');
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 125);
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
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 93);
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
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
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
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) -1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 34);
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
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 44);
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
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 47);
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
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 256);
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
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
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
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\ufffd\000\ufffd\n\ufffd");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) 0, (byte) -3, (byte) 10, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\ufffd\n\ufffd" + "'", str2, "\ufffd\000\ufffd\n\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\000\ufffd\n\ufffd" + "'", str3, "\ufffd\000\ufffd\n\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\000\ufffd\n\ufffd" + "'", str4, "\ufffd\000\ufffd\n\ufffd");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
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
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 35);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
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
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
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
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
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
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 92);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 47);
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
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 93);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 34);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) ' ');
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) 0);
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
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) -1);
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
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 34);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 69);
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
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 92);
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
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 57);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 2);
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
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 1);
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
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
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
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 9);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 39);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 69);
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
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 10);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'E' (code 69)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 69, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 54, (byte) 57, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'E' (code 69)" + "'", str2, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'E' (code 69)" + "'", str3, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'E' (code 69)" + "'", str4, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'E' (code 69)" + "'", str5, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'E' (code 69)" + "'", str6, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'E' (code 69)" + "'", str7, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'E' (code 69)" + "'", str8, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'E' (code 69)" + "'", str9, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'E' (code 69)" + "'", str10, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'E' (code 69)" + "'", str11, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'E' (code 69)" + "'", str12, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'E' (code 69)" + "'", str13, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'E' (code 69)" + "'", str14, "'E' (code 69)");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 58);
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
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) -1);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 125);
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 256);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 44);
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
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) '#');
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 34);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, (int) (byte) 100);
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
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 43);
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
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\"' (code 34)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 34, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"' (code 34)" + "'", str2, "'\"' (code 34)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
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
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) ' ');
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 44);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
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
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
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
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
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
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) -1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
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
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\\' (code 92)");
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
        java.lang.Class<?> wildcardClass13 = byteArray1.getClass();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\\' (code 92)" + "'", str10, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'\\' (code 92)" + "'", str11, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\\' (code 92)" + "'", str12, "'\\' (code 92)");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        java.lang.Class<?> wildcardClass24 = intArray13.getClass();
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
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '\000');
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
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
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
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
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) -1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (-1));
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 93);
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
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 101);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 57);
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
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 47);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 34);
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
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
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
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) 'a');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
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
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
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
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 16);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 44);
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
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 58);
        java.lang.Class<?> wildcardClass30 = intArray27.getClass();
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
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 34);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 47);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 57);
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
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 10);
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) -1);
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
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
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
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
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 44);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
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
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
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
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 2);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 100);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 13);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
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
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 256);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 256);
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
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) -1);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) ' ');
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 91);
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
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 2);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 123);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 2);
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
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 16);
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
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 43);
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
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 93);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (-1));
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 32);
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
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 2);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 0);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 100);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 101);
        int[] intArray16 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
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
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 39);
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
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str11 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001\n\ufffd\000d" + "'", str6, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n\ufffd\000d" + "'", str7, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001\n\ufffd\000d" + "'", str8, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\n\ufffd\000d" + "'", str9, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\001\n\ufffd\000d" + "'", str10, "\001\n\ufffd\000d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\n\ufffd\000d" + "'", str11, "\001\n\ufffd\000d");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 10);
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
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 13);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 58);
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
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 32);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) -1);
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
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
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
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 93);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 1);
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
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
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
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 46);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 69);
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
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 44);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 100);
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
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
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
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 58);
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
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 69);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 125);
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
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 47);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 4);
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
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 91);
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
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
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
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 46);
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
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 39);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 123);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 2);
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
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
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
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 32);
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
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) -1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
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
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 4);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 91);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 125);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 101);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
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
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 57);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) '\000');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 93);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (-1));
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
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 92);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
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
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 39);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 123);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 16);
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
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 9);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 10);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 44);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 39);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '#');
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
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
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
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 123);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 57);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 93);
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
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 13);
        int[] intArray16 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray14, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
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
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) 'a');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
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
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
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
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
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
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'.' (code 46)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 46, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 54, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'.' (code 46)" + "'", str2, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'.' (code 46)" + "'", str3, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'.' (code 46)" + "'", str4, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'.' (code 46)" + "'", str5, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'.' (code 46)" + "'", str6, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'.' (code 46)" + "'", str7, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'.' (code 46)" + "'", str8, "'.' (code 46)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
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
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 58);
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
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
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
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 2);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 123);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray31, 47);
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
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 44);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
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
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
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
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'[' (code 91)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 91, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'[' (code 91)" + "'", str2, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'[' (code 91)" + "'", str3, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'[' (code 91)" + "'", str4, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'[' (code 91)" + "'", str5, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'[' (code 91)" + "'", str6, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'[' (code 91)" + "'", str7, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'[' (code 91)" + "'", str8, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'[' (code 91)" + "'", str9, "'[' (code 91)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 42);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
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
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 9);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 47);
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
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
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
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
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
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
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 256);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) -1);
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
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 9);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 39);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
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
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 34);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 46);
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
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 8);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 10);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 256);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
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
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '#');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
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
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 10);
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
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
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
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 100);
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
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
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
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 10);
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
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 9);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 2);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 92);
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
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 101);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
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
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) '4');
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
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 46);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
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
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 39);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 10)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 48, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 10)" + "'", str2, "(CTRL-CHAR, code 10)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 10)" + "'", str3, "(CTRL-CHAR, code 10)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 10)" + "'", str4, "(CTRL-CHAR, code 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 10)" + "'", str5, "(CTRL-CHAR, code 10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(CTRL-CHAR, code 10)" + "'", str6, "(CTRL-CHAR, code 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(CTRL-CHAR, code 10)" + "'", str7, "(CTRL-CHAR, code 10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(CTRL-CHAR, code 10)" + "'", str8, "(CTRL-CHAR, code 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(CTRL-CHAR, code 10)" + "'", str9, "(CTRL-CHAR, code 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(CTRL-CHAR, code 10)" + "'", str10, "(CTRL-CHAR, code 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(CTRL-CHAR, code 10)" + "'", str11, "(CTRL-CHAR, code 10)");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
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
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
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
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 93);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 57);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) '#');
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 8);
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
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        java.lang.Class<?> wildcardClass13 = byteArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) 100);
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
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 92);
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
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
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
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        java.lang.Class<?> wildcardClass16 = intArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 58);
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
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 46);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 8);
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
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 9);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 125);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 35);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) 10);
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
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 48);
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
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 32);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 1);
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
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
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
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 8);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 45);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 2);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 39);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 35);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 34);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
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
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
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
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
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
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 10 };
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.Class<?> wildcardClass8 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000d\n" + "'", str4, "\000d\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000d\n" + "'", str5, "\000d\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000d\n" + "'", str6, "\000d\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000d\n" + "'", str7, "\000d\n");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
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
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 256);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) -1);
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
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 100);
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
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 47);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 35);
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
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (-1));
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 48);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 43);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 42);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) ' ');
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
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 42);
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
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
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
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 8);
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
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) 'a');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 1);
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
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 101);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
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
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\000' (code 256 / 0x100)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 0, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 53, (byte) 54, (byte) 32, (byte) 47, (byte) 32, (byte) 48, (byte) 120, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 125);
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
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) '#');
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
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 69);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 43);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, (int) (byte) 10);
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
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) -1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
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
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 47);
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
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 69);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 1);
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
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (-1));
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 69);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 100);
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
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 32);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
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
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 43);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
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
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d\000\000" + "'", str4, "d\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d\000\000" + "'", str5, "d\000\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d\000\000" + "'", str6, "d\000\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d\000\000" + "'", str7, "d\000\000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d\000\000" + "'", str8, "d\000\000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d\000\000" + "'", str9, "d\000\000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d\000\000" + "'", str10, "d\000\000");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) ' ');
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 44);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 125);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 125);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (-1));
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
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 35);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
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
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 39);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) 100);
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
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
        int[] intArray35 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray33, 256);
        int[] intArray37 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray33, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray37);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
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
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
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
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
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
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 10);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123, 16, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 4);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) -1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 4);
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
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 42);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 2);
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
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 91);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
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
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 0);
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
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
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
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 46);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 123);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 125);
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
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 42);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 100);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 91);
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
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) 'a');
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
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
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
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 48);
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
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 39);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
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
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 39);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 10);
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
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
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
        java.lang.Class<?> wildcardClass32 = intArray31.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 256);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
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
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
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
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 32);
        int[] intArray16 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 10);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\"' (code 34)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 34, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 52, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 42);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
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
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 32);
        int[] intArray16 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 101);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\000d\n");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000d\n" + "'", str2, "\000d\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000d\n" + "'", str3, "\000d\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000d\n" + "'", str4, "\000d\n");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
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
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, (int) (byte) 0);
        int[] intArray35 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, 101);
        java.lang.Class<?> wildcardClass36 = intArray29.getClass();
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
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 92);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
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
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
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
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 10);
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
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) -1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) -1);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 45);
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
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray15.getClass();
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
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 10);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 92);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 39);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
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
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 69);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
    }
}
