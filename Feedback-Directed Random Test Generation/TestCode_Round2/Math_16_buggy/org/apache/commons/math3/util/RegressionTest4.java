package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1023.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.15566292355646663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15629232893697098d + "'", double1 == 0.15629232893697098d);
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(Double.NEGATIVE_INFINITY, 1.0003709130606282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 2147483647, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.14748365E9f) + "'", float2 == (-2.14748365E9f));
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.6110142312416813d, 2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4524228376538795d) + "'", double2 == (-0.4524228376538795d));
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.4411627128891868d, 0.648361369288039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4411627128891868d + "'", double2 == 1.4411627128891868d);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (byte) 100, (-127.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) -1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(74.3898917758609d, 39);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.089627549827865E13d + "'", double2 == 4.089627549827865E13d);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '#', 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 8L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0000000000291038d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0000000000291038d) + "'", double2 == (-1.0000000000291038d));
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.42562584220407d + "'", double1 == 55.42562584220407d);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(9.0f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.2794150403540232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5537502203873549d) + "'", double1 == (-0.5537502203873549d));
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        double double2 = org.apache.commons.math3.util.FastMath.log(237.68018390304016d, 1.1029798377113775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017915698460637734d + "'", double2 == 0.017915698460637734d);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.718315292959719d, 108222.44191876269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.718315292959719d + "'", double2 == 1.718315292959719d);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-1024), (float) 9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1024.0f) + "'", float2 == (-1024.0f));
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(749.99994f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.9999f + "'", float2 == 749.9999f);
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.623641707626563d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.0000002f, 0.027041164336506635d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6880966331881486E43d + "'", double1 == 2.6880966331881486E43d);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 4.882813E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.882813082076609E-4d + "'", double1 == 4.882813082076609E-4d);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.0000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.2456194955503825d, 0.7262340257027773d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2456194955503825d + "'", double2 == 1.2456194955503825d);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.7453291188362752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030461739654624384d + "'", double1 == 0.030461739654624384d);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.30591789243267364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        int int2 = org.apache.commons.math3.util.FastMath.min(32, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.8904869112092367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47238216160195395d + "'", double1 == 0.47238216160195395d);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(512.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.19077079376318204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5756660649621339d + "'", double1 == 0.5756660649621339d);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.2401309032460812E-17d, (-63));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 0.015625002f, (-0.7615941309233424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.121079351920185d + "'", double2 == 3.121079351920185d);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.5065230921350898E254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9994192391908521d) + "'", double1 == (-0.9994192391908521d));
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.732511156817248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.87998490068716d + "'", double1 == 20.87998490068716d);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.1190346870425513E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1190346870425513E-15d + "'", double1 == 1.1190346870425513E-15d);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.011032585021104841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000608595834288d + "'", double1 == 1.0000608595834288d);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(265.94345040106276d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.0075707739244519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007570918573144928d) + "'", double1 == (-0.007570918573144928d));
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.999938966709995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615685223484937d + "'", double1 == 0.7615685223484937d);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.1425465430742778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14351994778492885d) + "'", double1 == (-0.14351994778492885d));
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(5.1771933557663626E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.177193355766363E-8d + "'", double1 == 5.177193355766363E-8d);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6.1035156E-5f, (-0.5545968900472659d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1035153E-5f + "'", float2 == 6.1035153E-5f);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        int int2 = org.apache.commons.math3.util.FastMath.min(5, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1023.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.0f + "'", float2 == 1023.0f);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.0000002f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0000005f + "'", float2 == 6.0000005f);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.9994192391908521d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5407909080932595d + "'", double1 == 0.5407909080932595d);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.76837215046544E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.768372150465441E-7d + "'", double1 == 4.768372150465441E-7d);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.2401310215141802E-16d, 1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.992760093696703E-17d + "'", double2 == 7.992760093696703E-17d);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 35, 32.01562118716424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9843788128357573d + "'", double2 == 2.9843788128357573d);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1L, 1.5111573E23f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        float float1 = org.apache.commons.math3.util.FastMath.abs(749.99994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 749.99994f + "'", float1 == 749.99994f);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        long long2 = org.apache.commons.math3.util.FastMath.max(2L, (long) 106);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106L + "'", long2 == 106L);
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 137);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1367205671564067d + "'", double1 == 2.1367205671564067d);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.061328855954495554d), (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6045861858451666E-40d) + "'", double2 == (-3.6045861858451666E-40d));
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.000000000705009d, 0.8414709624298973d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8414709624298973d + "'", double2 == 0.8414709624298973d);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8446874961776067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.611686E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        double double1 = org.apache.commons.math3.util.FastMath.rint(44.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.0d + "'", double1 == 44.0d);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        int int2 = org.apache.commons.math3.util.FastMath.min(6, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.09951163E12f + "'", float1 == 1.09951163E12f);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.09738634525693146d), 1.6942252369286008E32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.748134494412303E-34d) + "'", double2 == (-5.748134494412303E-34d));
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        double double1 = org.apache.commons.math3.util.FastMath.signum(7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.162277660168379d + "'", double1 == 3.162277660168379d);
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 52L, 5.9999995f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999995f + "'", float2 == 5.9999995f);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        float float2 = org.apache.commons.math3.util.FastMath.min(10.0f, (float) 230L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        int int1 = org.apache.commons.math3.util.FastMath.abs(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.990700744648233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.1977594109665195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.528732941264681d + "'", double1 == 1.528732941264681d);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.21991180375937053d), 22025.465794806678d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9766253859580151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.956512780729355d + "'", double1 == 55.956512780729355d);
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.444667861009766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12579431488456852d + "'", double1 == 0.12579431488456852d);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0000000000000004d + "'", double1 == 3.0000000000000004d);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 5.9604645E-8f, 9.999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.960464477539064E-8d + "'", double2 == 5.960464477539064E-8d);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0842022E-19f + "'", float1 == 1.0842022E-19f);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1.9999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.3890552180865745d + "'", double1 == 6.3890552180865745d);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-2L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.000001f + "'", float1 == 6.000001f);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.7802246589084126d, 0.1635222099724446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7802246589084126d + "'", double2 == 0.7802246589084126d);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-25.30591789243267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 749.9999f, 0.80038650342911d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 750.0003050086721d + "'", double2 == 750.0003050086721d);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(9.013560982203286d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.013560982203286d + "'", double2 == 9.013560982203286d);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        int int2 = org.apache.commons.math3.util.FastMath.max(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.0634370688955608d, (double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.085564054390163d + "'", double2 == 11.085564054390163d);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 2.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6268613048244727d + "'", double1 == 3.6268613048244727d);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.7182818284590453d, (double) 4.8828122E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7182818284590453d + "'", double2 == 1.7182818284590453d);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        float float2 = org.apache.commons.math3.util.FastMath.min(52.000004f, 52.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000004f + "'", float2 == 52.000004f);
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9734594443576854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011682137064909816d) + "'", double1 == (-0.011682137064909816d));
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 0.5938892634491227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.07621974786783883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 4.8828122E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        double double1 = org.apache.commons.math3.util.FastMath.floor(7.629394531175985E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        int int2 = org.apache.commons.math3.util.FastMath.min(86, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1024), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1024) + "'", int2 == (-1024));
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-31.776061130789305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.156007379756452E13d + "'", double1 == 3.156007379756452E13d);
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-2), 47999.996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        double double1 = org.apache.commons.math3.util.FastMath.exp(7.31322083153445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1500.0006666663703d + "'", double1 == 1500.0006666663703d);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        long long2 = org.apache.commons.math3.util.FastMath.min(1024L, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        int int1 = org.apache.commons.math3.util.FastMath.round((-63.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-63) + "'", int1 == (-63));
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.4247223454937545E21d, (double) 10.000001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4247223454937545E21d + "'", double2 == 2.4247223454937545E21d);
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.0019531248835846782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0019531261253500206d) + "'", double1 == (-0.0019531261253500206d));
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(155.74607629780772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1808787385219026E67d + "'", double1 == 2.1808787385219026E67d);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 97.00001f, 9.094947017729286E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948872d + "'", double2 == 1.5707963267948872d);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.1305288720633906E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001459633129270294d + "'", double1 == 0.001459633129270294d);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.000000033134038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.017915698460637734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01791665688303047d + "'", double1 == 0.01791665688303047d);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9950547536867305d, (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9950547536867306d + "'", double2 == 0.9950547536867306d);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1025.0d + "'", double1 == 1025.0d);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.017453291479645992d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.061290475572342844d), 100.2188872880747d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 10.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 1.090853653267673E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.327747459134791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.000000476837158d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-2L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 8.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9893581078632866d + "'", double1 == 0.9893581078632866d);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9998140668686113d, (double) 512.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998140668686113d + "'", double2 == 0.9998140668686113d);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9999999999999999d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        long long2 = org.apache.commons.math3.util.FastMath.min(4L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 2.14748365E9f, 2.9982230451921064d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9982230451921064d + "'", double2 == 2.9982230451921064d);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 6.0f, (-0.9994192391908521d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003484564854887573d + "'", double2 == 0.003484564854887573d);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.130647803622625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5310603550457816d) + "'", double1 == (-0.5310603550457816d));
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.2664005294302818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29971680358919567d + "'", double1 == 0.29971680358919567d);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        int int2 = org.apache.commons.math3.util.FastMath.max((-29), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.2065299964591305d, (double) 2.0000002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.335747329235344d + "'", double2 == 2.335747329235344d);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        double double2 = org.apache.commons.math3.util.FastMath.max(160.80803418105256d, (-0.9999999806537986d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 160.80803418105256d + "'", double2 == 160.80803418105256d);
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.30196465536956996d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.4507335189035081d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.935885722901565E9d + "'", double2 == 1.935885722901565E9d);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-29), 1.5111573E23f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 29.0f + "'", float2 == 29.0f);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(74.38989177586092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2983485416910245d + "'", double1 == 1.2983485416910245d);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.005519215703220059d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31622776601683805d) + "'", double1 == (-0.31622776601683805d));
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-14), 1.7453291188362752d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-13.999999999999998d) + "'", double2 == (-13.999999999999998d));
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-25.30591789243267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.935896209259133d) + "'", double1 == (-2.935896209259133d));
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 100L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86 + "'", int2 == 86);
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 4.8828122E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8828120149362145E-4d + "'", double1 == 4.8828120149362145E-4d);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 29.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.965667148572021E12d + "'", double1 == 1.965667148572021E12d);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '4', (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.2260986406399412d, (double) (-29));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.099338555038559d + "'", double2 == 3.099338555038559d);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0E200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 460.51701859880916d + "'", double1 == 460.51701859880916d);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-63.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.359610000063081E-28d + "'", double1 == 4.359610000063081E-28d);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-29));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7480575296890003d) + "'", double1 == (-0.7480575296890003d));
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        float float1 = org.apache.commons.math3.util.FastMath.signum(14.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        int int2 = org.apache.commons.math3.util.FastMath.min(32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 0L, (double) 1023);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.7165256995489035d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.89793739384485E10d + "'", double2 == 5.89793739384485E10d);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        long long2 = org.apache.commons.math3.util.FastMath.min(1023L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.011048993055354018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5597471089165569d + "'", double1 == 1.5597471089165569d);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        int int1 = org.apache.commons.math3.util.FastMath.round(47999.996f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48000 + "'", int1 == 48000);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 32, 32.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 9223372036854775807L, 1.2980742E33f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        int int2 = org.apache.commons.math3.util.FastMath.max(1024, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        long long1 = org.apache.commons.math3.util.FastMath.abs(750L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 750L + "'", long1 == 750L);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(69.5378615119413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.93496684993349d + "'", double1 == 4.93496684993349d);
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.04402615488638885d, (-0.013462623778017066d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04402615488638885d) + "'", double2 == (-0.04402615488638885d));
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        double double1 = org.apache.commons.math3.util.FastMath.rint(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        double double1 = org.apache.commons.math3.util.FastMath.acos(460.51701859880916d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.271684935418713d, 1.564058481760474d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0158029440740917d + "'", double2 == 2.0158029440740917d);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.3683211063593682d, (double) (-2016.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36832110635936816d + "'", double2 == 0.36832110635936816d);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(9.094947017729284E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.587367707538151E-14d + "'", double1 == 1.587367707538151E-14d);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.6268613048244727d, (double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6268613048244727d + "'", double2 == 3.6268613048244727d);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 34.999996f, 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1500624.3457795258d + "'", double2 == 1500624.3457795258d);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.00000000000001d + "'", double1 == 51.00000000000001d);
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0986122886681098d + "'", double1 == 1.0986122886681098d);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.7300933056128451d, (-0.0267863625707878d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.011020261488361868d) + "'", double2 == (-0.011020261488361868d));
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        double double2 = org.apache.commons.math3.util.FastMath.pow(57.29577951308232d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5378205025908554E10d + "'", double2 == 3.5378205025908554E10d);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        double double1 = org.apache.commons.math3.util.FastMath.acos(72.64597536373867d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.62939453139803E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629394531472045E-6d + "'", double1 == 7.629394531472045E-6d);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.9103830456733704E-11d, 1.7200786095266942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.910383045673371E-11d + "'", double2 == 2.910383045673371E-11d);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.3713210688081606E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(6000.0d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.482576781564405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4825767815644055d + "'", double1 == 2.4825767815644055d);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9232666633273902d, 48000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 4.768372E-7f, 1.5698207173483318d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5698207173483318d + "'", double2 == 1.5698207173483318d);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.099338555038559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-1), (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.817120640969395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.15411301352167d + "'", double1 == 6.15411301352167d);
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.4012984643248174E-45d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5604874144594285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2755538279996634d + "'", double1 == 2.2755538279996634d);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.130528872063391E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(512.5f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.49994f + "'", float2 == 512.49994f);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.8402864822065015d, 2.482576781564405d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6378974212549495d + "'", double2 == 0.6378974212549495d);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0000123108260286d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7241400178893854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012638627557620415d + "'", double1 == 0.012638627557620415d);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-26.33959286127792d), 7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-26.339592861277918d) + "'", double2 == (-26.339592861277918d));
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.361757477043805E67d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 156.43922347836767d + "'", double1 == 156.43922347836767d);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0000000000291038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.2983485416910245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0909305359822086d + "'", double1 == 1.0909305359822086d);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.30087022627717525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        long long1 = org.apache.commons.math3.util.FastMath.abs(6L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.5403023560237179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.516965851669841d + "'", double1 == 0.516965851669841d);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.992760093696703E-17d, 1.5597471089165569d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.992760093696703E-17d + "'", double2 == 7.992760093696703E-17d);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (byte) 0, 1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842022E-19f + "'", float2 == 1.0842022E-19f);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.022834589947065314d, 1.385850023714672d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.022834589947065314d + "'", double2 == 0.022834589947065314d);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 6.1035153E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000001862645d + "'", double1 == 1.000000001862645d);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        double double2 = org.apache.commons.math3.util.FastMath.max(108222.0d, (-1.0101769735763335d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 108222.0d + "'", double2 == 108222.0d);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.359610000063081E-28d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-6));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837747656337245d) + "'", double1 == (-0.008837747656337245d));
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        double double1 = org.apache.commons.math3.util.FastMath.rint(6000.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6000.0d + "'", double1 == 6000.0d);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02209708691207961d + "'", double1 == 0.02209708691207961d);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45231565944180985d) + "'", double1 == (-0.45231565944180985d));
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(69.5378615119413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.121079351920185d, 86);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.23752928622151E42d + "'", double2 == 3.23752928622151E42d);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        double double1 = org.apache.commons.math3.util.FastMath.log10(74.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8692317197309762d + "'", double1 == 1.8692317197309762d);
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-127.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-13.999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.118326675304813E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.118326675323529E-12d + "'", double1 == 6.118326675323529E-12d);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.25065299898745796d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.4242728127018156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1548354004191266d + "'", double1 == 3.1548354004191266d);
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.5756660649621339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5223347012340139d + "'", double1 == 0.5223347012340139d);
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        double double2 = org.apache.commons.math3.util.FastMath.pow(156.43922347836767d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.086097232552573E-5d + "'", double2 == 4.086097232552573E-5d);
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134185E15d + "'", double1 == 1.5860134523134185E15d);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0202140366142471d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        double double1 = org.apache.commons.math3.util.FastMath.tan(15.174271293851463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5908872108403207d) + "'", double1 == (-0.5908872108403207d));
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1024.0496050813779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0496050813779d + "'", double1 == 1024.0496050813779d);
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-7.224719895935548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.933186133561807d) + "'", double1 == (-1.933186133561807d));
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2097152.0d + "'", double1 == 2097152.0d);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        double double1 = org.apache.commons.math3.util.FastMath.atan(6.027800920562904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4063956532774693d + "'", double1 == 1.4063956532774693d);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-15.999999046325684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9576597548889478d) + "'", double1 == (-0.9576597548889478d));
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 1.0000001f, (-9.632848614896423E-5d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        double double2 = org.apache.commons.math3.util.FastMath.log(155.74607629780772d, 1.300664126286459E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.7356002949948d + "'", double2 == 13.7356002949948d);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.672330695785645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.958797365297499d + "'", double1 == 1.958797365297499d);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0000061553940698d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 127L, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1024L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.624618747740734d + "'", double1 == 7.624618747740734d);
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0842022E-19f, (float) 1024);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-1.2207033E-4f), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 750L, 2.19902312E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.19902312E12f + "'", float2 == 2.19902312E12f);
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        int int2 = org.apache.commons.math3.util.FastMath.max(52, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.9982230451921064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14287895626271624d + "'", double1 == 0.14287895626271624d);
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 137);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.09951163E12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.09951176E12f + "'", float1 == 1.09951176E12f);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 5, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 512.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.936085770210967d + "'", double1 == 8.936085770210967d);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.01728018604825701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017281906236058166d + "'", double1 == 0.017281906236058166d);
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.910383045673371E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9103830457157227E-11d + "'", double1 == 2.9103830457157227E-11d);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.9999995f, 2.9999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9999998f + "'", float2 == 2.9999998f);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        long long2 = org.apache.commons.math3.util.FastMath.min((-63L), (long) (-14));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(7.629365427493558E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019686241372257017d + "'", double1 == 0.019686241372257017d);
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        int int2 = org.apache.commons.math3.util.FastMath.min(750, 230);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 230 + "'", int2 == 230);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 2, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(7.313219942645561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999111110716d + "'", double1 == 0.999999111110716d);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        double double2 = org.apache.commons.math3.util.FastMath.pow(97.00000000000003d, 3.23752928622151E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.223372E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(5.729577951308233E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 7.737125E25f, 1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737124784365025E25d + "'", double2 == 7.737124784365025E25d);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8897341156536202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9432571842576234d + "'", double1 == 0.9432571842576234d);
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(5.421010862427522E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 2.9999998f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 9L, (float) 1024L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.666140437719302E21d, (-0.6508801521799592d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.21052320575111E-15d + "'", double2 == 9.21052320575111E-15d);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8344632077604134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.013462623778017066d), 3.4359738368E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013462623778017066d + "'", double2 == 0.013462623778017066d);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.359039207590521E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 163354.18244889102d + "'", double1 == 163354.18244889102d);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 2.14748365E9f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.5111573E23f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.80143985E16f + "'", float1 == 1.80143985E16f);
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.0075707739244519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0075707739244519d + "'", double1 == 0.0075707739244519d);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.0f, 9.2233715E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        long long1 = org.apache.commons.math3.util.FastMath.abs(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.24187733445678708d, (-0.8582226493088282d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24187733445678708d + "'", double2 == 0.24187733445678708d);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1.29807406E33f, 0.895475622246554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.895475622246554d + "'", double2 == 0.895475622246554d);
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.11004516131854963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.305123299389195d) + "'", double1 == (-6.305123299389195d));
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.743392130574644E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1448057014441228E-21d + "'", double1 == 2.1448057014441228E-21d);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        long long1 = org.apache.commons.math3.util.FastMath.abs(106L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 106L + "'", long1 == 106L);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-6.000001f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8416713321019201d, (-0.03467284536035253d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.842385207305781d + "'", double2 == 0.842385207305781d);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.154056433601276E39d, (double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 6.0000005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.71573230680755d + "'", double1 == 201.71573230680755d);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        float float2 = org.apache.commons.math3.util.FastMath.min(3.6379788E-12f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6379788E-12f + "'", float2 == 3.6379788E-12f);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5988104444497883d, 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0877197964243557d + "'", double2 == 2.0877197964243557d);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000004f + "'", float1 == 52.000004f);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.4255617839730704E64d, 7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.011682137064909816d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011614165842225865d) + "'", double1 == (-0.011614165842225865d));
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.0f, (float) (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 5);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(6.027800920562904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4963400238982523d + "'", double1 == 2.4963400238982523d);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182816664368272d + "'", double1 == 2.7182816664368272d);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.7397064891248464E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.710505431213761E-20d + "'", double1 == 2.710505431213761E-20d);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1024.0f), (double) 39);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1023.99994f) + "'", float2 == (-1023.99994f));
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5572364748926293d + "'", double1 == 1.5572364748926293d);
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.1190346870425513E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1190346870425513E-15d + "'", double1 == 1.1190346870425513E-15d);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.0024670109333179424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13512126156864773d) + "'", double1 == (-0.13512126156864773d));
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9734594443576854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.470081624379547d + "'", double1 == 1.470081624379547d);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.17543140958325787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1917602425161025d + "'", double1 == 1.1917602425161025d);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.090853653267673E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0908536532676732E11d + "'", double1 == 1.0908536532676732E11d);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222750278501d + "'", double1 == 2.993222750278501d);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9950547536867305d, (-63));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0788405256891817E-19d + "'", double2 == 1.0788405256891817E-19d);
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.5111573E23f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0842022E-19f, 0.09545486558053895d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842023E-19f + "'", float2 == 1.0842023E-19f);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.9999998f, 39);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.64926731E12f + "'", float2 == 1.64926731E12f);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.19902312E12f, 52.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.19902312E12f + "'", float2 == 2.19902312E12f);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.005846743218732369d), (-1.0426665814898082d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 2, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1691265E29f + "'", float2 == 3.1691265E29f);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9735692101318192d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.841534261491385E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.841534261491385E64d + "'", double1 == 2.841534261491385E64d);
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49174338951939384d + "'", double1 == 0.49174338951939384d);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.24187733445678708d, 1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2418773344567871d + "'", double2 == 0.2418773344567871d);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.536743E-7f, (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.3495150228208087E50d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.4012984643248174E-45d, (-13.999999999999998d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4012984643248174E-45d) + "'", double2 == (-1.4012984643248174E-45d));
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 750.0f, 2.1306478036226255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011973124835819249d + "'", double2 == 0.011973124835819249d);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(42971.83463481174d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.447327196772732E34d + "'", double2 == 5.447327196772732E34d);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.5065230921350898E254d), 0.9999500037496876d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 8L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 458.3662361046586d + "'", double1 == 458.3662361046586d);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5777218104420236E-30d + "'", double1 == 1.5777218104420236E-30d);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.3440585709080678E43d), 0.34559293815501096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709080678E43d + "'", double2 == 1.3440585709080678E43d);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.3776033183918694E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.37760331839187E14d + "'", double1 == 2.37760331839187E14d);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(44.29429222643544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.294292226435445d + "'", double1 == 44.294292226435445d);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.005846743218732369d), 1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.373400766945016d + "'", double1 == 1.373400766945016d);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 512.5f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(97.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.000015f + "'", float1 == 97.000015f);
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-1023), 0.02209708691207961d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1022.99994f) + "'", float2 == (-1022.99994f));
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.3683211063593682d, (-0.4731873725534812d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3683211063593682d) + "'", double2 == (-0.3683211063593682d));
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.8828120149362145E-4d, 7.313219942645561d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2609551558045143d) + "'", double2 == (-0.2609551558045143d));
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 86);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 86L + "'", long1 == 86L);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        float float2 = org.apache.commons.math3.util.FastMath.max(Float.POSITIVE_INFINITY, 512.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1.9999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9640275716535813d + "'", double1 == 0.9640275716535813d);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-2.2124675420131484E28d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        double double1 = org.apache.commons.math3.util.FastMath.rint(44.29429222643544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.0d + "'", double1 == 44.0d);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.1635222099724446d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1635222099724446d + "'", double2 == 0.1635222099724446d);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6000.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        double double1 = org.apache.commons.math3.util.FastMath.cos(8.18792839447947E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999966478914d + "'", double1 == 0.9999999966478914d);
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        int int1 = org.apache.commons.math3.util.FastMath.round(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        double double1 = org.apache.commons.math3.util.FastMath.tan(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.007570918573144928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007599723455542785d) + "'", double1 == (-0.007599723455542785d));
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 48000, (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8211864E-34f + "'", float2 == 2.8211864E-34f);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.9916154164156743d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9665319669045798d + "'", double2 == 3.9665319669045798d);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999092042625951d + "'", double1 == 0.9999092042625951d);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.2776724662502028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3200537642354306d + "'", double1 == 1.3200537642354306d);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.3890552180865745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.54155209850785d + "'", double1 == 2.54155209850785d);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9395033482133572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5587103146581684d + "'", double1 == 1.5587103146581684d);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.1546709519529927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5492548965142435d + "'", double1 == 0.5492548965142435d);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        double double2 = org.apache.commons.math3.util.FastMath.max(9.999960327225621E103d, 0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999960327225621E103d + "'", double2 == 9.999960327225621E103d);
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0955641261303415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0955641261303417d + "'", double1 == 1.0955641261303417d);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-1), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4226387499614237d + "'", double1 == 1.4226387499614237d);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        double double1 = org.apache.commons.math3.util.FastMath.cos(749.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2665848258979956d + "'", double1 == 0.2665848258979956d);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.611686E18f, 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5111573E23f + "'", float2 == 1.5111573E23f);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.25594028828308524d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        double double1 = org.apache.commons.math3.util.FastMath.atan(108222.44191876269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707870865672484d + "'", double1 == 1.5707870865672484d);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.11026848715132712d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10440635237314978d) + "'", double1 == (-0.10440635237314978d));
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 'a', 0.15629232893697098d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.569185067066198d + "'", double2 == 1.569185067066198d);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9088714301767988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0955641261303415d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(8.0d, 0.022832605602534084d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.999999999999999d + "'", double2 == 7.999999999999999d);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        double double1 = org.apache.commons.math3.util.FastMath.signum(9.094947017729284E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46340.950001051984d + "'", double1 == 46340.950001051984d);
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.156007379756452E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.08291395022939d + "'", double1 == 31.08291395022939d);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 512.49994f, (-9.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 512.5789572728952d + "'", double2 == 512.5789572728952d);
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 0L, 127.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-4.999875008328899E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 15);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.4768639379495386d, 1.0000123108260286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4449632606147725d + "'", double2 == 0.4449632606147725d);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9171523356580291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.548958003770906d + "'", double1 == 52.548958003770906d);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.9999995f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.999999f + "'", float2 == 5.999999f);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(52.548958003770906d, 0.5628219188284785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5600863066415889d + "'", double2 == 1.5600863066415889d);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 86, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        double double2 = org.apache.commons.math3.util.FastMath.max(160.80803418105256d, 5.416510530506886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 160.80803418105256d + "'", double2 == 160.80803418105256d);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-127.0f), 3.755020761982979E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707960311239704d) + "'", double2 == (-1.5707960311239704d));
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.4242728127018156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35366137659382735d + "'", double1 == 0.35366137659382735d);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.986979343053352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.715289172677667d + "'", double1 == 3.715289172677667d);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.359610000063081E-28d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-2.0000000000000004d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0000000000000004d) + "'", double2 == (-2.0000000000000004d));
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 63, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        double double2 = org.apache.commons.math3.util.FastMath.max(6.991989996645917E-56d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.991989996645917E-56d + "'", double2 == 6.991989996645917E-56d);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.09951176E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(100.2188872880747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.300478955492525d + "'", double1 == 5.300478955492525d);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-7.224719895935548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 686.4773600637391d + "'", double1 == 686.4773600637391d);
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.6056686600052703d), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0E100d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E100d + "'", double2 == 1.0E100d);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (-63));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 39);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.602681965908778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.602681965908778d + "'", double1 == 0.602681965908778d);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.155849015173716d, 1.6942252369286008E32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1558490151737164d + "'", double2 == 3.1558490151737164d);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.9999999403953552d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9950547536867305d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 3.1691265E29f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.531169184716246E27d + "'", double1 == 5.531169184716246E27d);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        float float2 = org.apache.commons.math3.util.FastMath.min(32.000004f, 749.99994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000004f + "'", float2 == 32.000004f);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        double double1 = org.apache.commons.math3.util.FastMath.signum(22025.4658761156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.10960414795451248d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.7730812391918281d, 1.0000123108260286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.658104239963583d + "'", double2 == 0.658104239963583d);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.466528223471357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6986437208666088d + "'", double1 == 1.6986437208666088d);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 100L, (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8774718E-37f + "'", float2 == 5.8774718E-37f);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.8897341156536202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.636436139626906d + "'", double1 == 0.636436139626906d);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.9351525542706054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.385626020143185d + "'", double1 == 9.385626020143185d);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.0831675322560934E97d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7798091421779662d) + "'", double1 == (-0.7798091421779662d));
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-9.632848614896423E-5d), 1025);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999999d) + "'", double1 == (-0.9999999999999999d));
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9124034991009714d + "'", double1 == 0.9124034991009714d);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(5.729577951308233E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.793076005481666d + "'", double1 == 50.793076005481666d);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-1L), 1.6718308188647008E103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6718308188647008E103d + "'", double2 == 1.6718308188647008E103d);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9998428711716857d, 3.162277660168379d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998428711716857d + "'", double2 == 0.9998428711716857d);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-1.5707960311239704d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        int int1 = org.apache.commons.math3.util.FastMath.abs(137);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 137 + "'", int1 == 137);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        int int2 = org.apache.commons.math3.util.FastMath.max(1025, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1025 + "'", int2 == 1025);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.75d + "'", double1 == 0.75d);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(8.18792839447947E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6.620073206530356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3502392001023199d + "'", double1 == 0.3502392001023199d);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 8L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        double double1 = org.apache.commons.math3.util.FastMath.sin(7.31322083153445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8573172772549914d + "'", double1 == 0.8573172772549914d);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-127.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-127L) + "'", long1 == (-127L));
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.5628219188284785d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 0L, (double) (-63.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.2980742E33f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.54742505E26f + "'", float1 == 1.54742505E26f);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(100.00001f, 0.30087022627717525d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 5L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        float float1 = org.apache.commons.math3.util.FastMath.abs(48000.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 48000.0f + "'", float1 == 48000.0f);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.8897341156536202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.9780097157571d + "'", double1 == 50.9780097157571d);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 2.9999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.085532134423065d + "'", double1 == 19.085532134423065d);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-1022.99994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(74.35674296486279d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.005969084226160847d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.1425465430742778d), (-0.07977109790154036d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.13533528323661262d, 0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0090262908655008d + "'", double2 == 1.0090262908655008d);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-8));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.5997382704646929d, 6000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0908536532676732E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.415396580804064d + "'", double1 == 25.415396580804064d);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-1.463965950463316E102d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9938148781603499d + "'", double1 == 0.9938148781603499d);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.07140440247247d + "'", double1 == 36.07140440247247d);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-5.9029581035870565E20d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.2796991406480593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.854277055161758d + "'", double1 == 1.854277055161758d);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.62939453125E-6d + "'", double1 == 7.62939453125E-6d);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.1003275537854505E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141491290551085E-6d + "'", double1 == 3.141491290551085E-6d);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.080594601624405E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012766224843186505d + "'", double1 == 0.0012766224843186505d);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, (double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(100.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.000015f + "'", float1 == 100.000015f);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707352916386088d + "'", double1 == 1.5707352916386088d);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9171523356580291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08648169657722073d) + "'", double1 == (-0.08648169657722073d));
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 6000);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.234021194410018d + "'", double1 == 2.234021194410018d);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.5574075204780884d), 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-49.83704065529883d) + "'", double2 == (-49.83704065529883d));
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.37438953472E11d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267876206d) + "'", double1 == (-1.5707963267876206d));
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1.29807406E33f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.265566627983154E31d + "'", double1 == 2.265566627983154E31d);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 7.737125E25f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 85 + "'", int1 == 85);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(108.43494882292201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6953302980477645d + "'", double1 == 4.6953302980477645d);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 9L, 8.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.844153986113171d + "'", double2 == 0.844153986113171d);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 63, 97.000015f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.000015f + "'", float2 == 97.000015f);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.37438953472E11d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.13533528323661262d, 0.19611987703015263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13533528323661265d + "'", double2 == 0.13533528323661265d);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0000001f, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.1920928955078157E-7d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2207031250000033E-4d + "'", double2 == 1.2207031250000033E-4d);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        double double1 = org.apache.commons.math3.util.FastMath.signum(97.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3666.9298888372687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.0000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.38905609893065d + "'", double1 == 7.38905609893065d);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.265566627983154E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.89110995790382d + "'", double1 == 72.89110995790382d);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.6379788E-12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-38) + "'", int1 == (-38));
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0101769735763335d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3826710608239539d + "'", double2 == 1.3826710608239539d);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-2.349101754933678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3491017549336775d) + "'", double1 == (-2.3491017549336775d));
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.13533528323661265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.144920592687449d + "'", double1 == 1.144920592687449d);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.013462623778017066d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1025L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }
}

