package org.apache.commons.lang.math;

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
        java.lang.Class<?> wildcardClass93 = longArray71.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray18 = new double[] { (byte) 10, 1, 1L };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray14);
        double double21 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double23 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double24 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double25 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double26 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        int int59 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
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
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray36);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray36, byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte53 = org.apache.commons.lang.math.NumberUtils.min(byteArray52);
        byte[] byteArray54 = null;
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(byteArray52, byteArray54);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte63 = org.apache.commons.lang.math.NumberUtils.min(byteArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray62);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray52, byteArray56);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray56);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte byte68 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray43);
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
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) -1 + "'", byte37 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) -1 + "'", byte46 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) -1 + "'", byte53 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) -1 + "'", byte63 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) -1 + "'", byte67 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) 1 + "'", byte68 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double double13 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        double[] doubleArray18 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray22 = new double[] { (byte) 10, 1, 1L };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray18, doubleArray22);
        double[] doubleArray25 = new double[] { 10L };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray25);
        double[] doubleArray31 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray35 = new double[] { (byte) 10, 1, 1L };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray35);
        double[] doubleArray38 = new double[] { 10L };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray38);
        double[] doubleArray44 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray48 = new double[] { (byte) 10, 1, 1L };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray48);
        double double50 = org.apache.commons.lang.math.NumberUtils.min(doubleArray44);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray44);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray35);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray22);
        double double54 = org.apache.commons.lang.math.NumberUtils.min(doubleArray22);
        double double55 = org.apache.commons.lang.math.NumberUtils.min(doubleArray22);
        double[] doubleArray56 = null;
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray56);
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
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
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte52 = org.apache.commons.lang.math.NumberUtils.min(byteArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray45, byteArray51);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray45);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte61 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray60);
        byte byte63 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        byte[] byteArray64 = null;
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray60);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte73 = org.apache.commons.lang.math.NumberUtils.min(byteArray72);
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte80 = org.apache.commons.lang.math.NumberUtils.min(byteArray79);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray79);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte byte83 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray72);
        byte byte85 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        byte byte86 = org.apache.commons.lang.math.NumberUtils.max(byteArray60);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
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
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) -1 + "'", byte52 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) -1 + "'", byte61 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) -1 + "'", byte63 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) -1 + "'", byte73 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) -1 + "'", byte80 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 1 + "'", byte82 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte83 + "' != '" + (byte) 1 + "'", byte83 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + byte85 + "' != '" + (byte) -1 + "'", byte85 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte86 + "' != '" + (byte) 1 + "'", byte86 == (byte) 1);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1.0f, (double) (short) 10, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97L, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) -1, 97.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray14);
        short[] shortArray19 = new short[] { (byte) 1, (short) 10, (short) 100 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray19);
        short[] shortArray27 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray27);
        short short29 = org.apache.commons.lang.math.NumberUtils.max(shortArray27);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray27);
        short short31 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short32 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
        short[] shortArray39 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short40 = org.apache.commons.lang.math.NumberUtils.min(shortArray39);
        short[] shortArray47 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray47);
        short[] shortArray51 = new short[] { (byte) 0, (short) 0 };
        short short52 = org.apache.commons.lang.math.NumberUtils.max(shortArray51);
        short short53 = org.apache.commons.lang.math.NumberUtils.min(shortArray51);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray51);
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray51);
        short short56 = org.apache.commons.lang.math.NumberUtils.max(shortArray51);
        short short57 = org.apache.commons.lang.math.NumberUtils.max(shortArray51);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray51);
        short short59 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
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
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 10 + "'", short32 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray39, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 0 + "'", short40 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray47, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 0 + "'", short52 == (short) 0);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 0 + "'", short53 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 0 + "'", short55 == (short) 0);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 0 + "'", short56 == (short) 0);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 0 + "'", short57 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) -1 + "'", short59 == (short) -1);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        long long64 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long66 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long67 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
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
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 32L + "'", long64 == 32L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 32L + "'", long65 == 32L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 32L + "'", long66 == 32L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 32L + "'", long67 == 32L);
    }
}

