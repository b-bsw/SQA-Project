package org.apache.commons.lang.math;

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
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, (long) 97, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray10);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray10);
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray10);
        int int14 = org.apache.commons.lang.math.NumberUtils.max(intArray10);
        int int15 = org.apache.commons.lang.math.NumberUtils.max(intArray10);
        java.lang.Class<?> wildcardClass16 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray10);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte18 = org.apache.commons.lang.math.NumberUtils.min(byteArray17);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray17);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray10);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte27 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray26);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray26);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) -1 + "'", byte27 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) -1 + "'", byte29 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 100 + "'", byte31 == (byte) 100);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1L), (float) (short) 10, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float[] floatArray21 = new float[] { 1.0f, (short) 100, 0L };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray26 = new float[] { 1.0f, (short) 100, 0L };
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray26);
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray30 = new float[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray30);
        float float33 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 100.0f + "'", float33 == 100.0f);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 97, (long) ' ', (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10, 0.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double double13 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        java.lang.Class<?> wildcardClass14 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        float[] floatArray3 = new float[] { 1.0f, (short) 100, 0L };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray8 = new float[] { 1.0f, (short) 100, 0L };
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray8);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray19 = new float[] { 1.0f, (short) 100, 0L };
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray8, floatArray14);
        float float23 = org.apache.commons.lang.math.NumberUtils.max(floatArray8);
        float[] floatArray29 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray33 = new float[] { 1.0f, (short) 100, 0L };
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        float[] floatArray38 = new float[] { 1.0f, (short) 100, 0L };
        float float39 = org.apache.commons.lang.math.NumberUtils.min(floatArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray38);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray33);
        float[] floatArray45 = new float[] { 1.0f, (short) 100, 0L };
        float float46 = org.apache.commons.lang.math.NumberUtils.min(floatArray45);
        float[] floatArray50 = new float[] { 1.0f, (short) 100, 0L };
        float float51 = org.apache.commons.lang.math.NumberUtils.min(floatArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray50);
        float[] floatArray56 = new float[] { 1.0f, (short) 100, 0L };
        float float57 = org.apache.commons.lang.math.NumberUtils.min(floatArray56);
        float[] floatArray61 = new float[] { 1.0f, (short) 100, 0L };
        float float62 = org.apache.commons.lang.math.NumberUtils.min(floatArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray56, floatArray61);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray56);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray56);
        float float66 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        float float67 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        float float68 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray8, floatArray29);
        java.lang.Class<?> wildcardClass70 = floatArray8.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertArrayEquals(floatArray38, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertArrayEquals(floatArray50, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertArrayEquals(floatArray56, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.0f + "'", float57 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertArrayEquals(floatArray61, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.0f + "'", float62 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + (-1.0f) + "'", float66 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + (-1.0f) + "'", float67 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + (-1.0f) + "'", float68 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97, (float) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray18 = new double[] { (byte) 10, 1, 1L };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray14);
        double double21 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double22 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double23 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray5 = new long[] { ' ' };
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray5);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, 100L, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', (long) (short) -1, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray14 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float float19 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        java.lang.Class<?> wildcardClass20 = floatArray14.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 0, (float) (short) 0, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int[] intArray29 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray33 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray33);
        int[] intArray41 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray45 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray41);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray41);
        int[] intArray50 = new int[] { (byte) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        int[] intArray56 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int57 = org.apache.commons.lang.math.NumberUtils.max(intArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray56);
        int[] intArray65 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray69 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray65, intArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray65);
        int int72 = org.apache.commons.lang.math.NumberUtils.max(intArray65);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray65);
        int[] intArray75 = new int[] { (byte) -1 };
        int int76 = org.apache.commons.lang.math.NumberUtils.max(intArray75);
        int[] intArray81 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int82 = org.apache.commons.lang.math.NumberUtils.max(intArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(intArray75, intArray81);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray81);
        int int85 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int int86 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        java.lang.Class<?> wildcardClass87 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 35 + "'", int85 == 35);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 35 + "'", int86 == 35);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double[] doubleArray17 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray21 = new double[] { (byte) 10, 1, 1L };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        double double23 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray17);
        double[] doubleArray29 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray33 = new double[] { (byte) 10, 1, 1L };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray33);
        double[] doubleArray39 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray43 = new double[] { (byte) 10, 1, 1L };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray39);
        double double46 = org.apache.commons.lang.math.NumberUtils.max(doubleArray39);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray39);
        double double48 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte22 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray23 = null;
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray23);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte32 = org.apache.commons.lang.math.NumberUtils.min(byteArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray31);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray25);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            byte byte36 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -1 + "'", byte32 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, 0.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray15 = null;
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray17);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray17);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray28);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte52 = org.apache.commons.lang.math.NumberUtils.min(byteArray51);
        byte[] byteArray53 = null;
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray53);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte62 = org.apache.commons.lang.math.NumberUtils.min(byteArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray61);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray55);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray55);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte73 = org.apache.commons.lang.math.NumberUtils.min(byteArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray66, byteArray72);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray66);
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte82 = org.apache.commons.lang.math.NumberUtils.min(byteArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray81);
        byte byte84 = org.apache.commons.lang.math.NumberUtils.max(byteArray81);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray81);
        byte byte86 = org.apache.commons.lang.math.NumberUtils.max(byteArray81);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) -1 + "'", byte52 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) -1 + "'", byte62 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) -1 + "'", byte73 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) -1 + "'", byte82 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 1 + "'", byte84 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + byte86 + "' != '" + (byte) 1 + "'", byte86 == (byte) 1);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', (float) 0L, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        long[] longArray1 = new long[] { ' ' };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52L, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, (float) (byte) 10, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '#', 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', (float) 100L, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        short[] shortArray0 = null;
        short[] shortArray5 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray12 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short13 = org.apache.commons.lang.math.NumberUtils.min(shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray12);
        short short15 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        short[] shortArray22 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short23 = org.apache.commons.lang.math.NumberUtils.min(shortArray22);
        short[] shortArray30 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray30);
        short short32 = org.apache.commons.lang.math.NumberUtils.min(shortArray30);
        short[] shortArray37 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray44 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short45 = org.apache.commons.lang.math.NumberUtils.min(shortArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray44);
        short[] shortArray53 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short54 = org.apache.commons.lang.math.NumberUtils.min(shortArray53);
        short[] shortArray61 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray61);
        short[] shortArray65 = new short[] { (byte) 0, (short) 0 };
        short short66 = org.apache.commons.lang.math.NumberUtils.max(shortArray65);
        short short67 = org.apache.commons.lang.math.NumberUtils.min(shortArray65);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray65);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray65);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray65);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray30);
        short[] shortArray78 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short79 = org.apache.commons.lang.math.NumberUtils.min(shortArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray78);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray78);
        // The following exception was thrown during execution in test generation
        try {
            short short82 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) -1 + "'", short32 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 0 + "'", short45 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray53, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 0 + "'", short54 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray61, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray65, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 0 + "'", short66 == (short) 0);
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) 0 + "'", short67 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray78, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 0 + "'", short79 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, (-1), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray4 = new int[] { (byte) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int[] intArray12 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray16 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray12);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int[] intArray21 = new int[] { (byte) -1 };
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray21);
        int[] intArray27 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(intArray21, intArray27);
        int[] intArray36 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray40 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray21, intArray36);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray36);
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        int int45 = org.apache.commons.lang.math.NumberUtils.max(intArray36);
        int[] intArray52 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray56 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray56);
        int[] intArray64 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray68 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray64, intArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray56, intArray64);
        int int71 = org.apache.commons.lang.math.NumberUtils.max(intArray64);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray64);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray64);
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 35 + "'", int71 == 35);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (-1L), (float) 1L, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', 35, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, 35L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray5);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte22 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray21);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray29);
        byte byte33 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -1 + "'", byte30 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) -1 + "'", byte33 == (byte) -1);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1L), (double) 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) (short) 0, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray26);
        int int29 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', (long) (short) 0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray18 = new double[] { (byte) 10, 1, 1L };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray14);
        double[] doubleArray25 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray29 = new double[] { (byte) 10, 1, 1L };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray29);
        double double31 = org.apache.commons.lang.math.NumberUtils.min(doubleArray25);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray25);
        double[] doubleArray37 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray41 = new double[] { (byte) 10, 1, 1L };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double double43 = org.apache.commons.lang.math.NumberUtils.min(doubleArray37);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray37);
        double[] doubleArray49 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray53 = new double[] { (byte) 10, 1, 1L };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray53);
        double[] doubleArray56 = new double[] { 10L };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray53, doubleArray56);
        double double58 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        double double59 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        double double60 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        double double61 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray53);
        double double63 = org.apache.commons.lang.math.NumberUtils.max(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 97.0d + "'", double63 == 97.0d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 1, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35, (double) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 10, 0.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray24 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray24);
        int[] intArray33 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray37 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray33);
        java.lang.Class<?> wildcardClass41 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray15 = null;
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray17);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray17);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 97, (long) (byte) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, 32L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, 35L, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100, (float) (-1), (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        short[] shortArray19 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray26);
        short short29 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray19);
        short[] shortArray35 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray42 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short43 = org.apache.commons.lang.math.NumberUtils.min(shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray42);
        short[] shortArray47 = new short[] { (byte) 0, (short) 0 };
        short short48 = org.apache.commons.lang.math.NumberUtils.max(shortArray47);
        short short49 = org.apache.commons.lang.math.NumberUtils.min(shortArray47);
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray47);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray42, shortArray47);
        short short52 = org.apache.commons.lang.math.NumberUtils.max(shortArray42);
        short short53 = org.apache.commons.lang.math.NumberUtils.max(shortArray42);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray42);
        java.lang.Class<?> wildcardClass55 = shortArray42.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) -1 + "'", short29 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray42, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 0 + "'", short43 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray47, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 0 + "'", short48 == (short) 0);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 0 + "'", short49 == (short) 0);
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 0 + "'", short50 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 10 + "'", short52 == (short) 10);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 10 + "'", short53 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int[] intArray23 = new int[] { (byte) -1 };
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int[] intArray31 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray35 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray31);
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = org.apache.commons.lang.math.NumberUtils.max(intArray40);
        int[] intArray46 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.max(intArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray46);
        int[] intArray55 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray59 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(intArray55, intArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray55);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray55);
        int int63 = org.apache.commons.lang.math.NumberUtils.max(intArray55);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray55);
        int int65 = org.apache.commons.lang.math.NumberUtils.max(intArray55);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte22 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray21);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            byte byte25 = org.apache.commons.lang.math.NumberUtils.min(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 10, 10.0d, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        int[] intArray4 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int int6 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int[] intArray8 = new int[] { (byte) -1 };
        int int9 = org.apache.commons.lang.math.NumberUtils.max(intArray8);
        int[] intArray16 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray20 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray8);
        int[] intArray25 = new int[] { (byte) -1 };
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray25);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int32 = org.apache.commons.lang.math.NumberUtils.max(intArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray31);
        int[] intArray40 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray44 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray40);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray40);
        int[] intArray54 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray61 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray65 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray65);
        int int67 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(intArray54, intArray61);
        int int69 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        int int70 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        int[] intArray77 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray81 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(intArray77, intArray81);
        int[] intArray89 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray93 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(intArray89, intArray93);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(intArray81, intArray89);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray89);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray89);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray40);
        int int99 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 35 + "'", int67 == 35);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32, (double) 0L, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray7 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray7);
        int[] intArray16 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray23 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray27 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray27);
        int int29 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray23);
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray23);
        int int32 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int[] intArray39 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray43 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray39, intArray43);
        int[] intArray51 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray55 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray51, intArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray51);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray51);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray7, intArray23);
        int[] intArray60 = null;
        int[] intArray61 = null;
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = org.apache.commons.lang.math.NumberUtils.max(intArray63);
        int[] intArray69 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int70 = org.apache.commons.lang.math.NumberUtils.max(intArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray63, intArray69);
        int[] intArray78 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray82 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(intArray78, intArray82);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray63, intArray78);
        int int85 = org.apache.commons.lang.math.NumberUtils.max(intArray78);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray78);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(intArray60, intArray78);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray60);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 35 + "'", int85 == 35);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, 35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1L), (float) (byte) 10, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', (int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray10);
        byte byte12 = org.apache.commons.lang.math.NumberUtils.min(byteArray10);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray18);
        byte[] byteArray20 = null;
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(byteArray18, byteArray20);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte29 = org.apache.commons.lang.math.NumberUtils.min(byteArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray28);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray18, byteArray22);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray22);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte40 = org.apache.commons.lang.math.NumberUtils.min(byteArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray39);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray33);
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte49 = org.apache.commons.lang.math.NumberUtils.min(byteArray48);
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte56 = org.apache.commons.lang.math.NumberUtils.min(byteArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray55);
        byte byte58 = org.apache.commons.lang.math.NumberUtils.min(byteArray55);
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte65 = org.apache.commons.lang.math.NumberUtils.min(byteArray64);
        byte[] byteArray66 = null;
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(byteArray64, byteArray66);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte75 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(byteArray68, byteArray74);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(byteArray64, byteArray68);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray68);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray68);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            byte byte81 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) -1 + "'", byte29 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) -1 + "'", byte40 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) -1 + "'", byte49 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) -1 + "'", byte56 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) -1 + "'", byte58 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) -1 + "'", byte65 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) -1 + "'", byte75 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int[] intArray29 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray33 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray33);
        int[] intArray41 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray45 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray41);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray41);
        int[] intArray50 = new int[] { (byte) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        int[] intArray56 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int57 = org.apache.commons.lang.math.NumberUtils.max(intArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray56);
        int[] intArray65 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray69 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray65, intArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray65);
        int int72 = org.apache.commons.lang.math.NumberUtils.max(intArray65);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray65);
        int[] intArray75 = new int[] { (byte) -1 };
        int int76 = org.apache.commons.lang.math.NumberUtils.max(intArray75);
        int[] intArray81 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int82 = org.apache.commons.lang.math.NumberUtils.max(intArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(intArray75, intArray81);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray81);
        int[] intArray91 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray95 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray91, intArray95);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(intArray81, intArray95);
        int int98 = org.apache.commons.lang.math.NumberUtils.max(intArray81);
        int int99 = org.apache.commons.lang.math.NumberUtils.max(intArray81);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertArrayEquals(intArray95, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 10 + "'", int98 == 10);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 10 + "'", int99 == 10);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        byte[] byteArray0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte22 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray23 = null;
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray23);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte32 = org.apache.commons.lang.math.NumberUtils.min(byteArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray31);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray25);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray25);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray36, byteArray42);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray36);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte52 = org.apache.commons.lang.math.NumberUtils.min(byteArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray51);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray25);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte61 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        byte[] byteArray67 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte68 = org.apache.commons.lang.math.NumberUtils.min(byteArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray67);
        byte byte70 = org.apache.commons.lang.math.NumberUtils.max(byteArray60);
        byte byte71 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray60);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray60);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -1 + "'", byte32 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) -1 + "'", byte43 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) -1 + "'", byte52 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) -1 + "'", byte61 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) -1 + "'", byte68 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 1 + "'", byte70 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte71 + "' != '" + (byte) -1 + "'", byte71 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(35L, (long) ' ', (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double[] doubleArray15 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray19 = new double[] { (byte) 10, 1, 1L };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray15, doubleArray19);
        double[] doubleArray25 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray29 = new double[] { (byte) 10, 1, 1L };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray25);
        double double32 = org.apache.commons.lang.math.NumberUtils.min(doubleArray25);
        double[] doubleArray37 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray41 = new double[] { (byte) 10, 1, 1L };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double double43 = org.apache.commons.lang.math.NumberUtils.min(doubleArray37);
        double double44 = org.apache.commons.lang.math.NumberUtils.min(doubleArray37);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray37);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray37);
        double double47 = org.apache.commons.lang.math.NumberUtils.min(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray21 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
        short[] shortArray29 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray29);
        short short31 = org.apache.commons.lang.math.NumberUtils.min(shortArray29);
        short[] shortArray36 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray43 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short44 = org.apache.commons.lang.math.NumberUtils.min(shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray43);
        short[] shortArray52 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short53 = org.apache.commons.lang.math.NumberUtils.min(shortArray52);
        short[] shortArray60 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray60);
        short[] shortArray64 = new short[] { (byte) 0, (short) 0 };
        short short65 = org.apache.commons.lang.math.NumberUtils.max(shortArray64);
        short short66 = org.apache.commons.lang.math.NumberUtils.min(shortArray64);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray64);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray64);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray64);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray29);
        short[] shortArray77 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short78 = org.apache.commons.lang.math.NumberUtils.min(shortArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray77);
        short short80 = org.apache.commons.lang.math.NumberUtils.max(shortArray77);
        short short81 = org.apache.commons.lang.math.NumberUtils.max(shortArray77);
        java.lang.Class<?> wildcardClass82 = shortArray77.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 0 + "'", short44 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 0 + "'", short53 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray60, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray64, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) 0 + "'", short65 == (short) 0);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 0 + "'", short66 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray77, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) 0 + "'", short78 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + short80 + "' != '" + (short) 10 + "'", short80 == (short) 10);
        org.junit.Assert.assertTrue("'" + short81 + "' != '" + (short) 10 + "'", short81 == (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        float[] floatArray3 = new float[] { 1.0f, (short) 100, 0L };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray8 = new float[] { 1.0f, (short) 100, 0L };
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray8);
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray12 = new float[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray12);
        float[] floatArray17 = new float[] { 1.0f, (short) 100, 0L };
        float float18 = org.apache.commons.lang.math.NumberUtils.min(floatArray17);
        float[] floatArray22 = new float[] { 1.0f, (short) 100, 0L };
        float float23 = org.apache.commons.lang.math.NumberUtils.min(floatArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray22);
        float[] floatArray28 = new float[] { 1.0f, (short) 100, 0L };
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        float[] floatArray33 = new float[] { 1.0f, (short) 100, 0L };
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray28);
        float float37 = org.apache.commons.lang.math.NumberUtils.max(floatArray22);
        float[] floatArray41 = new float[] { 1.0f, (short) 100, 0L };
        float float42 = org.apache.commons.lang.math.NumberUtils.min(floatArray41);
        float float43 = org.apache.commons.lang.math.NumberUtils.max(floatArray41);
        float[] floatArray47 = new float[] { 1.0f, (short) 100, 0L };
        float float48 = org.apache.commons.lang.math.NumberUtils.min(floatArray47);
        float[] floatArray52 = new float[] { 1.0f, (short) 100, 0L };
        float float53 = org.apache.commons.lang.math.NumberUtils.min(floatArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray47, floatArray52);
        float[] floatArray58 = new float[] { 1.0f, (short) 100, 0L };
        float float59 = org.apache.commons.lang.math.NumberUtils.min(floatArray58);
        float[] floatArray63 = new float[] { 1.0f, (short) 100, 0L };
        float float64 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(floatArray58, floatArray63);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray58);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray58);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray58);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray58);
        float float70 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertArrayEquals(floatArray41, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 100.0f + "'", float43 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertArrayEquals(floatArray47, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertArrayEquals(floatArray52, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertArrayEquals(floatArray58, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertArrayEquals(floatArray63, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray16 = new short[] { (byte) 0, (short) 0 };
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray16);
        short[] shortArray27 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray27);
        short[] shortArray35 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray35);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short short38 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray35);
        short[] shortArray44 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray51 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short52 = org.apache.commons.lang.math.NumberUtils.min(shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray51);
        short[] shortArray56 = new short[] { (byte) 0, (short) 0 };
        short short57 = org.apache.commons.lang.math.NumberUtils.max(shortArray56);
        short short58 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        short short59 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray51, shortArray56);
        short[] shortArray65 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray72 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short73 = org.apache.commons.lang.math.NumberUtils.min(shortArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray72);
        short short75 = org.apache.commons.lang.math.NumberUtils.min(shortArray65);
        short[] shortArray80 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray87 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short88 = org.apache.commons.lang.math.NumberUtils.min(shortArray87);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(shortArray80, shortArray87);
        short short90 = org.apache.commons.lang.math.NumberUtils.min(shortArray80);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray80);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(shortArray51, shortArray65);
        short short93 = org.apache.commons.lang.math.NumberUtils.min(shortArray65);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray65);
        short short95 = org.apache.commons.lang.math.NumberUtils.max(shortArray35);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -1 + "'", short38 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 0 + "'", short52 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray56, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 0 + "'", short57 == (short) 0);
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 0 + "'", short58 == (short) 0);
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 0 + "'", short59 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray65, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray72, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short73 + "' != '" + (short) 0 + "'", short73 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) -1 + "'", short75 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray80, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray87, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short88 + "' != '" + (short) 0 + "'", short88 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + short90 + "' != '" + (short) -1 + "'", short90 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + short93 + "' != '" + (short) -1 + "'", short93 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + short95 + "' != '" + (short) 10 + "'", short95 == (short) 10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, (float) 0L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) (byte) 1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), (double) 35.0f, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long[] longArray18 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray18);
        java.lang.Class<?> wildcardClass21 = longArray8.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray20 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short[] shortArray28 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray28);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray28);
        short[] shortArray36 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray43 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short44 = org.apache.commons.lang.math.NumberUtils.min(shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray43);
        short short46 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        short[] shortArray49 = new short[] { (byte) 0, (short) 0 };
        short short50 = org.apache.commons.lang.math.NumberUtils.max(shortArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray49);
        short short52 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray36);
        short[] shortArray58 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray65 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short66 = org.apache.commons.lang.math.NumberUtils.min(shortArray65);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray65);
        short[] shortArray70 = new short[] { (byte) 0, (short) 0 };
        short short71 = org.apache.commons.lang.math.NumberUtils.max(shortArray70);
        short short72 = org.apache.commons.lang.math.NumberUtils.min(shortArray70);
        short short73 = org.apache.commons.lang.math.NumberUtils.min(shortArray70);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray70);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray65);
        short[] shortArray80 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray87 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short88 = org.apache.commons.lang.math.NumberUtils.min(shortArray87);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(shortArray80, shortArray87);
        short[] shortArray92 = new short[] { (byte) 0, (short) 0 };
        short short93 = org.apache.commons.lang.math.NumberUtils.max(shortArray92);
        short short94 = org.apache.commons.lang.math.NumberUtils.min(shortArray92);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(shortArray87, shortArray92);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray87);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -1 + "'", short30 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 0 + "'", short44 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 100 + "'", short46 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 0 + "'", short50 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 100 + "'", short52 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray58, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray65, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 0 + "'", short66 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray70, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 0 + "'", short71 == (short) 0);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) 0 + "'", short72 == (short) 0);
        org.junit.Assert.assertTrue("'" + short73 + "' != '" + (short) 0 + "'", short73 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray80, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray87, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short88 + "' != '" + (short) 0 + "'", short88 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(shortArray92);
        org.junit.Assert.assertArrayEquals(shortArray92, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short93 + "' != '" + (short) 0 + "'", short93 == (short) 0);
        org.junit.Assert.assertTrue("'" + short94 + "' != '" + (short) 0 + "'", short94 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1L), 32.0d, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) (byte) 10, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) -1, (double) (byte) 100, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) -1, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 0, (double) 97.0f, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray18 = new double[] { (byte) 10, 1, 1L };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray14);
        double double21 = org.apache.commons.lang.math.NumberUtils.min(doubleArray14);
        double[] doubleArray26 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray30 = new double[] { (byte) 10, 1, 1L };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray30);
        double double32 = org.apache.commons.lang.math.NumberUtils.min(doubleArray26);
        double double33 = org.apache.commons.lang.math.NumberUtils.min(doubleArray26);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray26);
        double double35 = org.apache.commons.lang.math.NumberUtils.min(doubleArray14);
        double double36 = org.apache.commons.lang.math.NumberUtils.max(doubleArray14);
        java.lang.Class<?> wildcardClass37 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '4', (double) (byte) 10, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(52.0f, 35.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        short[] shortArray0 = null;
        short[] shortArray5 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray12 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short13 = org.apache.commons.lang.math.NumberUtils.min(shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray12);
        short short15 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        short[] shortArray22 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short23 = org.apache.commons.lang.math.NumberUtils.min(shortArray22);
        short[] shortArray30 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray30);
        short short32 = org.apache.commons.lang.math.NumberUtils.min(shortArray30);
        short[] shortArray37 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray44 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short45 = org.apache.commons.lang.math.NumberUtils.min(shortArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray44);
        short[] shortArray53 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short54 = org.apache.commons.lang.math.NumberUtils.min(shortArray53);
        short[] shortArray61 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray61);
        short[] shortArray65 = new short[] { (byte) 0, (short) 0 };
        short short66 = org.apache.commons.lang.math.NumberUtils.max(shortArray65);
        short short67 = org.apache.commons.lang.math.NumberUtils.min(shortArray65);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray65);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray65);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray65);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray30);
        short[] shortArray78 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short79 = org.apache.commons.lang.math.NumberUtils.min(shortArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray78);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray78);
        java.lang.Class<?> wildcardClass82 = shortArray78.getClass();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) -1 + "'", short32 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 0 + "'", short45 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray53, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 0 + "'", short54 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray61, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray65, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 0 + "'", short66 == (short) 0);
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) 0 + "'", short67 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray78, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 0 + "'", short79 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 97, (long) 32, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, (long) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray24 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray24);
        int[] intArray33 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray37 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray33);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        short[] shortArray19 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray26);
        short short29 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray19);
        short[] shortArray35 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray42 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short43 = org.apache.commons.lang.math.NumberUtils.min(shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray42);
        short short45 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short[] shortArray50 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray57 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short58 = org.apache.commons.lang.math.NumberUtils.min(shortArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray50, shortArray57);
        short short60 = org.apache.commons.lang.math.NumberUtils.max(shortArray57);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray57);
        short short62 = org.apache.commons.lang.math.NumberUtils.max(shortArray35);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray35);
        short short64 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        java.lang.Class<?> wildcardClass65 = shortArray35.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) -1 + "'", short29 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray42, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 0 + "'", short43 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) -1 + "'", short45 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 0 + "'", short58 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 10 + "'", short60 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 100 + "'", short62 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + short64 + "' != '" + (short) -1 + "'", short64 == (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long[] longArray18 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray18);
        long[] longArray22 = new long[] { (byte) -1 };
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long[] longArray26 = new long[] { ' ' };
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.min(longArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray26);
        long[] longArray31 = new long[] { (byte) -1 };
        long long32 = org.apache.commons.lang.math.NumberUtils.min(longArray31);
        long long33 = org.apache.commons.lang.math.NumberUtils.min(longArray31);
        long[] longArray35 = new long[] { ' ' };
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
        long long37 = org.apache.commons.lang.math.NumberUtils.min(longArray35);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray31);
        long[] longArray41 = new long[] { (byte) -1 };
        long long42 = org.apache.commons.lang.math.NumberUtils.min(longArray41);
        long[] longArray48 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray41, longArray48);
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long[] longArray51 = null;
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray51);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray51);
        long long55 = org.apache.commons.lang.math.NumberUtils.min(longArray18);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertArrayEquals(longArray48, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        short[] shortArray1 = new short[] { (short) 100 };
        short short2 = org.apache.commons.lang.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, 100L, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray17 = new short[] { (byte) 0, (short) 0 };
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray17);
        short[] shortArray26 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        short[] shortArray34 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray34);
        short[] shortArray39 = new short[] { (byte) 1, (short) 10, (short) 100 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray39);
        short short41 = org.apache.commons.lang.math.NumberUtils.min(shortArray34);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray34);
        java.lang.Class<?> wildcardClass43 = shortArray34.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray39, new short[] { (short) 1, (short) 10, (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) -1 + "'", short41 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, (int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0d), (double) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) ' ', (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        float[] floatArray3 = new float[] { (short) 10, (byte) 0, (-1.0f) };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 10.0f, 0.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100, (double) (byte) -1, (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(100.0f, (float) 10L, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 100L, (float) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, 0L, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, (float) (byte) 10, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray24 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray24);
        int[] intArray33 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray37 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray33);
        int int41 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        int[] intArray49 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray53 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray53);
        int int55 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        int int56 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        int int57 = org.apache.commons.lang.math.NumberUtils.max(intArray53);
        int[] intArray60 = new int[] { (byte) 1, (byte) 10 };
        int int61 = org.apache.commons.lang.math.NumberUtils.max(intArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray53, intArray60);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray60);
        int int64 = org.apache.commons.lang.math.NumberUtils.min(intArray60);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 1, 10 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, (long) (-1), 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray14 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float float19 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 97, (long) (byte) 0, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10, (double) 52, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        float[] floatArray0 = null;
        float[] floatArray6 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray10 = new float[] { 1.0f, (short) 100, 0L };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float[] floatArray15 = new float[] { 1.0f, (short) 100, 0L };
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray6, floatArray10);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0.0f, (double) 35L, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) -1, (float) 35, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35L, (double) 97, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(35.0f, 0.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 52, (double) 1, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray5 = new long[] { ' ' };
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray5);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long[] longArray18 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray18);
        long[] longArray26 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long27 = org.apache.commons.lang.math.NumberUtils.min(longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray26);
        long[] longArray31 = new long[] { (byte) -1 };
        long long32 = org.apache.commons.lang.math.NumberUtils.min(longArray31);
        long[] longArray38 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray38);
        long[] longArray41 = new long[] { (byte) -1 };
        long long42 = org.apache.commons.lang.math.NumberUtils.min(longArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray41);
        long long44 = org.apache.commons.lang.math.NumberUtils.min(longArray41);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray41);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray26);
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray14 = new float[] { 100, 97.0f, 1L, 'a', 32.0f };
        float[] floatArray18 = new float[] { 1.0f, (short) 100, 0L };
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float[] floatArray23 = new float[] { 1.0f, (short) 100, 0L };
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray23);
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float[] floatArray27 = new float[] {};
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray18);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 100.0f, 97.0f, 1.0f, 97.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertArrayEquals(floatArray27, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) (short) 1, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 0, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 0, (double) (short) 100, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(35L, 52L, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.min(doubleArray4);
        double double11 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
        double double12 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
        double[] doubleArray17 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray21 = new double[] { (byte) 10, 1, 1L };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        double[] doubleArray24 = new double[] { 10L };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray24);
        double[] doubleArray30 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray34 = new double[] { (byte) 10, 1, 1L };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        double[] doubleArray37 = new double[] { 10L };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray34, doubleArray37);
        double[] doubleArray43 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray47 = new double[] { (byte) 10, 1, 1L };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray43, doubleArray47);
        double double49 = org.apache.commons.lang.math.NumberUtils.min(doubleArray43);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray34, doubleArray43);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray34);
        double double52 = org.apache.commons.lang.math.NumberUtils.min(doubleArray21);
        double[] doubleArray57 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray61 = new double[] { (byte) 10, 1, 1L };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray57, doubleArray61);
        double[] doubleArray64 = new double[] { 10L };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray61, doubleArray64);
        double double66 = org.apache.commons.lang.math.NumberUtils.min(doubleArray64);
        double double67 = org.apache.commons.lang.math.NumberUtils.min(doubleArray64);
        double double68 = org.apache.commons.lang.math.NumberUtils.max(doubleArray64);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray64);
        double double70 = org.apache.commons.lang.math.NumberUtils.min(doubleArray64);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97, 32.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray16 = new short[] { (byte) 0, (short) 0 };
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray16);
        short[] shortArray27 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray27);
        short[] shortArray35 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray35);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short short38 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray35);
        java.lang.Class<?> wildcardClass40 = shortArray11.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -1 + "'", short38 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 0, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double[] doubleArray17 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray21 = new double[] { (byte) 10, 1, 1L };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        double[] doubleArray24 = new double[] { 10L };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray24);
        double[] doubleArray30 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray34 = new double[] { (byte) 10, 1, 1L };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        double double36 = org.apache.commons.lang.math.NumberUtils.min(doubleArray30);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray30);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray21);
        double double39 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double40 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double41 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte12 = org.apache.commons.lang.math.NumberUtils.min(byteArray11);
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray11);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte20 = org.apache.commons.lang.math.NumberUtils.min(byteArray19);
        byte[] byteArray21 = null;
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray19, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray29);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray19, byteArray23);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray11, byteArray23);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte41 = org.apache.commons.lang.math.NumberUtils.min(byteArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray40);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray34);
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte50 = org.apache.commons.lang.math.NumberUtils.min(byteArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray49);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray49);
        byte byte53 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -1 + "'", byte30 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) -1 + "'", byte41 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) -1 + "'", byte50 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 100 + "'", byte53 == (byte) 100);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '4', 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', (double) 10.0f, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) -1, (long) 97, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int[] intArray23 = new int[] { (byte) -1 };
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int[] intArray31 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray35 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray31);
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = org.apache.commons.lang.math.NumberUtils.max(intArray40);
        int[] intArray46 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.max(intArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray46);
        int[] intArray55 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray59 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(intArray55, intArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray55);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray55);
        int int63 = org.apache.commons.lang.math.NumberUtils.max(intArray55);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray55);
        java.lang.Class<?> wildcardClass65 = intArray55.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, (int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (-1L), (float) (byte) 1, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray19 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray26);
        short short29 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        short[] shortArray34 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray41 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray41);
        short short44 = org.apache.commons.lang.math.NumberUtils.max(shortArray41);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray41);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray19);
        short short47 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) -1 + "'", short29 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 0 + "'", short42 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 10 + "'", short44 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 100 + "'", short47 == (short) 100);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52L, (float) 0L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(100.0f, (float) 'a', (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35.0f, (double) 35, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52L, (float) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, (long) 'a', (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray8, byteArray14);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray30);
        byte[] byteArray32 = null;
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray32);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte41 = org.apache.commons.lang.math.NumberUtils.min(byteArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray40);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray34);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray34);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        byte[] byteArray52 = null;
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray52);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte61 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray60);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray54);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray50);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray50);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        byte byte71 = org.apache.commons.lang.math.NumberUtils.min(byteArray70);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray70);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray70);
        byte byte74 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) -1 + "'", byte41 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) -1 + "'", byte61 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + byte71 + "' != '" + (byte) -1 + "'", byte71 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + byte74 + "' != '" + (byte) -1 + "'", byte74 == (byte) -1);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray18 = new double[] { (byte) 10, 1, 1L };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray14);
        double[] doubleArray25 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray29 = new double[] { (byte) 10, 1, 1L };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray29);
        double double31 = org.apache.commons.lang.math.NumberUtils.min(doubleArray25);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray25);
        double[] doubleArray37 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray41 = new double[] { (byte) 10, 1, 1L };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double double43 = org.apache.commons.lang.math.NumberUtils.min(doubleArray37);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray37);
        double[] doubleArray49 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray53 = new double[] { (byte) 10, 1, 1L };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray53);
        double[] doubleArray56 = new double[] { 10L };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray53, doubleArray56);
        double double58 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        double double59 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        double double60 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        double double61 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray53);
        double double63 = org.apache.commons.lang.math.NumberUtils.min(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray12 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray19 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray19);
        short[] shortArray24 = new short[] { (byte) 0, (short) 0 };
        short short25 = org.apache.commons.lang.math.NumberUtils.max(shortArray24);
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray24);
        short short29 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        short[] shortArray34 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray41 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray41);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray41);
        short[] shortArray50 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray57 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short58 = org.apache.commons.lang.math.NumberUtils.min(shortArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray50, shortArray57);
        short[] shortArray66 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short67 = org.apache.commons.lang.math.NumberUtils.min(shortArray66);
        short[] shortArray74 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray66, shortArray74);
        short short76 = org.apache.commons.lang.math.NumberUtils.min(shortArray74);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray74);
        short short78 = org.apache.commons.lang.math.NumberUtils.min(shortArray74);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray74);
        java.lang.Class<?> wildcardClass80 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 0 + "'", short42 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 0 + "'", short58 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray66, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) 0 + "'", short67 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray74, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + short76 + "' != '" + (short) -1 + "'", short76 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) -1 + "'", short78 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(97L, (long) (short) 10, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        byte[] byteArray0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray14);
        byte[] byteArray16 = null;
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray16);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte25 = org.apache.commons.lang.math.NumberUtils.min(byteArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray18, byteArray24);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray18);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray6, byteArray18);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray35);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray18, byteArray29);
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray44);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte52 = org.apache.commons.lang.math.NumberUtils.min(byteArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray51);
        byte byte54 = org.apache.commons.lang.math.NumberUtils.max(byteArray44);
        byte byte55 = org.apache.commons.lang.math.NumberUtils.min(byteArray44);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray44);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray44);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -1 + "'", byte25 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) -1 + "'", byte52 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) -1 + "'", byte55 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double[] doubleArray17 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray21 = new double[] { (byte) 10, 1, 1L };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        double double23 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray17);
        double[] doubleArray29 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray33 = new double[] { (byte) 10, 1, 1L };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray33);
        double[] doubleArray39 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray43 = new double[] { (byte) 10, 1, 1L };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray39);
        double double46 = org.apache.commons.lang.math.NumberUtils.max(doubleArray39);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray39);
        double double48 = org.apache.commons.lang.math.NumberUtils.max(doubleArray39);
        double double49 = org.apache.commons.lang.math.NumberUtils.min(doubleArray39);
        double[] doubleArray54 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray58 = new double[] { (byte) 10, 1, 1L };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray64 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray68 = new double[] { (byte) 10, 1, 1L };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray64);
        double[] doubleArray75 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray79 = new double[] { (byte) 10, 1, 1L };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray75, doubleArray79);
        double double81 = org.apache.commons.lang.math.NumberUtils.min(doubleArray75);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray75);
        double double83 = org.apache.commons.lang.math.NumberUtils.max(doubleArray75);
        double double84 = org.apache.commons.lang.math.NumberUtils.max(doubleArray75);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray75);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 97.0d + "'", double48 == 97.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 97.0d + "'", double83 == 97.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 97.0d + "'", double84 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray10);
        int[] intArray18 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray22 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray10, intArray18);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int int27 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        long[] longArray15 = new long[] { (byte) -1 };
        long long16 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        long long17 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray15);
        long[] longArray20 = new long[] { ' ' };
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray20);
        long[] longArray26 = new long[] { ' ' };
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.min(longArray26);
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray26);
        long[] longArray31 = new long[] { (byte) -1 };
        long long32 = org.apache.commons.lang.math.NumberUtils.min(longArray31);
        long[] longArray38 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray38);
        long[] longArray41 = new long[] { (byte) -1 };
        long long42 = org.apache.commons.lang.math.NumberUtils.min(longArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray41);
        long[] longArray45 = new long[] { (byte) -1 };
        long long46 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        long long47 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray41, longArray45);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray45);
        long long50 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray45);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertArrayEquals(longArray45, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, (long) (-1), (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray18 = new double[] { (byte) 10, 1, 1L };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray14);
        double[] doubleArray25 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray29 = new double[] { (byte) 10, 1, 1L };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray29);
        double[] doubleArray35 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray39 = new double[] { (byte) 10, 1, 1L };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray35);
        double[] doubleArray46 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray50 = new double[] { (byte) 10, 1, 1L };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray50);
        double double52 = org.apache.commons.lang.math.NumberUtils.min(doubleArray46);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray46);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray35);
        java.lang.Class<?> wildcardClass55 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray14);
        short[] shortArray19 = new short[] { (byte) 1, (short) 10, (short) 100 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray19);
        short[] shortArray27 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray27);
        short[] shortArray35 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray35);
        short[] shortArray41 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray48 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short49 = org.apache.commons.lang.math.NumberUtils.min(shortArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray48);
        short[] shortArray57 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short58 = org.apache.commons.lang.math.NumberUtils.min(shortArray57);
        short[] shortArray65 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray65);
        short[] shortArray69 = new short[] { (byte) 0, (short) 0 };
        short short70 = org.apache.commons.lang.math.NumberUtils.max(shortArray69);
        short short71 = org.apache.commons.lang.math.NumberUtils.min(shortArray69);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray69);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray48, shortArray69);
        short short74 = org.apache.commons.lang.math.NumberUtils.max(shortArray48);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray48);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray35);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 1, (short) 10, (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray48, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 0 + "'", short49 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 0 + "'", short58 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray65, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray69, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 0 + "'", short70 == (short) 0);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 0 + "'", short71 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + short74 + "' != '" + (short) 10 + "'", short74 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        long[] longArray1 = new long[] { ' ' };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray6 = new long[] { (byte) -1 };
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray6);
        long[] longArray13 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray13);
        long[] longArray16 = new long[] { (byte) -1 };
        long long17 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray16);
        long[] longArray20 = new long[] { (byte) -1 };
        long long21 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray20);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray20);
        long[] longArray26 = new long[] { (byte) -1 };
        long long27 = org.apache.commons.lang.math.NumberUtils.min(longArray26);
        long[] longArray33 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray33);
        long long35 = org.apache.commons.lang.math.NumberUtils.min(longArray33);
        long[] longArray37 = new long[] { (byte) -1 };
        long long38 = org.apache.commons.lang.math.NumberUtils.min(longArray37);
        long[] longArray44 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray37, longArray44);
        long long46 = org.apache.commons.lang.math.NumberUtils.min(longArray37);
        long long47 = org.apache.commons.lang.math.NumberUtils.min(longArray37);
        long long48 = org.apache.commons.lang.math.NumberUtils.min(longArray37);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray37);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray37);
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertArrayEquals(longArray37, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertArrayEquals(longArray44, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int[] intArray23 = new int[] { (byte) -1 };
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int[] intArray31 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray35 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray31);
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = org.apache.commons.lang.math.NumberUtils.max(intArray40);
        int[] intArray46 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.max(intArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray46);
        int[] intArray55 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray59 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(intArray55, intArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray55);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray55);
        int int63 = org.apache.commons.lang.math.NumberUtils.max(intArray55);
        int int64 = org.apache.commons.lang.math.NumberUtils.max(intArray55);
        int[] intArray71 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray75 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(intArray71, intArray75);
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray75);
        int int78 = org.apache.commons.lang.math.NumberUtils.min(intArray75);
        int int79 = org.apache.commons.lang.math.NumberUtils.max(intArray75);
        int[] intArray82 = new int[] { (byte) 1, (byte) 10 };
        int int83 = org.apache.commons.lang.math.NumberUtils.max(intArray82);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray75, intArray82);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray55, intArray82);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray82);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 35 + "'", int64 == 35);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 52 + "'", int79 == 52);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 1, 10 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1L, 0.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(97, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray12 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray19 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray19);
        short[] shortArray24 = new short[] { (byte) 0, (short) 0 };
        short short25 = org.apache.commons.lang.math.NumberUtils.max(shortArray24);
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray24);
        short short29 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        short[] shortArray34 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray41 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray41);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray41);
        short short46 = org.apache.commons.lang.math.NumberUtils.max(shortArray6);
        java.lang.Class<?> wildcardClass47 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 0 + "'", short42 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 10 + "'", short46 == (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long long10 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long11 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray13 = new long[] { (byte) -1 };
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long[] longArray20 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray20);
        long[] longArray23 = new long[] { (byte) -1 };
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray23);
        long[] longArray30 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray30);
        long long33 = org.apache.commons.lang.math.NumberUtils.min(longArray30);
        long[] longArray40 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long41 = org.apache.commons.lang.math.NumberUtils.min(longArray40);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray40);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray40);
        long long45 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        java.lang.Class<?> wildcardClass46 = longArray40.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.min(doubleArray4);
        double double11 = org.apache.commons.lang.math.NumberUtils.min(doubleArray4);
        double double12 = org.apache.commons.lang.math.NumberUtils.min(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(35.0f, (float) (short) 100, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', (float) 52, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 100, (float) 97, (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) (byte) 100, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(32.0d, 35.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '4', 100.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1L), 100.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        float[] floatArray5 = new float[] { 100, 97.0f, 1L, 'a', 32.0f };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray18 = new float[] {};
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        java.lang.Class<?> wildcardClass21 = floatArray9.getClass();
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 100.0f, 97.0f, 1.0f, 97.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 10.0f, (double) '4', (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int[] intArray29 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray33 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray33);
        int[] intArray41 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray45 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray41);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray41);
        int[] intArray50 = new int[] { (byte) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        int[] intArray56 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int57 = org.apache.commons.lang.math.NumberUtils.max(intArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray56);
        int[] intArray65 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray69 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray65, intArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray65);
        int int72 = org.apache.commons.lang.math.NumberUtils.max(intArray65);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray65);
        int[] intArray75 = new int[] { (byte) -1 };
        int int76 = org.apache.commons.lang.math.NumberUtils.max(intArray75);
        int[] intArray81 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int82 = org.apache.commons.lang.math.NumberUtils.max(intArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(intArray75, intArray81);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray81);
        int[] intArray91 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray95 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray91, intArray95);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(intArray81, intArray95);
        int int98 = org.apache.commons.lang.math.NumberUtils.min(intArray95);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertArrayEquals(intArray95, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 10 + "'", int98 == 10);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 0, (double) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double double13 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        double[] doubleArray18 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray22 = new double[] { (byte) 10, 1, 1L };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray18, doubleArray22);
        double[] doubleArray25 = new double[] { 10L };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray25);
        double double27 = org.apache.commons.lang.math.NumberUtils.min(doubleArray22);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray22);
        double double29 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) (short) 100, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, 52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, (float) (-1L), (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long long10 = org.apache.commons.lang.math.NumberUtils.min(longArray8);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray8);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray16 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long17 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray16);
        long long20 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        long[] longArray22 = new long[] { (byte) -1 };
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long[] longArray29 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray29);
        long long31 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long long32 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long[] longArray34 = new long[] { (byte) -1 };
        long long35 = org.apache.commons.lang.math.NumberUtils.min(longArray34);
        long[] longArray41 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray41);
        long[] longArray44 = new long[] { (byte) -1 };
        long long45 = org.apache.commons.lang.math.NumberUtils.min(longArray44);
        long[] longArray51 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray44, longArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray41, longArray51);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray51);
        long[] longArray61 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long62 = org.apache.commons.lang.math.NumberUtils.min(longArray61);
        long long63 = org.apache.commons.lang.math.NumberUtils.max(longArray61);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray61);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray61);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray22);
        long long67 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long long68 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertArrayEquals(longArray29, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertArrayEquals(longArray44, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray20 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short[] shortArray28 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray28);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray28);
        short[] shortArray36 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray43 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short44 = org.apache.commons.lang.math.NumberUtils.min(shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray43);
        short short46 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        short[] shortArray49 = new short[] { (byte) 0, (short) 0 };
        short short50 = org.apache.commons.lang.math.NumberUtils.max(shortArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray49);
        short short52 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray36);
        short[] shortArray58 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray65 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short66 = org.apache.commons.lang.math.NumberUtils.min(shortArray65);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray65);
        short[] shortArray70 = new short[] { (byte) 0, (short) 0 };
        short short71 = org.apache.commons.lang.math.NumberUtils.max(shortArray70);
        short short72 = org.apache.commons.lang.math.NumberUtils.min(shortArray70);
        short short73 = org.apache.commons.lang.math.NumberUtils.min(shortArray70);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray70);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray65);
        short short76 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        short short77 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -1 + "'", short30 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 0 + "'", short44 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 100 + "'", short46 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 0 + "'", short50 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 100 + "'", short52 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray58, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray65, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 0 + "'", short66 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray70, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 0 + "'", short71 == (short) 0);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) 0 + "'", short72 == (short) 0);
        org.junit.Assert.assertTrue("'" + short73 + "' != '" + (short) 0 + "'", short73 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + short76 + "' != '" + (short) 0 + "'", short76 == (short) 0);
        org.junit.Assert.assertTrue("'" + short77 + "' != '" + (short) 0 + "'", short77 == (short) 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1, 100.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        long[] longArray1 = new long[] { ' ' };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { ' ' };
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        java.lang.Class<?> wildcardClass8 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        short[] shortArray0 = null;
        short[] shortArray5 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray12 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short13 = org.apache.commons.lang.math.NumberUtils.min(shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray12);
        short[] shortArray17 = new short[] { (byte) 0, (short) 0 };
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray17);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray17);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray17);
        short short22 = org.apache.commons.lang.math.NumberUtils.max(shortArray12);
        short[] shortArray27 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray34 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short35 = org.apache.commons.lang.math.NumberUtils.min(shortArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray34);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray12);
        // The following exception was thrown during execution in test generation
        try {
            short short39 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 10 + "'", short22 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 0 + "'", short35 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int int23 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        java.lang.Class<?> wildcardClass24 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long[] longArray18 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray18);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray23 = new long[] { (byte) -1 };
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray23);
        long[] longArray30 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray30);
        long[] longArray33 = new long[] { (byte) -1 };
        long long34 = org.apache.commons.lang.math.NumberUtils.min(longArray33);
        long[] longArray40 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray40);
        long[] longArray45 = new long[] { 10L, 32 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray30);
        long[] longArray49 = new long[] { (byte) -1 };
        long long50 = org.apache.commons.lang.math.NumberUtils.min(longArray49);
        long[] longArray56 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray56);
        long long58 = org.apache.commons.lang.math.NumberUtils.min(longArray49);
        long long59 = org.apache.commons.lang.math.NumberUtils.min(longArray49);
        long long60 = org.apache.commons.lang.math.NumberUtils.min(longArray49);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray49);
        long long62 = org.apache.commons.lang.math.NumberUtils.min(longArray49);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertArrayEquals(longArray45, new long[] { 10L, 32L });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertArrayEquals(longArray56, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray10 = null;
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray19 = new float[] { 1.0f, (short) 100, 0L };
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        float[] floatArray25 = new float[] { 1.0f, (short) 100, 0L };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float[] floatArray30 = new float[] { 1.0f, (short) 100, 0L };
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray30);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray25);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray19);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray19);
        float float36 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        float float39 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        java.lang.Class<?> wildcardClass40 = floatArray19.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        float[] floatArray3 = new float[] { 1.0f, (short) 100, 0L };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray8 = new float[] { 1.0f, (short) 100, 0L };
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray8);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray19 = new float[] { 1.0f, (short) 100, 0L };
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray8, floatArray14);
        float[] floatArray28 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray32 = new float[] { 1.0f, (short) 100, 0L };
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray32);
        float[] floatArray37 = new float[] { 1.0f, (short) 100, 0L };
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray37);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray32);
        float[] floatArray44 = new float[] { 1.0f, (short) 100, 0L };
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
        float float46 = org.apache.commons.lang.math.NumberUtils.max(floatArray44);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray44);
        float[] floatArray52 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float53 = org.apache.commons.lang.math.NumberUtils.max(floatArray52);
        float float54 = org.apache.commons.lang.math.NumberUtils.min(floatArray52);
        float float55 = org.apache.commons.lang.math.NumberUtils.min(floatArray52);
        float float56 = org.apache.commons.lang.math.NumberUtils.max(floatArray52);
        float float57 = org.apache.commons.lang.math.NumberUtils.min(floatArray52);
        float[] floatArray58 = null;
        float[] floatArray62 = new float[] { 1.0f, (short) 100, 0L };
        float float63 = org.apache.commons.lang.math.NumberUtils.min(floatArray62);
        float[] floatArray67 = new float[] { 1.0f, (short) 100, 0L };
        float float68 = org.apache.commons.lang.math.NumberUtils.min(floatArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray62, floatArray67);
        float[] floatArray73 = new float[] { 1.0f, (short) 100, 0L };
        float float74 = org.apache.commons.lang.math.NumberUtils.min(floatArray73);
        float[] floatArray78 = new float[] { 1.0f, (short) 100, 0L };
        float float79 = org.apache.commons.lang.math.NumberUtils.min(floatArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(floatArray73, floatArray78);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(floatArray67, floatArray73);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(floatArray58, floatArray67);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray67);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray67);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray32);
        float float86 = org.apache.commons.lang.math.NumberUtils.max(floatArray32);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertArrayEquals(floatArray44, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertArrayEquals(floatArray52, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 10.0f + "'", float53 == 10.0f);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 10.0f + "'", float56 == 10.0f);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.0f + "'", float57 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertArrayEquals(floatArray62, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertArrayEquals(floatArray67, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 0.0f + "'", float68 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertArrayEquals(floatArray73, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.0f + "'", float74 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertArrayEquals(floatArray78, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 0.0f + "'", float79 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + float86 + "' != '" + 100.0f + "'", float86 == 100.0f);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray18 = new double[] { (byte) 10, 1, 1L };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray14);
        double[] doubleArray25 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray29 = new double[] { (byte) 10, 1, 1L };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray29);
        double[] doubleArray35 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray39 = new double[] { (byte) 10, 1, 1L };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray35);
        double[] doubleArray46 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray50 = new double[] { (byte) 10, 1, 1L };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray50);
        double double52 = org.apache.commons.lang.math.NumberUtils.min(doubleArray46);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray46);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray35);
        double[] doubleArray59 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray63 = new double[] { (byte) 10, 1, 1L };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray59, doubleArray63);
        double[] doubleArray69 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray73 = new double[] { (byte) 10, 1, 1L };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray69, doubleArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray63, doubleArray69);
        double double76 = org.apache.commons.lang.math.NumberUtils.min(doubleArray69);
        double double77 = org.apache.commons.lang.math.NumberUtils.min(doubleArray69);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray69);
        double double79 = org.apache.commons.lang.math.NumberUtils.max(doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 97.0d + "'", double79 == 97.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray20 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short[] shortArray28 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray28);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray28);
        short short32 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        java.lang.Class<?> wildcardClass33 = shortArray11.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -1 + "'", short30 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 0 + "'", short32 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float float18 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float[] floatArray22 = new float[] { 1.0f, (short) 100, 0L };
        float float23 = org.apache.commons.lang.math.NumberUtils.min(floatArray22);
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray22);
        float float25 = org.apache.commons.lang.math.NumberUtils.max(floatArray22);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray22);
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float float28 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 35.0f + "'", float18 == 35.0f);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 35.0f + "'", float28 == 35.0f);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        float[] floatArray3 = new float[] { 1.0f, (short) 100, 0L };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray8 = new float[] { 1.0f, (short) 100, 0L };
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray8);
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray12 = new float[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray12);
        float[] floatArray17 = new float[] { 1.0f, (short) 100, 0L };
        float float18 = org.apache.commons.lang.math.NumberUtils.min(floatArray17);
        float[] floatArray22 = new float[] { 1.0f, (short) 100, 0L };
        float float23 = org.apache.commons.lang.math.NumberUtils.min(floatArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray22);
        float[] floatArray28 = new float[] { 1.0f, (short) 100, 0L };
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        float[] floatArray33 = new float[] { 1.0f, (short) 100, 0L };
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray28);
        float[] floatArray42 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray46 = new float[] { 1.0f, (short) 100, 0L };
        float float47 = org.apache.commons.lang.math.NumberUtils.min(floatArray46);
        float[] floatArray51 = new float[] { 1.0f, (short) 100, 0L };
        float float52 = org.apache.commons.lang.math.NumberUtils.min(floatArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray51);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray42, floatArray46);
        float float55 = org.apache.commons.lang.math.NumberUtils.max(floatArray42);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray42);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray42);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertArrayEquals(floatArray42, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertArrayEquals(floatArray46, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertArrayEquals(floatArray51, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 35.0f + "'", float55 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(97, (int) '4', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray14 = new float[] { 100, 97.0f, 1L, 'a', 32.0f };
        float[] floatArray18 = new float[] { 1.0f, (short) 100, 0L };
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float[] floatArray23 = new float[] { 1.0f, (short) 100, 0L };
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray23);
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float[] floatArray27 = new float[] {};
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray18);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float32 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 100.0f, 97.0f, 1.0f, 97.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertArrayEquals(floatArray27, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray16 = new short[] { (byte) 0, (short) 0 };
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray16);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short short21 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray16 = new short[] { (byte) 0, (short) 0 };
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray16);
        short[] shortArray27 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray27);
        short[] shortArray35 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray35);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short short38 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray35);
        short[] shortArray46 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short47 = org.apache.commons.lang.math.NumberUtils.min(shortArray46);
        short[] shortArray54 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray54);
        short short56 = org.apache.commons.lang.math.NumberUtils.min(shortArray54);
        short[] shortArray61 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray68 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short69 = org.apache.commons.lang.math.NumberUtils.min(shortArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray68);
        short[] shortArray77 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short78 = org.apache.commons.lang.math.NumberUtils.min(shortArray77);
        short[] shortArray85 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(shortArray77, shortArray85);
        short[] shortArray89 = new short[] { (byte) 0, (short) 0 };
        short short90 = org.apache.commons.lang.math.NumberUtils.max(shortArray89);
        short short91 = org.apache.commons.lang.math.NumberUtils.min(shortArray89);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(shortArray77, shortArray89);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(shortArray68, shortArray89);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray89);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray54);
        java.lang.Class<?> wildcardClass96 = shortArray54.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -1 + "'", short38 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 0 + "'", short47 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray54, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) -1 + "'", short56 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray61, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray68, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 0 + "'", short69 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray77, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) 0 + "'", short78 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray85, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray89, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short90 + "' != '" + (short) 0 + "'", short90 == (short) 0);
        org.junit.Assert.assertTrue("'" + short91 + "' != '" + (short) 0 + "'", short91 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97L, (double) (short) 1, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) 'a', (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float[] floatArray23 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray27 = new float[] { 1.0f, (short) 100, 0L };
        float float28 = org.apache.commons.lang.math.NumberUtils.min(floatArray27);
        float[] floatArray32 = new float[] { 1.0f, (short) 100, 0L };
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray27, floatArray32);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray27);
        float[] floatArray39 = new float[] { 1.0f, (short) 100, 0L };
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        float[] floatArray44 = new float[] { 1.0f, (short) 100, 0L };
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray44);
        float[] floatArray50 = new float[] { 1.0f, (short) 100, 0L };
        float float51 = org.apache.commons.lang.math.NumberUtils.min(floatArray50);
        float[] floatArray55 = new float[] { 1.0f, (short) 100, 0L };
        float float56 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray55);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray50);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray50);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray23);
        float float61 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        float[] floatArray67 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray71 = new float[] { 1.0f, (short) 100, 0L };
        float float72 = org.apache.commons.lang.math.NumberUtils.min(floatArray71);
        float[] floatArray76 = new float[] { 1.0f, (short) 100, 0L };
        float float77 = org.apache.commons.lang.math.NumberUtils.min(floatArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(floatArray71, floatArray76);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(floatArray67, floatArray71);
        float[] floatArray83 = new float[] { 1.0f, (short) 100, 0L };
        float float84 = org.apache.commons.lang.math.NumberUtils.min(floatArray83);
        float[] floatArray88 = new float[] { 1.0f, (short) 100, 0L };
        float float89 = org.apache.commons.lang.math.NumberUtils.min(floatArray88);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(floatArray83, floatArray88);
        float float91 = org.apache.commons.lang.math.NumberUtils.min(floatArray83);
        float[] floatArray92 = new float[] {};
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(floatArray83, floatArray92);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray71, floatArray92);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray71);
        float float96 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertArrayEquals(floatArray27, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray39, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertArrayEquals(floatArray44, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertArrayEquals(floatArray50, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertArrayEquals(floatArray55, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.0f + "'", float56 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 100.0f + "'", float61 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertArrayEquals(floatArray67, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray71);
        org.junit.Assert.assertArrayEquals(floatArray71, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.0f + "'", float72 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertArrayEquals(floatArray76, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 0.0f + "'", float77 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertArrayEquals(floatArray83, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 0.0f + "'", float84 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray88);
        org.junit.Assert.assertArrayEquals(floatArray88, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 0.0f + "'", float89 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + float91 + "' != '" + 0.0f + "'", float91 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray92);
        org.junit.Assert.assertArrayEquals(floatArray92, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + float96 + "' != '" + 0.0f + "'", float96 == 0.0f);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0.0f, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35L, (double) (byte) 100, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        long[] longArray6 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long long13 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray11);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        long[] longArray1 = new long[] { ' ' };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, 35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 32L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray16 = new short[] { (byte) 0, (short) 0 };
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray16);
        short short21 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        short[] shortArray26 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short34 = org.apache.commons.lang.math.NumberUtils.min(shortArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray33);
        short[] shortArray43 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short44 = org.apache.commons.lang.math.NumberUtils.min(shortArray43);
        short[] shortArray49 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray56 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short57 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray56);
        short[] shortArray61 = new short[] { (byte) 0, (short) 0 };
        short short62 = org.apache.commons.lang.math.NumberUtils.max(shortArray61);
        short short63 = org.apache.commons.lang.math.NumberUtils.min(shortArray61);
        short short64 = org.apache.commons.lang.math.NumberUtils.min(shortArray61);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray56, shortArray61);
        short short66 = org.apache.commons.lang.math.NumberUtils.max(shortArray56);
        short[] shortArray71 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray78 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short79 = org.apache.commons.lang.math.NumberUtils.min(shortArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(shortArray71, shortArray78);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(shortArray56, shortArray78);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray78);
        short short83 = org.apache.commons.lang.math.NumberUtils.min(shortArray43);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(shortArray33, shortArray43);
        short short85 = org.apache.commons.lang.math.NumberUtils.max(shortArray33);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray33, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 0 + "'", short34 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 0 + "'", short44 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray56, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 0 + "'", short57 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray61, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 0 + "'", short62 == (short) 0);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 0 + "'", short63 == (short) 0);
        org.junit.Assert.assertTrue("'" + short64 + "' != '" + (short) 0 + "'", short64 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 10 + "'", short66 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray71, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray78, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 0 + "'", short79 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 0 + "'", short83 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + short85 + "' != '" + (short) 10 + "'", short85 == (short) 10);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray11 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(intArray7, intArray11);
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        int int14 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        int int15 = org.apache.commons.lang.math.NumberUtils.max(intArray11);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray11);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray11);
        int[] intArray24 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray31 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray35 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray35);
        int int37 = org.apache.commons.lang.math.NumberUtils.max(intArray31);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray31);
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray31);
        int[] intArray41 = new int[] { (byte) -1 };
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
        int[] intArray49 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray53 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray49);
        int int56 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
        int[] intArray58 = new int[] { (byte) -1 };
        int int59 = org.apache.commons.lang.math.NumberUtils.max(intArray58);
        int[] intArray64 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int65 = org.apache.commons.lang.math.NumberUtils.max(intArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray58, intArray64);
        int[] intArray73 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray77 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(intArray58, intArray73);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray73);
        int int81 = org.apache.commons.lang.math.NumberUtils.max(intArray73);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray73);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray31);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 35 + "'", int81 == 35);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray9 = new double[] { (byte) 10, 1, 1L };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        double[] doubleArray12 = new double[] { 10L };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray9, doubleArray12);
        double[] doubleArray18 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray22 = new double[] { (byte) 10, 1, 1L };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray18, doubleArray22);
        double[] doubleArray25 = new double[] { 10L };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray25);
        double[] doubleArray31 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray35 = new double[] { (byte) 10, 1, 1L };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray35);
        double double37 = org.apache.commons.lang.math.NumberUtils.min(doubleArray31);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray31);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray9, doubleArray22);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray9);
        java.lang.Class<?> wildcardClass41 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 10, (double) 0L, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, (float) 35, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long long10 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long11 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray13 = new long[] { (byte) -1 };
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long[] longArray20 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray20);
        long[] longArray23 = new long[] { (byte) -1 };
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray23);
        long[] longArray30 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray30);
        long long33 = org.apache.commons.lang.math.NumberUtils.min(longArray30);
        long[] longArray40 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long41 = org.apache.commons.lang.math.NumberUtils.min(longArray40);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray40);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray40);
        long[] longArray46 = new long[] { (byte) -1 };
        long long47 = org.apache.commons.lang.math.NumberUtils.min(longArray46);
        long long48 = org.apache.commons.lang.math.NumberUtils.min(longArray46);
        long[] longArray50 = new long[] { ' ' };
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long long52 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray50);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray46);
        long[] longArray56 = new long[] { (byte) -1 };
        long long57 = org.apache.commons.lang.math.NumberUtils.min(longArray56);
        long[] longArray63 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray63);
        long[] longArray71 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long72 = org.apache.commons.lang.math.NumberUtils.min(longArray71);
        long long73 = org.apache.commons.lang.math.NumberUtils.max(longArray71);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray63, longArray71);
        long[] longArray76 = new long[] { (byte) -1 };
        long long77 = org.apache.commons.lang.math.NumberUtils.min(longArray76);
        long[] longArray83 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray76, longArray83);
        long[] longArray86 = new long[] { (byte) -1 };
        long long87 = org.apache.commons.lang.math.NumberUtils.min(longArray86);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray83, longArray86);
        long long89 = org.apache.commons.lang.math.NumberUtils.min(longArray86);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(longArray71, longArray86);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray71);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray71);
        long long93 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertArrayEquals(longArray50, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertArrayEquals(longArray56, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertArrayEquals(longArray63, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 100L + "'", long73 == 100L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertArrayEquals(longArray76, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertArrayEquals(longArray83, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertArrayEquals(longArray86, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + (-1L) + "'", long89 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + (-1L) + "'", long93 == (-1L));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, 0.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int[] intArray29 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray33 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray33);
        int[] intArray41 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray45 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray41);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray41);
        int[] intArray50 = new int[] { (byte) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        int[] intArray56 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int57 = org.apache.commons.lang.math.NumberUtils.max(intArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray56);
        int[] intArray65 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray69 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray65, intArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray65);
        int int72 = org.apache.commons.lang.math.NumberUtils.max(intArray65);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray65);
        int[] intArray75 = new int[] { (byte) -1 };
        int int76 = org.apache.commons.lang.math.NumberUtils.max(intArray75);
        int[] intArray81 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int82 = org.apache.commons.lang.math.NumberUtils.max(intArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(intArray75, intArray81);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray81);
        int int85 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int86 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 35 + "'", int86 == 35);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, 35, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(97, 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32L, (float) (byte) 1, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float[] floatArray21 = new float[] { 1.0f, (short) 100, 0L };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float float23 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray21);
        float float25 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float float26 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0.0f, 32.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97, 0.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(35.0d, 52.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray9 = new double[] { (byte) 10, 1, 1L };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        double[] doubleArray15 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray19 = new double[] { (byte) 10, 1, 1L };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray15, doubleArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray9, doubleArray15);
        double double22 = org.apache.commons.lang.math.NumberUtils.max(doubleArray9);
        double double23 = org.apache.commons.lang.math.NumberUtils.max(doubleArray9);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray9);
        double[] doubleArray29 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray33 = new double[] { (byte) 10, 1, 1L };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray33);
        double[] doubleArray39 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray43 = new double[] { (byte) 10, 1, 1L };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray39);
        double double46 = org.apache.commons.lang.math.NumberUtils.max(doubleArray39);
        double double47 = org.apache.commons.lang.math.NumberUtils.max(doubleArray39);
        double[] doubleArray52 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray56 = new double[] { (byte) 10, 1, 1L };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray52, doubleArray56);
        double[] doubleArray59 = new double[] { 10L };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray56, doubleArray59);
        double double61 = org.apache.commons.lang.math.NumberUtils.min(doubleArray59);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray59);
        double[] doubleArray67 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray71 = new double[] { (byte) 10, 1, 1L };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray67, doubleArray71);
        double[] doubleArray77 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray81 = new double[] { (byte) 10, 1, 1L };
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray77, doubleArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray71, doubleArray77);
        double[] doubleArray88 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray92 = new double[] { (byte) 10, 1, 1L };
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray88, doubleArray92);
        double double94 = org.apache.commons.lang.math.NumberUtils.min(doubleArray88);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray77, doubleArray88);
        double double96 = org.apache.commons.lang.math.NumberUtils.min(doubleArray77);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray77);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray77);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 97.0d + "'", double47 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-1.0d) + "'", double94 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-1.0d) + "'", double96 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '#', (int) '4', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', 32, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray10 = null;
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray19 = new float[] { 1.0f, (short) 100, 0L };
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        float[] floatArray25 = new float[] { 1.0f, (short) 100, 0L };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float[] floatArray30 = new float[] { 1.0f, (short) 100, 0L };
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray30);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray25);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray19);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray19);
        float float36 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray19);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', (float) (short) 0, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray7 = null;
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray9);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray5);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte27 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        byte[] byteArray36 = null;
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray36);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(byteArray38, byteArray44);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray38);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray38);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte56 = org.apache.commons.lang.math.NumberUtils.min(byteArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(byteArray49, byteArray55);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(byteArray38, byteArray49);
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte65 = org.apache.commons.lang.math.NumberUtils.min(byteArray64);
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte72 = org.apache.commons.lang.math.NumberUtils.min(byteArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray64, byteArray71);
        byte byte74 = org.apache.commons.lang.math.NumberUtils.max(byteArray64);
        byte byte75 = org.apache.commons.lang.math.NumberUtils.min(byteArray64);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(byteArray49, byteArray64);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray49);
        // The following exception was thrown during execution in test generation
        try {
            byte byte78 = org.apache.commons.lang.math.NumberUtils.min(byteArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) -1 + "'", byte27 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) -1 + "'", byte28 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) -1 + "'", byte56 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) -1 + "'", byte65 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) -1 + "'", byte72 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + byte74 + "' != '" + (byte) 1 + "'", byte74 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) -1 + "'", byte75 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray10);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray10);
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray10);
        int int14 = org.apache.commons.lang.math.NumberUtils.max(intArray10);
        int[] intArray17 = new int[] { (byte) 1, (byte) 10 };
        int int18 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray10, intArray17);
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray14 = new float[] { 100, 97.0f, 1L, 'a', 32.0f };
        float[] floatArray18 = new float[] { 1.0f, (short) 100, 0L };
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float[] floatArray23 = new float[] { 1.0f, (short) 100, 0L };
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray23);
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float[] floatArray27 = new float[] {};
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray18);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float float31 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 100.0f, 97.0f, 1.0f, 97.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertArrayEquals(floatArray27, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray7 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray7);
        int[] intArray16 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray20 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32L, (float) 32, (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) -1, 100.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 100, (long) (byte) -1, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1L, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 'a', (float) 0, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 52, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray12 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray19 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray19);
        short[] shortArray24 = new short[] { (byte) 0, (short) 0 };
        short short25 = org.apache.commons.lang.math.NumberUtils.max(shortArray24);
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray24);
        short short29 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        short[] shortArray34 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray41 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray41);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray41);
        short short46 = org.apache.commons.lang.math.NumberUtils.max(shortArray6);
        short short47 = org.apache.commons.lang.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 0 + "'", short42 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 10 + "'", short46 == (short) 10);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 10 + "'", short47 == (short) 10);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 0.0f, (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 10, 0.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, 52.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(97.0d, (double) 32.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 100, (double) 52L, (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        float[] floatArray0 = null;
        float[] floatArray6 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray10 = new float[] { 1.0f, (short) 100, 0L };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float[] floatArray15 = new float[] { 1.0f, (short) 100, 0L };
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray6, floatArray10);
        float[] floatArray24 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray28 = new float[] { 1.0f, (short) 100, 0L };
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        float[] floatArray33 = new float[] { 1.0f, (short) 100, 0L };
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray24, floatArray28);
        float[] floatArray40 = new float[] { 1.0f, (short) 100, 0L };
        float float41 = org.apache.commons.lang.math.NumberUtils.min(floatArray40);
        float[] floatArray45 = new float[] { 1.0f, (short) 100, 0L };
        float float46 = org.apache.commons.lang.math.NumberUtils.min(floatArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray40, floatArray45);
        float[] floatArray51 = new float[] { 1.0f, (short) 100, 0L };
        float float52 = org.apache.commons.lang.math.NumberUtils.min(floatArray51);
        float[] floatArray56 = new float[] { 1.0f, (short) 100, 0L };
        float float57 = org.apache.commons.lang.math.NumberUtils.min(floatArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray56);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray51);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray24, floatArray51);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray24);
        float float62 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float[] floatArray68 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray72 = new float[] { 1.0f, (short) 100, 0L };
        float float73 = org.apache.commons.lang.math.NumberUtils.min(floatArray72);
        float[] floatArray77 = new float[] { 1.0f, (short) 100, 0L };
        float float78 = org.apache.commons.lang.math.NumberUtils.min(floatArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(floatArray72, floatArray77);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(floatArray68, floatArray72);
        float[] floatArray84 = new float[] { 1.0f, (short) 100, 0L };
        float float85 = org.apache.commons.lang.math.NumberUtils.min(floatArray84);
        float[] floatArray89 = new float[] { 1.0f, (short) 100, 0L };
        float float90 = org.apache.commons.lang.math.NumberUtils.min(floatArray89);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(floatArray84, floatArray89);
        float float92 = org.apache.commons.lang.math.NumberUtils.min(floatArray84);
        float[] floatArray93 = new float[] {};
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray84, floatArray93);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray72, floatArray93);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray72);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray10);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertArrayEquals(floatArray40, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertArrayEquals(floatArray51, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertArrayEquals(floatArray56, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.0f + "'", float57 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 100.0f + "'", float62 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertArrayEquals(floatArray68, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertArrayEquals(floatArray72, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 0.0f + "'", float73 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertArrayEquals(floatArray77, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 0.0f + "'", float78 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertArrayEquals(floatArray84, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 0.0f + "'", float85 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray89);
        org.junit.Assert.assertArrayEquals(floatArray89, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float90 + "' != '" + 0.0f + "'", float90 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + 0.0f + "'", float92 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray93);
        org.junit.Assert.assertArrayEquals(floatArray93, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray14);
        short[] shortArray19 = new short[] { (byte) 1, (short) 10, (short) 100 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray19);
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short23 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 1, (short) 10, (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 10 + "'", short23 == (short) 10);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, (long) '4', (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) 0, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32.0f, (double) 35L, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(52L, (long) (short) 0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35L, (double) '#', (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(97.0f, (float) (byte) -1, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, 32, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((-1), 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(52, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float[] floatArray21 = new float[] { 1.0f, (short) 100, 0L };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray26 = new float[] { 1.0f, (short) 100, 0L };
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray26);
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray30 = new float[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray30);
        float[] floatArray36 = new float[] { 1.0f, (short) 100, 0L };
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray41 = new float[] { 1.0f, (short) 100, 0L };
        float float42 = org.apache.commons.lang.math.NumberUtils.min(floatArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray41);
        float float44 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray45 = new float[] {};
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray45);
        float[] floatArray53 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray57 = new float[] { 1.0f, (short) 100, 0L };
        float float58 = org.apache.commons.lang.math.NumberUtils.min(floatArray57);
        float[] floatArray62 = new float[] { 1.0f, (short) 100, 0L };
        float float63 = org.apache.commons.lang.math.NumberUtils.min(floatArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(floatArray57, floatArray62);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray57);
        float[] floatArray69 = new float[] { 1.0f, (short) 100, 0L };
        float float70 = org.apache.commons.lang.math.NumberUtils.min(floatArray69);
        float[] floatArray74 = new float[] { 1.0f, (short) 100, 0L };
        float float75 = org.apache.commons.lang.math.NumberUtils.min(floatArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(floatArray69, floatArray74);
        float[] floatArray80 = new float[] { 1.0f, (short) 100, 0L };
        float float81 = org.apache.commons.lang.math.NumberUtils.min(floatArray80);
        float[] floatArray85 = new float[] { 1.0f, (short) 100, 0L };
        float float86 = org.apache.commons.lang.math.NumberUtils.min(floatArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(floatArray80, floatArray85);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(floatArray74, floatArray80);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray80);
        float float90 = org.apache.commons.lang.math.NumberUtils.min(floatArray53);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray53);
        // The following exception was thrown during execution in test generation
        try {
            float float92 = org.apache.commons.lang.math.NumberUtils.max(floatArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertArrayEquals(floatArray41, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertArrayEquals(floatArray53, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertArrayEquals(floatArray57, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertArrayEquals(floatArray62, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertArrayEquals(floatArray69, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertArrayEquals(floatArray74, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(floatArray80);
        org.junit.Assert.assertArrayEquals(floatArray80, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + 0.0f + "'", float81 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray85);
        org.junit.Assert.assertArrayEquals(floatArray85, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float86 + "' != '" + 0.0f + "'", float86 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + float90 + "' != '" + (-1.0f) + "'", float90 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', 1L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray10);
        int[] intArray18 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray22 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray22);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray22);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray22);
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(1.0f, (float) (byte) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (int) '4', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97, 1.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10, (double) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10, (float) (byte) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) (byte) 1, (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray17 = new short[] { (byte) 0, (short) 0 };
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray17);
        short[] shortArray24 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray31 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short32 = org.apache.commons.lang.math.NumberUtils.min(shortArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray31);
        short[] shortArray40 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short41 = org.apache.commons.lang.math.NumberUtils.min(shortArray40);
        short[] shortArray48 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray48);
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray48);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray48);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray17, shortArray31);
        short short53 = org.apache.commons.lang.math.NumberUtils.min(shortArray17);
        short[] shortArray60 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short61 = org.apache.commons.lang.math.NumberUtils.min(shortArray60);
        short[] shortArray68 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray68);
        short[] shortArray73 = new short[] { (byte) 1, (short) 10, (short) 100 };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray68, shortArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray17, shortArray73);
        java.lang.Class<?> wildcardClass76 = shortArray73.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 0 + "'", short32 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) 0 + "'", short41 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray48, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) -1 + "'", short50 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 0 + "'", short53 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray60, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 0 + "'", short61 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray68, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray73, new short[] { (short) 1, (short) 10, (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, 0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32, (double) 1, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 0, (byte) 1 };
        byte byte12 = org.apache.commons.lang.math.NumberUtils.max(byteArray11);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray18);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.min(byteArray18);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte27 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte[] byteArray28 = null;
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray30);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray18, byteArray30);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte48 = org.apache.commons.lang.math.NumberUtils.min(byteArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray47);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray41);
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte57 = org.apache.commons.lang.math.NumberUtils.min(byteArray56);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte64 = org.apache.commons.lang.math.NumberUtils.min(byteArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray63);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.min(byteArray63);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte73 = org.apache.commons.lang.math.NumberUtils.min(byteArray72);
        byte[] byteArray74 = null;
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray74);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte83 = org.apache.commons.lang.math.NumberUtils.min(byteArray82);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(byteArray76, byteArray82);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray76);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray76);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray76);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(byteArray11, byteArray30);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray11);
        java.lang.Class<?> wildcardClass90 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) -1 + "'", byte27 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) -1 + "'", byte37 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) -1 + "'", byte48 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) -1 + "'", byte57 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) -1 + "'", byte64 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) -1 + "'", byte66 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) -1 + "'", byte73 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte83 + "' != '" + (byte) -1 + "'", byte83 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10, (float) 32L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', (long) 1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray11 = new float[] { 1.0f, (short) 100, 0L };
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray11);
        float[] floatArray16 = new float[] { 1.0f, (short) 100, 0L };
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray16);
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray11);
        float[] floatArray20 = new float[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray11);
        float float23 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float25 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double double13 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        double[] doubleArray18 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray22 = new double[] { (byte) 10, 1, 1L };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray18, doubleArray22);
        double[] doubleArray25 = new double[] { 10L };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray25);
        double double27 = org.apache.commons.lang.math.NumberUtils.min(doubleArray22);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray22);
        java.lang.Class<?> wildcardClass29 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) 1, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 1, (float) 97, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 100, (long) (byte) 10, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) '#', (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 52, (double) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray20 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short[] shortArray28 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray28);
        short[] shortArray32 = new short[] { (byte) 0, (short) 0 };
        short short33 = org.apache.commons.lang.math.NumberUtils.max(shortArray32);
        short short34 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray32);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray32);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        short short38 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        short short39 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 0 + "'", short33 == (short) 0);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 0 + "'", short34 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 0 + "'", short37 == (short) 0);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 0 + "'", short38 == (short) 0);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 10 + "'", short39 == (short) 10);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        short[] shortArray19 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray26);
        short short29 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray19);
        short[] shortArray35 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray42 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short43 = org.apache.commons.lang.math.NumberUtils.min(shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray42);
        short short45 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short[] shortArray50 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray57 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short58 = org.apache.commons.lang.math.NumberUtils.min(shortArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray50, shortArray57);
        short short60 = org.apache.commons.lang.math.NumberUtils.max(shortArray57);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray57);
        short short62 = org.apache.commons.lang.math.NumberUtils.max(shortArray35);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray35);
        short short64 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) -1 + "'", short29 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray42, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 0 + "'", short43 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) -1 + "'", short45 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 0 + "'", short58 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 10 + "'", short60 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 100 + "'", short62 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + short64 + "' != '" + (short) 100 + "'", short64 == (short) 100);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) (short) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), (float) 100, (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long[] longArray18 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray18);
        long[] longArray22 = new long[] { (byte) -1 };
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long[] longArray26 = new long[] { ' ' };
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.min(longArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray26);
        long[] longArray31 = new long[] { (byte) -1 };
        long long32 = org.apache.commons.lang.math.NumberUtils.min(longArray31);
        long long33 = org.apache.commons.lang.math.NumberUtils.min(longArray31);
        long[] longArray35 = new long[] { ' ' };
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
        long long37 = org.apache.commons.lang.math.NumberUtils.min(longArray35);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray31);
        long[] longArray41 = new long[] { (byte) -1 };
        long long42 = org.apache.commons.lang.math.NumberUtils.min(longArray41);
        long[] longArray48 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray41, longArray48);
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long[] longArray51 = null;
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray51);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray51);
        // The following exception was thrown during execution in test generation
        try {
            long long55 = org.apache.commons.lang.math.NumberUtils.min(longArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertArrayEquals(longArray48, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, (float) 97, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray14);
        short[] shortArray19 = new short[] { (byte) 1, (short) 10, (short) 100 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray19);
        short[] shortArray27 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray27);
        short[] shortArray35 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray35);
        short[] shortArray40 = new short[] { (byte) 1, (short) 10, (short) 100 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray40);
        short short42 = org.apache.commons.lang.math.NumberUtils.max(shortArray35);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray35);
        short short44 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 1, (short) 10, (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] { (short) 1, (short) 10, (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 10 + "'", short42 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 100 + "'", short44 == (short) 100);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double[] doubleArray17 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray21 = new double[] { (byte) 10, 1, 1L };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        double[] doubleArray24 = new double[] { 10L };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray24);
        double[] doubleArray30 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray34 = new double[] { (byte) 10, 1, 1L };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        double double36 = org.apache.commons.lang.math.NumberUtils.min(doubleArray30);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray30);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray21);
        double double39 = org.apache.commons.lang.math.NumberUtils.max(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32L, (double) 97, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte22 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        byte[] byteArray31 = null;
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray31);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte40 = org.apache.commons.lang.math.NumberUtils.min(byteArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray39);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray33);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray33);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray50);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray44);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte60 = org.apache.commons.lang.math.NumberUtils.min(byteArray59);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.min(byteArray59);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray59);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray33);
        byte byte64 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -1 + "'", byte30 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) -1 + "'", byte40 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) -1 + "'", byte60 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) -1 + "'", byte61 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) -1 + "'", byte64 == (byte) -1);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray21 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
        short[] shortArray29 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray29);
        short short31 = org.apache.commons.lang.math.NumberUtils.min(shortArray29);
        short[] shortArray36 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray43 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short44 = org.apache.commons.lang.math.NumberUtils.min(shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray43);
        short[] shortArray52 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short53 = org.apache.commons.lang.math.NumberUtils.min(shortArray52);
        short[] shortArray60 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray60);
        short[] shortArray64 = new short[] { (byte) 0, (short) 0 };
        short short65 = org.apache.commons.lang.math.NumberUtils.max(shortArray64);
        short short66 = org.apache.commons.lang.math.NumberUtils.min(shortArray64);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray64);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray64);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray64);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray29);
        short short71 = org.apache.commons.lang.math.NumberUtils.min(shortArray29);
        short[] shortArray76 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray83 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short84 = org.apache.commons.lang.math.NumberUtils.min(shortArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(shortArray76, shortArray83);
        short short86 = org.apache.commons.lang.math.NumberUtils.max(shortArray76);
        short[] shortArray89 = new short[] { (byte) 0, (short) 0 };
        short short90 = org.apache.commons.lang.math.NumberUtils.max(shortArray89);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(shortArray76, shortArray89);
        short short92 = org.apache.commons.lang.math.NumberUtils.max(shortArray76);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray76);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 0 + "'", short44 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 0 + "'", short53 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray60, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray64, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) 0 + "'", short65 == (short) 0);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 0 + "'", short66 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) -1 + "'", short71 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray76, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray83, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short84 + "' != '" + (short) 0 + "'", short84 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + short86 + "' != '" + (short) 100 + "'", short86 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray89, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short90 + "' != '" + (short) 0 + "'", short90 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + short92 + "' != '" + (short) 100 + "'", short92 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray24 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray24);
        int[] intArray33 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray37 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray33);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        int[] intArray49 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray53 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray53);
        int[] intArray61 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray65 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray65);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray53, intArray61);
        int int68 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray61);
        int int70 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 0, 32.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 0, (float) 100, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray16 = null;
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray16);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        byte byte25 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte32 = org.apache.commons.lang.math.NumberUtils.min(byteArray31);
        byte[] byteArray33 = null;
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray31, byteArray33);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray35, byteArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray31, byteArray35);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray35);
        byte[] byteArray46 = null;
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray35, byteArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray46);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -1 + "'", byte25 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -1 + "'", byte32 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, 1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 100, (long) 1, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100, (double) (short) 1, 97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32L, (float) 32, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray16 = new short[] { (byte) 0, (short) 0 };
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray16);
        short[] shortArray27 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray27);
        short[] shortArray35 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray35);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short short38 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray35);
        short[] shortArray44 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray51 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short52 = org.apache.commons.lang.math.NumberUtils.min(shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray51);
        short[] shortArray56 = new short[] { (byte) 0, (short) 0 };
        short short57 = org.apache.commons.lang.math.NumberUtils.max(shortArray56);
        short short58 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        short short59 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray51, shortArray56);
        short[] shortArray65 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray72 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short73 = org.apache.commons.lang.math.NumberUtils.min(shortArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray72);
        short short75 = org.apache.commons.lang.math.NumberUtils.min(shortArray65);
        short[] shortArray80 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray87 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short88 = org.apache.commons.lang.math.NumberUtils.min(shortArray87);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(shortArray80, shortArray87);
        short short90 = org.apache.commons.lang.math.NumberUtils.min(shortArray80);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray80);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(shortArray51, shortArray65);
        short short93 = org.apache.commons.lang.math.NumberUtils.min(shortArray65);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray65);
        short short95 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -1 + "'", short38 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 0 + "'", short52 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray56, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 0 + "'", short57 == (short) 0);
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 0 + "'", short58 == (short) 0);
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 0 + "'", short59 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray65, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray72, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short73 + "' != '" + (short) 0 + "'", short73 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) -1 + "'", short75 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray80, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray87, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short88 + "' != '" + (short) 0 + "'", short88 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + short90 + "' != '" + (short) -1 + "'", short90 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + short93 + "' != '" + (short) -1 + "'", short93 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + short95 + "' != '" + (short) -1 + "'", short95 == (short) -1);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long long10 = org.apache.commons.lang.math.NumberUtils.min(longArray8);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray13 = new long[] { (byte) -1 };
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long[] longArray17 = new long[] { ' ' };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long long19 = org.apache.commons.lang.math.NumberUtils.min(longArray17);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray17);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long[] longArray24 = new long[] { (byte) -1 };
        long long25 = org.apache.commons.lang.math.NumberUtils.min(longArray24);
        long[] longArray31 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray31);
        long[] longArray39 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray39);
        long long43 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        long[] longArray45 = new long[] { (byte) -1 };
        long long46 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        long[] longArray52 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray52);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        long long55 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        long[] longArray57 = new long[] { (byte) -1 };
        long long58 = org.apache.commons.lang.math.NumberUtils.min(longArray57);
        long[] longArray64 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray57, longArray64);
        long[] longArray67 = new long[] { (byte) -1 };
        long long68 = org.apache.commons.lang.math.NumberUtils.min(longArray67);
        long[] longArray74 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(longArray67, longArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray64, longArray74);
        long long77 = org.apache.commons.lang.math.NumberUtils.min(longArray74);
        long[] longArray84 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long85 = org.apache.commons.lang.math.NumberUtils.min(longArray84);
        long long86 = org.apache.commons.lang.math.NumberUtils.max(longArray84);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(longArray74, longArray84);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray84);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray45);
        long long90 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        long long91 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        long long92 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray45);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray45);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertArrayEquals(longArray39, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertArrayEquals(longArray45, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertArrayEquals(longArray52, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertArrayEquals(longArray57, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertArrayEquals(longArray64, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertArrayEquals(longArray67, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertArrayEquals(longArray74, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertArrayEquals(longArray84, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 100L + "'", long86 == 100L);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-1L) + "'", long90 == (-1L));
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-1L) + "'", long91 == (-1L));
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-1L) + "'", long92 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(10.0f, (float) 35, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 10, (long) '#', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(97, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97.0f, 35.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        long[] longArray15 = new long[] { (byte) -1 };
        long long16 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        long long17 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray15);
        long[] longArray20 = new long[] { ' ' };
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray20);
        long[] longArray26 = new long[] { (byte) -1 };
        long long27 = org.apache.commons.lang.math.NumberUtils.min(longArray26);
        long[] longArray33 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray33);
        long[] longArray36 = new long[] { (byte) -1 };
        long long37 = org.apache.commons.lang.math.NumberUtils.min(longArray36);
        long[] longArray43 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray43);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray43);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray20 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short[] shortArray28 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray28);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray28);
        short[] shortArray36 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray43 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short44 = org.apache.commons.lang.math.NumberUtils.min(shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray43);
        short short46 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        short[] shortArray49 = new short[] { (byte) 0, (short) 0 };
        short short50 = org.apache.commons.lang.math.NumberUtils.max(shortArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray49);
        short short52 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray36);
        short short54 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        short short55 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        short short56 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -1 + "'", short30 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 0 + "'", short44 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 100 + "'", short46 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 0 + "'", short50 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 100 + "'", short52 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 10 + "'", short54 == (short) 10);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 10 + "'", short55 == (short) 10);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 0 + "'", short56 == (short) 0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 1, (long) (short) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, (long) 52, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 97.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long long10 = org.apache.commons.lang.math.NumberUtils.min(longArray8);
        long[] longArray12 = new long[] { (byte) -1 };
        long long13 = org.apache.commons.lang.math.NumberUtils.min(longArray12);
        long[] longArray19 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray19);
        long long21 = org.apache.commons.lang.math.NumberUtils.min(longArray12);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray12);
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray12);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray12);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray27 = new long[] { ' ' };
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray27);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray27);
        long[] longArray32 = new long[] { (byte) -1 };
        long long33 = org.apache.commons.lang.math.NumberUtils.min(longArray32);
        long[] longArray39 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray39);
        long[] longArray42 = new long[] { (byte) -1 };
        long long43 = org.apache.commons.lang.math.NumberUtils.min(longArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray42);
        long[] longArray46 = new long[] { (byte) -1 };
        long long47 = org.apache.commons.lang.math.NumberUtils.min(longArray46);
        long long48 = org.apache.commons.lang.math.NumberUtils.min(longArray46);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray46);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray46);
        long[] longArray51 = null;
        long[] longArray53 = new long[] { (byte) -1 };
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray53);
        long[] longArray60 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray53, longArray60);
        long[] longArray68 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long69 = org.apache.commons.lang.math.NumberUtils.min(longArray68);
        long long70 = org.apache.commons.lang.math.NumberUtils.max(longArray68);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray68);
        long[] longArray73 = new long[] { (byte) -1 };
        long long74 = org.apache.commons.lang.math.NumberUtils.min(longArray73);
        long[] longArray80 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(longArray73, longArray80);
        long[] longArray83 = new long[] { (byte) -1 };
        long long84 = org.apache.commons.lang.math.NumberUtils.min(longArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(longArray80, longArray83);
        long long86 = org.apache.commons.lang.math.NumberUtils.min(longArray83);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray83);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray68);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray68);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray27);
        long long91 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertArrayEquals(longArray39, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertArrayEquals(longArray53, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertArrayEquals(longArray60, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertArrayEquals(longArray68, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertArrayEquals(longArray73, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertArrayEquals(longArray80, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertArrayEquals(longArray83, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1L) + "'", long86 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 32L + "'", long91 == 32L);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((-1L), (-1L), 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97L, (float) 97L, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1), (double) (byte) 1, (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) (byte) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 0, 0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray24 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray24);
        int[] intArray33 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray37 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray33);
        int int41 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        int[] intArray49 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray53 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray53);
        int int55 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        int int56 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        int int57 = org.apache.commons.lang.math.NumberUtils.max(intArray53);
        int[] intArray60 = new int[] { (byte) 1, (byte) 10 };
        int int61 = org.apache.commons.lang.math.NumberUtils.max(intArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray53, intArray60);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray60);
        int int64 = org.apache.commons.lang.math.NumberUtils.max(intArray60);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray60);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 1, 10 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray17 = new short[] { (byte) 0, (short) 0 };
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray17);
        short short20 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray25 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray32 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray32);
        short[] shortArray39 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray46 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short47 = org.apache.commons.lang.math.NumberUtils.min(shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray46);
        short short49 = org.apache.commons.lang.math.NumberUtils.max(shortArray39);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray39);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray25);
        short[] shortArray52 = null;
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray52);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 0 + "'", short33 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray39, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 0 + "'", short47 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 100 + "'", short49 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray5);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray17 = null;
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            byte byte19 = org.apache.commons.lang.math.NumberUtils.max(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 0, (long) 'a', (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        long[] longArray1 = new long[] { ' ' };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray6 = new long[] { (byte) -1 };
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray6);
        long[] longArray13 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray13);
        long[] longArray16 = new long[] { (byte) -1 };
        long long17 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray16);
        long[] longArray20 = new long[] { (byte) -1 };
        long long21 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray20);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray20);
        long[] longArray25 = null;
        long[] longArray27 = new long[] { (byte) -1 };
        long long28 = org.apache.commons.lang.math.NumberUtils.min(longArray27);
        long[] longArray34 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray34);
        long[] longArray42 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long43 = org.apache.commons.lang.math.NumberUtils.min(longArray42);
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray42);
        long[] longArray47 = new long[] { (byte) -1 };
        long long48 = org.apache.commons.lang.math.NumberUtils.min(longArray47);
        long[] longArray54 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray54);
        long[] longArray57 = new long[] { (byte) -1 };
        long long58 = org.apache.commons.lang.math.NumberUtils.min(longArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray54, longArray57);
        long long60 = org.apache.commons.lang.math.NumberUtils.min(longArray57);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray57);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray42);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray42);
        long[] longArray65 = new long[] { ' ' };
        long long66 = org.apache.commons.lang.math.NumberUtils.max(longArray65);
        long long67 = org.apache.commons.lang.math.NumberUtils.min(longArray65);
        long long68 = org.apache.commons.lang.math.NumberUtils.min(longArray65);
        long[] longArray70 = new long[] { (byte) -1 };
        long long71 = org.apache.commons.lang.math.NumberUtils.min(longArray70);
        long[] longArray77 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(longArray70, longArray77);
        long[] longArray80 = new long[] { (byte) -1 };
        long long81 = org.apache.commons.lang.math.NumberUtils.min(longArray80);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(longArray77, longArray80);
        long[] longArray84 = new long[] { (byte) -1 };
        long long85 = org.apache.commons.lang.math.NumberUtils.min(longArray84);
        long long86 = org.apache.commons.lang.math.NumberUtils.min(longArray84);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(longArray80, longArray84);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray65, longArray84);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray84);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertArrayEquals(longArray47, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertArrayEquals(longArray54, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertArrayEquals(longArray57, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertArrayEquals(longArray65, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 32L + "'", long66 == 32L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 32L + "'", long67 == 32L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 32L + "'", long68 == 32L);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertArrayEquals(longArray70, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertArrayEquals(longArray77, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertArrayEquals(longArray80, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertArrayEquals(longArray84, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1L) + "'", long86 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double[] doubleArray17 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray21 = new double[] { (byte) 10, 1, 1L };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        double[] doubleArray24 = new double[] { 10L };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray24);
        double[] doubleArray30 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray34 = new double[] { (byte) 10, 1, 1L };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        double double36 = org.apache.commons.lang.math.NumberUtils.min(doubleArray30);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray30);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray21);
        double double39 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double[] doubleArray44 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray48 = new double[] { (byte) 10, 1, 1L };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray48);
        double[] doubleArray51 = new double[] { 10L };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray48, doubleArray51);
        double double53 = org.apache.commons.lang.math.NumberUtils.min(doubleArray51);
        double double54 = org.apache.commons.lang.math.NumberUtils.min(doubleArray51);
        double double55 = org.apache.commons.lang.math.NumberUtils.max(doubleArray51);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray51);
        double double57 = org.apache.commons.lang.math.NumberUtils.max(doubleArray51);
        double[] doubleArray62 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray66 = new double[] { (byte) 10, 1, 1L };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        double double68 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray51, doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97.0f, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '4', 35.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte21 = org.apache.commons.lang.math.NumberUtils.min(byteArray20);
        byte[] byteArray22 = null;
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray22);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray30);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray24);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray24);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray35, byteArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray35);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray50);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray24);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte60 = org.apache.commons.lang.math.NumberUtils.min(byteArray59);
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte67 = org.apache.commons.lang.math.NumberUtils.min(byteArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray66);
        byte byte69 = org.apache.commons.lang.math.NumberUtils.max(byteArray59);
        byte byte70 = org.apache.commons.lang.math.NumberUtils.min(byteArray59);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray59);
        // The following exception was thrown during execution in test generation
        try {
            byte byte72 = org.apache.commons.lang.math.NumberUtils.min(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) -1 + "'", byte60 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) -1 + "'", byte67 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) 1 + "'", byte69 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) -1 + "'", byte70 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray21 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
        short[] shortArray29 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray29);
        short short31 = org.apache.commons.lang.math.NumberUtils.min(shortArray29);
        short[] shortArray36 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray43 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short44 = org.apache.commons.lang.math.NumberUtils.min(shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray43);
        short[] shortArray52 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short53 = org.apache.commons.lang.math.NumberUtils.min(shortArray52);
        short[] shortArray60 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray60);
        short[] shortArray64 = new short[] { (byte) 0, (short) 0 };
        short short65 = org.apache.commons.lang.math.NumberUtils.max(shortArray64);
        short short66 = org.apache.commons.lang.math.NumberUtils.min(shortArray64);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray64);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray64);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray64);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray29);
        short[] shortArray77 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short78 = org.apache.commons.lang.math.NumberUtils.min(shortArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray77);
        short short80 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 0 + "'", short44 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 0 + "'", short53 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray60, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray64, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) 0 + "'", short65 == (short) 0);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 0 + "'", short66 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray77, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) 0 + "'", short78 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + short80 + "' != '" + (short) -1 + "'", short80 == (short) -1);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1L), 97.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray16 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long17 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray16);
        long long20 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        long[] longArray22 = new long[] { (byte) -1 };
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long[] longArray29 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray29);
        long long31 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long long32 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long[] longArray34 = new long[] { (byte) -1 };
        long long35 = org.apache.commons.lang.math.NumberUtils.min(longArray34);
        long[] longArray41 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray41);
        long[] longArray44 = new long[] { (byte) -1 };
        long long45 = org.apache.commons.lang.math.NumberUtils.min(longArray44);
        long[] longArray51 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray44, longArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray41, longArray51);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray51);
        long[] longArray61 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long62 = org.apache.commons.lang.math.NumberUtils.min(longArray61);
        long long63 = org.apache.commons.lang.math.NumberUtils.max(longArray61);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray61);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray61);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray22);
        long long67 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertArrayEquals(longArray29, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertArrayEquals(longArray44, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 100L + "'", long67 == 100L);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        long[] longArray6 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long[] longArray10 = new long[] { ' ' };
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray10);
        long long13 = org.apache.commons.lang.math.NumberUtils.min(longArray10);
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray10);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray10);
        long long16 = org.apache.commons.lang.math.NumberUtils.min(longArray10);
        long[] longArray18 = new long[] { (byte) -1 };
        long long19 = org.apache.commons.lang.math.NumberUtils.min(longArray18);
        long[] longArray25 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray25);
        long[] longArray33 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long34 = org.apache.commons.lang.math.NumberUtils.min(longArray33);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray33);
        long long37 = org.apache.commons.lang.math.NumberUtils.min(longArray33);
        long[] longArray39 = new long[] { (byte) -1 };
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        long[] longArray46 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray46);
        long long48 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        long long49 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        long[] longArray51 = new long[] { (byte) -1 };
        long long52 = org.apache.commons.lang.math.NumberUtils.min(longArray51);
        long[] longArray58 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray58);
        long[] longArray61 = new long[] { (byte) -1 };
        long long62 = org.apache.commons.lang.math.NumberUtils.min(longArray61);
        long[] longArray68 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(longArray61, longArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray68);
        long long71 = org.apache.commons.lang.math.NumberUtils.min(longArray68);
        long[] longArray78 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long79 = org.apache.commons.lang.math.NumberUtils.min(longArray78);
        long long80 = org.apache.commons.lang.math.NumberUtils.max(longArray78);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray78);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray78);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray39);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray39);
        long long85 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertArrayEquals(longArray39, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertArrayEquals(longArray58, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertArrayEquals(longArray68, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertArrayEquals(longArray78, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 100L + "'", long80 == 100L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, (-1), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) '#', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, 100.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float[] floatArray21 = new float[] { 1.0f, (short) 100, 0L };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray26 = new float[] { 1.0f, (short) 100, 0L };
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray26);
        float[] floatArray32 = new float[] { 1.0f, (short) 100, 0L };
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray32);
        float[] floatArray37 = new float[] { 1.0f, (short) 100, 0L };
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray37);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray32);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray32);
        float float42 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float[] floatArray46 = new float[] { 1.0f, (short) 100, 0L };
        float float47 = org.apache.commons.lang.math.NumberUtils.min(floatArray46);
        float float48 = org.apache.commons.lang.math.NumberUtils.max(floatArray46);
        float[] floatArray52 = new float[] { 1.0f, (short) 100, 0L };
        float float53 = org.apache.commons.lang.math.NumberUtils.min(floatArray52);
        float[] floatArray57 = new float[] { 1.0f, (short) 100, 0L };
        float float58 = org.apache.commons.lang.math.NumberUtils.min(floatArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray57);
        float[] floatArray63 = new float[] { 1.0f, (short) 100, 0L };
        float float64 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
        float[] floatArray68 = new float[] { 1.0f, (short) 100, 0L };
        float float69 = org.apache.commons.lang.math.NumberUtils.min(floatArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(floatArray63, floatArray68);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(floatArray57, floatArray63);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray63);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray63);
        float float74 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertArrayEquals(floatArray46, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 100.0f + "'", float48 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertArrayEquals(floatArray52, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertArrayEquals(floatArray57, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertArrayEquals(floatArray63, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertArrayEquals(floatArray68, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 0.0f + "'", float69 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.0f + "'", float74 == 0.0f);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) ' ', (float) (short) 10, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int16 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray26 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray30 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray26);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray35 = new int[] { (byte) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        int[] intArray41 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray41);
        int[] intArray50 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray54 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray50);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray50);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray18);
        int int59 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int61 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (-1L), 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }
}

