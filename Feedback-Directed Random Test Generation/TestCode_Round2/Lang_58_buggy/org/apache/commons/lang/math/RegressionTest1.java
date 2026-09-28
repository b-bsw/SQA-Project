package org.apache.commons.lang.math;

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
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) -1, (float) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0, (double) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35, 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            byte byte47 = org.apache.commons.lang.math.NumberUtils.min(byteArray17);
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
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100, (double) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) '4', (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 32, (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 100, (long) (short) 100, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 100, (float) 35, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 10, (double) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 0, (double) 100, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) ' ', (-1.0f), (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0d), 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(1.0d, (double) 1.0f, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 97, (long) 0, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        java.lang.Class<?> wildcardClass54 = doubleArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(35.0d, (double) 97L, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, 35, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        long[] longArray3 = new long[] { (short) 1, (byte) 1, (short) 10 };
        long long4 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] { 1L, 1L, 10L });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(10.0d, (double) 52, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray50);
        byte byte53 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte60 = org.apache.commons.lang.math.NumberUtils.min(byteArray59);
        byte[] byteArray61 = null;
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray61);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte70 = org.apache.commons.lang.math.NumberUtils.min(byteArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray69);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray63);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray63);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray63);
        // The following exception was thrown during execution in test generation
        try {
            byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
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
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) -1 + "'", byte53 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) -1 + "'", byte60 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) -1 + "'", byte70 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, (long) 10, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) -1, (long) 1, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) (short) -1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(10.0d, 0.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) -1, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 0, (float) (-1), (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        java.lang.Class<?> wildcardClass35 = doubleArray26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, 35L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', 0L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) 10, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        byte byte47 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        java.lang.Class<?> wildcardClass48 = byteArray43.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 1 + "'", byte46 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) -1 + "'", byte47 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 0, 0L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(35L, (long) (byte) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', 32, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 35L, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 1, (float) ' ', 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 100, (double) '4', (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, (float) 32, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte[] byteArray47 = null;
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            byte byte49 = org.apache.commons.lang.math.NumberUtils.min(byteArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
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
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) -1 + "'", byte46 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10, (float) (byte) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 0, (long) 100, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        float[] floatArray0 = null;
        float[] floatArray4 = new float[] { 1.0f, (short) 100, 0L };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray9);
        float[] floatArray15 = new float[] { 1.0f, (short) 100, 0L };
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        float[] floatArray20 = new float[] { 1.0f, (short) 100, 0L };
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray15);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray9);
        float[] floatArray28 = new float[] { 1.0f, (short) 100, 0L };
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        float[] floatArray33 = new float[] { 1.0f, (short) 100, 0L };
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray33);
        float float36 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        float[] floatArray37 = new float[] {};
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray37);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray28);
        float float40 = org.apache.commons.lang.math.NumberUtils.max(floatArray28);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray28);
        // The following exception was thrown during execution in test generation
        try {
            float float42 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 10, (double) 35, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) 100, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 100, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(1.0f, (float) (short) 100, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1), (double) (short) 100, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) (-1L), (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, 35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        java.lang.Class<?> wildcardClass9 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 97L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 100, (long) 10, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', 32L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        int int49 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
        int[] intArray56 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray63 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray67 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(intArray63, intArray67);
        int int69 = org.apache.commons.lang.math.NumberUtils.max(intArray63);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray56, intArray63);
        int int71 = org.apache.commons.lang.math.NumberUtils.min(intArray63);
        int int72 = org.apache.commons.lang.math.NumberUtils.max(intArray63);
        int[] intArray79 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray83 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray79, intArray83);
        int[] intArray91 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray95 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray91, intArray95);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(intArray83, intArray91);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray63, intArray91);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray63);
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 35 + "'", int69 == 35);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertArrayEquals(intArray95, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1.0f, (double) 52, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '4', (long) ' ', 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        short[] shortArray2 = new short[] { (byte) 0, (short) 0 };
        short short3 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
        short short4 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short short5 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        java.lang.Class<?> wildcardClass6 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 1, (double) (-1L), (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(35.0d, (double) 35, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97.0f, 0.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 1, (double) 0, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35.0f, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, (long) 1, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 100, (long) (short) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 32, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 10, (float) (short) -1, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), (float) 10, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 1, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, 0L, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(35.0d, (double) (-1), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97L, (float) 32, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.lang.Class<?> wildcardClass54 = shortArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', (float) 1, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 100, (float) ' ', 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 10, (float) 10, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(100.0d, (double) 10, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, (long) (short) 10, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte[] byteArray47 = null;
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            byte byte49 = org.apache.commons.lang.math.NumberUtils.max(byteArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
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
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) -1 + "'", byte46 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 0, (double) (short) 1, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35L, (double) 10, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) (short) -1, (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '4', (double) 10, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, (int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(97.0f, (float) 0L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32L, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100.0f, (double) 1, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, (float) 52, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (-1.0d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        short[] shortArray19 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray26);
        short short29 = org.apache.commons.lang.math.NumberUtils.max(shortArray26);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray26);
        short short31 = org.apache.commons.lang.math.NumberUtils.max(shortArray26);
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
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 10 + "'", short31 == (short) 10);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) -1, 0.0d, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (-1), (float) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, (float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1), 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) -1, (float) 32L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52, (float) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, 35, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        int[] intArray71 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray75 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(intArray71, intArray75);
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray75);
        int int78 = org.apache.commons.lang.math.NumberUtils.min(intArray75);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray75);
        int int80 = org.apache.commons.lang.math.NumberUtils.max(intArray75);
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
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 52 + "'", int80 == 52);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 1, 32.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '#', (float) 'a', 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 100, (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35, (float) (byte) 0, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1L), (double) 35L, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, (-1L), (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 10, 52.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) ' ', 0.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(1.0d, (double) 52.0f, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '#', 100.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97L, 100.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        java.lang.Class<?> wildcardClass21 = floatArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35L, (float) (short) 10, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(35L, 97L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', 52, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 10L, (float) (short) -1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(52.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 10, (float) 1L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100L, (double) 32.0f, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray17 = new short[] { (byte) 0, (short) 0 };
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray17);
        java.lang.Class<?> wildcardClass20 = shortArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1, (float) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32L, 0.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, (-1), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 100, (float) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', 100, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, (float) 1, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        java.lang.Class<?> wildcardClass42 = floatArray32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 1, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(32.0f, (float) (byte) 0, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1L), 0.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100L, (float) 1, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray14);
        short[] shortArray16 = null;
        short[] shortArray19 = new short[] { (byte) 0, (short) 0 };
        short short20 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray16);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray14 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float float18 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float float19 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float float21 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short short15 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        short[] shortArray0 = null;
        short[] shortArray5 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray12 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short13 = org.apache.commons.lang.math.NumberUtils.min(shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray12);
        short short15 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, (long) 1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 100, (float) 0L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) ' ', (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        java.lang.Class<?> wildcardClass29 = doubleArray22.getClass();
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        short[] shortArray78 = new short[] { (byte) 0, (short) 0 };
        short short79 = org.apache.commons.lang.math.NumberUtils.max(shortArray78);
        short short80 = org.apache.commons.lang.math.NumberUtils.min(shortArray78);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(shortArray66, shortArray78);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray78);
        short[] shortArray87 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray94 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short95 = org.apache.commons.lang.math.NumberUtils.min(shortArray94);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(shortArray87, shortArray94);
        short short97 = org.apache.commons.lang.math.NumberUtils.min(shortArray87);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(shortArray78, shortArray87);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray87);
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
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray78, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 0 + "'", short79 == (short) 0);
        org.junit.Assert.assertTrue("'" + short80 + "' != '" + (short) 0 + "'", short80 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray87, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray94);
        org.junit.Assert.assertArrayEquals(shortArray94, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short95 + "' != '" + (short) 0 + "'", short95 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + short97 + "' != '" + (short) -1 + "'", short97 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray50);
        byte byte53 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        byte byte54 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray43);
        java.lang.Class<?> wildcardClass56 = byteArray43.getClass();
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
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) -1 + "'", byte54 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, (int) (byte) -1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100L, (double) '4', (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int int23 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, (long) 100, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0L, (float) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32, (double) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 100, 1.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, 35, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        short[] shortArray2 = new short[] { (byte) 0, (short) 0 };
        short short3 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
        short short4 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short short5 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short short6 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        java.lang.Class<?> wildcardClass26 = floatArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) (byte) 100, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, 0L, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        float[] floatArray27 = new float[] { 1.0f, (short) 100, 0L };
        float float28 = org.apache.commons.lang.math.NumberUtils.min(floatArray27);
        float float29 = org.apache.commons.lang.math.NumberUtils.max(floatArray27);
        float[] floatArray33 = new float[] { 1.0f, (short) 100, 0L };
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        float[] floatArray38 = new float[] { 1.0f, (short) 100, 0L };
        float float39 = org.apache.commons.lang.math.NumberUtils.min(floatArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray38);
        float[] floatArray44 = new float[] { 1.0f, (short) 100, 0L };
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
        float[] floatArray49 = new float[] { 1.0f, (short) 100, 0L };
        float float50 = org.apache.commons.lang.math.NumberUtils.min(floatArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray49);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(floatArray38, floatArray44);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray27, floatArray44);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray8, floatArray44);
        java.lang.Class<?> wildcardClass55 = floatArray8.getClass();
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
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertArrayEquals(floatArray27, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertArrayEquals(floatArray38, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertArrayEquals(floatArray44, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertArrayEquals(floatArray49, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.0f + "'", float50 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(100L, (long) 97, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', (long) (byte) 0, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte54 = org.apache.commons.lang.math.NumberUtils.min(byteArray24);
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
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        int[] intArray71 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray75 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(intArray71, intArray75);
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray75);
        int int78 = org.apache.commons.lang.math.NumberUtils.min(intArray75);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray75);
        int int80 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
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
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', 32, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray3);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
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
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 100 + "'", byte32 == (byte) 100);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 0, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 100, (float) 10, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', (float) 0L, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) (byte) 100, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '4', 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) -1, 97.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) -1, (double) 97.0f, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) '4', 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, 0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) -1, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) (short) -1, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) ' ', 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 52, 0.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, 0L, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(52, 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        short[] shortArray0 = null;
        short[] shortArray1 = null;
        boolean boolean2 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 1, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (-1), (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        float[] floatArray40 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float41 = org.apache.commons.lang.math.NumberUtils.max(floatArray40);
        float float42 = org.apache.commons.lang.math.NumberUtils.min(floatArray40);
        float float43 = org.apache.commons.lang.math.NumberUtils.min(floatArray40);
        float float44 = org.apache.commons.lang.math.NumberUtils.max(floatArray40);
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray40);
        float[] floatArray50 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float51 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        float float52 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        float float53 = org.apache.commons.lang.math.NumberUtils.min(floatArray50);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray40, floatArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray50);
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
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertArrayEquals(floatArray40, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertArrayEquals(floatArray50, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 10.0f + "'", float51 == 10.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 10.0f + "'", float52 == 10.0f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        float[] floatArray3 = new float[] { 1.0f, (short) 100, 0L };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray3);
        float[] floatArray10 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float11 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray10);
        java.lang.Class<?> wildcardClass17 = floatArray10.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35L, 0.0d, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        float[] floatArray3 = new float[] { 1.0f, (short) 100, 0L };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray8 = new float[] { 1.0f, (short) 100, 0L };
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray8);
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray12 = new float[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray12);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', (float) (byte) 1, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray14);
        short[] shortArray19 = new short[] { (byte) 1, (short) 10, (short) 100 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray19);
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        java.lang.Class<?> wildcardClass22 = shortArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        short short53 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        short short54 = org.apache.commons.lang.math.NumberUtils.min(shortArray17);
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray17);
        short short56 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        short short57 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
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
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 0 + "'", short54 == (short) 0);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 0 + "'", short55 == (short) 0);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 0 + "'", short56 == (short) 0);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 0 + "'", short57 == (short) 0);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray14);
        short short16 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray6);
        java.lang.Class<?> wildcardClass18 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), (float) (short) 100, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 35, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97L, (double) 0.0f, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) -1, (double) (short) 0, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97L, 0.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        short short31 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
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
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 100 + "'", short31 == (short) 100);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) -1, (float) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 0, (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10, (float) 97L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
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
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) -1 + "'", short55 == (short) -1);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) -1, (double) (short) -1, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(52.0f, (float) 10L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, 1.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        long long67 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
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
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) ' ', (float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 10, (float) 0L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, 35, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, (long) (-1), (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.lang.Class<?> wildcardClass28 = byteArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0L, (double) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) ' ', (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        byte byte47 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte54 = org.apache.commons.lang.math.NumberUtils.min(byteArray53);
        byte byte55 = org.apache.commons.lang.math.NumberUtils.min(byteArray53);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte62 = org.apache.commons.lang.math.NumberUtils.min(byteArray61);
        byte[] byteArray63 = null;
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray63);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte72 = org.apache.commons.lang.math.NumberUtils.min(byteArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray71);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray65);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray53, byteArray65);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte83 = org.apache.commons.lang.math.NumberUtils.min(byteArray82);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(byteArray76, byteArray82);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray76);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray76);
        // The following exception was thrown during execution in test generation
        try {
            byte byte87 = org.apache.commons.lang.math.NumberUtils.min(byteArray76);
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
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 1 + "'", byte46 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) -1 + "'", byte47 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) -1 + "'", byte54 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) -1 + "'", byte55 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) -1 + "'", byte62 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) -1 + "'", byte72 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte83 + "' != '" + (byte) -1 + "'", byte83 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32, (double) 1L, (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(32.0d, (double) 'a', (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, (float) 35, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, (-1L), (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, (long) (short) -1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray22);
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
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 10, (double) (byte) 1, 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(52L, 0L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10L, (float) 32, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35, (double) 52L, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10, (float) (short) -1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, 0.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32.0f, (-1.0d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        double[] doubleArray1 = new double[] { 52.0d };
        double double2 = org.apache.commons.lang.math.NumberUtils.min(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1), (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
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
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 0 + "'", short55 == (short) 0);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 0 + "'", short56 == (short) 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), (long) '4', (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1L, (float) (byte) 100, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) (byte) 100, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        float[] floatArray0 = null;
        float[] floatArray4 = new float[] { 1.0f, (short) 100, 0L };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray9);
        float[] floatArray15 = new float[] { 1.0f, (short) 100, 0L };
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        float[] floatArray20 = new float[] { 1.0f, (short) 100, 0L };
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray15);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray9);
        float[] floatArray30 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray34 = new float[] { 1.0f, (short) 100, 0L };
        float float35 = org.apache.commons.lang.math.NumberUtils.min(floatArray34);
        float[] floatArray39 = new float[] { 1.0f, (short) 100, 0L };
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray34, floatArray39);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray34);
        float[] floatArray46 = new float[] { 1.0f, (short) 100, 0L };
        float float47 = org.apache.commons.lang.math.NumberUtils.min(floatArray46);
        float[] floatArray51 = new float[] { 1.0f, (short) 100, 0L };
        float float52 = org.apache.commons.lang.math.NumberUtils.min(floatArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray51);
        float float54 = org.apache.commons.lang.math.NumberUtils.min(floatArray46);
        float[] floatArray55 = new float[] {};
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray34, floatArray55);
        float float58 = org.apache.commons.lang.math.NumberUtils.min(floatArray34);
        float float59 = org.apache.commons.lang.math.NumberUtils.max(floatArray34);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray34);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray39, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertArrayEquals(floatArray46, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertArrayEquals(floatArray51, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertArrayEquals(floatArray55, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 100.0f + "'", float59 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 0, 52L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 32, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, (float) 10L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1, (double) (short) 1, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        long long25 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
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
        byte byte54 = org.apache.commons.lang.math.NumberUtils.max(byteArray51);
        byte byte55 = org.apache.commons.lang.math.NumberUtils.min(byteArray51);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte62 = org.apache.commons.lang.math.NumberUtils.min(byteArray61);
        byte byte63 = org.apache.commons.lang.math.NumberUtils.min(byteArray61);
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte70 = org.apache.commons.lang.math.NumberUtils.min(byteArray69);
        byte[] byteArray71 = null;
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(byteArray69, byteArray71);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte80 = org.apache.commons.lang.math.NumberUtils.min(byteArray79);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray73, byteArray79);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray69, byteArray73);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray73);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray90 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte91 = org.apache.commons.lang.math.NumberUtils.min(byteArray90);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(byteArray84, byteArray90);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(byteArray73, byteArray84);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray84);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray84);
        byte byte96 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
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
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) -1 + "'", byte55 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) -1 + "'", byte62 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) -1 + "'", byte63 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) -1 + "'", byte70 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) -1 + "'", byte80 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte91 + "' != '" + (byte) -1 + "'", byte91 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + byte96 + "' != '" + (byte) -1 + "'", byte96 == (byte) -1);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 1, (float) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        float float96 = org.apache.commons.lang.math.NumberUtils.min(floatArray71);
        java.lang.Class<?> wildcardClass97 = floatArray71.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 32, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 1, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 'a', 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        short[] shortArray2 = new short[] { (byte) 0, (short) 0 };
        short short3 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
        java.lang.Class<?> wildcardClass5 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray5);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        java.lang.Class<?> wildcardClass17 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        int int85 = org.apache.commons.lang.math.NumberUtils.min(intArray81);
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        float float23 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100, (double) 1, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35, (float) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 0, (-1L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray5 = new long[] { ' ' };
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray5);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long11 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte34 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte[] byteArray35 = null;
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray35);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray37, byteArray43);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray37);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray33);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        byte byte53 = org.apache.commons.lang.math.NumberUtils.min(byteArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray52);
        byte byte55 = org.apache.commons.lang.math.NumberUtils.min(byteArray52);
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
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) -1 + "'", byte34 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) -1 + "'", byte53 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) -1 + "'", byte55 == (byte) -1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, (float) 32, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100L, (float) 'a', (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 1, (float) (byte) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0L, 97.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 10, (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        long[] longArray59 = new long[] { (byte) -1 };
        long long60 = org.apache.commons.lang.math.NumberUtils.min(longArray59);
        long[] longArray66 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray59, longArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray66);
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        long[] longArray71 = new long[] { (byte) -1 };
        long long72 = org.apache.commons.lang.math.NumberUtils.min(longArray71);
        long[] longArray78 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray71, longArray78);
        long[] longArray81 = new long[] { (byte) -1 };
        long long82 = org.apache.commons.lang.math.NumberUtils.min(longArray81);
        long[] longArray88 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(longArray81, longArray88);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(longArray78, longArray88);
        long[] longArray93 = new long[] { 10L, 32 };
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(longArray78, longArray93);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray78);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray56);
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
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertArrayEquals(longArray59, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertArrayEquals(longArray66, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 100L + "'", long69 == 100L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertArrayEquals(longArray78, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertArrayEquals(longArray81, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-1L) + "'", long82 == (-1L));
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertArrayEquals(longArray88, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertArrayEquals(longArray93, new long[] { 10L, 32L });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35, (double) 52, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        long[] longArray28 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray28);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray28);
        long[] longArray33 = new long[] { (byte) -1 };
        long long34 = org.apache.commons.lang.math.NumberUtils.min(longArray33);
        long[] longArray40 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray40);
        long[] longArray43 = new long[] { (byte) -1 };
        long long44 = org.apache.commons.lang.math.NumberUtils.min(longArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray43);
        long long46 = org.apache.commons.lang.math.NumberUtils.min(longArray43);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray43);
        long long48 = org.apache.commons.lang.math.NumberUtils.min(longArray28);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray28);
        long[] longArray51 = new long[] { (byte) -1 };
        long long52 = org.apache.commons.lang.math.NumberUtils.min(longArray51);
        long[] longArray58 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray58);
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray58);
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
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertArrayEquals(longArray58, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L + "'", long60 == 100L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short short16 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, 32, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        double[] doubleArray48 = null;
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray48);
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 0, (long) 32, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52L, (float) 52L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray10);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        short[] shortArray60 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray67 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short68 = org.apache.commons.lang.math.NumberUtils.min(shortArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray67);
        short short70 = org.apache.commons.lang.math.NumberUtils.max(shortArray60);
        short[] shortArray73 = new short[] { (byte) 0, (short) 0 };
        short short74 = org.apache.commons.lang.math.NumberUtils.max(shortArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray73);
        short[] shortArray82 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short83 = org.apache.commons.lang.math.NumberUtils.min(shortArray82);
        short[] shortArray90 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(shortArray82, shortArray90);
        short[] shortArray95 = new short[] { (byte) 1, (short) 10, (short) 100 };
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(shortArray90, shortArray95);
        short short97 = org.apache.commons.lang.math.NumberUtils.min(shortArray90);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray90);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray60);
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
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray60, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray67, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 0 + "'", short68 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 100 + "'", short70 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray73, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short74 + "' != '" + (short) 0 + "'", short74 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray82, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 0 + "'", short83 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray90, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(shortArray95);
        org.junit.Assert.assertArrayEquals(shortArray95, new short[] { (short) 1, (short) 10, (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + short97 + "' != '" + (short) -1 + "'", short97 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 10, (float) (byte) 100, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 10, (float) (byte) 0, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (-1L), (float) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10L, (double) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, 100L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 52L, 100.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short short38 = org.apache.commons.lang.math.NumberUtils.max(shortArray32);
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
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
            byte byte25 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double double13 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        double double14 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        double double15 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        double double16 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        double[] doubleArray33 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray37 = new double[] { (byte) 10, 1, 1L };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray37);
        double[] doubleArray40 = new double[] { 10L };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray40);
        double[] doubleArray46 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray50 = new double[] { (byte) 10, 1, 1L };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray50);
        double double52 = org.apache.commons.lang.math.NumberUtils.min(doubleArray46);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray46);
        double[] doubleArray58 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray62 = new double[] { (byte) 10, 1, 1L };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        double[] doubleArray65 = new double[] { 10L };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray65);
        double[] doubleArray71 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray75 = new double[] { (byte) 10, 1, 1L };
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray71, doubleArray75);
        double[] doubleArray78 = new double[] { 10L };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray75, doubleArray78);
        double[] doubleArray84 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray88 = new double[] { (byte) 10, 1, 1L };
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray84, doubleArray88);
        double double90 = org.apache.commons.lang.math.NumberUtils.min(doubleArray84);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray75, doubleArray84);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray75);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray75);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray46);
        double[] doubleArray95 = null;
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray95);
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
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-1.0d) + "'", double90 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) '#', (double) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        float[] floatArray29 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float30 = org.apache.commons.lang.math.NumberUtils.max(floatArray29);
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        float float32 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        float float33 = org.apache.commons.lang.math.NumberUtils.max(floatArray29);
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        float[] floatArray35 = null;
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
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray35, floatArray44);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray44);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray44);
        float float62 = org.apache.commons.lang.math.NumberUtils.max(floatArray44);
        java.lang.Class<?> wildcardClass63 = floatArray44.getClass();
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
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
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
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 100.0f + "'", float62 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        float[] floatArray4 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, 1.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, 10L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray3);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.min(byteArray3);
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
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 0 + "'", byte32 == (byte) 0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        float[] floatArray24 = new float[] { 1.0f, (short) 100, 0L };
        float float25 = org.apache.commons.lang.math.NumberUtils.min(floatArray24);
        float[] floatArray29 = new float[] { 1.0f, (short) 100, 0L };
        float float30 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray24, floatArray29);
        float[] floatArray35 = new float[] { 1.0f, (short) 100, 0L };
        float float36 = org.apache.commons.lang.math.NumberUtils.min(floatArray35);
        float[] floatArray40 = new float[] { 1.0f, (short) 100, 0L };
        float float41 = org.apache.commons.lang.math.NumberUtils.min(floatArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray35, floatArray40);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray35);
        float float44 = org.apache.commons.lang.math.NumberUtils.max(floatArray29);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray29);
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
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertArrayEquals(floatArray35, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertArrayEquals(floatArray40, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 100.0f + "'", float44 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }
}

