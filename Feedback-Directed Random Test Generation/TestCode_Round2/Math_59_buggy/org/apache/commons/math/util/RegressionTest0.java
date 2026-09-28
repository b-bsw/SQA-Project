package org.apache.commons.math.util;

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
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 100, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6931471805599453d + "'", double2 == 0.6931471805599453d);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3273845772164696d) + "'", double1 == (-1.3273845772164696d));
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) 10, (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E52d + "'", double2 == 1.0E52d);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 97L, (-1.3273845772164696d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5844798497868198d + "'", double2 == 1.5844798497868198d);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        double double0 = org.apache.commons.math.util.FastMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.29577951308232d) + "'", double1 == (-57.29577951308232d));
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6d + "'", double1 == 0.6d);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) 0, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8306408778607839d + "'", double1 == 0.8306408778607839d);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 52, 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.99999915301149d + "'", double2 == 51.99999915301149d);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453292519943295d) + "'", double1 == (-0.017453292519943295d));
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9113950174654148d + "'", double1 == 0.9113950174654148d);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        double double2 = org.apache.commons.math.util.FastMath.max(4.9E-324d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (short) -1, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.9E-324d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        double double1 = org.apache.commons.math.util.FastMath.atanh(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.718281828459045d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9251475365964139d), 0.9113950174654148d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7615941559557649d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.3273845772164696d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0950379321938843d) + "'", double1 == (-1.0950379321938843d));
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        double double1 = org.apache.commons.math.util.FastMath.sin((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6795226183513794d) + "'", double1 == (-0.6795226183513794d));
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        double double1 = org.apache.commons.math.util.FastMath.sinh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        double double0 = org.apache.commons.math.util.FastMath.random();
// flaky "1) test00070(org.apache.commons.math.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.46285676099588835d + "'", double0 == 0.46285676099588835d);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.25d + "'", double1 == 1.25d);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158638853279167d + "'", double1 == 4.158638853279167d);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        double double1 = org.apache.commons.math.util.FastMath.asinh(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-323d + "'", double1 == 1.0E-323d);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        double double1 = org.apache.commons.math.util.FastMath.log(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4251878220010183d + "'", double1 == 1.4251878220010183d);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455064928217585d + "'", double1 == 0.017455064928217585d);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        float float1 = org.apache.commons.math.util.FastMath.abs(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7987095471340483d) + "'", double1 == (-0.7987095471340483d));
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.0950379321938843d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5540437953657898d) + "'", double1 == (-0.5540437953657898d));
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        double double0 = org.apache.commons.math.util.FastMath.PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.141592653589793d + "'", double0 == 3.141592653589793d);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8390715290764524d), 0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8306408778607839d + "'", double2 == 0.8306408778607839d);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        int int1 = org.apache.commons.math.util.FastMath.round((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4251878220010183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        double double1 = org.apache.commons.math.util.FastMath.sin(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5844798497868198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2407288686697964d + "'", double1 == 1.2407288686697964d);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7987095471340483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0269835496406734d) + "'", double1 == (-1.0269835496406734d));
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9113950174654148d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7456241416655579d) + "'", double1 == (-0.7456241416655579d));
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 10.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03799291018846901d + "'", double1 == 0.03799291018846901d);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        int int1 = org.apache.commons.math.util.FastMath.round(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0392740995950414d + "'", double1 == 2.0392740995950414d);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2407288686697964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2407288686697966d + "'", double1 == 1.2407288686697966d);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        double double1 = org.apache.commons.math.util.FastMath.asin(100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-57.29577951308232d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        double double1 = org.apache.commons.math.util.FastMath.asin(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6865874069985796d) + "'", double1 == (-0.6865874069985796d));
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6795226183513794d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 1, 51.99999915301149d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8414709848078965d), (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        double double1 = org.apache.commons.math.util.FastMath.ceil(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.0d + "'", double1 == 11014.0d);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9955742875642764d) + "'", double1 == (-0.9955742875642764d));
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014497418220326751d + "'", double1 == 0.014497418220326751d);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.053272382792838d) + "'", double1 == (-6.053272382792838d));
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0d, 1.0E52d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        double double1 = org.apache.commons.math.util.FastMath.log(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306922469822426d + "'", double1 == 9.306922469822426d);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 97L, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5540437953657898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1574487915559275d + "'", double1 == 1.1574487915559275d);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9999999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.7910068511973d + "'", double1 == 11.7910068511973d);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (short) 1, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.3273845772164696d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.3273845772164696d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-90.0d) + "'", double1 == (-90.0d));
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        double double1 = org.apache.commons.math.util.FastMath.signum(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        long long1 = org.apache.commons.math.util.FastMath.round((-90.0d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-90L) + "'", long1 == (-90L));
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (-90L), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.486784401E19d + "'", double2 == 3.486784401E19d);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        long long2 = org.apache.commons.math.util.FastMath.max((-90L), (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5404195002705842d + "'", double1 == 0.5404195002705842d);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5540437953657898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2407288686697966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        double double1 = org.apache.commons.math.util.FastMath.log(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.0d), 1.2407288686697966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0E-323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-323.0051853474518d) + "'", double1 == (-323.0051853474518d));
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9388149908366094d + "'", double1 == 0.9388149908366094d);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6682015101903132d) + "'", double1 == (-0.6682015101903132d));
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.94395132690269d + "'", double1 == 104.94395132690269d);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745240643728351d) + "'", double1 == (-0.01745240643728351d));
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (short) -1, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.356194490192345d) + "'", double2 == (-2.356194490192345d));
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.566370614359173d + "'", double1 == 2.566370614359173d);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5330785122775574d) + "'", double1 == (-0.5330785122775574d));
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        double double1 = org.apache.commons.math.util.FastMath.asin(104.94395132690269d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (byte) -1, (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.04323229440977d) + "'", double1 == (-1.04323229440977d));
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        double double1 = org.apache.commons.math.util.FastMath.atan(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055269358083d + "'", double1 == 1.5707055269358083d);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 100.0f, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5607966601082315d + "'", double2 == 1.5607966601082315d);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.691673596021348E41d, (-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021347E41d + "'", double2 == 6.691673596021347E41d);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        double double1 = org.apache.commons.math.util.FastMath.sin(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9555128717466592d) + "'", double1 == (-0.9555128717466592d));
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.98437118343895d + "'", double1 == 31.98437118343895d);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        double double1 = org.apache.commons.math.util.FastMath.log(3.486784401E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.99809670330265d + "'", double1 == 44.99809670330265d);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 10.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        long long1 = org.apache.commons.math.util.FastMath.round((double) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        double double1 = org.apache.commons.math.util.FastMath.sinh(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8860316424407535E45d + "'", double1 == 1.8860316424407535E45d);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        long long1 = org.apache.commons.math.util.FastMath.round(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.872983346207419d + "'", double1 == 7.872983346207419d);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 52.0f, 2.566370614359173d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.566370614359173d + "'", double2 == 2.566370614359173d);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        double double1 = org.apache.commons.math.util.FastMath.cos((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7336545584598283d + "'", double1 == 0.7336545584598283d);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        double double2 = org.apache.commons.math.util.FastMath.max((double) ' ', 31.98437118343895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818284590455d + "'", double1 == 2.7182818284590455d);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.17453292519943295d, 2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.492757420590521E-45d + "'", double2 == 6.492757420590521E-45d);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.0950379321938843d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0950379321938841d) + "'", double1 == (-1.0950379321938841d));
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1102230246251565E-16d, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8551464208140986d) + "'", double1 == (-3.8551464208140986d));
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 100.0f, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.04323229440977d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8640359722236105d) + "'", double1 == (-0.8640359722236105d));
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        long long1 = org.apache.commons.math.util.FastMath.abs(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.3273845772164696d), (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3273845772164694d) + "'", double2 == (-1.3273845772164694d));
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        int int1 = org.apache.commons.math.util.FastMath.round(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        int int1 = org.apache.commons.math.util.FastMath.round((float) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.29577951308232d) + "'", double1 == (-57.29577951308232d));
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4210854715202004E-14d, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 0L, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 52);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9036922050915067d) + "'", double1 == (-0.9036922050915067d));
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        long long1 = org.apache.commons.math.util.FastMath.abs(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1854652182422676d + "'", double1 == 1.1854652182422676d);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        long long2 = org.apache.commons.math.util.FastMath.min((-90L), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7456241416655579d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9630272572571656d) + "'", double1 == (-0.9630272572571656d));
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        int int1 = org.apache.commons.math.util.FastMath.abs(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9075712110370514d + "'", double1 == 0.9075712110370514d);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6795226183513794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7330383821741316d) + "'", double1 == (-0.7330383821741316d));
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 100, 1.2407288686697964d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943293d + "'", double1 == 1.7453292519943293d);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.566370614359173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.199239450742893d + "'", double1 == 1.199239450742893d);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11.7910068511973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.433803554543751d + "'", double1 == 3.433803554543751d);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.718281828459045d, (-0.6795226183513794d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.815758426184901d + "'", double2 == 1.815758426184901d);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.356194490192345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.227971924677803d) + "'", double1 == (-5.227971924677803d));
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        double double1 = org.apache.commons.math.util.FastMath.log(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.57791748631743d) + "'", double1 == (-32.57791748631743d));
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.994294500487108d + "'", double1 == 0.994294500487108d);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3805346802806d + "'", double1 == 2979.3805346802806d);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.03799291018846901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8640359722236105d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        double double1 = org.apache.commons.math.util.FastMath.log((-323.0051853474518d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021347E41d + "'", double1 == 6.691673596021347E41d);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707055269358083d, 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707055269358083d + "'", double2 == 1.5707055269358083d);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2407288686697964d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5540437953657898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5261303806882357d) + "'", double1 == (-0.5261303806882357d));
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7336545584598283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0826779851380144d + "'", double1 == 1.0826779851380144d);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5403023058681398d, 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005402970483400532d + "'", double2 == 0.005402970483400532d);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.379830211523892d + "'", double1 == 0.379830211523892d);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8860316424407535E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0806165313998193E47d + "'", double1 == 1.0806165313998193E47d);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        double double1 = org.apache.commons.math.util.FastMath.log(11.7910068511973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.467337109647484d + "'", double1 == 2.467337109647484d);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.994294500487108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7825372599825183d + "'", double1 == 0.7825372599825183d);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 0.0f, 2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3978952727983707d + "'", double2 == 2.3978952727983707d);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5278888682247538d) + "'", double1 == (-0.5278888682247538d));
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.0392740995950414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9075758706536994d + "'", double1 == 3.9075758706536994d);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9075712110370514d, 0.017455064928217585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5515659755035023d + "'", double2 == 1.5515659755035023d);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6795226183513794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6284217534373299d) + "'", double1 == (-0.6284217534373299d));
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6995216443485196d) + "'", double1 == (-0.6995216443485196d));
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (byte) 100, (-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.824475489000561E-13d + "'", double2 == 7.824475489000561E-13d);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.04323229440977d), 1.0E-323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0432322944097698d) + "'", double2 == (-1.0432322944097698d));
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2407288686697964d, 7.824475489000561E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2407288686697961d + "'", double2 == 1.2407288686697961d);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0E-323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.6284217534373299d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        double double1 = org.apache.commons.math.util.FastMath.log(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988091d + "'", double1 == 4.605170185988091d);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        long long1 = org.apache.commons.math.util.FastMath.round((double) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.005402970483400532d, (-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005402970483400531d + "'", double2 == 0.005402970483400531d);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.199239450742893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        double double2 = org.apache.commons.math.util.FastMath.max(3.2710663101885897d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2710663101885897d + "'", double2 == 3.2710663101885897d);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9836065573770492d + "'", double1 == 0.9836065573770492d);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        float float1 = org.apache.commons.math.util.FastMath.abs(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(52.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.99999999999999d + "'", double2 == 51.99999999999999d);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.467337109647484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.433803554543751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9473741150701356d + "'", double1 == 1.9473741150701356d);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8373983731296124d) + "'", double1 == (-0.8373983731296124d));
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2407288686697961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.141592653589793d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.0950379321938841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33452691736804824d + "'", double1 == 0.33452691736804824d);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6019190803008256d + "'", double1 == 1.6019190803008256d);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.0432322944097698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0432322944097696d) + "'", double1 == (-1.0432322944097696d));
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        double double1 = org.apache.commons.math.util.FastMath.asinh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6435011087932844d + "'", double1 == 0.6435011087932844d);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3953649341158527d + "'", double1 == 1.3953649341158527d);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.467337109647484d, (-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3648280517791587E-23d + "'", double2 == 3.3648280517791587E-23d);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.3648280517791587E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.872732826701256E-25d + "'", double1 == 5.872732826701256E-25d);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981613362947d + "'", double1 == 0.7853981613362947d);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8196150146861299d) + "'", double1 == (-0.8196150146861299d));
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        double double1 = org.apache.commons.math.util.FastMath.abs((-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.227971924677803d + "'", double1 == 5.227971924677803d);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.834046549311538E43d + "'", double1 == 3.834046549311538E43d);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        long long1 = org.apache.commons.math.util.FastMath.round(10.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.0950379321938841d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.306922469822426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5507.000045396766d + "'", double1 == 5507.000045396766d);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0826779851380144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8250752499738025d + "'", double1 == 0.8250752499738025d);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0806165313998193E47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108.29903111138356d + "'", double1 == 108.29903111138356d);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4251878220010183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4251878220010183d + "'", double1 == 1.4251878220010183d);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9113950174654148d, (-1.04323229440977d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1016289084929765d + "'", double2 == 1.1016289084929765d);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        double double1 = org.apache.commons.math.util.FastMath.sinh(51.99999915301149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155023779490905E22d + "'", double1 == 1.9155023779490905E22d);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.15912713462618d, 31.98437118343895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12931063444698587d + "'", double2 == 0.12931063444698587d);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6284217534373299d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.005914226169836d) + "'", double1 == (-36.005914226169836d));
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.158638853279167d, 35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11826379220364476d + "'", double2 == 0.11826379220364476d);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        double double1 = org.apache.commons.math.util.FastMath.sin((-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8700054540617281d + "'", double1 == 0.8700054540617281d);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (-90L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5596856728972892d) + "'", double1 == (-1.5596856728972892d));
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0536712127723509E-8d + "'", double1 == 1.0536712127723509E-8d);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2407288686697961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2407288686697961d + "'", double1 == 1.2407288686697961d);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 100.0f, 1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000485233538d + "'", double2 == 1.0000000485233538d);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2407288686697964d, (-0.9555128717466592d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9555128717466592d) + "'", double2 == (-0.9555128717466592d));
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8250752499738025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0826779851380144d + "'", double1 == 1.0826779851380144d);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4364668701002334d + "'", double1 == 1.4364668701002334d);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837632d + "'", double1 == 0.6610060414837632d);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8700054540617281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8700054540617282d + "'", double1 == 0.8700054540617282d);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.04323229440977d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3012989023072947d) + "'", double1 == (-2.3012989023072947d));
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        double double1 = org.apache.commons.math.util.FastMath.abs(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3805346802806d + "'", double1 == 2979.3805346802806d);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.0269835496406734d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9388149908366094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2191734374167393d + "'", double1 == 1.2191734374167393d);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1854652182422676d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2407288686697961d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6019190803008256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9625468178726484d + "'", double1 == 3.9625468178726484d);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.815758426184901d, 1.0000000485233538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8157584261849007d + "'", double2 == 1.8157584261849007d);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5515659755035023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        double double1 = org.apache.commons.math.util.FastMath.cosh(11.7910068511973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66029.68355238467d + "'", double1 == 66029.68355238467d);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999986258976d + "'", double1 == 0.9999999986258976d);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.199239450742893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6212147412252023d + "'", double1 == 0.6212147412252023d);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.005402970483400531d, 5.227971924677803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4004475999834715E-12d + "'", double2 == 1.4004475999834715E-12d);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3043045862358962d + "'", double1 == 1.3043045862358962d);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6995216443485195d) + "'", double1 == (-0.6995216443485195d));
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985986933498E-5d + "'", double1 == 9.079985986933498E-5d);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.103676392483125d + "'", double1 == 2.103676392483125d);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9113950174654148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7218011448664199d + "'", double1 == 0.7218011448664199d);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-36.005914226169836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.00591422616983d) + "'", double1 == (-36.00591422616983d));
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6035270795055018d) + "'", double1 == (-0.6035270795055018d));
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6655280485429236d) + "'", double1 == (-0.6655280485429236d));
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5540437953657898d), (-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4626264090759076d) + "'", double2 == (-2.4626264090759076d));
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.46285676099588835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7735389809079516d + "'", double1 == 0.7735389809079516d);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.9075758706536994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0392740995950414d + "'", double1 == 2.0392740995950414d);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.691673596021347E41d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893698d) + "'", double1 == (-0.5440211108893698d));
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.451863517420987d + "'", double1 == 1.451863517420987d);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6610060414837632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7893750108307105d + "'", double1 == 0.7893750108307105d);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3275811425819994d + "'", double1 == 2.3275811425819994d);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.0950379321938841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.888945622903398d) + "'", double1 == (-0.888945622903398d));
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4505495340698077d) + "'", double1 == (-0.4505495340698077d));
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.3273845772164696d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        double double2 = org.apache.commons.math.util.FastMath.max((-323.0051853474518d), 2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2979.3805346802806d + "'", double2 == 2979.3805346802806d);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.3273845772164694d), (-0.9251475365964139d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.174802103936399d + "'", double1 == 3.174802103936399d);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        double double1 = org.apache.commons.math.util.FastMath.sin(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.306922469822426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0536712127723509E-8d + "'", double1 == 1.0536712127723509E-8d);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.140692632779267d + "'", double1 == 23.140692632779267d);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6012.84549645786d + "'", double1 == 6012.84549645786d);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        int int1 = org.apache.commons.math.util.FastMath.abs(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        double double1 = org.apache.commons.math.util.FastMath.log(5.872732826701256E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-55.79430724113828d) + "'", double1 == (-55.79430724113828d));
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) 1, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.0432322944097698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8065537826828391d) + "'", double1 == (-0.8065537826828391d));
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        int int1 = org.apache.commons.math.util.FastMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0947125472611012d + "'", double1 == 2.0947125472611012d);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6795226183513794d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}
