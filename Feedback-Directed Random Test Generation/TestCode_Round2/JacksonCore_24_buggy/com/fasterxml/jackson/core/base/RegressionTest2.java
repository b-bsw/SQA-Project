package com.fasterxml.jackson.core.base;

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
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'}' (code 125)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 125, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 50, (byte) 53, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'}' (code 125)" + "'", str2, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'}' (code 125)" + "'", str3, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'}' (code 125)" + "'", str4, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'}' (code 125)" + "'", str5, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'}' (code 125)" + "'", str6, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'}' (code 125)" + "'", str7, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'}' (code 125)" + "'", str8, "'}' (code 125)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'}' (code 125)" + "'", str9, "'}' (code 125)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 1 });
// flaky "1) test1005(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffdd\001" + "'", str6, "\ufffd\ufffdd\001");
// flaky "1) test1005(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffdd\001" + "'", str7, "\ufffd\ufffdd\001");
// flaky "1) test1005(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\ufffdd\001" + "'", str8, "\ufffd\ufffdd\001");
// flaky "1) test1005(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffdd\001" + "'", str9, "\ufffd\ufffdd\001");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 256);
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 42);
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 2);
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 13);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 9);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 46);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 100);
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 101);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
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
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '\000');
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 256);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 42);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 0);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
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
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 44);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '\000');
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 1);
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 46);
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
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
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 92);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 42);
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 125);
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
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
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 123);
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 10);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 125);
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) -1);
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.lang.Class<?> wildcardClass12 = byteArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 91);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 9);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 2);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 100);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 16);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 35);
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 57);
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 9)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str2, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str3, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 16);
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 100);
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 256);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 45);
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) 'a');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (-1));
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 35);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 256);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 8);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 92);
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 45);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 39);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 69);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 125);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 4);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        java.lang.Class<?> wildcardClass22 = intArray13.getClass();
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 100);
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 0);
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 46);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 93);
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 123);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 8)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 56, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str2, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str3, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 8)" + "'", str4, "(CTRL-CHAR, code 8)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 35);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 93);
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 0);
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
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '\000');
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
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 46);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 100);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
        org.junit.Assert.assertNotNull(intArray5);
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
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'4' (code 52)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 52, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4' (code 52)" + "'", str2, "'4' (code 52)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
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
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("d\000\000");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\000\000" + "'", str2, "d\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d\000\000" + "'", str3, "d\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d\000\000" + "'", str4, "d\000\000");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 34);
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) 'a');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 42);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) '4');
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 101);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
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
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 35);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 123);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 48);
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) -1);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 69);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 58);
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 69);
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
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
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 43);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 4);
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 125);
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("hi!");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (short) 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 39, 16, 123, 16, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 39, 16, 123, 16, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 39, 16, 123, 16, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray29, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 4);
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
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 123);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 100);
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '#');
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 4);
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) '\000');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
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
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 1);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 101);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray31, (int) (short) 1);
        java.lang.Class<?> wildcardClass34 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 48);
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) -1);
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
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
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
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
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 91);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 2);
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
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
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
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
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
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
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 43);
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (-1));
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
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
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
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
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 100);
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
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 9);
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 46);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 10);
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
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
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
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 46);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 92);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 9);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
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
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 69);
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
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 9)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str2, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str3, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str4, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 9)" + "'", str5, "(CTRL-CHAR, code 9)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 32);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 46);
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 13)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 51, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 13)" + "'", str2, "(CTRL-CHAR, code 13)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 13)" + "'", str3, "(CTRL-CHAR, code 13)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (-1));
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 93);
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 93);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 92);
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
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
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 101);
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
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
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
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 10);
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
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
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 69);
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
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
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 123);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 46);
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 34);
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
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 0);
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
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 101);
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
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray6);
        java.lang.Class<?> wildcardClass11 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1 });
// flaky "2) test1227(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str7, "\001\n\ufffd\ufffd\001");
// flaky "2) test1227(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str8, "\001\n\ufffd\ufffd\001");
// flaky "2) test1227(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str9, "\001\n\ufffd\ufffd\001");
// flaky "2) test1227(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str10, "\001\n\ufffd\ufffd\001");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 57);
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
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        org.junit.Assert.assertNotNull(intArray5);
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
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '\000');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 9);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
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
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\"' (code 34)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 34, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 51, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"' (code 34)" + "'", str2, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\"' (code 34)" + "'", str3, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"' (code 34)" + "'", str4, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\"' (code 34)" + "'", str5, "'\"' (code 34)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\"' (code 34)" + "'", str6, "'\"' (code 34)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) -1);
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) 'a');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 42);
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
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 32);
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
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("(CTRL-CHAR, code 16)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 40, (byte) 67, (byte) 84, (byte) 82, (byte) 76, (byte) 45, (byte) 67, (byte) 72, (byte) 65, (byte) 82, (byte) 44, (byte) 32, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 54, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str2, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str3, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str4, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str5, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(CTRL-CHAR, code 16)" + "'", str6, "(CTRL-CHAR, code 16)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 32);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
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
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '\000');
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 58);
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
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 47);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
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
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        java.lang.Class<?> wildcardClass11 = byteArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) ' ');
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\nd\000\n\000\n");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 45);
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
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '\000');
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
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
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 92);
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 43);
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
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 91);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
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
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 123);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 101);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 91);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 57);
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
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 256);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 35);
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 44);
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 13);
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (-1));
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 91);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 34);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 39);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 16);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 123);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 32);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
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
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
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
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (-1));
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 8);
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
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
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
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 1);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 92);
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
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
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
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
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
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 8);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
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
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
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
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 92);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '#');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 4);
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 39);
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 34);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) ' ');
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
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 8);
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
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 0);
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 32);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 43);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 100);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'0' (code 48)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 48, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 56, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'0' (code 48)" + "'", str2, "'0' (code 48)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'0' (code 48)" + "'", str3, "'0' (code 48)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'0' (code 48)" + "'", str4, "'0' (code 48)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'0' (code 48)" + "'", str5, "'0' (code 48)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 42);
        org.junit.Assert.assertNotNull(intArray5);
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
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 91);
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 48);
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
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
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
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000\ufffd\001\001\000" + "'", str6, "\000\ufffd\001\001\000");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 10);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 45);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 39);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 42);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
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
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        java.lang.Class<?> wildcardClass28 = intArray25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
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
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 4);
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
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 8);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 1);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 39);
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
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 0);
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
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
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
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'4' (code 52)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 52, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4' (code 52)" + "'", str2, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'4' (code 52)" + "'", str3, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'4' (code 52)" + "'", str4, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'4' (code 52)" + "'", str5, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'4' (code 52)" + "'", str6, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'4' (code 52)" + "'", str7, "'4' (code 52)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'4' (code 52)" + "'", str8, "'4' (code 52)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
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
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
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
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 32);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) 'a');
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
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 123);
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
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 1);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 91);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 2);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 57);
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
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) -1);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 47);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 93);
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
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) ' ');
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 47);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 256);
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 34);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 1);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 44);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
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
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 46);
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
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 57);
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
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
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
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) -1);
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 13);
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 100);
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
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
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
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
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
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) -1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) -1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (-1));
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
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
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str1 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.Class<?> wildcardClass7 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 46);
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
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 1);
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
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 93);
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
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("':' (code 58)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 58, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 53, (byte) 56, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "':' (code 58)" + "'", str2, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "':' (code 58)" + "'", str3, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "':' (code 58)" + "'", str4, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "':' (code 58)" + "'", str5, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "':' (code 58)" + "'", str6, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "':' (code 58)" + "'", str7, "':' (code 58)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "':' (code 58)" + "'", str8, "':' (code 58)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 91);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 125);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
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
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 0);
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
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 0);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 10);
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (short) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
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
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 35);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '#');
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
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
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
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
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
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 4);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '4');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 93);
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
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 2);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
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
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str1 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray0);
        java.lang.Class<?> wildcardClass2 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 69);
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
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) '\000');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 35);
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'*' (code 42)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 42, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 50, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'*' (code 42)" + "'", str2, "'*' (code 42)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'*' (code 42)" + "'", str3, "'*' (code 42)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'*' (code 42)" + "'", str4, "'*' (code 42)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'*' (code 42)" + "'", str5, "'*' (code 42)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
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
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
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
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 125);
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
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
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("',' (code 44)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 44, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 52, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "',' (code 44)" + "'", str2, "',' (code 44)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "',' (code 44)" + "'", str3, "',' (code 44)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "',' (code 44)" + "'", str4, "',' (code 44)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 39);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 10);
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
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
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
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) -1);
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
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 0);
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
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray27, 58);
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 10);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
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
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 100);
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
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 0);
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
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
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
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 45);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 35);
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
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) ' ');
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
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 10);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
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
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 32);
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
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
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
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '4');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 92);
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
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 9);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 256);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 125);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 123);
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
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) 'a');
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 100);
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
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'0' (code 48)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 48, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 52, (byte) 56, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'0' (code 48)" + "'", str2, "'0' (code 48)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'0' (code 48)" + "'", str3, "'0' (code 48)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'0' (code 48)" + "'", str4, "'0' (code 48)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'0' (code 48)" + "'", str5, "'0' (code 48)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'0' (code 48)" + "'", str6, "'0' (code 48)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'0' (code 48)" + "'", str7, "'0' (code 48)");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 125);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
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
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 39);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 43);
        java.lang.Class<?> wildcardClass28 = intArray25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'e' (code 101)");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 101, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 49, (byte) 48, (byte) 49, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'e' (code 101)" + "'", str2, "'e' (code 101)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'e' (code 101)" + "'", str3, "'e' (code 101)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'e' (code 101)" + "'", str4, "'e' (code 101)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'e' (code 101)" + "'", str5, "'e' (code 101)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'e' (code 101)" + "'", str6, "'e' (code 101)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'e' (code 101)" + "'", str7, "'e' (code 101)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'e' (code 101)" + "'", str8, "'e' (code 101)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'e' (code 101)" + "'", str9, "'e' (code 101)");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 2);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 39);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 1, 10, 52, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\001\n\ufffd\ufffd\001");
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
// flaky "3) test1400(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 10, (byte) -3, (byte) 100, (byte) -3, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str2, "\001\n\ufffd\ufffd\001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str3, "\001\n\ufffd\ufffd\001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str4, "\001\n\ufffd\ufffd\001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str5, "\001\n\ufffd\ufffd\001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str6, "\001\n\ufffd\ufffd\001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str7, "\001\n\ufffd\ufffd\001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str8, "\001\n\ufffd\ufffd\001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str9, "\001\n\ufffd\ufffd\001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\001\n\ufffd\ufffd\001" + "'", str10, "\001\n\ufffd\ufffd\001");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 8);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 42);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 35);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 45);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 91);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 93);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        java.lang.Class<?> wildcardClass11 = byteArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '#');
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
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 39);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
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
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) '4');
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
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.lang.Class<?> wildcardClass13 = byteArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'a' (code 97)");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 97, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 57, (byte) 55, (byte) 41 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 4);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 256);
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
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 69);
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
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 32);
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
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 45);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 39);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 42);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
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
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 256);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 45);
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 43);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) '#');
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 58);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 48);
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
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 58);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 101);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
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
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, (int) '\000');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 100 });
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 125);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 1);
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
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 1);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 1);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '\000');
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 57);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 125);
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
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) '\000');
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) 1);
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
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 43);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 44);
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
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) ' ');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 101);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 44);
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
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 4);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 46);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 100);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 9);
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
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
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
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 16);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
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
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str10 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 1 });
// flaky "4) test1434(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffdd\001" + "'", str6, "\ufffd\ufffdd\001");
// flaky "3) test1434(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffdd\001" + "'", str7, "\ufffd\ufffdd\001");
// flaky "3) test1434(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\ufffdd\001" + "'", str8, "\ufffd\ufffdd\001");
// flaky "3) test1434(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffdd\001" + "'", str9, "\ufffd\ufffdd\001");
// flaky "1) test1434(com.fasterxml.jackson.core.base.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ufffd\ufffdd\001" + "'", str10, "\ufffd\ufffdd\001");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 69);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 2);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 100);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray8, 16);
        int[] intArray12 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray10, (int) '\000');
        int[] intArray14 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray12, 16);
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
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
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
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 46);
        java.lang.Class<?> wildcardClass28 = intArray23.getClass();
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
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (byte) 0);
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
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) 1);
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
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 10);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
        org.junit.Assert.assertNotNull(intArray5);
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
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 45);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (short) 1);
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("'\000' (code 256 / 0x100)");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 39, (byte) 0, (byte) 39, (byte) 32, (byte) 40, (byte) 99, (byte) 111, (byte) 100, (byte) 101, (byte) 32, (byte) 50, (byte) 53, (byte) 54, (byte) 32, (byte) 47, (byte) 32, (byte) 48, (byte) 120, (byte) 49, (byte) 48, (byte) 48, (byte) 41 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str2, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str3, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str4, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str5, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str6, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str7, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str8, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'\000' (code 256 / 0x100)" + "'", str9, "'\000' (code 256 / 0x100)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
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
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (-1));
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, (int) (short) 100);
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
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 57);
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
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '4');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 47);
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 10);
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
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, 39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 58);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 69);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
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
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 32);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray23, (int) (byte) -1);
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 57);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 91);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) 'a');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 43);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) ' ');
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 0);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 34);
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        int[] intArray29 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 58);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 58);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 93);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 100);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 123);
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (short) 100);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) -1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 0);
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
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) (byte) 10);
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
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 123);
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
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 46);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, (int) (byte) 10);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 69);
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
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
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.lang.String str6 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str7 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str8 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.String str9 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray5);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000\ufffd\001\001\000" + "'", str6, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\001\001\000" + "'", str7, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\ufffd\001\001\000" + "'", str8, "\000\ufffd\001\001\000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\001\001\000" + "'", str9, "\000\ufffd\001\001\000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 10);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) (byte) 10);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 8);
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
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("d\000\000");
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
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\000\000" + "'", str2, "d\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d\000\000" + "'", str3, "d\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d\000\000" + "'", str4, "d\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d\000\000" + "'", str5, "d\000\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d\000\000" + "'", str6, "d\000\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d\000\000" + "'", str7, "d\000\000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d\000\000" + "'", str8, "d\000\000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d\000\000" + "'", str9, "d\000\000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 57);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) (short) 100);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 39);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 46);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 123);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 16);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (int) (byte) 10);
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 35);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 57);
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
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 0);
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
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
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
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 16);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '\000');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
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
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 16);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (-1));
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) '#');
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
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 101);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 1);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 44);
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
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 256);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (-1));
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 47);
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
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) '4');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 44);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 42);
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 10);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 256);
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 46);
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
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 44);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) (byte) 0);
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
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 1, 10, 52, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 2);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, 43);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray17, (int) '\000');
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 9);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 101);
        int[] intArray8 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 9);
        int[] intArray10 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray6, 101);
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 57);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 101);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 93);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 48);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 13);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) (short) 100);
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
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 13);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 123);
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        int[] intArray5 = new int[] { 39, 16, 123, 16, (short) 0 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 92);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 69);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray11, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 45);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (byte) -1);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 2);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 58);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        int[] intArray25 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 100);
        int[] intArray27 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 100);
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
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 39);
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 47);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, (int) '4');
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray9, 0);
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, 13);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray15, (int) (short) 100);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, 91);
        int[] intArray23 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray21, 34);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 1, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray7);
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
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 48);
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray2, 43);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        int[] intArray31 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 2);
        int[] intArray33 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray25, 45);
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
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        int[] intArray5 = new int[] { 32, 1, (short) 10, '4', (short) 1 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, (int) (byte) 10);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, (int) '#');
        int[] intArray11 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 2);
        int[] intArray13 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        int[] intArray15 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, (int) 'a');
        int[] intArray17 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 123);
        int[] intArray19 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray13, 34);
        int[] intArray21 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray19, (-1));
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
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("");
        java.lang.String str2 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
    }
}
