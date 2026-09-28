package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (short) 1, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.apache.commons.math3.util.FastMath.EXP_INT_TABLE_MAX_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 750 + "'", int0 == 750);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 750, (double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 750.0d + "'", double2 == 750.0d);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.1920929E-7f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920929E-7f + "'", float2 == 1.1920929E-7f);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(100.0f, (double) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000001f + "'", float1 == 10.000001f);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 100L, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E200d + "'", double2 == 1.0E200d);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(750.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.386127875258307d + "'", double1 == 27.386127875258307d);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 100, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 100.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        double double2 = org.apache.commons.math3.util.FastMath.pow(27.386127875258307d, 750);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(97.00000000000001d, (double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0463806640928d + "'", double2 == 97.0463806640928d);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        int int2 = org.apache.commons.math3.util.FastMath.min(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = org.apache.commons.math3.util.FastMath.LN_MANT_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000001f + "'", float1 == 10.000001f);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453291188362752d + "'", double1 == 1.7453291188362752d);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078154E-7d + "'", double1 == 1.1920928955078154E-7d);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 10L, (double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (byte) 0, 1.1920928955078154E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        double double0 = org.apache.commons.math3.util.FastMath.PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.141592653589793d + "'", double0 == 3.141592653589793d);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 750, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.080594601624405E-9d + "'", double1 == 2.080594601624405E-9d);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(7.105427357601002E-15d, 750.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 750.0d + "'", double2 == 750.0d);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(27.386127875258307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.827881037133875E11d + "'", double1 == 7.827881037133875E11d);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        double double0 = org.apache.commons.math3.util.FastMath.random();
// flaky "1) test00058(org.apache.commons.math3.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.7564260666383823d + "'", double0 == 0.7564260666383823d);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.827881037133875E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.220703125E-4d + "'", double1 == 1.220703125E-4d);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 0, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 0L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 0, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        double double0 = org.apache.commons.math3.util.FastMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = org.apache.commons.math3.util.FastMath.EXP_INT_TABLE_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1500 + "'", int0 == 1500);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 100.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E20d + "'", double2 == 1.0E20d);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 0, 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        long long2 = org.apache.commons.math3.util.FastMath.min(100L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 155.74607629780772d + "'", double1 == 155.74607629780772d);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.473814720414451d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.473814720414451d + "'", double2 == 0.473814720414451d);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 750L, 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6000.0f + "'", float2 == 6000.0f);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 'a', (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 100, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7564260666383823d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.061328855954495554d + "'", double2 == 0.061328855954495554d);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 100L, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6321205588285577d + "'", double2 == 0.6321205588285577d);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (byte) 10, (float) 1024);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2246467991473532E-16d + "'", double1 == 1.2246467991473532E-16d);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (byte) 10, 5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7241400178893854d + "'", double2 == 0.7241400178893854d);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 750L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 3, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.892546881191539d + "'", double2 == 1.892546881191539d);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2401310215141802E-16d + "'", double1 == 1.2401310215141802E-16d);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        float float2 = org.apache.commons.math3.util.FastMath.max(99.99999f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 100L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(27.386127875258307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.913940518571937E11d + "'", double1 == 3.913940518571937E11d);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (short) 0, 97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36004964460910377d + "'", double1 == 0.36004964460910377d);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (byte) 10, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (short) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(10.0d, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2664005294302816d + "'", double2 == 1.2664005294302816d);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.401298464324817E-45d + "'", double1 == 1.401298464324817E-45d);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.9E-324d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        double double1 = org.apache.commons.math3.util.FastMath.signum(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        float float2 = org.apache.commons.math3.util.FastMath.max(10.000001f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E100d + "'", double2 == 1.0E100d);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        double double2 = org.apache.commons.math3.util.FastMath.pow(Double.POSITIVE_INFINITY, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0E20d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.36004964460910377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36832110635936816d + "'", double1 == 0.36832110635936816d);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        double double1 = org.apache.commons.math3.util.FastMath.cos(27.386127875258307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6308050742098271d) + "'", double1 == (-0.6308050742098271d));
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        int int1 = org.apache.commons.math3.util.FastMath.round(100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(10.0d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852868E30d + "'", double2 == 1.5845632502852868E30d);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(155.74607629780772d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 155.74607629780772d + "'", double2 == 155.74607629780772d);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.743392130574644E-23d + "'", double1 == 3.743392130574644E-23d);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.061328855954495554d, 0.36832110635936816d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16499547112384425d + "'", double2 == 0.16499547112384425d);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.6321205588285577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011032585021104841d + "'", double1 == 0.011032585021104841d);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.7453291188362752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17364804653184446d) + "'", double1 == (-0.17364804653184446d));
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        int int2 = org.apache.commons.math3.util.FastMath.max(3, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 'a', 1.1920928955078154E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 'a', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 10, 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (byte) 1, 1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        float float1 = org.apache.commons.math3.util.FastMath.abs(99.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 99.99999f + "'", float1 == 99.99999f);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        double double2 = org.apache.commons.math3.util.FastMath.min(97.0d, 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36787944117144233d + "'", double2 == 0.36787944117144233d);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        int int2 = org.apache.commons.math3.util.FastMath.min(1024, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.17364804653184446d), 57.29577951308232d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.584967478670572d + "'", double1 == 4.584967478670572d);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 5);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 10.000001f, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000953674316d + "'", double2 == 10.000000953674316d);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.17364804653184446d), 1.7453291188362752d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7453291188362752d + "'", double2 == 1.7453291188362752d);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(27.386127875258307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1L, 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000291038d + "'", double1 == 1.0000000000291038d);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.9E-324d, 1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        double double1 = org.apache.commons.math3.util.FastMath.asin(57.29577951308232d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8163011535675582d + "'", double1 == 1.8163011535675582d);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 750, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999500037496876d + "'", double1 == 0.9999500037496876d);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7564260666383823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1306478036226246d + "'", double1 == 2.1306478036226246d);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.548739357257746d + "'", double1 == 11.548739357257746d);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.0E200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E200d + "'", double1 == 1.0E200d);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        double double2 = org.apache.commons.math3.util.FastMath.pow(97.00000000000001d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.5063656411097588d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.591953275521519d + "'", double1 == 11.591953275521519d);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.6308050742098271d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 0, 0.16499547112384425d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.401298464324817E-45d + "'", double1 == 1.401298464324817E-45d);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.151292546497023d + "'", double1 == 1.151292546497023d);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 750, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.4131591025766d + "'", double1 == 148.4131591025766d);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1500);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1500.0d + "'", double1 == 1500.0d);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 100L, (-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5771174481917147d + "'", double2 == 1.5771174481917147d);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-1L), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(10.000000953674316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9982230451921064d + "'", double1 == 2.9982230451921064d);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.7241400178893854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.672330695785645d + "'", double1 == 0.672330695785645d);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 0L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4359738368E11d + "'", double2 == 3.4359738368E11d);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414439706668982d + "'", double1 == 0.8414439706668982d);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        long long1 = org.apache.commons.math3.util.FastMath.abs(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.1622776601683795d, 0.061328855954495554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1628723067131066d + "'", double2 == 3.1628723067131066d);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.29577951308232d) + "'", double1 == (-57.29577951308232d));
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.993222846126381d, 0.6321205588285577d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.993222846126381d + "'", double2 == 2.993222846126381d);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '#', 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        int int0 = org.apache.commons.math3.util.FastMath.EXP_FRAC_TABLE_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1025 + "'", int0 == 1025);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1500);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        double double1 = org.apache.commons.math3.util.FastMath.log(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6673940104325407d + "'", double1 == 1.6673940104325407d);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        int int2 = org.apache.commons.math3.util.FastMath.min(1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) '#', (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.8163011535675582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.155849015173716d + "'", double1 == 3.155849015173716d);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7241400178893854d, 5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1808389053476742d + "'", double2 == 0.1808389053476742d);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        double double1 = org.apache.commons.math3.util.FastMath.rint(11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.36787944117144233d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 7.6293945E-6f, 4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.62939453125E-6d + "'", double2 == 7.62939453125E-6d);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1025);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 97L, 750);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        int int1 = org.apache.commons.math3.util.FastMath.abs(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        long long1 = org.apache.commons.math3.util.FastMath.abs(5L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 7.6293945E-6f, 3.743392130574644E-23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.62939453125E-6d + "'", double2 == 7.62939453125E-6d);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-0.99999994f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-1), (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 1.7453291188362752d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 230.25850929940458d + "'", double1 == 230.25850929940458d);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        long long2 = org.apache.commons.math3.util.FastMath.min(5L, (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 97L, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.0d, 7.62939453125E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        double double1 = org.apache.commons.math3.util.FastMath.asin(97.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.155849015173716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806678d + "'", double1 == 22025.465794806678d);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.8414439706668982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7456061400682787d + "'", double1 == 0.7456061400682787d);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 3, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3072.0f + "'", float2 == 3072.0f);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.4359738368E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.562736412595044d + "'", double1 == 26.562736412595044d);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1, 750);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.17364804653184446d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0d + "'", double1 == 750.0d);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.31322083153445d + "'", double1 == 7.31322083153445d);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        double double1 = org.apache.commons.math3.util.FastMath.log10(26.562736412595044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4242728127018156d + "'", double1 == 1.4242728127018156d);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        double double2 = org.apache.commons.math3.util.FastMath.min(57.29577951308232d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.743392130574644E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        double double1 = org.apache.commons.math3.util.FastMath.exp(750.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6673940104325407d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5997382704646929d + "'", double2 == 0.5997382704646929d);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1024.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.624619224577892d + "'", double1 == 7.624619224577892d);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) '4', (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1500.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        float float2 = org.apache.commons.math3.util.FastMath.min(10.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1024.0f) + "'", float2 == (-1024.0f));
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(750.0f, 3.743392130574644E-23d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.99994f + "'", float2 == 749.99994f);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 10, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6420149920119997d + "'", double1 == 0.6420149920119997d);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(11.591953275521519d, 1025);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 750);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 'a', 3072.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.743392130574644E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.8414439706668982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.3440585709080678E43d, 0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709080676E43d + "'", double2 == 1.3440585709080676E43d);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1024.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        double double2 = org.apache.commons.math3.util.FastMath.max(230.25850929940458d, 0.6321205588285577d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 230.25850929940458d + "'", double2 == 230.25850929940458d);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.00001f + "'", float1 == 97.00001f);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        float float2 = org.apache.commons.math3.util.FastMath.min(6000.0f, 749.99994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.99994f + "'", float2 == 749.99994f);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        double double2 = org.apache.commons.math3.util.FastMath.log(10.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.5997382704646929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2915496650148839d + "'", double1 == 1.2915496650148839d);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        double double1 = org.apache.commons.math3.util.FastMath.tan(7.31322083153445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.665378035886179d + "'", double1 == 1.665378035886179d);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(749.99994f, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 374.99997f + "'", float2 == 374.99997f);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.17512404686688d + "'", double1 == 1.17512404686688d);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.36004964460910377d, 0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36004964460910377d + "'", double2 == 0.36004964460910377d);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 10.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 10.000001f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1024.0f), 97.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.00001f + "'", float2 == 97.00001f);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        int int2 = org.apache.commons.math3.util.FastMath.min(5, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        double double1 = org.apache.commons.math3.util.FastMath.atan(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4844222297453324d + "'", double1 == 1.4844222297453324d);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        int int2 = org.apache.commons.math3.util.FastMath.min(100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0E200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.7564260666383823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9111477955680065d + "'", double1 == 0.9111477955680065d);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1500.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.080594601624405E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078125E-7d + "'", double1 == 1.1920928955078125E-7d);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 1025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.569820717348332d + "'", double1 == 1.569820717348332d);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1024.0f, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.61512051684126d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.615120516841261d + "'", double2 == 4.615120516841261d);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932228461263812d + "'", double1 == 2.9932228461263812d);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549025d + "'", double1 == 1.5574077246549025d);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.6420149920119997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7476805260785286d + "'", double1 == 0.7476805260785286d);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012989023072947d + "'", double1 == 2.3012989023072947d);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.9982230451921064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.385850023714672d + "'", double1 == 1.385850023714672d);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.743392130574644E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.118326675304813E-12d + "'", double1 == 6.118326675304813E-12d);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        long long2 = org.apache.commons.math3.util.FastMath.min(10L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(97.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6508801680230075d + "'", double1 == 0.6508801680230075d);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 10.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453294184418977d + "'", double1 == 0.17453294184418977d);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404853d + "'", double1 == 0.9866275920404853d);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.4E-45f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9512437185814275d + "'", double1 == 3.9512437185814275d);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1024.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0d + "'", double1 == 1024.0d);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 6000.0f, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13158548711983195d + "'", double2 == 0.13158548711983195d);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 97L, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.0000000000291038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559679877d + "'", double1 == 0.7615941559679877d);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 100, 27.386127875258307d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.718281828459045d, 0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.999750016661555E-5d) + "'", double2 == (-4.999750016661555E-5d));
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999801317847d) + "'", double1 == (-0.9999999801317847d));
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.0f, 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2676506E30f + "'", float2 == 1.2676506E30f);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7200786095266942d + "'", double1 == 1.7200786095266942d);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 97, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.148283155648077d + "'", double1 == 2.148283155648077d);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.602681965908778d + "'", double1 == 0.602681965908778d);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (byte) 0, (double) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.401298464324817E-45d, 4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4012984643248174E-45d + "'", double2 == 1.4012984643248174E-45d);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.42944819032518d + "'", double1 == 43.42944819032518d);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        double double2 = org.apache.commons.math3.util.FastMath.pow(11.591953275521519d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6718308188647008E103d + "'", double2 == 1.6718308188647008E103d);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 749.99994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42971.83113775489d + "'", double1 == 42971.83113775489d);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.3440585709080676E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.666140437719302E21d + "'", double1 == 3.666140437719302E21d);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623150089993341d + "'", double1 == 0.8623150089993341d);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        int int2 = org.apache.commons.math3.util.FastMath.max(1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 750);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.7160033436347992d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 10L, 1.569820717348332d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        long long2 = org.apache.commons.math3.util.FastMath.min(97L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(57.29577951308232d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3666.9298888372687d + "'", double2 == 3666.9298888372687d);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013462623778017066d) + "'", double1 == (-0.013462623778017066d));
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.99999994f), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 750L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 750.0f + "'", float1 == 750.0f);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.8623150089993341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.759350929417189d + "'", double1 == 0.759350929417189d);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.36832110635936816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31358451852720004d + "'", double1 == 0.31358451852720004d);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        double double2 = org.apache.commons.math3.util.FastMath.pow(97.00000000000001d, 1.5771174481917147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1359.4785752092612d + "'", double2 == 1359.4785752092612d);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6321205588285577d + "'", double1 == 0.6321205588285577d);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 10, 750.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(22025.465794806678d, 1.892546881191539d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.4658761156d + "'", double2 == 22025.4658761156d);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(7.62939453125E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3713210688081606E-4d + "'", double1 == 4.3713210688081606E-4d);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1500.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.7456061400682787d, 0.7241400178893854d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7456061400682787d + "'", double2 == 0.7456061400682787d);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        long long2 = org.apache.commons.math3.util.FastMath.min(100L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E20d + "'", double1 == 1.0E20d);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.4844222297453324d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 100, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.729577951308233E21d + "'", double1 == 5.729577951308233E21d);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.602681965908778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6973483401028054d + "'", double1 == 0.6973483401028054d);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2246467991473532E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2246467991473532E-16d + "'", double1 == 1.2246467991473532E-16d);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.17364804653184446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17452205010929986d) + "'", double1 == (-0.17452205010929986d));
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.36004964460910377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9358793340080341d + "'", double1 == 0.9358793340080341d);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.602681965908778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6026819659087781d + "'", double1 == 0.6026819659087781d);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.313219942645561d + "'", double1 == 7.313219942645561d);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-1024.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 10L, (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845633E30f + "'", float2 == 1.5845633E30f);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 52, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.36004964460910377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1500, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.949874371066198d + "'", double1 == 19.949874371066198d);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.1306478036226246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1306478036226246d + "'", double1 == 2.1306478036226246d);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 750, 0.602681965908778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 749.9999999999999d + "'", double2 == 749.9999999999999d);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.2676506E30f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2676506E30f + "'", float2 == 1.2676506E30f);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (byte) 0, 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.7615941559679877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0E20d, (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.7453291188362752d, 1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3383347192042695E42d + "'", double2 == 1.3383347192042695E42d);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.4844222297453324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 97.00001f, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5604874144594285d + "'", double2 == 1.5604874144594285d);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        double double1 = org.apache.commons.math3.util.FastMath.exp(749.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.569820717348332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.94410169625876d + "'", double1 == 89.94410169625876d);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.000000000000001d + "'", double1 == 4.000000000000001d);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.1808389053476742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17889304790669835d + "'", double1 == 0.17889304790669835d);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.2664005294302816d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1296.7941421366083d + "'", double2 == 1296.7941421366083d);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.913940518571937E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5251711488118009d + "'", double1 == 0.5251711488118009d);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.4E-45f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.762747174039086d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 112.81581913850151d + "'", double2 == 112.81581913850151d);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.082648376090521d + "'", double1 == 10.082648376090521d);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5251711488118009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48168124860751377d + "'", double1 == 0.48168124860751377d);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.999999f + "'", float1 == 9.999999f);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.743392130574644E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.743392130574644E-23d + "'", double1 == 3.743392130574644E-23d);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.36832110635936816d, 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3683211063593682d + "'", double2 == 0.3683211063593682d);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.6673940104325407d, 97.0463806640928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6673940104325407d + "'", double2 == 1.6673940104325407d);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(10.082648376090521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1759754114836391d + "'", double1 == 0.1759754114836391d);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.385850023714672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8524213316116924d + "'", double1 == 0.8524213316116924d);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.9932228461263812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7300933056128451d + "'", double1 == 1.7300933056128451d);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 374.99997f, 1.7200786095266942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.022832605602534084d + "'", double2 == 0.022832605602534084d);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 6, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1024);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 6.1035156E-5f, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.103515625000001E-5d + "'", double2 == 6.103515625000001E-5d);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8524213316116924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9232666633273902d + "'", double1 == 0.9232666633273902d);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.17512404686688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.922737656982237d + "'", double1 == 0.922737656982237d);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.01562118716424d + "'", double1 == 32.01562118716424d);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.993222846126381d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(7.624619224577892d, 97.0463806640928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.624619224577892d + "'", double2 == 7.624619224577892d);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.620073206530356d + "'", double1 == 6.620073206530356d);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        double double1 = org.apache.commons.math3.util.FastMath.atan(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.080594601624405E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.080594601624405E-9d + "'", double1 == 2.080594601624405E-9d);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        double double1 = org.apache.commons.math3.util.FastMath.log(89.94410169625876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.499188385108773d + "'", double1 == 4.499188385108773d);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.5997382704646929d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5997382704646929d + "'", double2 == 0.5997382704646929d);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1359.4785752092612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.871107594012706d + "'", double1 == 36.871107594012706d);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1920928955078154E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078097E-7d + "'", double1 == 1.1920928955078097E-7d);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(750.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 52, 2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.499188385108773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.503897021644941d + "'", double1 == 1.503897021644941d);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        double double1 = org.apache.commons.math3.util.FastMath.floor(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.585786437626905d) + "'", double1 == (-0.585786437626905d));
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 750L, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.569462994251686d + "'", double2 == 1.569462994251686d);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 100L, 1.665378035886179d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 97.00001f, 0.6508801680230075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.018862593966410546d + "'", double2 == 0.018862593966410546d);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.1920928955078154E-7d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.814697265625009E-6d + "'", double2 == 3.814697265625009E-6d);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, (-0.6308050742098271d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6308050742098271d) + "'", double2 == (-0.6308050742098271d));
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5403023058681398d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.782135461917777E-9d + "'", double2 == 2.782135461917777E-9d);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(7.31322083153445d, 1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.31322083153445d + "'", double2 == 7.31322083153445d);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        int int2 = org.apache.commons.math3.util.FastMath.max(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9866275920404853d, 0.17453294184418977d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9866275920404852d + "'", double2 == 0.9866275920404852d);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.36832110635936816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36832110635936816d + "'", double1 == 0.36832110635936816d);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.022832605602534084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6414445250304635d) + "'", double1 == (-1.6414445250304635d));
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.16499547112384425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1635222099724446d + "'", double1 == 0.1635222099724446d);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1024.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.079368399158986d + "'", double1 == 10.079368399158986d);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 0, (float) 750);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        float float2 = org.apache.commons.math3.util.FastMath.min(6.1035156E-5f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1035156E-5f + "'", float2 == 6.1035156E-5f);
    }
}
