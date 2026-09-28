package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.75d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7227342478134157d + "'", double1 == 0.7227342478134157d);
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-58670.88521551002d), 1.1753554136824456d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58670.885227282975d + "'", double2 == 58670.885227282975d);
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.08703103478010532d, 0.13158548711983195d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7252312445040109d + "'", double2 == 0.7252312445040109d);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.007599723455542785d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4354320794691795d) + "'", double1 == (-0.4354320794691795d));
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.4342944819032518d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.0000001f, 11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000013113029667d + "'", double2 == 1.0000013113029667d);
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 29);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.0d + "'", double1 == 29.0d);
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        float float1 = org.apache.commons.math3.util.FastMath.signum(9.2233715E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.66633186E17f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.19177788476679059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9816669139461678d + "'", double1 == 0.9816669139461678d);
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3.1691263E29f, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        double double2 = org.apache.commons.math3.util.FastMath.log(72.64597536373867d, (-0.23226068750587248d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.6423065883854172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.801456667930985d + "'", double1 == 36.801456667930985d);
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.1474839E9f, 0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.2401310215141802E-16d, 55.42562584220408d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2374686846925546E-18d + "'", double2 == 2.2374686846925546E-18d);
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 21L, 0.01791665688303047d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.999998f + "'", float2 == 20.999998f);
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9329331452021941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.45313178795132d + "'", double1 == 53.45313178795132d);
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(47999.996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 48000.0f + "'", float1 == 48000.0f);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.2785394510828827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3236692321000447d + "'", double1 == 3.3236692321000447d);
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        double double1 = org.apache.commons.math3.util.FastMath.floor(67492.433469899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67492.0d + "'", double1 == 67492.0d);
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(21.799911408087066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.0d + "'", double1 == 22.0d);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(72.64597536373867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4162.307786953581d + "'", double1 == 4162.307786953581d);
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.007570484655252586d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-2.290822861412639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10118316786443415d + "'", double1 == 0.10118316786443415d);
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        int int1 = org.apache.commons.math3.util.FastMath.round((-2.9999998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        long long2 = org.apache.commons.math3.util.FastMath.min(20L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.1858035486915015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7819835177797978d + "'", double1 == 0.7819835177797978d);
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        int int2 = org.apache.commons.math3.util.FastMath.min(137, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9996344099938438d, 4.882813082076609E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5703078669494845d + "'", double2 == 1.5703078669494845d);
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.2980741E33f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        int int2 = org.apache.commons.math3.util.FastMath.min(1023, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1024.000488281114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0d + "'", double1 == 1024.0d);
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.0179147401920297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018076171710472027d + "'", double1 == 0.018076171710472027d);
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.25594028828308524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0329318964938872d + "'", double1 == 1.0329318964938872d);
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        int int2 = org.apache.commons.math3.util.FastMath.max(1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.1368887786267312d, 1.1368887786267312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1368887786267312d + "'", double2 == 1.1368887786267312d);
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.4043418471644635d, (double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(8.918828546453101d, 1.3234889800848443E-23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.8772762058832566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9942138060909441d + "'", double1 == 0.9942138060909441d);
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 3071.9998f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3072L + "'", long1 == 3072L);
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.07621974786783883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-3), 6000);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.0794415416798357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.509644039241865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.831193E31f, 86.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.831193E31f + "'", float2 == 5.831193E31f);
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        float float2 = org.apache.commons.math3.util.FastMath.min(32.000004f, 1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207033E-4f + "'", float2 == 1.2207033E-4f);
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.19902312E12f, (-2016));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-29L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 5.684342E-14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(7.392372908686772E-9d, 5.8460065493236117E48d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.8460065493236117E48d + "'", double2 == 5.8460065493236117E48d);
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.18885342001155384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18774846815194668d + "'", double1 == 0.18774846815194668d);
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        int int1 = org.apache.commons.math3.util.FastMath.round((-34.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34) + "'", int1 == (-34));
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.2815044999386025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28150449993860255d + "'", double1 == 0.28150449993860255d);
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0318785345512005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018009677908572518d + "'", double1 == 0.018009677908572518d);
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        int int2 = org.apache.commons.math3.util.FastMath.max(87, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.29971680358919567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9554201410772422d + "'", double1 == 0.9554201410772422d);
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-3.3334775868839923d), (-97.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.3334775868839928d) + "'", double2 == (-3.3334775868839928d));
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0940947389186513d, 3.072316825685847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0940947389186515d + "'", double2 == 1.0940947389186515d);
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.9999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.6363319661787273E69d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 159.37082854749778d + "'", double1 == 159.37082854749778d);
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(5.531169184716246E27d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 36L, 0.037494614331192756d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.999996f + "'", float2 == 35.999996f);
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        double double1 = org.apache.commons.math3.util.FastMath.floor(7677.584358657442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7677.0d + "'", double1 == 7677.0d);
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-975527.4450396402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17026.165859509747d) + "'", double1 == (-17026.165859509747d));
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 750L, (-1022.99994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-750.0f) + "'", float2 == (-750.0f));
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, (-2.290822861412639d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.290822861412639d) + "'", double2 == (-2.290822861412639d));
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.36693586126414035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.351682065360422d + "'", double1 == 0.351682065360422d);
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0E200d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-200d + "'", double2 == 1.0E-200d);
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.922737656982237d, 1.892546881191539d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.922737656982237d + "'", double2 == 0.922737656982237d);
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.5091784786580553d, (-1024));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 512.5f, (double) 35.000008f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.907264929829861E94d + "'", double2 == 6.907264929829861E94d);
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.973552586323384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7719980488790864d + "'", double1 == 0.7719980488790864d);
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        double double1 = org.apache.commons.math3.util.FastMath.asin(6.991989996645917E-56d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.991989996645917E-56d + "'", double1 == 6.991989996645917E-56d);
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1612231530729575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06491568643588523d + "'", double1 == 0.06491568643588523d);
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        double double1 = org.apache.commons.math3.util.FastMath.cos(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37076031047484287d + "'", double1 == 0.37076031047484287d);
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 9);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.814697265625009E-6d, 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03568236643846962d) + "'", double2 == (-0.03568236643846962d));
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.0000005f, 7.392373E-9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.392373E-9f + "'", float2 == 7.392373E-9f);
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(89.94410169625876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.77028216800638E38d + "'", double1 == 5.77028216800638E38d);
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1499.9999f, (-48.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1499.9999f) + "'", float2 == (-1499.9999f));
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        double double1 = org.apache.commons.math3.util.FastMath.exp(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.154229163653721E-5d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1 == (-15));
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        int int2 = org.apache.commons.math3.util.FastMath.min((-127), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.232686862584267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8032057313113643d + "'", double1 == 0.8032057313113643d);
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        double double2 = org.apache.commons.math3.util.FastMath.min(1500624.3457795258d, 7.571098934738399d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.571098934738399d + "'", double2 == 7.571098934738399d);
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.5565355E-17f, 0.8897341156536202d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.556536E-17f + "'", float2 == 5.556536E-17f);
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1224236947215336d + "'", double1 == 1.1224236947215336d);
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.2634384421834473d, 31.08291395022939d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2634384421834473d + "'", double2 == 0.2634384421834473d);
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001953125d + "'", double1 == 0.001953125d);
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.298534883328E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.042580882468783d + "'", double1 == 3.042580882468783d);
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.29243176689515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6606133228442809d) + "'", double1 == (-0.6606133228442809d));
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1500);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0001f + "'", float1 == 1500.0001f);
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.999999f, (-34));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.492459E-10f + "'", float2 == 3.492459E-10f);
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.570796311160112d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.4874365673914125E14d, 0.24187733445678708d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794895d + "'", double2 == 1.570796326794895d);
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.779595846079306d + "'", double1 == 0.779595846079306d);
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4350.668043506033d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9999998555018376d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5645971953656318d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5645971953656318d + "'", double2 == 0.5645971953656318d);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        long long2 = org.apache.commons.math3.util.FastMath.max(2147483647L, 128L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.440892098500626E-16d, 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-44.36141949623185d) + "'", double1 == (-44.36141949623185d));
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-90.0d) + "'", double1 == (-90.0d));
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-1499.9999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-15));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-14.999999f) + "'", float1 == (-14.999999f));
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.1759754114836391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        int int2 = org.apache.commons.math3.util.FastMath.min(230, 3072);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 230 + "'", int2 == 230);
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4107813643634838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        float float1 = org.apache.commons.math3.util.FastMath.abs(100.000015f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.000015f + "'", float1 == 100.000015f);
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.89793739384485E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.89793739384485E10d + "'", double1 == 5.89793739384485E10d);
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        int int2 = org.apache.commons.math3.util.FastMath.min(15, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-13L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.999999999999998d) + "'", double1 == (-12.999999999999998d));
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.3472175051613533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.273737E-13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-42) + "'", int1 == (-42));
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0090262908655008d, 1.5430691590224186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5340428681569178d) + "'", double2 == (-0.5340428681569178d));
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-8.726209956738549E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.726209956738549E-7d + "'", double1 == 8.726209956738549E-7d);
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(8.522116504168896E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.52208019114035E-6d + "'", double1 == 8.52208019114035E-6d);
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.9127058362020531d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 2016.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3072.0f, 48000);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        int int2 = org.apache.commons.math3.util.FastMath.min(12, 230);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.132761631686654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8136451593772986d + "'", double1 == 1.8136451593772986d);
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(8.588325623556069E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.57108454052487d + "'", double1 == 20.57108454052487d);
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 512.5f, 5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 512.5d + "'", double2 == 512.5d);
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.999999999999999d, 2.189528855605421E-47d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.488074682093421E62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20152396769507416d + "'", double1 == 0.20152396769507416d);
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.02567142327678562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02567142327678562d + "'", double1 == 0.02567142327678562d);
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8414709624298973d, 86);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.575736556591671E-7d + "'", double2 == 3.575736556591671E-7d);
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 48000);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        float float2 = org.apache.commons.math3.util.FastMath.max(6.0000005f, 2.7079938E27f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7079938E27f + "'", float2 == 2.7079938E27f);
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 9, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(55.42562584220408d, (-0.21991180375937053d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-55.42562584220408d) + "'", double2 == (-55.42562584220408d));
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(375.0f, (float) (-49L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-375.0f) + "'", float2 == (-375.0f));
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.09967381678567376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.710889029779327d + "'", double1 == 5.710889029779327d);
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.302585092994046d, 1.1597153257338444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.302585092994046d + "'", double2 == 2.302585092994046d);
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-2.2124675420131484E28d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.050338712741454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.699742556943686d + "'", double1 == 28.699742556943686d);
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.0000000006208816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6964543897941453E-10d + "'", double1 == 2.6964543897941453E-10d);
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1356.935080185115d, 4.641588833612778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1356.9350801851149d + "'", double2 == 1356.9350801851149d);
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-2.349101754933678d), 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.1666639438181765E19d) + "'", double2 == (-2.1666639438181765E19d));
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.0000000000000004d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2676506002282575E30d + "'", double2 == 1.2676506002282575E30d);
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 31.999998f, 0.01728018604825701d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0617182222484527d + "'", double2 == 1.0617182222484527d);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4438.5341089142175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4439.0d + "'", double1 == 4439.0d);
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.7224284372420832d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182484254679353d + "'", double1 == 1.7182484254679353d);
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 46L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 46.0f + "'", float1 == 46.0f);
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.139932559690632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8148137583349884d + "'", double1 == 1.8148137583349884d);
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 10, 21);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E21d + "'", double2 == 1.0E21d);
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-1.2207033E-4f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207033E-4f + "'", float1 == 1.2207033E-4f);
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        double double1 = org.apache.commons.math3.util.FastMath.cos(8.376517822945031E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        double double1 = org.apache.commons.math3.util.FastMath.log10(230.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.361727836017593d + "'", double1 == 2.361727836017593d);
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 1025.0001f, 3.9823973283939967E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1025.0001220703898d + "'", double2 == 1025.0001220703898d);
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7853983422113506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6657738606223214d + "'", double1 == 0.6657738606223214d);
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-1.6738779353175968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10289915108550522d) + "'", double1 == (-0.10289915108550522d));
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.3169578280992984d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        float float1 = org.apache.commons.math3.util.FastMath.signum(512.5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 29.0f, (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2667715847722035E-218d + "'", double2 == 1.2667715847722035E-218d);
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.999999111110716d, 0.7249531797676281d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999999111110716d + "'", double2 == 0.999999111110716d);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.0000608595834288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7854285922632093d + "'", double1 == 0.7854285922632093d);
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.1003275537854505E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.03417412840354696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18486245806963336d + "'", double1 == 0.18486245806963336d);
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.2658595418453178E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 6000);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.71975511965978d + "'", double1 == 104.71975511965978d);
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.09951176E12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 131072.0f + "'", float1 == 131072.0f);
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.4226387499614237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.51119614455678d + "'", double1 == 81.51119614455678d);
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', 230);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.8338268425894415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07892412815811237d) + "'", double1 == (-0.07892412815811237d));
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1024.000488281114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16006310268393353d) + "'", double1 == (-0.16006310268393353d));
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1096.6331584284585d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 16.129019760422665d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 141);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 141.0d + "'", double1 == 141.0d);
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(70.01428280002321d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 12, (long) (-63));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.015341507605323268d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(237.68018390304016d, 4.641588833612778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.55127009268916d + "'", double2 == 1.55127009268916d);
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-4.8103634E12f), 0.017452419920761693d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.81036337152E12d) + "'", double2 == (-4.81036337152E12d));
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        int int2 = org.apache.commons.math3.util.FastMath.max((-8), (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 21);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3665191429188092d + "'", double1 == 0.3665191429188092d);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-35), (-18));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.335144E-4f) + "'", float2 == (-1.335144E-4f));
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.9998140668686113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.285126329382095d) + "'", double1 == (-57.285126329382095d));
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.48941851000927195d, 5.284913104854943E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.284913104854943E8d + "'", double2 == 5.284913104854943E8d);
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        float float2 = org.apache.commons.math3.util.FastMath.min(374.99997f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.7513003742396658d, 1.0000000000000002E100d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.751300374239666d + "'", double2 == 1.751300374239666d);
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.817120640969395d, 0.027041164336506638d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027041164336506638d + "'", double2 == 0.027041164336506638d);
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.011614165842225865d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011614426947562432d) + "'", double1 == (-0.011614426947562432d));
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-42), (long) (-15));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42L) + "'", long2 == (-42L));
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 32L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.684342E-14f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9957901442164847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9957901442164848d + "'", double1 == 0.9957901442164848d);
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.007334883977608064d, (double) (-67));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007334883977608064d + "'", double2 == 0.007334883977608064d);
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.2211972947867284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(127.0f, 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 508.0f + "'", float2 == 508.0f);
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.75000006f, (float) 11014L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11014.0f + "'", float2 == 11014.0f);
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.778151250383644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.004389269421803d + "'", double1 == 2.004389269421803d);
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.5707963267876206d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.817120640969395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.17543140958325787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17726509371386773d + "'", double1 == 0.17726509371386773d);
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-2.9103834E-11f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.469447E-18f + "'", float1 == 3.469447E-18f);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.32841555916265663d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.015625f, (-127.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.486339547584802E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.395560437890808d + "'", double1 == 10.395560437890808d);
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 74L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.0000000000291038d), 108.36909013398466d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-15.0d), 4.02816255926152E-309d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-14.999999999999998d) + "'", double2 == (-14.999999999999998d));
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.849653111851499E7d, 8.448719238886445E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.41224612614114514d) + "'", double2 == (-0.41224612614114514d));
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        long long1 = org.apache.commons.math3.util.FastMath.round((-4.185891831851989d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-4L) + "'", long1 == (-4L));
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-47L), (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47.0f + "'", float2 == 47.0f);
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9483582177369652d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.841534261491385E64d, 0.5251711488118009d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.841534261491384E64d + "'", double2 == 2.841534261491384E64d);
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 85, (-14L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 85L + "'", long2 == 85L);
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6931471805599453d, 23.472957530972486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8352820081427102E-4d + "'", double2 == 1.8352820081427102E-4d);
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.17889304790669835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003122272694899836d + "'", double1 == 0.003122272694899836d);
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9092973276085183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6143003604059988d + "'", double1 == 0.6143003604059988d);
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-13.0591403123201d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1305288720633893E-6d + "'", double1 == 2.1305288720633893E-6d);
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.061290475572342844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-7.684013597604755E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999231893784963d + "'", double1 == 0.999231893784963d);
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3072.0002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3072.0002f + "'", float1 == 3072.0002f);
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 192.00002f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.941742215644044E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.911645311413624E41d + "'", double1 == 8.911645311413624E41d);
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        int int2 = org.apache.commons.math3.util.FastMath.max(63, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.665378035886179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        long long1 = org.apache.commons.math3.util.FastMath.round(71.74447588040013d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72L + "'", long1 == 72L);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-35));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(9.53674430093088E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357508E-22d + "'", double1 == 2.1175823681357508E-22d);
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.3862856729793054E49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 113.84644473005815d + "'", double1 == 113.84644473005815d);
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.8619263557749237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        int int2 = org.apache.commons.math3.util.FastMath.max(21, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.6308050742098271d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.14246844765979d) + "'", double1 == (-36.14246844765979d));
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.31322083153445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        int int2 = org.apache.commons.math3.util.FastMath.min(3072, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.3712141381683466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.992842419769159E162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9913289130029649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.694813266259794d + "'", double1 == 1.694813266259794d);
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(86.74231627807738d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 86.74231627807738d + "'", double2 == 86.74231627807738d);
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 512.49994f, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 512.4999389648438d + "'", double2 == 512.4999389648438d);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        float float2 = org.apache.commons.math3.util.FastMath.max((-2045.9999f), (float) (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-14.0f) + "'", float2 == (-14.0f));
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0844638552900231E46d, (-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0844638552900231E46d + "'", double2 == 1.0844638552900231E46d);
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 6.1035153E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8623150089993341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.16700897784261d + "'", double1 == 1.16700897784261d);
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        int int2 = org.apache.commons.math3.util.FastMath.max(85, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1024.0001220703125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1025.0d + "'", double1 == 1025.0d);
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2340211944100186d + "'", double1 == 2.2340211944100186d);
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080487E43d + "'", double1 == 1.3440585709080487E43d);
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.81474976710656E14d, 39);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5474250491067253E26d + "'", double2 == 1.5474250491067253E26d);
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-2016.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2016L) + "'", long1 == (-2016L));
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.8414709848078964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6865874069985795d) + "'", double1 == (-0.6865874069985795d));
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258789062500003E-5d + "'", double1 == 1.5258789062500003E-5d);
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 37L, (float) 192L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.8284271247461903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8284271247461907d + "'", double1 == 2.8284271247461907d);
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        double double1 = org.apache.commons.math3.util.FastMath.asin(572.9577951308232d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-9.632848599998937E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9403184054350179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5607966601082315d + "'", double1 == 2.5607966601082315d);
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 37L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6821738184917205d + "'", double1 == 1.6821738184917205d);
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        double double2 = org.apache.commons.math3.util.FastMath.log(57.29577951307475d, (double) (-8.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.5035996E15f, 46340.950001051984d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.50359936E15f + "'", float2 == 4.50359936E15f);
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.54661364251996d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.0015093903479832123d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        float float2 = org.apache.commons.math3.util.FastMath.max(47999.996f, (float) (-38));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47999.996f + "'", float2 == 47999.996f);
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 1.9999999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 9223372036854775807L, 1.0000038147045416d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233715E18f + "'", float2 == 9.2233715E18f);
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.9232666633273902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.053236471998201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9607006791231103d + "'", double1 == 3.9607006791231103d);
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5670585390721963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.792530399568667d + "'", double1 == 4.792530399568667d);
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-10));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999958776927d) + "'", double1 == (-0.9999999958776927d));
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-29L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7480575296890003d) + "'", double1 == (-0.7480575296890003d));
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.882813E-4f, 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.25000003f + "'", float2 == 0.25000003f);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8441539875937955d, 2.3841860752327426E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796044359925d + "'", double2 == 1.570796044359925d);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(508.0f, 2.0000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 508.0f + "'", float2 == 508.0f);
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.7427521618439966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2887572196644652d + "'", double1 == 1.2887572196644652d);
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 2.910383E-11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.075979125719905E-4d + "'", double1 == 3.075979125719905E-4d);
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.361727836017593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.361727836017593d + "'", double1 == 2.361727836017593d);
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-2.0f), 0.006931009667375755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.000012009687694d + "'", double2 == 2.000012009687694d);
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.13533528323661262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.754140548665503d + "'", double1 == 7.754140548665503d);
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) -1, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.4E-45f, (float) 128);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-0.0f), (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.275344667466088E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2756035467681588E-4d + "'", double1 == 2.2756035467681588E-4d);
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-49L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536732862475499E20d + "'", double1 == 9.536732862475499E20d);
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.8889466E22f, (-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8889466E22f + "'", float2 == 1.8889466E22f);
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.656682604204755d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9963140402878587d) + "'", double1 == (-0.9963140402878587d));
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 0, 28.999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(7.0368744E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8388608.0f + "'", float1 == 8388608.0f);
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 4.2949673E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.5367431640625E-7d + "'", double1 == 9.5367431640625E-7d);
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.5063656411097466d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.007599577149562085d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007599723455542785d) + "'", double1 == (-0.007599723455542785d));
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(9.999999046325684d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        int int2 = org.apache.commons.math3.util.FastMath.min(11, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9442157056960517d, 3.7781512503836434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9442157056960518d + "'", double2 == 0.9442157056960518d);
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.7275232359393335d, 1.6653746816831394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.603379927602576d) + "'", double2 == (-1.603379927602576d));
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.2887572196644652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0882375410779608d + "'", double1 == 1.0882375410779608d);
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.3472175051613533d, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07732857262142041d + "'", double2 == 0.07732857262142041d);
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.3956142355310157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.2547422950466232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0785778878993908d + "'", double1 == 1.0785778878993908d);
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-29.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(35.000008f, 37.999996185302734d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.00001f + "'", float2 == 35.00001f);
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.0024883905848449408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8772762058832566d, 2.704872438963137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7017639929214721d + "'", double2 == 0.7017639929214721d);
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(8388608.0f, 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0633824E37f + "'", float2 == 1.0633824E37f);
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.736275386267657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 271.3685902448305d + "'", double1 == 271.3685902448305d);
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        int int2 = org.apache.commons.math3.util.FastMath.min(13, (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(29.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.0d + "'", double1 == 29.0d);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 661L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 661.0d + "'", double1 == 661.0d);
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.5623517462205421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5122768330946906d + "'", double1 == 0.5122768330946906d);
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.725756569820719d, 11.575836902790211d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.420521517896809E7d + "'", double2 == 6.420521517896809E7d);
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.3776033183918697E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.10228427314669d + "'", double1 == 33.10228427314669d);
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3282.6426454739853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3282.6426454739853d + "'", double1 == 3282.6426454739853d);
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        long long2 = org.apache.commons.math3.util.FastMath.min(63959947L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0304351312815117d, 85);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.786622405592862d + "'", double2 == 12.786622405592862d);
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.0050790161833526295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.864555516157939E-5d) + "'", double1 == (-8.864555516157939E-5d));
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-126.99999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 126.99999f + "'", float1 == 126.99999f);
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(35.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(7.31321994264556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 749.9999999999994d + "'", double1 == 749.9999999999994d);
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        double double2 = org.apache.commons.math3.util.FastMath.max(71.36873997425154d, 0.19198621771937624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 71.36873997425154d + "'", double2 == 71.36873997425154d);
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.18486245806963336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.733151276556472d) + "'", double1 == (-0.733151276556472d));
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-47L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.123573122745224d) + "'", double1 == (-0.123573122745224d));
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 32.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-34.657358789578716d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5419504291964514d) + "'", double1 == (-1.5419504291964514d));
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.471710130960498E228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.471710130960498E228d + "'", double1 == 3.471710130960498E228d);
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.001459633129270294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.52957015616005d) + "'", double1 == (-6.52957015616005d));
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615560214388488d + "'", double1 == 0.7615560214388488d);
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.28366218546322625d, 0.2815044999386025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.399636108162734d + "'", double2 == 0.399636108162734d);
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.6263033E-16f, 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0f + "'", float2 == 1500.0f);
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.556245054886526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44227590364287706d + "'", double1 == 0.44227590364287706d);
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6973483401028054d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        int int1 = org.apache.commons.math3.util.FastMath.abs(46);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.55127009268916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4390740100324318d + "'", double1 == 0.4390740100324318d);
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(8.003014266594967d, (-63.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.003014266594967d) + "'", double2 == (-8.003014266594967d));
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.3753475883946132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 52L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.0980154606041823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.2233715E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.2233715E18f + "'", float1 == 9.2233715E18f);
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        int int2 = org.apache.commons.math3.util.FastMath.max(44, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(131072.0f, 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.5251711488118009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1411011610973407d + "'", double1 == 1.1411011610973407d);
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9830277404112437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9830277404112437d + "'", double1 == 0.9830277404112437d);
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-14.999999f), 4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.999999f + "'", float2 == 14.999999f);
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 1023);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5698188099996992d + "'", double1 == 1.5698188099996992d);
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.004962015874444895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28430256748260907d + "'", double1 == 0.28430256748260907d);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 106.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 106.0d + "'", double1 == 106.0d);
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.002151468416961833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0021514667571732597d + "'", double1 == 0.0021514667571732597d);
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-63L), (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.04001048220963152d, 0.9182846632869422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04001048220963152d + "'", double2 == 0.04001048220963152d);
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 661);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.006851200750452483d, 0.02668142320876577d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8754980340813943d + "'", double2 == 0.8754980340813943d);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        double double2 = org.apache.commons.math3.util.FastMath.log((-72.35560618424385d), 0.9975054538602377d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.015628966602108815d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        int int2 = org.apache.commons.math3.util.FastMath.min(2147483647, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-2.9999998f), (-2.9103834E-11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999998f) + "'", float2 == (-2.9999998f));
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.466528223471357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.05396584957164d + "'", double1 == 87.05396584957164d);
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-63959947L), (double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.395994700000028E7d + "'", double2 == 6.395994700000028E7d);
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.0027621360286460735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0027659542410312d + "'", double1 == 1.0027659542410312d);
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.16499547112384425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002879714221990311d + "'", double1 == 0.002879714221990311d);
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.48917865697472146d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5.68434188608064E-14d, (-0.0024670109333179424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.684341886080639E-14d + "'", double2 == 5.684341886080639E-14d);
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.019250629751176255d, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2781148015578958d) + "'", double2 == (-0.2781148015578958d));
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.02816255926152E-309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.02816255926152E-309d + "'", double1 == 4.02816255926152E-309d);
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.11321160719436832d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        int int1 = org.apache.commons.math3.util.FastMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-8), (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8L) + "'", long2 == (-8L));
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.34198014841116886d, (double) 1.0633824E37f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0633823966279327E37d + "'", double2 == 1.0633823966279327E37d);
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(8.699514748210191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2999.9999166666644d + "'", double1 == 2999.9999166666644d);
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        long long2 = org.apache.commons.math3.util.FastMath.max((-63959947L), (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 14.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        float float2 = org.apache.commons.math3.util.FastMath.min(7.0368744E13f, 9.536744E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536744E-7f + "'", float2 == 9.536744E-7f);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(46040.886104364334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.43043228949497d + "'", double1 == 11.43043228949497d);
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.882812208961696E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.7615685223484937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27237512730911073d) + "'", double1 == (-0.27237512730911073d));
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.2220482392758838d, 2.184458789852743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.222048239275884d + "'", double2 == 1.222048239275884d);
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        long long2 = org.apache.commons.math3.util.FastMath.max(51L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.8889466E22f, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.0831675322560934E97d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-29));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.8114933394509746d), 137);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4138207963594455E41d) + "'", double2 == (-1.4138207963594455E41d));
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 3072L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3072.0f + "'", float1 == 3072.0f);
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 4L, (-8.781516350303278d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.8641086300492958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.309341227634172d + "'", double1 == 1.309341227634172d);
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-2), 0.009850471303251545d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1.04453605E13f), (-375.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-375.0f) + "'", float2 == (-375.0f));
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-35));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-34.999996f) + "'", float1 == (-34.999996f));
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9818981350712841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5554451480746508d + "'", double1 == 0.5554451480746508d);
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.3200537642354306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12059161986893001d + "'", double1 == 0.12059161986893001d);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        int int2 = org.apache.commons.math3.util.FastMath.max(44, 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 141 + "'", int2 == 141);
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.05037245961609866d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-56.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.842859999667946E24d) + "'", double1 == (-2.842859999667946E24d));
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6871714861810375d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3258176636680326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3258176636680326d + "'", double1 == 1.3258176636680326d);
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.13533528323661262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0023620462865979784d + "'", double1 == 0.0023620462865979784d);
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.1413520055419475d, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.759527733946123E225d + "'", double2 == 6.759527733946123E225d);
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.011032585021104841d, 43);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.70436441210568E10d + "'", double2 == 9.70436441210568E10d);
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (short) 100, 0.5756660649621339d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5650397297342755d + "'", double2 == 1.5650397297342755d);
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-127L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-127.0d) + "'", double1 == (-127.0d));
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5430661936490957d, (-0.03468674668190965d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 5.831193E31f, 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.49278093949912594d) + "'", double2 == (-0.49278093949912594d));
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.9576597548889478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016714315836654003d) + "'", double1 == (-0.016714315836654003d));
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-6.305123299389195d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997593718998387d + "'", double1 == 0.9997593718998387d);
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        int int1 = org.apache.commons.math3.util.FastMath.round(512.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0000000018626451d, 4.359039207590521E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.933327349611498E10d + "'", double2 == 1.933327349611498E10d);
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-127L), 230);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.191304465106004E71d) + "'", double2 == (-2.191304465106004E71d));
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.2065299964591305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8205510187675935d + "'", double1 == 1.8205510187675935d);
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.5310603550457816d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        float float1 = org.apache.commons.math3.util.FastMath.signum(35.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-63.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-63.0d) + "'", double1 == (-63.0d));
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.8414443782266199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        int int2 = org.apache.commons.math3.util.FastMath.min((-127), (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 9.2233709E18f, 7.313219942645561d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223370937343148E18d + "'", double2 == 9.223370937343148E18d);
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.661650474533378d, 0.022097089107228303d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6620193590804253d + "'", double2 == 0.6620193590804253d);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(686.477360063739d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 8.881785E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881785255792436E-16d + "'", double1 == 8.881785255792436E-16d);
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.998222988255625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4419647480158577d + "'", double1 == 1.4419647480158577d);
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        double double1 = org.apache.commons.math3.util.FastMath.abs(7677.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7677.0d + "'", double1 == 7677.0d);
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-28.999998f), 1.5707963267942904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.04250833647213d + "'", double2 == 29.04250833647213d);
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(16128.0f, 0.7569856324386435d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16127.999f + "'", float2 == 16127.999f);
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.9132181397411985d), 2.0831675322560934E97d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9132181397411984d) + "'", double2 == (-0.9132181397411984d));
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7811383772589705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1839570179408234d + "'", double1 == 2.1839570179408234d);
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.648361369288039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.865510571767041d + "'", double1 == 0.865510571767041d);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.10289915108550522d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9947105519848425d + "'", double1 == 0.9947105519848425d);
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.570796325565935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523354720764d + "'", double1 == 0.9171523354720764d);
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        double double1 = org.apache.commons.math3.util.FastMath.exp(9.385626020143185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11915.86542515003d + "'", double1 == 11915.86542515003d);
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.0000000000014222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.176517423269412E-13d + "'", double1 == 6.176517423269412E-13d);
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.02042970020377229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020431121603772754d + "'", double1 == 0.020431121603772754d);
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0469529584324009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.999625033326321E-5d, 1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4436354751788103d + "'", double2 == 1.4436354751788103d);
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        double double1 = org.apache.commons.math3.util.FastMath.exp(8.946190480851357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7678.584358657442d + "'", double1 == 7678.584358657442d);
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        float float2 = org.apache.commons.math3.util.FastMath.max(85.0f, 2.14748352E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748352E9f + "'", float2 == 2.14748352E9f);
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 29L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.14973832340422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.14973832340422d + "'", double1 == 4.14973832340422d);
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-1023), 3.553423334544648d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1022.9999999999999d) + "'", double2 == (-1022.9999999999999d));
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-2.38388025641375E-13d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.38388025641375E-13d) + "'", double1 == (-2.38388025641375E-13d));
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.015625004f, 4.7683733E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.015625004f + "'", float2 == 0.015625004f);
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        double double1 = org.apache.commons.math3.util.FastMath.acos(51.999996185302734d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9735692101318191d, 16.252646034500078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.252646034500078d + "'", double2 == 16.252646034500078d);
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.5403021903467493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6156266841948422d) + "'", double1 == (-0.6156266841948422d));
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        int int2 = org.apache.commons.math3.util.FastMath.max((-121), (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.36274713936822706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.78388011624328d + "'", double1 == 20.78388011624328d);
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.420521517896809E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        double double1 = org.apache.commons.math3.util.FastMath.atan(7.313219861265277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4349004383915853d + "'", double1 == 1.4349004383915853d);
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1024.0001220703127d), 4.7683715820312495E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7683715820312495E-7d + "'", double2 == 4.7683715820312495E-7d);
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.4981210310577606d, 1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.1086244689504383E-15d) + "'", double2 == (-3.1086244689504383E-15d));
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(749.9998f, 1.6286665988545064d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.99976f + "'", float2 == 749.99976f);
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.7615685223484937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9132079039842687d + "'", double1 == 0.9132079039842687d);
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        double double1 = org.apache.commons.math3.util.FastMath.sin(8.126610105220086E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.126610105220086E-39d + "'", double1 == 8.126610105220086E-39d);
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-1), 230);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(20.871061917633263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.56848573573709d + "'", double1 == 4.56848573573709d);
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 9.6714065E24f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.6714065E24f + "'", float2 == 9.6714065E24f);
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 15, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.0179147401920297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0179147401920297d + "'", double1 == 0.0179147401920297d);
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(8.881784E-16f, 4.93496684993349d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.881785E-16f + "'", float2 == 8.881785E-16f);
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        int int2 = org.apache.commons.math3.util.FastMath.max(37, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 374.99997f, 2.4428418403909626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15069566561422487d + "'", double2 == 0.15069566561422487d);
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.028392510015146796d, 6.932447891572509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.028392510015146796d + "'", double2 == 0.028392510015146796d);
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.6294616902487444d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        double double1 = org.apache.commons.math3.util.FastMath.abs(255.53800932622195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 255.53800932622195d + "'", double1 == 255.53800932622195d);
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.440892098500627E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        double double2 = org.apache.commons.math3.util.FastMath.log(7.046745412134744E21d, 0.8414709624298973d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0034310190995747916d) + "'", double2 == (-0.0034310190995747916d));
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1409471084848406d, 0.7525265177153062d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1043171489277315d + "'", double2 == 1.1043171489277315d);
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.506934503488869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8052744271020462d) + "'", double1 == (-0.8052744271020462d));
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 3.469447E-18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953615E-18d + "'", double1 == 3.469446951953615E-18d);
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        int int1 = org.apache.commons.math3.util.FastMath.round(7.0368744E13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 10445360463872L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1048576.0f + "'", float1 == 1048576.0f);
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.15411301352167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9916817294253804d + "'", double1 == 0.9916817294253804d);
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.7559662776027264d), 2.8284271247461907d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7559662776027264d) + "'", double2 == (-0.7559662776027264d));
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        double double1 = org.apache.commons.math3.util.FastMath.cos(10.000000003691417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715270682437d) + "'", double1 == (-0.8390715270682437d));
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 38L, 1246.3114137236385d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.000004f + "'", float2 == 38.000004f);
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0272356433182504d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4357702930920064d + "'", double2 == 0.4357702930920064d);
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.8767220797745886d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 128);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.545192702919391d + "'", double1 == 5.545192702919391d);
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.5662046180417148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1646222122142713d + "'", double1 == 1.1646222122142713d);
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(7.62364218539641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1023.0004887584365d + "'", double1 == 1023.0004887584365d);
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(9.536743164059608E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536743164062499E-7d + "'", double1 == 9.536743164062499E-7d);
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-41.392100454203025d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.055939846045818E-18d + "'", double1 == 1.055939846045818E-18d);
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.2233704E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.814697265625E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(39936.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 39936.004f + "'", float1 == 39936.004f);
    }
}

