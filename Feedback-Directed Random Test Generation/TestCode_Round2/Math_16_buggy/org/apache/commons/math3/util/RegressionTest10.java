package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.44496326061477254d, 0.011020261488361868d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9911158927999445d + "'", double2 == 0.9911158927999445d);
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5370263527767281E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.486339547584802E10d + "'", double1 == 2.486339547584802E10d);
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.8774718E-37f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.918828546453101d, 1.5927965878556878E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.7683715820308884E-7d, 0.36274713936822706d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7683715820308884E-7d + "'", double2 == 4.7683715820308884E-7d);
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.044757795734393d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-4.999750018744576E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.999625033326321E-5d) + "'", double1 == (-4.999625033326321E-5d));
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0691650524286674E-14d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47) + "'", int1 == (-47));
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-63.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-62.99999999999999d) + "'", double1 == (-62.99999999999999d));
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.3712141381683466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37121413816834664d + "'", double1 == 0.37121413816834664d);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.4043418471644635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8772762058832566d + "'", double1 == 0.8772762058832566d);
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6022849320448147d, (double) (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.617985073826121d + "'", double2 == 12.617985073826121d);
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2016.0f, 85);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.7990222E28f + "'", float2 == 7.7990222E28f);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1529215E18f, 1.0037447732267826d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.15292144E18f + "'", float2 == 1.15292144E18f);
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000005f + "'", float1 == 3.0000005f);
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(749.99994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.433773393518789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 2.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9092973276085183d + "'", double1 == 0.9092973276085183d);
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308233d + "'", double1 == 572.9577951308233d);
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.447327196772732E34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.736183462198994d + "'", double1 == 34.736183462198994d);
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.4657022738769552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02558133053312054d + "'", double1 == 0.02558133053312054d);
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 15);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837977760189568d) + "'", double1 == (-0.008837977760189568d));
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.2794150403540232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        int int1 = org.apache.commons.math3.util.FastMath.round((-1.4E-45f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(100.99797342105242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.308272139545614d + "'", double1 == 5.308272139545614d);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 4, 8.445152205030682E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.1047944774642255d) + "'", double2 == (-5.1047944774642255d));
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.6508801521799592d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-7276.563998161455d), 0.7665477425729947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7276.564038537341d + "'", double2 == 7276.564038537341d);
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 375.0f, 1.17512404686688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 374.99999999999994d + "'", double2 == 374.99999999999994d);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.658104239963583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9311279069507328d + "'", double1 == 1.9311279069507328d);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.5111573E23f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.0051598093960231765d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.14748352E9d, 0.8623150089993341d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.14748352E9d + "'", double2 == 2.14748352E9d);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        double double1 = org.apache.commons.math3.util.FastMath.floor(8.187928385330529E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        long long1 = org.apache.commons.math3.util.FastMath.abs(9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        double double1 = org.apache.commons.math3.util.FastMath.atan(512.5789572728952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5688454103221872d + "'", double1 == 1.5688454103221872d);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        float float2 = org.apache.commons.math3.util.FastMath.min(7.629395E-6f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) ' ', 17.76076974417489d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.999998f + "'", float2 == 31.999998f);
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 29, (float) (-8));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.0f) + "'", float2 == (-8.0f));
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        int int2 = org.apache.commons.math3.util.FastMath.max(141, 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1023 + "'", int2 == 1023);
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 8.8817837E-16f, (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7755573961267688E-17d + "'", double2 == 2.7755573961267688E-17d);
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.19611987703015263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1936619037451575d + "'", double1 == 0.1936619037451575d);
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-63));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.2227587494850775E-162d, 0.007570918573144928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.222758749485078E-162d + "'", double2 == 2.222758749485078E-162d);
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        int int1 = org.apache.commons.math3.util.FastMath.round(127.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 4.768372E-7f, 7.509644039241865d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.50964403924188d + "'", double2 == 7.50964403924188d);
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 63);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8524213316116924d, 0.1759754114836391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8524213316116924d + "'", double2 == 0.8524213316116924d);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.2456194955503825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.36873997425154d + "'", double1 == 71.36873997425154d);
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.2949673E9f, (-2016.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8849970445005179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.0554544523933395E-6d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1 == (-18));
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        long long1 = org.apache.commons.math3.util.FastMath.abs(39L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39L + "'", long1 == 39L);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.37438953472E11d), 1.0000004768373099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000004768373099d + "'", double2 == 1.0000004768373099d);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-20L), 5.5565355E-17f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.000000033134038d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.007599723455542785d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007599577149562085d) + "'", double1 == (-0.007599577149562085d));
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 37.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.00000000000001d + "'", double1 == 37.00000000000001d);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.884004301644022E-4d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1 == (-11));
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9953380705322046d, 1.5031586665657326d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9953380705322047d + "'", double2 == 0.9953380705322047d);
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        int int2 = org.apache.commons.math3.util.FastMath.max((-15), 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.1936619037451575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5785595485605854d + "'", double1 == 0.5785595485605854d);
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258905478413947E-5d + "'", double1 == 1.5258905478413947E-5d);
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1071487177940904d) + "'", double1 == (-1.1071487177940904d));
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 7.629395E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.33158070377639E-7d + "'", double1 == 1.33158070377639E-7d);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 36L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.5698207173483318d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-4.999875008328899E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.999875010412076E-5d) + "'", double1 == (-4.999875010412076E-5d));
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.1511132905840549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017452419920761693d + "'", double1 == 0.017452419920761693d);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.3728503949255086E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707961895098572d + "'", double1 == 1.5707961895098572d);
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.9379882965789272d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 661.6940238674958d + "'", double1 == 661.6940238674958d);
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.849653111851499E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 2.8211867E-34f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6000.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.9721522630525295E-31d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        double double1 = org.apache.commons.math3.util.FastMath.acos(7.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.000000005268356d, (double) (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000005268356d + "'", double2 == 1.000000005268356d);
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8483318952611161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.012826747469946d + "'", double1 == 1.012826747469946d);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.154434690031884d, 9.999960327225621E103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(207.29648124788537d, 0.33934385609142426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 207.29648124788534d + "'", double2 == 207.29648124788534d);
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1023.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1023L + "'", long1 == 1023L);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        double double2 = org.apache.commons.math3.util.FastMath.max(2097152.0d, 8.699514748210191d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2097152.0d + "'", double2 == 2097152.0d);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.300664126286459E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.300664126286459E30d + "'", double1 == 1.300664126286459E30d);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.10899577685250762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4615835748927024d + "'", double1 == 1.4615835748927024d);
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 52L, 1.1920928955078154E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078154E-7d + "'", double2 == 1.1920928955078154E-7d);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.6148367167674555d, 2.688101119437145E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6148367167674555d + "'", double2 == 1.6148367167674555d);
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5707963267948966d, 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 225.6516556453549d + "'", double2 == 225.6516556453549d);
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8905770416677471d + "'", double1 == 0.8905770416677471d);
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(34.736183462198994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 43L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1368683772161603E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.944289813551192d) + "'", double1 == (-12.944289813551192d));
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.1071487177940904d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1071487177940904d + "'", double2 == 1.1071487177940904d);
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        int int2 = org.apache.commons.math3.util.FastMath.max(149, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.4505495340698077d), 1.151292546497023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.151292546497023d + "'", double2 == 1.151292546497023d);
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 1.64926731E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267942904d + "'", double1 == 1.5707963267942904d);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1413520055419475d, (double) (-126.99999f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1413520055419473d + "'", double2 == 1.1413520055419473d);
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.220703128031649E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        int int2 = org.apache.commons.math3.util.FastMath.max(52, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.75000006f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.2609551558045143d), (-6.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.26095515580451434d) + "'", double2 == (-0.26095515580451434d));
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.5492548965142435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(9.085602717697938d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(28.999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 29.0f + "'", float1 == 29.0f);
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(29.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.072316825685847d + "'", double1 == 3.072316825685847d);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.3017603043599186d, 0.13158548711983198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3083939125614241d + "'", double2 == 1.3083939125614241d);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-49.17253568793198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-49.172535687931976d) + "'", double1 == (-49.172535687931976d));
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.8414709848078964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9440892412430647d) + "'", double1 == (-0.9440892412430647d));
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.9999995f, 5.5565355E-17f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.5565355E-17f + "'", float2 == 5.5565355E-17f);
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        long long2 = org.apache.commons.math3.util.FastMath.max(100L, 127L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.09801546060418229d, (double) 2.14748352E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0980154606041823d + "'", double2 == 0.0980154606041823d);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794896d + "'", double1 == 1.570796326794896d);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 29L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.0d + "'", double1 == 29.0d);
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        long long2 = org.apache.commons.math3.util.FastMath.max(74L, 1023L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023L + "'", long2 == 1023L);
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.141491290551085E-6d, 0.9999999585824487d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.268736768472422E-9d + "'", double2 == 3.268736768472422E-9d);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-29), 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        double double1 = org.apache.commons.math3.util.FastMath.cos(5.89793739384485E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12150579067946177d + "'", double1 == 0.12150579067946177d);
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-4.999625033326321E-5d), 3.010299956639812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.999625033326321E-5d + "'", double2 == 4.999625033326321E-5d);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.690910072194429d + "'", double1 == 7.690910072194429d);
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        float float2 = org.apache.commons.math3.util.FastMath.min(100.000015f, 4.0000005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0000005f + "'", float2 == 4.0000005f);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.2609551558045143d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.996833390848202d), 57.29577951308232d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 97.000015f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00001525878908d + "'", double1 == 97.00001525878908d);
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.1017419656965828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9515181949376154d + "'", double1 == 0.9515181949376154d);
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(29.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(108222.44191876269d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 13.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5649493574615367d + "'", double1 == 2.5649493574615367d);
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        double double1 = org.apache.commons.math3.util.FastMath.rint(36.01102806275611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.6625659571216382d, 11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1356.935080185115d + "'", double2 == 1356.935080185115d);
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        float float2 = org.apache.commons.math3.util.FastMath.min(99.99999f, 1.5845633E30f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.0000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0000005f + "'", float1 == 2.0000005f);
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        double double1 = org.apache.commons.math3.util.FastMath.rint(57.29291493894794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.22864910185707277d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4.761141328797799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998536059613301d + "'", double1 == 0.9998536059613301d);
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.812978183665497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9333108123671324d + "'", double1 == 0.9333108123671324d);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.2755538279996634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.91802404552728d + "'", double1 == 4.91802404552728d);
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 40L, 1500);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 256.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14667.719555349075d + "'", double1 == 14667.719555349075d);
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.02558133053312054d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-29.0f), (double) (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6738779353175968d) + "'", double2 == (-1.6738779353175968d));
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        long long1 = org.apache.commons.math3.util.FastMath.round(11014.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11014L + "'", long1 == 11014L);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-4.1244601392439496E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.124460373116969E-4d) + "'", double1 == (-4.124460373116969E-4d));
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.8879813966787504d, 5.7277862875981045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8879813966787504d + "'", double2 == 0.8879813966787504d);
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6321205588285577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19920008462778144d) + "'", double1 == (-0.19920008462778144d));
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-35.0f), 37);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.8103634E12f) + "'", float2 == (-4.8103634E12f));
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 149, (float) (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-149.0f) + "'", float2 == (-149.0f));
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5688454103221872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-5.748134494412303E-34d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.748134494412303E-34d) + "'", double1 == (-5.748134494412303E-34d));
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 0.015625f, 0.999938966709995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015628966602108815d + "'", double2 == 0.015628966602108815d);
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7615685223484937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5662046180417148d + "'", double1 == 0.5662046180417148d);
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.344058570908068E43d + "'", double1 == 1.344058570908068E43d);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.739706489124846E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7397064803492486E-4d) + "'", double1 == (-1.7397064803492486E-4d));
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-63959947L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 63959947L + "'", long1 == 63959947L);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2147483647, 1.5474254E26f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5474254E26f + "'", float2 == 1.5474254E26f);
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        double double1 = org.apache.commons.math3.util.FastMath.floor(9.999960327225621E103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999960327225621E103d + "'", double1 == 9.999960327225621E103d);
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.384185791015625E-7d + "'", double1 == 2.384185791015625E-7d);
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        long long1 = org.apache.commons.math3.util.FastMath.round(8.699681400989515d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.02718858648935137d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 52L, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.0d + "'", double2 == 13.0d);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.8383231924340317d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3666.9298888372687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 210099.6064007516d + "'", double1 == 210099.6064007516d);
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-4.736275386267657d), 31.08291395022939d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.736275386267657d + "'", double2 == 4.736275386267657d);
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.8215975647065147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6759384609369061d) + "'", double1 == (-0.6759384609369061d));
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(224.08464360781855d, (-0.5537502203873549d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-224.08464360781855d) + "'", double2 == (-224.08464360781855d));
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.4342944819032518d, (double) 16128.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4342944819032518d + "'", double2 == 0.4342944819032518d);
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.0678869494090629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06778294805138535d + "'", double1 == 0.06778294805138535d);
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(35.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 7, 1.2664005294302816d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.9999995f + "'", float2 == 6.9999995f);
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-684.0422700463664d), 0.9182846632869424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5694538891241967d) + "'", double2 == (-1.5694538891241967d));
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-149));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.2233709E18f, 4.768372150465441E-7d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233704E18f + "'", float2 == 9.2233704E18f);
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-9.223372E18f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.09951163E12f + "'", float1 == 1.09951163E12f);
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.005969084226160847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005969155120433433d + "'", double1 == 0.005969155120433433d);
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.4097900908384d + "'", double1 == 148.4097900908384d);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        double double2 = org.apache.commons.math3.util.FastMath.max(16.129019760422665d, 0.2779131873068914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.129019760422665d + "'", double2 == 16.129019760422665d);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.768371582031611E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000476837272d + "'", double1 == 1.000000476837272d);
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9515181949376154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.51797669983169d + "'", double1 == 54.51797669983169d);
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-1023.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.027041164336506635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996344099938438d + "'", double1 == 0.9996344099938438d);
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-2L), 4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1024, (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.018531E-36f + "'", float2 == 6.018531E-36f);
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.9663132900858417E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6.7762636E-21f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        long long1 = org.apache.commons.math3.util.FastMath.round(12.16264444841069d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 8);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.000000476837272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000476837272d + "'", double1 == 1.000000476837272d);
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.2993419E33f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.444680502256067E34d + "'", double1 == 7.444680502256067E34d);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.1597153257338444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9166893899372177d + "'", double1 == 0.9166893899372177d);
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.22652043378197598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8934439858858716d + "'", double1 == 2.8934439858858716d);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-44));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.014551271908370545d, (-0.10412335356742336d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.002741601523296d + "'", double2 == 3.002741601523296d);
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 12, 1.9999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2046.0d, 5.778105565676456E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2046.0d + "'", double2 == 2046.0d);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9182846632869422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9171523356580291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7938732240692224d + "'", double1 == 0.7938732240692224d);
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.895475622246554d, 108222.44191876269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-104.99922643163309d) + "'", double2 == (-104.99922643163309d));
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.129321527924962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.834777679932393d) + "'", double1 == (-0.834777679932393d));
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-2.935896209259133d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-149));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.8820097754150913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.89704490591024d + "'", double1 == 8.89704490591024d);
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        long long2 = org.apache.commons.math3.util.FastMath.max(6L, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.7160033436347992d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.5474254E26f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5474254E26f + "'", float1 == 1.5474254E26f);
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(6.027800920562904d, 1.5702884095118321d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3159527968551723d + "'", double2 == 1.3159527968551723d);
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.3862943611198906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9830277404112437d + "'", double1 == 0.9830277404112437d);
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 2015.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.3099240316342194E-25d, 0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4500444201914883E-25d + "'", double2 == 2.4500444201914883E-25d);
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8778599937165045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5729.578825572446d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.284603712274012E22d + "'", double2 == 5.284603712274012E22d);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-2.4428418403909626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4428418403909626d + "'", double1 == 2.4428418403909626d);
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 8.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0000000794728567d + "'", double1 == 2.0000000794728567d);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.7461777875704901d, 0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.34720030357470333d + "'", double2 == 0.34720030357470333d);
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 4.5035996E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.04365338911715d + "'", double1 == 36.04365338911715d);
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 9.2233704E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.36141937702255d + "'", double1 == 44.36141937702255d);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 48000);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 48000.0f + "'", float1 == 48000.0f);
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(749.9999f, 1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.9998f + "'", float2 == 749.9998f);
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078068E-7d + "'", double1 == 1.1920928955078068E-7d);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        int int2 = org.apache.commons.math3.util.FastMath.min((-50), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-50) + "'", int2 == (-50));
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.1474839E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.6321636932737211d, 1.090853653267673E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.878049774137445d + "'", double2 == 51.878049774137445d);
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.11052669025126904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11686615809270445d + "'", double1 == 0.11686615809270445d);
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 46, 6000);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.9982230451921064d, 1484736.8269696261d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.998223045192107d + "'", double2 == 2.998223045192107d);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.271684935418713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.240342741956245d + "'", double1 == 0.240342741956245d);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.7301521188343126d, 1.0007751983046094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0007751983046094d + "'", double2 == 1.0007751983046094d);
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        int int1 = org.apache.commons.math3.util.FastMath.round(6.7762636E-21f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (-0.061328855954495554d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.061328855954495554d + "'", double2 == 0.061328855954495554d);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9977630759545902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9977630759545902d + "'", double1 == 0.9977630759545902d);
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.8725523440809979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6428736185724158d + "'", double1 == 0.6428736185724158d);
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.4863445844633245d, 2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7395614359828127d + "'", double2 == 2.7395614359828127d);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(230.25850929940458d, 1.5609054788787597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 230.25850929940455d + "'", double2 == 230.25850929940455d);
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 100.00001f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.39427356861218293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4045683399228926d) + "'", double1 == (-0.4045683399228926d));
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.695108876643778E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 11014L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11014.0f + "'", float1 == 11014.0f);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        long long1 = org.apache.commons.math3.util.FastMath.round(9.085602717697938d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.4731873725534812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45710223504283165d) + "'", double1 == (-0.45710223504283165d));
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.1612231530729578d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.7670734698904623d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.64926731E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.5342424578144773d, (-2016));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.1425465430742778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14159265358979323d) + "'", double1 == (-0.14159265358979323d));
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(7.444680502256067E34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.206769224304003E11d + "'", double1 == 4.206769224304003E11d);
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        int int1 = org.apache.commons.math3.util.FastMath.abs(2016);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2016 + "'", int1 == 2016);
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.2246467991473532E-16d, 6.930494765951626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.930494765951626d + "'", double2 == 6.930494765951626d);
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        float float2 = org.apache.commons.math3.util.FastMath.max((-2015.9998f), 48000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48000.0f + "'", float2 == 48000.0f);
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.8284271247461903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.342454046453526d + "'", double1 == 1.342454046453526d);
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(9.2233715E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-4.999750016661555E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-1024L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.4304247186494576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (-121));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.9982230451921064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9897401698715056d) + "'", double1 == (-0.9897401698715056d));
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.75d, 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.0d + "'", double2 == 96.0d);
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.00961538461539d + "'", double1 == 26.00961538461539d);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-20));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-20L), 4.882813E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-20.0f) + "'", float2 == (-20.0f));
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        long long2 = org.apache.commons.math3.util.FastMath.min(38L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 2.8211864E-34f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(89.92360567258659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-6));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4917798526449118d) + "'", double1 == (-2.4917798526449118d));
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.4464931094577818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4803115798498959d + "'", double1 == 0.4803115798498959d);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.463965950463316E102d), 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.14319630411596E204d + "'", double2 == 2.14319630411596E204d);
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8431577997039656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1227455410149547d + "'", double1 == 1.1227455410149547d);
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.027181889027663657d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.950212931632136d) + "'", double1 == (-0.950212931632136d));
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.000001f, 7.7371252E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.000001f + "'", float2 == 9.000001f);
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 3071.9998f, 1.4615835748927024d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.24891856508546262d) + "'", double2 == (-0.24891856508546262d));
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 1024);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1024L + "'", long1 == 1024L);
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8879813966787504d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3570334.006879247d + "'", double2 == 3570334.006879247d);
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.736374376643928d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        int int2 = org.apache.commons.math3.util.FastMath.min((-127), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 85.0f, 4.64158883361278d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.027538327591038E8d + "'", double2 == 9.027538327591038E8d);
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.62939453139803E-6d + "'", double1 == 7.62939453139803E-6d);
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1858035486915015d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.20824159849321072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45633496304053967d + "'", double1 == 0.45633496304053967d);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        float float2 = org.apache.commons.math3.util.FastMath.max(63.0f, (float) (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-15), 3.0000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-15.0f) + "'", float2 == (-15.0f));
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.6812492467611788E-6d), 749.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.9466715061814477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7580103071638075d + "'", double1 == 0.7580103071638075d);
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.4758801E27f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.47588E27f + "'", float2 == 2.47588E27f);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(22025.4658761156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000003691417d + "'", double1 == 10.000000003691417d);
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.3502392001023199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35023920010231996d + "'", double1 == 0.35023920010231996d);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.171869616492817E-49d, 7.31322083153445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.337171937726513E-50d + "'", double2 == 4.337171937726513E-50d);
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        int int2 = org.apache.commons.math3.util.FastMath.min(8, 48000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.882813082076609E-4d, (double) 34);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4361214946296837E-5d + "'", double2 == 1.4361214946296837E-5d);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        double double2 = org.apache.commons.math3.util.FastMath.min(6.164414002968976d, 0.03490658295929199d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03490658295929199d + "'", double2 == 0.03490658295929199d);
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1023.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.3841857910156255E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3841860752327426E-7d + "'", double1 == 2.3841860752327426E-7d);
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000004f + "'", float1 == 52.000004f);
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        double double1 = org.apache.commons.math3.util.FastMath.abs(461599.5939121951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 461599.5939121951d + "'", double1 == 461599.5939121951d);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        double double1 = org.apache.commons.math3.util.FastMath.atan(96.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560380036863927d + "'", double1 == 1.560380036863927d);
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.061877705960518836d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003828850494936428d + "'", double2 == 0.003828850494936428d);
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3779650346793701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3779650346793701d + "'", double1 == 1.3779650346793701d);
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 63L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        long long2 = org.apache.commons.math3.util.FastMath.min((-1024L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1024L) + "'", long2 == (-1024L));
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        double double2 = org.apache.commons.math3.util.FastMath.max(22025.465794806718d, (-0.14159265358979323d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.465794806718d + "'", double2 == 22025.465794806718d);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.4056437262473316d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.7456061400682787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 43);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-4.999875010412076E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.002864717361895405d) + "'", double1 == (-0.002864717361895405d));
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(20.085536923187668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.284913104854943E8d + "'", double1 == 5.284913104854943E8d);
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.1691265E29f, (-18));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2089258E24f + "'", float2 == 1.2089258E24f);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.3200537642354306d, (-0.26095515580451434d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015277985212858947d + "'", double2 == 0.015277985212858947d);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.768372E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.768372E-7f + "'", float1 == 4.768372E-7f);
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.005159786500818854d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.8215975647065147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.749444424663085d) + "'", double1 == (-0.749444424663085d));
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.556245054886526d, 0.4304247186494576d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.556245054886526d + "'", double2 == 1.556245054886526d);
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        long long2 = org.apache.commons.math3.util.FastMath.min((-2L), (-121L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-121L) + "'", long2 == (-121L));
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1.64926744E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0000005f + "'", float1 == 2.0000005f);
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.5845633E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.9787379103558784d) + "'", double1 == (-3.9787379103558784d));
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 750);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 750.0f + "'", float1 == 750.0f);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.7615941309233423d), 0.5366847334153032d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9569323043843873d) + "'", double2 == (-0.9569323043843873d));
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(106.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        double double1 = org.apache.commons.math3.util.FastMath.log((-2.0964636728249658E-8d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        long long2 = org.apache.commons.math3.util.FastMath.max(86L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 86L + "'", long2 == 86L);
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.6428736185724158d, (-0.7798091421779662d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6428736185724157d + "'", double2 == 0.6428736185724157d);
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        float float1 = org.apache.commons.math3.util.FastMath.signum(192.00002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.841534261491385E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.40979009083827d + "'", double1 == 148.40979009083827d);
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 21L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.1691265E29f, 0.0678869494090629d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1691263E29f + "'", float2 == 3.1691263E29f);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 97, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8879813966787504d, 2.0794415416798357d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0794415416798357d + "'", double2 == 2.0794415416798357d);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(38.75229574078433d, 15.174271293851461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.197577468956393d + "'", double2 == 1.197577468956393d);
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-63959947L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1023.00006f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1023.0d + "'", double1 == 1023.0d);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.7182817474479353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4107813643634838d + "'", double1 == 0.4107813643634838d);
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 10, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(686.4773600637391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.796720822921585E297d + "'", double1 == 6.796720822921585E297d);
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 10, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.138463037954397d, 1.4255617839730704E64d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1384630379543976d + "'", double2 == 2.1384630379543976d);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.3733829795401761E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 97L, 29);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.2076478E10f + "'", float2 == 5.2076478E10f);
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.433773393518789d, 62.58344286260509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006931009667375755d + "'", double2 == 0.006931009667375755d);
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        int int2 = org.apache.commons.math3.util.FastMath.max(9, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13533528323661273d + "'", double1 == 0.13533528323661273d);
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.5587103146581684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19276540932902125d + "'", double1 == 0.19276540932902125d);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        double double1 = org.apache.commons.math3.util.FastMath.cos(89.94410169625876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3974268916928712d) + "'", double1 == (-0.3974268916928712d));
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(29.0f, 31);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.2277026E10f + "'", float2 == 6.2277026E10f);
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1023 + "'", int2 == 1023);
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.24304604515482672d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24071465746731802d) + "'", double1 == (-0.24071465746731802d));
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-149));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.7502685605935906d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.884004301644022E-4d, 0.23632416484367985d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.884004301644022E-4d + "'", double2 == 4.884004301644022E-4d);
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 48000, (long) 3072);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3072L + "'", long2 == 3072L);
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        int int2 = org.apache.commons.math3.util.FastMath.max((-3), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(7.31322083153445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1499.0006666663703d + "'", double1 == 1499.0006666663703d);
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        double double1 = org.apache.commons.math3.util.FastMath.signum(42971.83113775489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-15.749999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999998555018376d) + "'", double1 == (-0.9999998555018376d));
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.892546881191539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2427806885208375d + "'", double1 == 3.2427806885208375d);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.29920478501236675d, 0.9659011330697134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29920478501236675d + "'", double2 == 0.29920478501236675d);
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9576597548889478d), (double) 256.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5490899152547166E-5d + "'", double2 == 1.5490899152547166E-5d);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.17452205010929986d), 1.3423197723816498d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17452205010929986d + "'", double2 == 0.17452205010929986d);
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.164414002968976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.0000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000004f + "'", float1 == 1.0000004f);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.8469725489740325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2726787747159125d) + "'", double1 == (-0.2726787747159125d));
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.3713210688081606E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.370365924753115E-4d + "'", double1 == 4.370365924753115E-4d);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1024.0007801044699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0007801044699d + "'", double1 == 1024.0007801044699d);
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 4.8828125E-4f, 0.0017485284275232642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8828125E-4d + "'", double2 == 4.8828125E-4d);
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 5.8274116E13f, 0.015277985212858947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.13191944504731992d) + "'", double2 == (-0.13191944504731992d));
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3.0000002f, 0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9997010053589297d + "'", double2 == 2.9997010053589297d);
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.658104239963583d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        long long2 = org.apache.commons.math3.util.FastMath.max(100L, (long) (-121));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0027621360286460735d, 2.3978953594960317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0027621360286460735d + "'", double2 == 0.0027621360286460735d);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-1.9999999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 6.2277026E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.227702579200001E10d + "'", double1 == 6.227702579200001E10d);
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 63L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        int int2 = org.apache.commons.math3.util.FastMath.min((-15), (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 0.015625004f, 1.5707647845032549d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707647845032549d + "'", double2 == 1.5707647845032549d);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        int int1 = org.apache.commons.math3.util.FastMath.abs(29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0027621360286460735d, 1.5574077246549025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002762136028646074d + "'", double2 == 0.002762136028646074d);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(237.68018390304016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.359154094323616E102d + "'", double1 == 8.359154094323616E102d);
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0788405256891817E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0788405256891818E-19d + "'", double1 == 1.0788405256891818E-19d);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.24339128723952508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(37.0f, (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.66633186E17f + "'", float2 == 1.66633186E17f);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0000000000291038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9103830456310187E-11d + "'", double1 == 2.9103830456310187E-11d);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1500.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1500.0d + "'", double1 == 1500.0d);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 85, (-1.0480275261378338d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 84.99999f + "'", float2 == 84.99999f);
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-5L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-74.20321057778875d) + "'", double1 == (-74.20321057778875d));
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9975054538602377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.4453060614371709d, 1.5927965878556878E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5927965878556878E16d + "'", double2 == 1.5927965878556878E16d);
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.17889304790669835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1808389053476742d + "'", double1 == 0.1808389053476742d);
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        int int2 = org.apache.commons.math3.util.FastMath.max((-18), 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.4464931094577818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4787371664446284d + "'", double1 == 0.4787371664446284d);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.4226387499614237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 661L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1024.0001220703127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0001220703127d + "'", double1 == 1024.0001220703127d);
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.7445401778338758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1054730691723746d + "'", double1 == 1.1054730691723746d);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        long long1 = org.apache.commons.math3.util.FastMath.round((-49.17253568793199d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-49L) + "'", long1 == (-49L));
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.0019531248835846782d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.13533528323661265d, 0.5997382704646929d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13533528323661265d + "'", double2 == 0.13533528323661265d);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.9640275716535813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.3753475883946132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4554972406527213d + "'", double1 == 1.4554972406527213d);
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.017452419920761693d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(22025.4658761156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 40L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.8767220797745886d), (-0.007570773924451899d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.876754767185269d + "'", double2 == 0.876754767185269d);
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        double double1 = org.apache.commons.math3.util.FastMath.asin(57.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 31.999998f, 1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999998092651367d + "'", double2 == 31.999998092651367d);
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.1071487177940904d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 100, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        int int2 = org.apache.commons.math3.util.FastMath.max((-14), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5847443794151275d, 0.005969155120433433d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5847443794151275d + "'", double2 == 1.5847443794151275d);
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.463965950463316E102d), 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.287685879697498E111d) + "'", double2 == (-6.287685879697498E111d));
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 37L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6435381333569995d) + "'", double1 == (-0.6435381333569995d));
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.0066927999415745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.8623667551892d + "'", double1 == 286.8623667551892d);
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0000038147045416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.000001f, 85.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.000001f + "'", float2 == 9.000001f);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 2.910383E-11f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        long long1 = org.apache.commons.math3.util.FastMath.round(192.00001525878906d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 192L + "'", long1 == 192L);
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.24187733445678708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6164048260636456d) + "'", double1 == (-0.6164048260636456d));
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1.04453605E13f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10445360463872L + "'", long1 == 10445360463872L);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.010299956639812d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.19077079376318204d, (-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008837747656337245d) + "'", double2 == (-0.008837747656337245d));
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-2.4917798526449118d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.15292144E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1529215E18f + "'", float1 == 1.1529215E18f);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        double double1 = org.apache.commons.math3.util.FastMath.floor(12.617985073826121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.159276472395984E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.871061917633263d + "'", double1 == 20.871061917633263d);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.19068996526228799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6571063883041222d) + "'", double1 == (-1.6571063883041222d));
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.0000002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.656682604204755d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-2.4917798526449118d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4917798526449113d) + "'", double1 == (-2.4917798526449113d));
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 85.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 85.0d + "'", double1 == 85.0d);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.5707963267948581d, 0.80038650342911d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.80038650342911d + "'", double2 == 0.80038650342911d);
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.6508801521799592d), 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.795508967228428E9d) + "'", double2 == (-2.795508967228428E9d));
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.1361707344559157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5144714273384203d + "'", double1 == 0.5144714273384203d);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.718315292959719d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(686.4773600637391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 686.4773600637392d + "'", double1 == 686.4773600637392d);
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.984378812835757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.912392919850914d + "'", double1 == 9.912392919850914d);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8102.083927575384d + "'", double1 == 8102.083927575384d);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-3.9133899457889196d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.935885722901565E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1246.3114137236385d + "'", double1 == 1246.3114137236385d);
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.4322216757321002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 82.0602573466037d + "'", double1 == 82.0602573466037d);
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.02668142320876577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.992660940609293E149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.840873528995979E49d + "'", double1 == 5.840873528995979E49d);
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9893581078632866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9893581078632867d + "'", double1 == 0.9893581078632867d);
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.4304918528519632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9707818780825963d + "'", double1 == 1.9707818780825963d);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.629394531472045E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0027621358640501454d + "'", double1 == 0.0027621358640501454d);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.29971680358919567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3494765865309735d + "'", double1 == 1.3494765865309735d);
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.1382155914975337E-50d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(6.8669148977008805E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.30685281944005d + "'", double1 == 73.30685281944005d);
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 6, (long) (-11));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.971286084435162d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.24553239290601714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2455323929060171d) + "'", double1 == (-0.2455323929060171d));
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 127);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.030765742067207565d, (double) 39);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.030765742067207565d + "'", double2 == 0.030765742067207565d);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-2L), 35.000008f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000008f + "'", float2 == 35.000008f);
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.8446874961776067d, 0.895475622246554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.654074475403972d + "'", double2 == 0.654074475403972d);
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.000004f + "'", float1 == 32.000004f);
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-47), (long) (-2016));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-47L) + "'", long2 == (-47L));
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.7453291188362752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.556943144653333d + "'", double1 == 0.556943144653333d);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        double double1 = org.apache.commons.math3.util.FastMath.asin(42.281978014156664d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.569185067066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.505473743921135d + "'", double1 == 2.505473743921135d);
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        int int2 = org.apache.commons.math3.util.FastMath.min(52, 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(85.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1115063573114566E36d + "'", double1 == 4.1115063573114566E36d);
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.0517578E-5f, (-34));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7763568E-15f + "'", float2 == 1.7763568E-15f);
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.6349733946709988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 93.67707513082527d + "'", double1 == 93.67707513082527d);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.03937253280921479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3072613755411777d + "'", double1 == 1.3072613755411777d);
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9999010695219456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557068888645458d + "'", double1 == 1.557068888645458d);
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.560380036863927d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        double double2 = org.apache.commons.math3.util.FastMath.max(74.35674296486278d, 1.8218109075452849d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.35674296486278d + "'", double2 == 74.35674296486278d);
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        double double2 = org.apache.commons.math3.util.FastMath.max(7.999999999999999d, 2.5649493574615367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.999999999999999d + "'", double2 == 7.999999999999999d);
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(37.999996185302734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1855810236609772E16d + "'", double1 == 3.1855810236609772E16d);
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.5643904318910452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5720090118561684d) + "'", double1 == (-0.5720090118561684d));
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-44));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.1645206134117347E-165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1645206134117347E-165d + "'", double1 == 1.1645206134117347E-165d);
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.9132181397411985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.722673277468218d) + "'", double1 == (-0.722673277468218d));
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.332177586716706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8140012656304243d) + "'", double1 == (-0.8140012656304243d));
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.91802404552728d, 7.624618747740735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.91802404552728d + "'", double2 == 4.91802404552728d);
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 8L, (-149));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1E-44f + "'", float2 == 1.1E-44f);
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 21L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.5551700532107924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19177788476679059d + "'", double1 == 0.19177788476679059d);
    }
}

