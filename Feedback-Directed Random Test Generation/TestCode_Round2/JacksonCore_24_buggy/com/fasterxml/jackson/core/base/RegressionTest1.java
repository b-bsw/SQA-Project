package com.fasterxml.jackson.core.base;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) 'a');
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 13);
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
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
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        byte[] byteArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_BYTES;
        java.lang.String str1 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.Class<?> wildcardClass8 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'/' (code 47)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 47, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 55, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 69);
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\u0100' (code 256 / 0x100)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "1) test0514(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 0, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 53, (byte) 54, (byte) 32, (byte) 47, (byte) 32, (byte) 48, (byte) 120, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
// flaky "1) test0514(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str2, "'\000' (code 256 / 0x100)");
// flaky "1) test0514(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str3, "'\000' (code 256 / 0x100)");
// flaky "1) test0514(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str4, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 58);
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '4');
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 57);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 2)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 2)" + "'", str2, "(CTRL-CHAR, code 2)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 32);
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 125);
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 2)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 35);
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 69);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 125);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 44);
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 4)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str2, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str3, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str4, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 4)" + "'", str5, "(CTRL-CHAR, code 4)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 9);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 44);
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
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 2);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 47);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("d\000d\001");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\000d\001" + "'", str2, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d\000d\001" + "'", str3, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d\000d\001" + "'", str4, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d\000d\001" + "'", str5, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d\000d\001" + "'", str6, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d\000d\001" + "'", str7, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d\000d\001" + "'", str8, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d\000d\001" + "'", str9, "d\000d\001");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'/' (code 47)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 47, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 55, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/' (code 47)" + "'", str2, "'/' (code 47)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 123);
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 101);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'9' (code 57)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 57, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 55, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'9' (code 57)" + "'", str2, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'9' (code 57)" + "'", str3, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'9' (code 57)" + "'", str4, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'9' (code 57)" + "'", str5, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'9' (code 57)" + "'", str6, "'9' (code 57)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'0' (code 48)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 48, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 56, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'0' (code 48)" + "'", str2, "'0' (code 48)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 69);
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 91);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 0);
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\001\n\ufffd\ufffd\001");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "2) test0553(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 10, (byte) -3, (byte) 100, (byte) -3, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 93);
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
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 8);
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
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 4);
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 13)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 51, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 13)" + "'", str2, "(CTRL-CHAR, code 13)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 44);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'9' (code 57)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 57, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 55, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'9' (code 57)" + "'", str2, "'9' (code 57)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'9' (code 57)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 57, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 55, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'9' (code 57)" + "'", str2, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'9' (code 57)" + "'", str3, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'9' (code 57)" + "'", str4, "'9' (code 57)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'9' (code 57)" + "'", str5, "'9' (code 57)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 1)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str2, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str3, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str4, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'d' (code 100)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 100, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'d' (code 100)" + "'", str2, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'d' (code 100)" + "'", str3, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'d' (code 100)" + "'", str4, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'d' (code 100)" + "'", str5, "'d' (code 100)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) ' ');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 13);
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
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 43);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'-' (code 45)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 45, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'-' (code 45)" + "'", str2, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'-' (code 45)" + "'", str3, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'-' (code 45)" + "'", str4, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'-' (code 45)" + "'", str5, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'-' (code 45)" + "'", str6, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'-' (code 45)" + "'", str7, "'-' (code 45)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 58);
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\000' (code 256 / 0x100)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 0, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 53, (byte) 54, (byte) 32, (byte) 47, (byte) 32, (byte) 48, (byte) 120, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str2, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str3, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("' ' (code 32)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 32, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "' ' (code 32)" + "'", str2, "' ' (code 32)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "' ' (code 32)" + "'", str3, "' ' (code 32)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 44);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\000\ufffd\001\001\000");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -3, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\ufffd\001\001\000" + "'", str2, "\000\ufffd\001\001\000");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("''' (code 39)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 39, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 57, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "''' (code 39)" + "'", str2, "''' (code 39)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "''' (code 39)" + "'", str3, "''' (code 39)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "''' (code 39)" + "'", str4, "''' (code 39)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "''' (code 39)" + "'", str5, "''' (code 39)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 69);
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '4');
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 13);
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'0' (code 48)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 48, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 56, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'0' (code 48)" + "'", str2, "'0' (code 48)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'0' (code 48)" + "'", str3, "'0' (code 48)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("d\000\000");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\000\000" + "'", str2, "d\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d\000\000" + "'", str3, "d\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d\000\000" + "'", str4, "d\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d\000\000" + "'", str5, "d\000\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d\000\000" + "'", str6, "d\000\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d\000\000" + "'", str7, "d\000\000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d\000\000" + "'", str8, "d\000\000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\"' (code 34)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 34, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"' (code 34)" + "'", str2, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\"' (code 34)" + "'", str3, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"' (code 34)" + "'", str4, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\"' (code 34)" + "'", str5, "'\"' (code 34)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 123);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str1 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.Class<?> wildcardClass6 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
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
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\000' (code 256 / 0x100)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 0, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 53, (byte) 54, (byte) 32, (byte) 47, (byte) 32, (byte) 48, (byte) 120, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str2, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str3, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str4, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str5, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str6, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'d' (code 100)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 100, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'d' (code 100)" + "'", str2, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'d' (code 100)" + "'", str3, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'d' (code 100)" + "'", str4, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'d' (code 100)" + "'", str5, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'d' (code 100)" + "'", str6, "'d' (code 100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'d' (code 100)" + "'", str7, "'d' (code 100)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 13);
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
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 123);
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 92);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'-' (code 45)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 45, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'-' (code 45)" + "'", str2, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'-' (code 45)" + "'", str3, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'-' (code 45)" + "'", str4, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'-' (code 45)" + "'", str5, "'-' (code 45)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 1);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 8);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 1);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("' ' (code 32)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 32, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "' ' (code 32)" + "'", str2, "' ' (code 32)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "' ' (code 32)" + "'", str3, "' ' (code 32)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "' ' (code 32)" + "'", str4, "' ' (code 32)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 45);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 42);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) '\000');
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
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
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        java.lang.Class<?> wildcardClass18 = intArray7.getClass();
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 58);
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 43);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 42);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 34);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 125);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 0);
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) -1);
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (-1));
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 125);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 123);
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 1)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str2, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str3, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str4, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str5, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str6, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 13)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 51, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) '#');
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '#');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 35);
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\ufffd' (code -1)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "3) test0669(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) -3, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 45, (byte) 49, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 100);
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'[' (code 91)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 91, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'[' (code 91)" + "'", str2, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'[' (code 91)" + "'", str3, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'[' (code 91)" + "'", str4, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'[' (code 91)" + "'", str5, "'[' (code 91)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'[' (code 91)" + "'", str6, "'[' (code 91)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 125);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 10);
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d\000\000" + "'", str4, "d\000\000");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 4);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 100);
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 58);
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
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 16);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
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
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 34);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
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
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
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
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 4);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 42);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 32);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("hi!");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
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
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '#');
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 123);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 0);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 34);
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
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) ' ');
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) ' ');
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 34);
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
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
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
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 1);
        java.lang.Class<?> wildcardClass16 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\u0100' (code 256 / 0x100)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "4) test0723(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 0, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 53, (byte) 54, (byte) 32, (byte) 47, (byte) 32, (byte) 48, (byte) 120, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
// flaky "2) test0723(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str2, "'\000' (code 256 / 0x100)");
// flaky "2) test0723(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str3, "'\000' (code 256 / 0x100)");
// flaky "2) test0723(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str4, "'\000' (code 256 / 0x100)");
// flaky "1) test0723(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str5, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 123);
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 100);
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '\000');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 42);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.lang.Class<?> wildcardClass26 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 92);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 35);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 256);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
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
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) ' ');
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 57);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\ufffd\ufffdd\001");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "5) test0747(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) -3, (byte) -3, (byte) 100, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffdd\001" + "'", str2, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdd\001" + "'", str3, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffdd\001" + "'", str4, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffdd\001" + "'", str5, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffdd\001" + "'", str6, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffdd\001" + "'", str7, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\ufffdd\001" + "'", str8, "\ufffd\ufffdd\001");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
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
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '\000');
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 13);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) 'a');
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
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
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) ' ');
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
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
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 10)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 48, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 32);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
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
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 48);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'#' (code 35)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 35, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'#' (code 35)" + "'", str2, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'#' (code 35)" + "'", str3, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'#' (code 35)" + "'", str4, "'#' (code 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'#' (code 35)" + "'", str5, "'#' (code 35)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 34);
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 35);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 42);
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 34);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 92);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 32);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 125);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\u0100' (code 256 / 0x100)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "6) test0780(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 0, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 53, (byte) 54, (byte) 32, (byte) 47, (byte) 32, (byte) 48, (byte) 120, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
// flaky "3) test0780(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str2, "'\000' (code 256 / 0x100)");
// flaky "3) test0780(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str3, "'\000' (code 256 / 0x100)");
// flaky "3) test0780(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str4, "'\000' (code 256 / 0x100)");
// flaky "2) test0780(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str5, "'\000' (code 256 / 0x100)");
// flaky "1) test0780(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str6, "'\000' (code 256 / 0x100)");
// flaky "1) test0780(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str7, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\"' (code 34)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 34, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"' (code 34)" + "'", str2, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\"' (code 34)" + "'", str3, "'\"' (code 34)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 35);
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '\000');
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\ufffd\ufffdd\001");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "7) test0787(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) -3, (byte) -3, (byte) 100, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffdd\001" + "'", str2, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdd\001" + "'", str3, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffdd\001" + "'", str4, "\ufffd\ufffdd\001");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
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
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 47);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        byte[] byteArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_BYTES;
        java.lang.Class<?> wildcardClass1 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\\' (code 92)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 92, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 50, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        java.lang.Class<?> wildcardClass24 = intArray15.getClass();
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
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
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 9);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 1)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str2, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str3, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str4, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 1)" + "'", str5, "(CTRL-CHAR, code 1)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        java.lang.Class<?> wildcardClass24 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '\000');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (-1));
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
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
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'E' (code 69)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 69, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 54, (byte) 57, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'E' (code 69)" + "'", str2, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'E' (code 69)" + "'", str3, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'E' (code 69)" + "'", str4, "'E' (code 69)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'E' (code 69)" + "'", str5, "'E' (code 69)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '#');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 35);
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        java.lang.Class<?> wildcardClass18 = intArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 256);
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("',' (code 44)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 44, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "',' (code 44)" + "'", str2, "',' (code 44)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "',' (code 44)" + "'", str3, "',' (code 44)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
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
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 16);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 0);
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 43);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '\000');
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("',' (code 44)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 44, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "',' (code 44)" + "'", str2, "',' (code 44)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 1);
        java.lang.Class<?> wildcardClass16 = intArray7.getClass();
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        java.lang.Class<?> wildcardClass18 = intArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 42);
        java.lang.Class<?> wildcardClass24 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.Class<?> wildcardClass10 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1 });
// flaky "8) test0849(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str7, "\001\n\ufffd\ufffd\001");
// flaky "4) test0849(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str8, "\001\n\ufffd\ufffd\001");
// flaky "4) test0849(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str9, "\001\n\ufffd\ufffd\001");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 44);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        java.lang.Class<?> wildcardClass16 = intArray7.getClass();
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'d' (code 100)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 100, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 32);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) -1);
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 125);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 100);
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'-' (code 45)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 45, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'-' (code 45)" + "'", str2, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'-' (code 45)" + "'", str3, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'-' (code 45)" + "'", str4, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'-' (code 45)" + "'", str5, "'-' (code 45)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'-' (code 45)" + "'", str6, "'-' (code 45)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (-1));
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 43);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) 'a');
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 57);
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
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
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
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 16);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 16);
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
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 44);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 10);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 91);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\u0100' (code 256 / 0x100)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "9) test0880(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 0, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 53, (byte) 54, (byte) 32, (byte) 47, (byte) 32, (byte) 48, (byte) 120, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
// flaky "5) test0880(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str2, "'\000' (code 256 / 0x100)");
// flaky "5) test0880(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str3, "'\000' (code 256 / 0x100)");
// flaky "4) test0880(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str4, "'\000' (code 256 / 0x100)");
// flaky "3) test0880(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str5, "'\000' (code 256 / 0x100)");
// flaky "2) test0880(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str6, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 100);
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 93);
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
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 92);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 43);
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 43);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 9);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 58);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '\000');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) '\000');
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 92);
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 32);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 125);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '#');
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
        java.lang.Class<?> wildcardClass26 = intArray17.getClass();
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
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
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.lang.Class<?> wildcardClass24 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 125);
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 69);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 48);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
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
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
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
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 4);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 42);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 42);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 92);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        java.lang.Class<?> wildcardClass22 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 0);
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (short) 10);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, (int) '4');
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 100);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
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
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 2);
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
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\ufffd\ufffdd\001");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "10) test0928(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) -3, (byte) -3, (byte) 100, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffdd\001" + "'", str2, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdd\001" + "'", str3, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffdd\001" + "'", str4, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffdd\001" + "'", str5, "\ufffd\ufffdd\001");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 1);
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 256);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 35);
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 34);
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
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (-1));
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 91);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 93);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 43);
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '#');
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 101);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'{' (code 123)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 123, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 50, (byte) 51, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 32);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 45);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 1);
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 16)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 54, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str2, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str3, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 44);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 10);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\\' (code 92)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 92, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\' (code 92)" + "'", str2, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\\' (code 92)" + "'", str3, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\\' (code 92)" + "'", str4, "'\\' (code 92)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\\' (code 92)" + "'", str5, "'\\' (code 92)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 4);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'}' (code 125)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 125, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 50, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'}' (code 125)" + "'", str2, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'}' (code 125)" + "'", str3, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'}' (code 125)" + "'", str4, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'}' (code 125)" + "'", str5, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'}' (code 125)" + "'", str6, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'}' (code 125)" + "'", str7, "'}' (code 125)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
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
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 91);
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 48);
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("hi!");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 101);
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
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 1);
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        java.lang.Class<?> wildcardClass28 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 58);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) ' ');
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) ' ');
        java.lang.Class<?> wildcardClass30 = intArray25.getClass();
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 57);
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 39);
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
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 256);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 45);
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 92);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 35);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("d\000d\001");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\000d\001" + "'", str2, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d\000d\001" + "'", str3, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d\000d\001" + "'", str4, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d\000d\001" + "'", str5, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d\000d\001" + "'", str6, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d\000d\001" + "'", str7, "d\000d\001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d\000d\001" + "'", str8, "d\000d\001");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\ufffd' (code -1)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "11) test0995(com.fasterxml.jackson.core.base.RegressionTest1)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) -3, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 45, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd' (code -1)" + "'", str2, "\ufffd' (code -1)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 123);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 10);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        java.lang.Class<?> wildcardClass22 = intArray13.getClass();
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
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
}
