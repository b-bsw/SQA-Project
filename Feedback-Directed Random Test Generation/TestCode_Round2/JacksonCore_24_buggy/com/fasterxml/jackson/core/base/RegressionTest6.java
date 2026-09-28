package com.fasterxml.jackson.core.base;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 10);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 4);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 69);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 69);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
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
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 34);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 100);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 34);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 43);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 43);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 256);
        org.junit.Assert.assertNotNull(intArray5);
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
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 34);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 44);
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
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
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
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 125);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 0);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
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
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
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
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'.' (code 46)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 46, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 54, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'.' (code 46)" + "'", str2, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'.' (code 46)" + "'", str3, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'.' (code 46)" + "'", str4, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'.' (code 46)" + "'", str5, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'.' (code 46)" + "'", str6, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'.' (code 46)" + "'", str7, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'.' (code 46)" + "'", str8, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'.' (code 46)" + "'", str9, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'.' (code 46)" + "'", str10, "'.' (code 46)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'.' (code 46)" + "'", str11, "'.' (code 46)");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\ufffd\ufffdd\001");
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
// flaky "1) test3021(com.fasterxml.jackson.core.base.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) -3, (byte) -3, (byte) 100, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffdd\001" + "'", str2, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdd\001" + "'", str3, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffdd\001" + "'", str4, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffdd\001" + "'", str5, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffdd\001" + "'", str6, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffdd\001" + "'", str7, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\ufffdd\001" + "'", str8, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffdd\001" + "'", str9, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ufffd\ufffdd\001" + "'", str10, "\ufffd\ufffdd\001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffdd\001" + "'", str11, "\ufffd\ufffdd\001");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 9);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 4);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 42);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 46);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 93);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 45);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 1);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 8)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 56, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str2, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str3, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 9);
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
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 45);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 32);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) 'a');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 58);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
}
